package org.betup.ui.dialogs.push;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil3.compose.SingletonAsyncImageKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.dialogs.push.PushNotificationData;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: PushNotificationScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"PushNotificationScreen", "", "notificationData", "Lorg/betup/ui/dialogs/push/PushNotificationData;", "onActionClick", "Lkotlin/Function0;", "onDismiss", "(Lorg/betup/ui/dialogs/push/PushNotificationData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PushNotificationContent", "data", "(Lorg/betup/ui/dialogs/push/PushNotificationData;Landroidx/compose/runtime/Composer;I)V", "MESSAGE_CONTENT_MAX_HEIGHT_DP", "", "resolveNotificationBody", "", "(Lorg/betup/ui/dialogs/push/PushNotificationData;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "DefaultNotificationContent", "RewardPreviewContent", "Lorg/betup/ui/dialogs/push/PushNotificationData$Reward;", "(Lorg/betup/ui/dialogs/push/PushNotificationData$Reward;Landroidx/compose/runtime/Composer;I)V", "NotificationIcon", "AdditionalInfo", "getHeaderTitle", "getActionButtonText", "getIconResource", "(Lorg/betup/ui/dialogs/push/PushNotificationData;)Ljava/lang/Integer;", "PreviewPushNotificationChallengeAccepted", "(Landroidx/compose/runtime/Composer;I)V", "PreviewPushNotificationBetWon", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PushNotificationScreenKt {
    private static final int MESSAGE_CONTENT_MAX_HEIGHT_DP = 200;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdditionalInfo$lambda$14(PushNotificationData pushNotificationData, int i, Composer composer, int i2) {
        AdditionalInfo(pushNotificationData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultNotificationContent$lambda$5(PushNotificationData pushNotificationData, int i, Composer composer, int i2) {
        DefaultNotificationContent(pushNotificationData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationIcon$lambda$10(PushNotificationData pushNotificationData, int i, Composer composer, int i2) {
        NotificationIcon(pushNotificationData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPushNotificationBetWon$lambda$24(int i, Composer composer, int i2) {
        PreviewPushNotificationBetWon(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPushNotificationChallengeAccepted$lambda$19(int i, Composer composer, int i2) {
        PreviewPushNotificationChallengeAccepted(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PushNotificationContent$lambda$2(PushNotificationData pushNotificationData, int i, Composer composer, int i2) {
        PushNotificationContent(pushNotificationData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PushNotificationScreen$lambda$1(PushNotificationData pushNotificationData, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PushNotificationScreen(pushNotificationData, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardPreviewContent$lambda$9(PushNotificationData.Reward reward, int i, Composer composer, int i2) {
        RewardPreviewContent(reward, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PushNotificationScreen(final PushNotificationData notificationData, final Function0<Unit> onActionClick, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        Intrinsics.checkNotNullParameter(onActionClick, "onActionClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-142108468);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(notificationData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onActionClick) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-142108468, i2, -1, "org.betup.ui.dialogs.push.PushNotificationScreen (PushNotificationScreen.kt:53)");
            }
            float f = 32;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
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
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, ((i2 >> 3) & 112) | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(100)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), ComposableLambdaKt.rememberComposableLambda(522991730, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$PushNotificationScreen$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    String headerTitle;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(522991730, i3, -1, "org.betup.ui.dialogs.push.PushNotificationScreen.<anonymous>.<anonymous> (PushNotificationScreen.kt:71)");
                    }
                    headerTitle = PushNotificationScreenKt.getHeaderTitle(PushNotificationData.this, composer3, 0);
                    QuickBetHeaderKt.QuickBetHeader(null, headerTitle, null, null, false, false, false, false, composer3, 0, 253);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(2033013555, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$PushNotificationScreen$1$2
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
                        ComposerKt.traceEventStart(2033013555, i3, -1, "org.betup.ui.dialogs.push.PushNotificationScreen.<anonymous>.<anonymous> (PushNotificationScreen.kt:91)");
                    }
                    PushNotificationScreenKt.PushNotificationContent(PushNotificationData.this, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-751931916, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$PushNotificationScreen$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    String actionButtonText;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-751931916, i3, -1, "org.betup.ui.dialogs.push.PushNotificationScreen.<anonymous>.<anonymous> (PushNotificationScreen.kt:76)");
                    }
                    float f2 = 16;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2));
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
                    PushNotificationData pushNotificationData = PushNotificationData.this;
                    Function0<Unit> function0 = onActionClick;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 6);
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
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    actionButtonText = PushNotificationScreenKt.getActionButtonText(pushNotificationData, composer3, 0);
                    CommonButtonKt.m12915CommonButtonUPEs2M4(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), true, actionButtonText, false, false, false, function0, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer3, 48, 0, 0, 2097080);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PushNotificationScreen$lambda$1;
                    PushNotificationScreen$lambda$1 = PushNotificationScreenKt.PushNotificationScreen$lambda$1(PushNotificationData.this, onActionClick, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PushNotificationScreen$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PushNotificationContent(final PushNotificationData pushNotificationData, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1719610931);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pushNotificationData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719610931, i2, -1, "org.betup.ui.dialogs.push.PushNotificationContent (PushNotificationScreen.kt:105)");
            }
            if (pushNotificationData instanceof PushNotificationData.Reward) {
                startRestartGroup.startReplaceGroup(1016308711);
                RewardPreviewContent((PushNotificationData.Reward) pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.BetResult) {
                startRestartGroup.startReplaceGroup(1016311021);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.ChallengeAccepted) {
                startRestartGroup.startReplaceGroup(1016313773);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.ChallengeResult) {
                startRestartGroup.startReplaceGroup(1016316461);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite) {
                startRestartGroup.startReplaceGroup(1016319373);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.CompetitionResult) {
                startRestartGroup.startReplaceGroup(1016322125);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.AchievementUnlocked) {
                startRestartGroup.startReplaceGroup(1016324941);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.MatchNotification) {
                startRestartGroup.startReplaceGroup(1016327693);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.SupportMessage) {
                startRestartGroup.startReplaceGroup(1016330349);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (pushNotificationData instanceof PushNotificationData.Info) {
                startRestartGroup.startReplaceGroup(1016332685);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(pushNotificationData instanceof PushNotificationData.DailyQuest)) {
                    startRestartGroup.startReplaceGroup(1016307815);
                    startRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1016335213);
                DefaultNotificationContent(pushNotificationData, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PushNotificationContent$lambda$2;
                    PushNotificationContent$lambda$2 = PushNotificationScreenKt.PushNotificationContent$lambda$2(PushNotificationData.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PushNotificationContent$lambda$2;
                }
            });
        }
    }

    private static final String resolveNotificationBody(PushNotificationData pushNotificationData, Composer composer, int i) {
        composer.startReplaceGroup(-1457700805);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1457700805, i, -1, "org.betup.ui.dialogs.push.resolveNotificationBody (PushNotificationScreen.kt:124)");
        }
        if (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite) {
            PushNotificationData.PrivateChallengeInvite privateChallengeInvite = (PushNotificationData.PrivateChallengeInvite) pushNotificationData;
            Long buyIn = privateChallengeInvite.getBuyIn();
            if (buyIn == null) {
                Long potentialWin = privateChallengeInvite.getPotentialWin();
                buyIn = null;
                if (potentialWin != null) {
                    if (potentialWin.longValue() <= 0) {
                        potentialWin = null;
                    }
                    if (potentialWin != null) {
                        buyIn = Long.valueOf(potentialWin.longValue() / 2);
                    }
                }
            }
            if (buyIn != null && buyIn.longValue() > 0) {
                String stringResource = StringResources_androidKt.stringResource(R.string.push_challenge_invite_buy_in_body, new Object[]{FormatHelper.getDialogBetcoinsFormated(buyIn.longValue())}, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return stringResource;
            }
        }
        String body = pushNotificationData.getBody();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return body;
    }

    private static final void DefaultNotificationContent(final PushNotificationData pushNotificationData, Composer composer, final int i) {
        int i2;
        Modifier m1517paddingVpY3zN4;
        int i3;
        Composer composer2;
        Composer composer3;
        Composer composer4;
        Composer startRestartGroup = composer.startRestartGroup(682237208);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pushNotificationData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(682237208, i2, -1, "org.betup.ui.dialogs.push.DefaultNotificationContent (PushNotificationScreen.kt:139)");
            }
            boolean z = (pushNotificationData instanceof PushNotificationData.SupportMessage) || (pushNotificationData instanceof PushNotificationData.Info);
            startRestartGroup.startReplaceGroup(-1500032255);
            if (z) {
                m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(MESSAGE_CONTENT_MAX_HEIGHT_DP), 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(24));
            } else {
                m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(24));
            }
            startRestartGroup.endReplaceGroup();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = i2 & 14;
            NotificationIcon(pushNotificationData, startRestartGroup, i4);
            startRestartGroup.startReplaceGroup(121328780);
            if (StringsKt.isBlank(pushNotificationData.getTitle())) {
                i3 = i4;
                composer2 = startRestartGroup;
            } else {
                i3 = i4;
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(pushNotificationData.getTitle(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 130512);
            }
            composer2.endReplaceGroup();
            Composer composer5 = composer2;
            String resolveNotificationBody = resolveNotificationBody(pushNotificationData, composer5, i3);
            composer5.startReplaceGroup(121341966);
            if (StringsKt.isBlank(resolveNotificationBody)) {
                composer3 = composer5;
            } else {
                composer3 = composer5;
                TextKt.m3621Text4IGK_g(resolveNotificationBody, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199728, 0, 130512);
            }
            composer3.endReplaceGroup();
            composer4 = composer3;
            AdditionalInfo(pushNotificationData, composer4, i3);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer4 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DefaultNotificationContent$lambda$5;
                    DefaultNotificationContent$lambda$5 = PushNotificationScreenKt.DefaultNotificationContent$lambda$5(PushNotificationData.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DefaultNotificationContent$lambda$5;
                }
            });
        }
    }

    private static final void RewardPreviewContent(final PushNotificationData.Reward reward, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1788797925);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(reward) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1788797925, i2, -1, "org.betup.ui.dialogs.push.RewardPreviewContent (PushNotificationScreen.kt:189)");
            }
            String period = reward.getPeriod();
            if (period == null || StringsKt.isBlank(period)) {
                period = null;
            }
            startRestartGroup.startReplaceGroup(1047890769);
            if (period == null) {
                period = StringResources_androidKt.stringResource(R.string.rankings, startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            Integer place = reward.getPlace();
            int intValue = place != null ? place.intValue() : 0;
            Long price = reward.getPrice();
            long longValue = (price == null && (price = reward.getWon()) == null) ? 0L : price.longValue();
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(24));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_reward_congratulations, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 130512);
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_reward_you_are_place_in_rankings, new Object[]{Integer.valueOf(intValue), period}, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3120, 0, 130544);
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.push_reward_your_reward_is, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 130512);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(String.valueOf(longValue), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131026);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer2, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, composer2, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RewardPreviewContent$lambda$9;
                    RewardPreviewContent$lambda$9 = PushNotificationScreenKt.RewardPreviewContent$lambda$9(PushNotificationData.Reward.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RewardPreviewContent$lambda$9;
                }
            });
        }
    }

    private static final void NotificationIcon(final PushNotificationData pushNotificationData, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-521992511);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pushNotificationData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-521992511, i2, -1, "org.betup.ui.dialogs.push.NotificationIcon (PushNotificationScreen.kt:252)");
            }
            String iconUrl = pushNotificationData.getIconUrl();
            Integer iconResource = getIconResource(pushNotificationData);
            LottieComposition value = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.coin_animation)), null, null, null, null, null, startRestartGroup, 6, 62).getValue();
            if (pushNotificationData instanceof PushNotificationData.BetResult) {
                startRestartGroup.startReplaceGroup(1398087733);
                PushNotificationData.BetResult betResult = (PushNotificationData.BetResult) pushNotificationData;
                if (betResult.getBetState() == 8 && value != null) {
                    startRestartGroup.startReplaceGroup(1398116687);
                    LottieAnimationKt.LottieAnimation(value, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(84)), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, null, null, startRestartGroup, 1572912, 0, 524220);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else if (betResult.getBetState() == 1 && (iconUrl == null || StringsKt.isBlank(iconUrl))) {
                    startRestartGroup.startReplaceGroup(1398397609);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.gold_cup_ranking, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.cd_notification_icon, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(64)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else if (iconUrl != null && !StringsKt.isBlank(iconUrl)) {
                    startRestartGroup.startReplaceGroup(1398696573);
                    composer2 = startRestartGroup;
                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(iconUrl, StringResources_androidKt.stringResource(R.string.cd_notification_icon, startRestartGroup, 6), ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572864, 0, 1976);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1399021639);
                    ImageKt.Image(PainterResources_androidKt.painterResource(iconResource != null ? iconResource.intValue() : R.drawable.betcoin, composer2, 0), StringResources_androidKt.stringResource(R.string.cd_notification_icon, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(64)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1399292021);
                if (iconUrl == null || StringsKt.isBlank(iconUrl)) {
                    composer2 = startRestartGroup;
                    if (iconResource != null) {
                        composer2.startReplaceGroup(1399657015);
                        ImageKt.Image(PainterResources_androidKt.painterResource(iconResource.intValue(), composer2, 0), "Notification icon", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(64)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1399851137);
                        composer2.endReplaceGroup();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(1399337591);
                    composer2 = startRestartGroup;
                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(iconUrl, "Notification icon", ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(64)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, startRestartGroup, 1572912, 0, 1976);
                    composer2.endReplaceGroup();
                }
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NotificationIcon$lambda$10;
                    NotificationIcon$lambda$10 = PushNotificationScreenKt.NotificationIcon$lambda$10(PushNotificationData.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NotificationIcon$lambda$10;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x04f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AdditionalInfo(final PushNotificationData pushNotificationData, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        String str;
        long j;
        Composer startRestartGroup = composer.startRestartGroup(-2073648464);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pushNotificationData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2073648464, i2, -1, "org.betup.ui.dialogs.push.AdditionalInfo (PushNotificationScreen.kt:313)");
            }
            if (pushNotificationData instanceof PushNotificationData.BetResult) {
                startRestartGroup.startReplaceGroup(-1546596140);
                PushNotificationData.BetResult betResult = (PushNotificationData.BetResult) pushNotificationData;
                if (betResult.getPrice() > 0) {
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
                    if (betResult.getBetState() == 1) {
                        str = "+" + betResult.getPrice();
                    } else {
                        str = betResult.getBetState() == 2 ? "-" + betResult.getPrice() : String.valueOf(betResult.getPrice());
                    }
                    if (betResult.getBetState() == 1) {
                        j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                    } else {
                        j = betResult.getBetState() == 2 ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                    }
                    TextKt.m3621Text4IGK_g(str, (Modifier) null, j, TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131026);
                    composer2 = startRestartGroup;
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer2, 6);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.cd_coin, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                if (pushNotificationData instanceof PushNotificationData.AchievementUnlocked) {
                    composer2.startReplaceGroup(-1545100018);
                    PushNotificationData.AchievementUnlocked achievementUnlocked = (PushNotificationData.AchievementUnlocked) pushNotificationData;
                    if (achievementUnlocked.getPrice() > 0) {
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        TextKt.m3621Text4IGK_g("+" + achievementUnlocked.getPrice(), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                        composer2 = composer2;
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer2, 6);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.cd_coin, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                    }
                    composer2.endReplaceGroup();
                } else {
                    if (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite) {
                        composer2.startReplaceGroup(-1544138181);
                        Long potentialWin = ((PushNotificationData.PrivateChallengeInvite) pushNotificationData).getPotentialWin();
                        if (potentialWin == null || potentialWin.longValue() <= 0) {
                            composer3 = composer2;
                        } else {
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
                            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically3, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default3);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.prize_label, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer2, 6);
                            TextKt.m3621Text4IGK_g(potentialWin.toString(), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                            composer3 = composer2;
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer3, 6);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer3, 6), StringResources_androidKt.stringResource(R.string.cd_coin, composer3, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                        }
                        composer3.endReplaceGroup();
                    } else {
                        composer3 = composer2;
                        composer3.startReplaceGroup(-1542928747);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            composer3 = composer2;
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AdditionalInfo$lambda$14;
                    AdditionalInfo$lambda$14 = PushNotificationScreenKt.AdditionalInfo$lambda$14(PushNotificationData.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AdditionalInfo$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHeaderTitle(PushNotificationData pushNotificationData, Composer composer, int i) {
        String stringResource;
        composer.startReplaceGroup(298023811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298023811, i, -1, "org.betup.ui.dialogs.push.getHeaderTitle (PushNotificationScreen.kt:411)");
        }
        if (pushNotificationData instanceof PushNotificationData.ChallengeAccepted) {
            composer.startReplaceGroup(-1361921446);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_challenge_accepted, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.ChallengeResult) {
            composer.startReplaceGroup(-1361918024);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_challenge_result, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite) {
            composer.startReplaceGroup(-1361914440);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_challenge_invite, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.BetResult) {
            composer.startReplaceGroup(-1361911278);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_bet_result, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.CompetitionResult) {
            composer.startReplaceGroup(-1361908038);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_competition_result, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.AchievementUnlocked) {
            composer.startReplaceGroup(-1361904493);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_achievement, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.MatchNotification) {
            composer.startReplaceGroup(-1361901228);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_match_update, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.SupportMessage) {
            composer.startReplaceGroup(-1361898033);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_support, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.Info) {
            composer.startReplaceGroup(-1361895308);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_notification, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.Reward) {
            composer.startReplaceGroup(-1361892370);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_reward, composer, 6);
            composer.endReplaceGroup();
        } else {
            if (!(pushNotificationData instanceof PushNotificationData.DailyQuest)) {
                composer.startReplaceGroup(-1361922525);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1361889485);
            stringResource = StringResources_androidKt.stringResource(R.string.push_header_daily_quest, composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionButtonText(PushNotificationData pushNotificationData, Composer composer, int i) {
        String stringResource;
        composer.startReplaceGroup(1629272297);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629272297, i, -1, "org.betup.ui.dialogs.push.getActionButtonText (PushNotificationScreen.kt:431)");
        }
        if (pushNotificationData instanceof PushNotificationData.ChallengeAccepted) {
            composer.startReplaceGroup(-1932380455);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_battle, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.ChallengeResult) {
            composer.startReplaceGroup(-1932377255);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_battle, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite) {
            composer.startReplaceGroup(-1932373831);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_invite, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.BetResult) {
            composer.startReplaceGroup(-1932370826);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_bet, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.CompetitionResult) {
            composer.startReplaceGroup(-1932367650);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_competition, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.AchievementUnlocked) {
            composer.startReplaceGroup(-1932364162);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_achievement, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.MatchNotification) {
            composer.startReplaceGroup(-1932360744);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_view_match, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.SupportMessage) {
            composer.startReplaceGroup(-1932357605);
            stringResource = StringResources_androidKt.stringResource(R.string.push_action_go_to_support, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.Info) {
            composer.startReplaceGroup(-1932354716);
            stringResource = StringResources_androidKt.stringResource(R.string.ok, composer, 6);
            composer.endReplaceGroup();
        } else if (pushNotificationData instanceof PushNotificationData.Reward) {
            composer.startReplaceGroup(-1932352467);
            stringResource = StringResources_androidKt.stringResource(R.string.see_details, composer, 6);
            composer.endReplaceGroup();
        } else {
            if (!(pushNotificationData instanceof PushNotificationData.DailyQuest)) {
                composer.startReplaceGroup(-1932381426);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1932349285);
            if (((PushNotificationData.DailyQuest) pushNotificationData).getShowClaimAction()) {
                composer.startReplaceGroup(226737282);
                stringResource = StringResources_androidKt.stringResource(R.string.home_daily_quests_claim_reward, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(226828670);
                stringResource = StringResources_androidKt.stringResource(R.string.ok, composer, 6);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource;
    }

    private static final Integer getIconResource(PushNotificationData pushNotificationData) {
        boolean z = pushNotificationData instanceof PushNotificationData.ChallengeAccepted;
        Integer valueOf = Integer.valueOf(R.drawable.ic_battle);
        if (z || (pushNotificationData instanceof PushNotificationData.ChallengeResult) || (pushNotificationData instanceof PushNotificationData.PrivateChallengeInvite)) {
            return valueOf;
        }
        if (pushNotificationData instanceof PushNotificationData.BetResult) {
            return Integer.valueOf(R.drawable.betcoin);
        }
        if (pushNotificationData instanceof PushNotificationData.CompetitionResult) {
            return Integer.valueOf(R.drawable.ic_competition);
        }
        if (pushNotificationData instanceof PushNotificationData.AchievementUnlocked) {
            return null;
        }
        if (pushNotificationData instanceof PushNotificationData.MatchNotification) {
            return Integer.valueOf(R.drawable.ic_sport);
        }
        if (pushNotificationData instanceof PushNotificationData.SupportMessage) {
            return Integer.valueOf(R.drawable.support);
        }
        if (pushNotificationData instanceof PushNotificationData.Info) {
            return Integer.valueOf(R.drawable.info);
        }
        if (pushNotificationData instanceof PushNotificationData.Reward) {
            return null;
        }
        if (pushNotificationData instanceof PushNotificationData.DailyQuest) {
            return Integer.valueOf(R.drawable.ic_gift);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void PreviewPushNotificationChallengeAccepted(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-503440711);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503440711, i, -1, "org.betup.ui.dialogs.push.PreviewPushNotificationChallengeAccepted (PushNotificationScreen.kt:474)");
            }
            PushNotificationData.ChallengeAccepted challengeAccepted = new PushNotificationData.ChallengeAccepted(123, "Challenge Accepted!", "Player123 accepted your battle challenge. Good luck!", null, 8, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            PushNotificationScreen(challengeAccepted, function0, (Function0) rememberedValue2, startRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewPushNotificationChallengeAccepted$lambda$19;
                    PreviewPushNotificationChallengeAccepted$lambda$19 = PushNotificationScreenKt.PreviewPushNotificationChallengeAccepted$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewPushNotificationChallengeAccepted$lambda$19;
                }
            });
        }
    }

    public static final void PreviewPushNotificationBetWon(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2024496480);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024496480, i, -1, "org.betup.ui.dialogs.push.PreviewPushNotificationBetWon (PushNotificationScreen.kt:488)");
            }
            PushNotificationData.BetResult betResult = new PushNotificationData.BetResult(456, 1, 500L, "Bet Won!", "Congratulations! Your bet was successful.", null, 32, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            PushNotificationScreen(betResult, function0, (Function0) rememberedValue2, startRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.push.PushNotificationScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewPushNotificationBetWon$lambda$24;
                    PreviewPushNotificationBetWon$lambda$24 = PushNotificationScreenKt.PreviewPushNotificationBetWon$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewPushNotificationBetWon$lambda$24;
                }
            });
        }
    }
}
