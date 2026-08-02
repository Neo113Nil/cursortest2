package org.betup.ui.fragment.bets.sheet.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.X2;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.HapticFeedbackEffectKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.BattleCreateResult;
import org.betup.ui.fragment.bets.BattleOpponent;
import org.betup.ui.fragment.bets.PlaceBetResult;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTab;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BettingSheetContent.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a;\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a¡\u0002\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0002\u0010)\u001a§\u0001\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0002\u0010/\u001a+\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0002\u00104\u001a/\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010;\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006<²\u0006\n\u0010=\u001a\u00020>X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020>X\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010B\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002²\u0006\f\u0010D\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, d2 = {"QUICK_BET_ERROR_VISIBLE_MS", "", "QuickBetTopBar", "", "onDismiss", "Lkotlin/Function0;", "onSettingsClick", "isInTour", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BettingSheetContent", "isLoading", "amount", "bets", "", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "userAmount", "isFirsBetAvailable", "highScore", "minBet", "onInviteUserClick", "battleOpponent", "Lorg/betup/ui/fragment/bets/BattleOpponent;", "placeBetResult", "Lorg/betup/ui/fragment/bets/PlaceBetResult;", "onPlaceBetResultConsumed", "battleCreateResult", "Lorg/betup/ui/fragment/bets/BattleCreateResult;", "onBattleCreateResultConsumed", "onChallengeClick", "onPlaceBetClick", "onAddCoinsClick", "onAmountChange", "Lkotlin/Function1;", "onMultiBetClicked", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "(ZJLjava/util/List;Lorg/betup/model/local/entity/OddType;JZJJLkotlin/jvm/functions/Function0;Lorg/betup/ui/fragment/bets/BattleOpponent;Lorg/betup/ui/fragment/bets/PlaceBetResult;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/fragment/bets/BattleCreateResult;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLorg/betup/ui/tour/compose/TourState;Landroidx/compose/runtime/Composer;IIII)V", "QuickBetBottomAction", "selectedTab", "Lorg/betup/ui/fragment/bets/sheet/compose/items/QuickBetTab;", "isActionEnabled", "isChallengeAllowed", "(Lorg/betup/ui/fragment/bets/sheet/compose/items/QuickBetTab;JZZZLorg/betup/ui/fragment/bets/BattleOpponent;Lorg/betup/ui/fragment/bets/PlaceBetResult;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/fragment/bets/BattleCreateResult;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "InvitedOpponentButton", "opponent", "isEnabled", "onClick", "(Lorg/betup/ui/fragment/bets/BattleOpponent;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SpeechBubbleWithTip", "title", "", "subtitle", "tipPosition", "Lorg/betup/ui/fragment/bets/sheet/compose/TipPosition;", "(Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/fragment/bets/sheet/compose/TipPosition;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "handTargetOffset", "", "handOffsetY", "bet", "isAvailable", "isDeleted", "isInvalid", "amountBeforeBattle"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BettingSheetContentKt {
    private static final long QUICK_BET_ERROR_VISIBLE_MS = 2200;

    /* compiled from: BettingSheetContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuickBetTab.values().length];
            try {
                iArr[QuickBetTab.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuickBetTab.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuickBetTab.BATTLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BettingSheetContent$lambda$34(boolean z, long j, List list, OddType oddType, long j2, boolean z2, long j3, long j4, Function0 function0, BattleOpponent battleOpponent, PlaceBetResult placeBetResult, Function0 function02, BattleCreateResult battleCreateResult, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function1 function1, Function0 function09, boolean z3, TourState tourState, int i, int i2, int i3, int i4, Composer composer, int i5) {
        BettingSheetContent(z, j, list, oddType, j2, z2, j3, j4, function0, battleOpponent, placeBetResult, function02, battleCreateResult, function03, function04, function05, function06, function07, function08, function1, function09, z3, tourState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvitedOpponentButton$lambda$55(BattleOpponent battleOpponent, boolean z, Function0 function0, int i, Composer composer, int i2) {
        InvitedOpponentButton(battleOpponent, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetBottomAction$lambda$52(QuickBetTab quickBetTab, long j, boolean z, boolean z2, boolean z3, BattleOpponent battleOpponent, PlaceBetResult placeBetResult, Function0 function0, BattleCreateResult battleCreateResult, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i, int i2, Composer composer, int i3) {
        QuickBetBottomAction(quickBetTab, j, z, z2, z3, battleOpponent, placeBetResult, function0, battleCreateResult, function02, function03, function04, function05, function06, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetTopBar$lambda$6(Function0 function0, Function0 function02, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuickBetTopBar(function0, function02, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpeechBubbleWithTip$lambda$58(String str, String str2, TipPosition tipPosition, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpeechBubbleWithTip(str, str2, tipPosition, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickBetTopBar(final Function0<Unit> onDismiss, final Function0<Unit> onSettingsClick, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Object rememberedValue;
        BettingSheetContentKt$QuickBetTopBar$1$1$1 rememberedValue2;
        int i5;
        Modifier modifier3;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSettingsClick, "onSettingsClick");
        Composer startRestartGroup = composer.startRestartGroup(1333281285);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onSettingsClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1333281285, i4, -1, "org.betup.ui.fragment.bets.sheet.compose.QuickBetTopBar (BettingSheetContent.kt:87)");
                }
                Object obj = null;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), Dp.m7774constructorimpl(!z ? 46 : 0), 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(-40.0f), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new BettingSheetContentKt$QuickBetTopBar$1$1$1(mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(366516935);
                if (z) {
                    i5 = 6;
                    modifier3 = modifier5;
                    i6 = i4;
                    i7 = 2;
                    i8 = 1;
                } else {
                    modifier3 = modifier5;
                    State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(QuickBetTopBar$lambda$5$lambda$1(mutableState), AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "hand_offset", null, startRestartGroup, 3072, 20);
                    i5 = 6;
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.icon_show_down, startRestartGroup, 6);
                    String stringResource = StringResources_androidKt.stringResource(R.string.cd_hand_pointer, startRestartGroup, 6);
                    ContentScale fit = ContentScale.INSTANCE.getFit();
                    obj = null;
                    i8 = 1;
                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), 0.0f, Dp.m7774constructorimpl(QuickBetTopBar$lambda$5$lambda$4(animateFloatAsState)), 1, null), Dp.m7774constructorimpl(60));
                    i6 = i4;
                    i7 = 2;
                    ImageKt.Image(painterResource, stringResource, m1563size3ABfNKs, (Alignment) null, fit, 0.0f, (ColorFilter) null, startRestartGroup, 24576, 104);
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                TopActionButtonsKt.TopActionButtons(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i8, obj), QuickBetDimens.INSTANCE.m13590getTopBarHorizontalPaddingD9Ej5fM(), 0.0f, i7, obj), onDismiss, null, onSettingsClick, !z, false, false, startRestartGroup, ((i6 << 3) & 112) | i5 | ((i6 << i5) & 7168), 100);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit QuickBetTopBar$lambda$6;
                        QuickBetTopBar$lambda$6 = BettingSheetContentKt.QuickBetTopBar$lambda$6(Function0.this, onSettingsClick, z, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return QuickBetTopBar$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Object obj2 = null;
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), Dp.m7774constructorimpl(!z ? 46 : 0), 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
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
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(366516935);
        if (z) {
        }
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        TopActionButtonsKt.TopActionButtons(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i8, obj2), QuickBetDimens.INSTANCE.m13590getTopBarHorizontalPaddingD9Ej5fM(), 0.0f, i7, obj2), onDismiss, null, onSettingsClick, !z, false, false, startRestartGroup, ((i6 << 3) & 112) | i5 | ((i6 << i5) & 7168), 100);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float QuickBetTopBar$lambda$5$lambda$1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QuickBetTopBar$lambda$5$lambda$2(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BettingSheetContent(final boolean z, final long j, final List<? extends BetModel> bets, final OddType oddType, final long j2, final boolean z2, final long j3, final long j4, final Function0<Unit> onInviteUserClick, final BattleOpponent battleOpponent, PlaceBetResult placeBetResult, Function0<Unit> function0, BattleCreateResult battleCreateResult, Function0<Unit> function02, final Function0<Unit> onDismiss, final Function0<Unit> onChallengeClick, final Function0<Unit> onSettingsClick, final Function0<Unit> onPlaceBetClick, final Function0<Unit> onAddCoinsClick, final Function1<? super Long, Unit> onAmountChange, final Function0<Unit> onMultiBetClicked, boolean z3, TourState tourState, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        Function0<Unit> function03;
        Function0<Unit> function04;
        boolean z5;
        boolean isTourActive;
        TourStep currentStep;
        boolean z6;
        boolean changed;
        BettingSheetContentKt$BettingSheetContent$3$1 rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        boolean changed4;
        Object rememberedValue4;
        boolean changed5;
        Object rememberedValue5;
        Long valueOf;
        Object rememberedValue6;
        final MutableState mutableState;
        long max;
        Object rememberedValue7;
        QuickBetTab BettingSheetContent$lambda$25;
        boolean changed6;
        BettingSheetContentKt$BettingSheetContent$4$1 rememberedValue8;
        long j5;
        QuickBetTab quickBetTab;
        Alignment alignment;
        Long l;
        Composer composer2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer3;
        final PlaceBetResult placeBetResult2;
        final Function0<Unit> function05;
        final BattleCreateResult battleCreateResult2;
        final Function0<Unit> function06;
        final boolean z7;
        final TourState tourState2;
        MatchDetailsDataModel match;
        MatchState state;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(onInviteUserClick, "onInviteUserClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onChallengeClick, "onChallengeClick");
        Intrinsics.checkNotNullParameter(onSettingsClick, "onSettingsClick");
        Intrinsics.checkNotNullParameter(onPlaceBetClick, "onPlaceBetClick");
        Intrinsics.checkNotNullParameter(onAddCoinsClick, "onAddCoinsClick");
        Intrinsics.checkNotNullParameter(onAmountChange, "onAmountChange");
        Intrinsics.checkNotNullParameter(onMultiBetClicked, "onMultiBetClicked");
        Composer startRestartGroup = composer.startRestartGroup(-194237811);
        if ((i4 & 1) != 0) {
            i5 = i | 6;
        } else if ((i & 6) == 0) {
            i5 = i | (startRestartGroup.changed(z) ? 4 : 2);
        } else {
            i5 = i;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i16 = i5;
        if ((i4 & 4) != 0) {
            i16 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i16 |= startRestartGroup.changedInstance(bets) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i16 |= 3072;
        } else if ((i & 3072) == 0) {
            i16 |= startRestartGroup.changed(oddType.ordinal()) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i16 |= 24576;
        } else if ((i & 24576) == 0) {
            i16 |= startRestartGroup.changed(j2) ? 16384 : 8192;
            if ((i4 & 32) == 0) {
                i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i16 |= startRestartGroup.changed(z2) ? 131072 : 65536;
            }
            if ((i4 & 128) == 0) {
                i16 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i16 |= startRestartGroup.changed(j4) ? 8388608 : 4194304;
            }
            if ((i4 & 256) != 0) {
                i15 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(onInviteUserClick) ? 67108864 : 33554432 : 100663296;
                if ((i4 & 512) != 0) {
                    i16 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i16 |= startRestartGroup.changed(battleOpponent) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    i6 = i4 & 1024;
                    if (i6 == 0) {
                        i7 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i7 = i2 | (startRestartGroup.changed(placeBetResult) ? 4 : 2);
                    } else {
                        i7 = i2;
                    }
                    i8 = i4 & 2048;
                    if (i8 == 0) {
                        i7 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i7 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                    }
                    int i17 = i7;
                    i9 = i4 & 4096;
                    if (i9 == 0) {
                        i17 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i17 |= startRestartGroup.changed(battleCreateResult) ? 256 : 128;
                        i10 = i4 & 8192;
                        if (i10 != 0) {
                            i17 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i17 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                            if ((i4 & 32768) == 0) {
                                i17 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i17 |= startRestartGroup.changedInstance(onChallengeClick) ? 131072 : 65536;
                            }
                            if ((i4 & 131072) != 0) {
                                i14 = (i2 & 12582912) == 0 ? startRestartGroup.changedInstance(onPlaceBetClick) ? 8388608 : 4194304 : 12582912;
                                if ((i4 & 524288) != 0) {
                                    i17 |= 805306368;
                                } else if ((i2 & 805306368) == 0) {
                                    i17 |= startRestartGroup.changedInstance(onAmountChange) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                }
                                if ((i4 & 1048576) != 0) {
                                    i11 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i11 = i3 | (startRestartGroup.changedInstance(onMultiBetClicked) ? 4 : 2);
                                } else {
                                    i11 = i3;
                                }
                                i12 = i4 & 2097152;
                                if (i12 != 0) {
                                    i11 |= 48;
                                    z4 = z3;
                                } else {
                                    z4 = z3;
                                    if ((i3 & 48) == 0) {
                                        i11 |= startRestartGroup.changed(z4) ? 32 : 16;
                                    }
                                }
                                int i18 = i11;
                                i13 = i4 & 4194304;
                                if (i13 != 0) {
                                    i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i18 |= startRestartGroup.changed(tourState) ? 256 : 128;
                                    if ((i16 & 306259091) == 306259090 || (272696467 & i17) != 272696466 || (i18 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                                        PlaceBetResult placeBetResult3 = i6 == 0 ? null : placeBetResult;
                                        if (i8 == 0) {
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            Object rememberedValue9 = startRestartGroup.rememberedValue();
                                            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit unit;
                                                        unit = Unit.INSTANCE;
                                                        return unit;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            function03 = (Function0) rememberedValue9;
                                        } else {
                                            function03 = function0;
                                        }
                                        BattleCreateResult battleCreateResult3 = i9 == 0 ? null : battleCreateResult;
                                        if (i10 == 0) {
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            Object rememberedValue10 = startRestartGroup.rememberedValue();
                                            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit unit;
                                                        unit = Unit.INSTANCE;
                                                        return unit;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue10);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            function04 = (Function0) rememberedValue10;
                                        } else {
                                            function04 = function02;
                                        }
                                        z5 = i12 == 0 ? false : z4;
                                        TourState tourState3 = i13 == 0 ? null : tourState;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-194237811, i16, i17, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent (BettingSheetContent.kt:160)");
                                        }
                                        isTourActive = tourState3 == null ? tourState3.isTourActive() : false;
                                        currentStep = tourState3 == null ? tourState3.getCurrentStep() : null;
                                        z6 = !isTourActive && currentStep == TourStep.PLACE_BET;
                                        Boolean valueOf2 = Boolean.valueOf(isTourActive);
                                        Boolean valueOf3 = Boolean.valueOf(z5);
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        changed = ((i18 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(valueOf2, currentStep, valueOf3, (Function2) rememberedValue, startRestartGroup, (i18 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changed2 = startRestartGroup.changed(bets);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    BetModel BettingSheetContent$lambda$13$lambda$12;
                                                    BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                                                    return BettingSheetContent$lambda$13$lambda$12;
                                                }
                                            });
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        State state2 = (State) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changed3 = startRestartGroup.changed(bets);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    boolean BettingSheetContent$lambda$16$lambda$15;
                                                    BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                                                    return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                                                }
                                            });
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        final State state3 = (State) rememberedValue3;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changed4 = startRestartGroup.changed(bets);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    boolean BettingSheetContent$lambda$19$lambda$18;
                                                    BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                                                    return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                                                }
                                            });
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        final State state4 = (State) rememberedValue4;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changed5 = startRestartGroup.changed(bets);
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (!changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    boolean BettingSheetContent$lambda$22$lambda$21;
                                                    BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                                                    return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                                                }
                                            });
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        State state5 = (State) rememberedValue5;
                                        startRestartGroup.endReplaceGroup();
                                        BetModel BettingSheetContent$lambda$14 = BettingSheetContent$lambda$14(state2);
                                        valueOf = BettingSheetContent$lambda$14 == null ? Long.valueOf(BettingSheetContent$lambda$14.getGrabbedBetId()) : null;
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue6 = startRestartGroup.rememberedValue();
                                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(QuickBetTab.SINGLE, null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue6);
                                        }
                                        mutableState = (MutableState) rememberedValue6;
                                        startRestartGroup.endReplaceGroup();
                                        BetModel BettingSheetContent$lambda$142 = BettingSheetContent$lambda$14(state2);
                                        final boolean z8 = (BettingSheetContent$lambda$142 != null || (match = BettingSheetContent$lambda$142.getMatch()) == null || (state = match.getState()) == null || state.ordinal() != MatchState.LIVE.ordinal()) && BettingSheetContent$lambda$17(state3) && !BettingSheetContent$lambda$20(state4);
                                        max = BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE ? Math.max(500L, j4) : j4;
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
                                            rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue7);
                                        }
                                        MutableState mutableState2 = (MutableState) rememberedValue7;
                                        startRestartGroup.endReplaceGroup();
                                        BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i17 & 1879048192) != 536870912);
                                        rememberedValue8 = startRestartGroup.rememberedValue();
                                        if (!changed6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            j5 = max;
                                            quickBetTab = BettingSheetContent$lambda$25;
                                            alignment = null;
                                            l = valueOf;
                                            rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState2, j4, null);
                                            composer2 = startRestartGroup;
                                            composer2.updateRememberedValue(rememberedValue8);
                                        } else {
                                            j5 = max;
                                            quickBetTab = BettingSheetContent$lambda$25;
                                            l = valueOf;
                                            alignment = null;
                                            composer2 = startRestartGroup;
                                        }
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (!composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        final Long l2 = l;
                                        composer3 = composer2;
                                        final PlaceBetResult placeBetResult4 = placeBetResult3;
                                        final Function0<Unit> function07 = function03;
                                        final BattleCreateResult battleCreateResult4 = battleCreateResult3;
                                        final Function0<Unit> function08 = function04;
                                        TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i19) {
                                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                                                }
                                                QuickBetHeaderKt.QuickBetHeader(null, null, l2, null, false, false, false, false, composer4, 0, 251);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state2, oddType, state5, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                                            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void invoke(Composer composer4, int i19) {
                                                QuickBetTab BettingSheetContent$lambda$252;
                                                boolean BettingSheetContent$lambda$17;
                                                boolean z9;
                                                boolean BettingSheetContent$lambda$20;
                                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                                                }
                                                BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                                                long j6 = j;
                                                BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state3);
                                                if (BettingSheetContent$lambda$17) {
                                                    BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state4);
                                                    if (!BettingSheetContent$lambda$20) {
                                                        z9 = true;
                                                        BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult4, function07, battleCreateResult4, function08, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            return;
                                                        }
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                }
                                                z9 = false;
                                                BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult4, function07, battleCreateResult4, function08, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                            }
                                        }, composer3, 54), z2 || BettingSheetContent$lambda$23(state5), true, null, false, composer3, 200118, 192);
                                        composer3.startReplaceGroup(-1355900919);
                                        if (z5) {
                                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(46), 0.0f, 0.0f, 0.0f, 14, null);
                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1520paddingqDBjuR0$default);
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
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            SpeechBubbleWithTip(StringResources_androidKt.stringResource(R.string.tour_place_bet_amount_title, composer3, 6), StringResources_androidKt.stringResource(R.string.tour_place_bet_amount_subtitle, composer3, 6), TipPosition.BOTTOM_LEFT, SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(300), 1, null), composer3, 3456, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                        }
                                        composer3.endReplaceGroup();
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
                                        placeBetResult2 = placeBetResult3;
                                        function05 = function03;
                                        battleCreateResult2 = battleCreateResult3;
                                        function06 = function04;
                                        z7 = z5;
                                        tourState2 = tourState3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        placeBetResult2 = placeBetResult;
                                        function05 = function0;
                                        battleCreateResult2 = battleCreateResult;
                                        function06 = function02;
                                        tourState2 = tourState;
                                        composer3 = startRestartGroup;
                                        z7 = z4;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda14
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit BettingSheetContent$lambda$34;
                                                BettingSheetContent$lambda$34 = BettingSheetContentKt.BettingSheetContent$lambda$34(z, j, bets, oddType, j2, z2, j3, j4, onInviteUserClick, battleOpponent, placeBetResult2, function05, battleCreateResult2, function06, onDismiss, onChallengeClick, onSettingsClick, onPlaceBetClick, onAddCoinsClick, onAmountChange, onMultiBetClicked, z7, tourState2, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                return BettingSheetContent$lambda$34;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if ((i16 & 306259091) == 306259090) {
                                }
                                if (i6 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (tourState3 == null) {
                                }
                                if (tourState3 == null) {
                                }
                                if (isTourActive) {
                                }
                                Boolean valueOf22 = Boolean.valueOf(isTourActive);
                                Boolean valueOf32 = Boolean.valueOf(z5);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changed = ((i18 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf22, currentStep, valueOf32, (Function2) rememberedValue, startRestartGroup, (i18 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                                startRestartGroup.startReplaceGroup(5004770);
                                changed2 = startRestartGroup.changed(bets);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        BetModel BettingSheetContent$lambda$13$lambda$12;
                                        BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                                        return BettingSheetContent$lambda$13$lambda$12;
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                State state22 = (State) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                changed3 = startRestartGroup.changed(bets);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3) {
                                }
                                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean BettingSheetContent$lambda$16$lambda$15;
                                        BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                                        return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                final State<Boolean> state32 = (State) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                changed4 = startRestartGroup.changed(bets);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed4) {
                                }
                                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean BettingSheetContent$lambda$19$lambda$18;
                                        BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                                        return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                final State<Boolean> state42 = (State) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                changed5 = startRestartGroup.changed(bets);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!changed5) {
                                }
                                rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        boolean BettingSheetContent$lambda$22$lambda$21;
                                        BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                                        return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                State state52 = (State) rememberedValue5;
                                startRestartGroup.endReplaceGroup();
                                BetModel BettingSheetContent$lambda$143 = BettingSheetContent$lambda$14(state22);
                                if (BettingSheetContent$lambda$143 == null) {
                                }
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState = (MutableState) rememberedValue6;
                                startRestartGroup.endReplaceGroup();
                                BetModel BettingSheetContent$lambda$1422 = BettingSheetContent$lambda$14(state22);
                                if (BettingSheetContent$lambda$1422 != null) {
                                }
                                if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
                                }
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState22 = (MutableState) rememberedValue7;
                                startRestartGroup.endReplaceGroup();
                                BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i17 & 1879048192) != 536870912);
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (changed6) {
                                }
                                j5 = max;
                                quickBetTab = BettingSheetContent$lambda$25;
                                alignment = null;
                                l = valueOf;
                                rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState22, j4, null);
                                composer2 = startRestartGroup;
                                composer2.updateRememberedValue(rememberedValue8);
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
                                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, companion2);
                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting()) {
                                }
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                final Long l22 = l;
                                composer3 = composer2;
                                final PlaceBetResult placeBetResult42 = placeBetResult3;
                                final Function0<Unit> function072 = function03;
                                final BattleCreateResult battleCreateResult42 = battleCreateResult3;
                                final Function0<Unit> function082 = function04;
                                TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i19) {
                                        if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                                        }
                                        QuickBetHeaderKt.QuickBetHeader(null, null, l22, null, false, false, false, false, composer4, 0, 251);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state22, oddType, state52, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer4, int i19) {
                                        QuickBetTab BettingSheetContent$lambda$252;
                                        boolean BettingSheetContent$lambda$17;
                                        boolean z9;
                                        boolean BettingSheetContent$lambda$20;
                                        if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                                        }
                                        BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                                        long j6 = j;
                                        BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state32);
                                        if (BettingSheetContent$lambda$17) {
                                            BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state42);
                                            if (!BettingSheetContent$lambda$20) {
                                                z9 = true;
                                                BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult42, function072, battleCreateResult42, function082, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    return;
                                                }
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                        }
                                        z9 = false;
                                        BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult42, function072, battleCreateResult42, function082, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                }, composer3, 54), z2 || BettingSheetContent$lambda$23(state52), true, null, false, composer3, 200118, 192);
                                composer3.startReplaceGroup(-1355900919);
                                if (z5) {
                                }
                                composer3.endReplaceGroup();
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
                                }
                                placeBetResult2 = placeBetResult3;
                                function05 = function03;
                                battleCreateResult2 = battleCreateResult3;
                                function06 = function04;
                                z7 = z5;
                                tourState2 = tourState3;
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i17 |= i14;
                            if ((i4 & 524288) != 0) {
                            }
                            if ((i4 & 1048576) != 0) {
                            }
                            i12 = i4 & 2097152;
                            if (i12 != 0) {
                            }
                            int i182 = i11;
                            i13 = i4 & 4194304;
                            if (i13 != 0) {
                            }
                            if ((i16 & 306259091) == 306259090) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (tourState3 == null) {
                            }
                            if (tourState3 == null) {
                            }
                            if (isTourActive) {
                            }
                            Boolean valueOf222 = Boolean.valueOf(isTourActive);
                            Boolean valueOf322 = Boolean.valueOf(z5);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changed = ((i182 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf222, currentStep, valueOf322, (Function2) rememberedValue, startRestartGroup, (i182 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                            startRestartGroup.startReplaceGroup(5004770);
                            changed2 = startRestartGroup.changed(bets);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    BetModel BettingSheetContent$lambda$13$lambda$12;
                                    BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                                    return BettingSheetContent$lambda$13$lambda$12;
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            State state222 = (State) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            changed3 = startRestartGroup.changed(bets);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean BettingSheetContent$lambda$16$lambda$15;
                                    BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                                    return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            final State<Boolean> state322 = (State) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            changed4 = startRestartGroup.changed(bets);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed4) {
                            }
                            rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean BettingSheetContent$lambda$19$lambda$18;
                                    BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                                    return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            final State<Boolean> state422 = (State) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            changed5 = startRestartGroup.changed(bets);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed5) {
                            }
                            rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    boolean BettingSheetContent$lambda$22$lambda$21;
                                    BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                                    return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            State state522 = (State) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            BetModel BettingSheetContent$lambda$1432 = BettingSheetContent$lambda$14(state222);
                            if (BettingSheetContent$lambda$1432 == null) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue6;
                            startRestartGroup.endReplaceGroup();
                            BetModel BettingSheetContent$lambda$14222 = BettingSheetContent$lambda$14(state222);
                            if (BettingSheetContent$lambda$14222 != null) {
                            }
                            if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState222 = (MutableState) rememberedValue7;
                            startRestartGroup.endReplaceGroup();
                            BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i17 & 1879048192) != 536870912);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (changed6) {
                            }
                            j5 = max;
                            quickBetTab = BettingSheetContent$lambda$25;
                            alignment = null;
                            l = valueOf;
                            rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState222, j4, null);
                            composer2 = startRestartGroup;
                            composer2.updateRememberedValue(rememberedValue8);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
                            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
                            Alignment center22 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default22);
                            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                            Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, composer2, 48);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer2, companion22);
                            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                            final Long l222 = l;
                            composer3 = composer2;
                            final PlaceBetResult placeBetResult422 = placeBetResult3;
                            final Function0<Unit> function0722 = function03;
                            final BattleCreateResult battleCreateResult422 = battleCreateResult3;
                            final Function0<Unit> function0822 = function04;
                            TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i19) {
                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                                    }
                                    QuickBetHeaderKt.QuickBetHeader(null, null, l222, null, false, false, false, false, composer4, 0, 251);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state222, oddType, state522, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                                /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer4, int i19) {
                                    QuickBetTab BettingSheetContent$lambda$252;
                                    boolean BettingSheetContent$lambda$17;
                                    boolean z9;
                                    boolean BettingSheetContent$lambda$20;
                                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                                    }
                                    BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                                    long j6 = j;
                                    BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state322);
                                    if (BettingSheetContent$lambda$17) {
                                        BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state422);
                                        if (!BettingSheetContent$lambda$20) {
                                            z9 = true;
                                            BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult422, function0722, battleCreateResult422, function0822, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                    }
                                    z9 = false;
                                    BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult422, function0722, battleCreateResult422, function0822, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }, composer3, 54), z2 || BettingSheetContent$lambda$23(state522), true, null, false, composer3, 200118, 192);
                            composer3.startReplaceGroup(-1355900919);
                            if (z5) {
                            }
                            composer3.endReplaceGroup();
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
                            }
                            placeBetResult2 = placeBetResult3;
                            function05 = function03;
                            battleCreateResult2 = battleCreateResult3;
                            function06 = function04;
                            z7 = z5;
                            tourState2 = tourState3;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        if ((i4 & 32768) == 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        i17 |= i14;
                        if ((i4 & 524288) != 0) {
                        }
                        if ((i4 & 1048576) != 0) {
                        }
                        i12 = i4 & 2097152;
                        if (i12 != 0) {
                        }
                        int i1822 = i11;
                        i13 = i4 & 4194304;
                        if (i13 != 0) {
                        }
                        if ((i16 & 306259091) == 306259090) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (tourState3 == null) {
                        }
                        if (tourState3 == null) {
                        }
                        if (isTourActive) {
                        }
                        Boolean valueOf2222 = Boolean.valueOf(isTourActive);
                        Boolean valueOf3222 = Boolean.valueOf(z5);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed = ((i1822 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf2222, currentStep, valueOf3222, (Function2) rememberedValue, startRestartGroup, (i1822 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                        startRestartGroup.startReplaceGroup(5004770);
                        changed2 = startRestartGroup.changed(bets);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                BetModel BettingSheetContent$lambda$13$lambda$12;
                                BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                                return BettingSheetContent$lambda$13$lambda$12;
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        State state2222 = (State) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        changed3 = startRestartGroup.changed(bets);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean BettingSheetContent$lambda$16$lambda$15;
                                BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                                return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        final State<Boolean> state3222 = (State) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        changed4 = startRestartGroup.changed(bets);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean BettingSheetContent$lambda$19$lambda$18;
                                BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                                return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        final State<Boolean> state4222 = (State) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        changed5 = startRestartGroup.changed(bets);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed5) {
                        }
                        rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean BettingSheetContent$lambda$22$lambda$21;
                                BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                                return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        State state5222 = (State) rememberedValue5;
                        startRestartGroup.endReplaceGroup();
                        BetModel BettingSheetContent$lambda$14322 = BettingSheetContent$lambda$14(state2222);
                        if (BettingSheetContent$lambda$14322 == null) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue6;
                        startRestartGroup.endReplaceGroup();
                        BetModel BettingSheetContent$lambda$142222 = BettingSheetContent$lambda$14(state2222);
                        if (BettingSheetContent$lambda$142222 != null) {
                        }
                        if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState2222 = (MutableState) rememberedValue7;
                        startRestartGroup.endReplaceGroup();
                        BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i17 & 1879048192) != 536870912);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (changed6) {
                        }
                        j5 = max;
                        quickBetTab = BettingSheetContent$lambda$25;
                        alignment = null;
                        l = valueOf;
                        rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState2222, j4, null);
                        composer2 = startRestartGroup;
                        composer2.updateRememberedValue(rememberedValue8);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
                        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
                        Alignment center222 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap422 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default222);
                        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion222 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer2, companion222);
                        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                        final Long l2222 = l;
                        composer3 = composer2;
                        final PlaceBetResult placeBetResult4222 = placeBetResult3;
                        final Function0<Unit> function07222 = function03;
                        final BattleCreateResult battleCreateResult4222 = battleCreateResult3;
                        final Function0<Unit> function08222 = function04;
                        TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i19) {
                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                                }
                                QuickBetHeaderKt.QuickBetHeader(null, null, l2222, null, false, false, false, false, composer4, 0, 251);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state2222, oddType, state5222, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(Composer composer4, int i19) {
                                QuickBetTab BettingSheetContent$lambda$252;
                                boolean BettingSheetContent$lambda$17;
                                boolean z9;
                                boolean BettingSheetContent$lambda$20;
                                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                                }
                                BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                                long j6 = j;
                                BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state3222);
                                if (BettingSheetContent$lambda$17) {
                                    BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state4222);
                                    if (!BettingSheetContent$lambda$20) {
                                        z9 = true;
                                        BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult4222, function07222, battleCreateResult4222, function08222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            return;
                                        }
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                }
                                z9 = false;
                                BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult4222, function07222, battleCreateResult4222, function08222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }, composer3, 54), z2 || BettingSheetContent$lambda$23(state5222), true, null, false, composer3, 200118, 192);
                        composer3.startReplaceGroup(-1355900919);
                        if (z5) {
                        }
                        composer3.endReplaceGroup();
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
                        }
                        placeBetResult2 = placeBetResult3;
                        function05 = function03;
                        battleCreateResult2 = battleCreateResult3;
                        function06 = function04;
                        z7 = z5;
                        tourState2 = tourState3;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i4 & 8192;
                    if (i10 != 0) {
                    }
                    if ((i4 & 32768) == 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    i17 |= i14;
                    if ((i4 & 524288) != 0) {
                    }
                    if ((i4 & 1048576) != 0) {
                    }
                    i12 = i4 & 2097152;
                    if (i12 != 0) {
                    }
                    int i18222 = i11;
                    i13 = i4 & 4194304;
                    if (i13 != 0) {
                    }
                    if ((i16 & 306259091) == 306259090) {
                    }
                    if (i6 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (tourState3 == null) {
                    }
                    if (tourState3 == null) {
                    }
                    if (isTourActive) {
                    }
                    Boolean valueOf22222 = Boolean.valueOf(isTourActive);
                    Boolean valueOf32222 = Boolean.valueOf(z5);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed = ((i18222 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf22222, currentStep, valueOf32222, (Function2) rememberedValue, startRestartGroup, (i18222 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                    startRestartGroup.startReplaceGroup(5004770);
                    changed2 = startRestartGroup.changed(bets);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            BetModel BettingSheetContent$lambda$13$lambda$12;
                            BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                            return BettingSheetContent$lambda$13$lambda$12;
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    State state22222 = (State) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changed3 = startRestartGroup.changed(bets);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean BettingSheetContent$lambda$16$lambda$15;
                            BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                            return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    final State<Boolean> state32222 = (State) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changed4 = startRestartGroup.changed(bets);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean BettingSheetContent$lambda$19$lambda$18;
                            BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                            return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    final State<Boolean> state42222 = (State) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changed5 = startRestartGroup.changed(bets);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed5) {
                    }
                    rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean BettingSheetContent$lambda$22$lambda$21;
                            BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                            return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    State state52222 = (State) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    BetModel BettingSheetContent$lambda$143222 = BettingSheetContent$lambda$14(state22222);
                    if (BettingSheetContent$lambda$143222 == null) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    BetModel BettingSheetContent$lambda$1422222 = BettingSheetContent$lambda$14(state22222);
                    if (BettingSheetContent$lambda$1422222 != null) {
                    }
                    if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState22222 = (MutableState) rememberedValue7;
                    startRestartGroup.endReplaceGroup();
                    BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i17 & 1879048192) != 536870912);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (changed6) {
                    }
                    j5 = max;
                    quickBetTab = BettingSheetContent$lambda$25;
                    alignment = null;
                    l = valueOf;
                    rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState22222, j4, null);
                    composer2 = startRestartGroup;
                    composer2.updateRememberedValue(rememberedValue8);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
                    Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
                    Alignment center2222 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4222 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2222);
                    Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Modifier.Companion companion2222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap22222 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer2, companion2222);
                    Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                    final Long l22222 = l;
                    composer3 = composer2;
                    final PlaceBetResult placeBetResult42222 = placeBetResult3;
                    final Function0<Unit> function072222 = function03;
                    final BattleCreateResult battleCreateResult42222 = battleCreateResult3;
                    final Function0<Unit> function082222 = function04;
                    TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i19) {
                            if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                            }
                            QuickBetHeaderKt.QuickBetHeader(null, null, l22222, null, false, false, false, false, composer4, 0, 251);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state22222, oddType, state52222, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer4, int i19) {
                            QuickBetTab BettingSheetContent$lambda$252;
                            boolean BettingSheetContent$lambda$17;
                            boolean z9;
                            boolean BettingSheetContent$lambda$20;
                            if ((i19 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                            }
                            BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                            long j6 = j;
                            BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state32222);
                            if (BettingSheetContent$lambda$17) {
                                BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state42222);
                                if (!BettingSheetContent$lambda$20) {
                                    z9 = true;
                                    BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult42222, function072222, battleCreateResult42222, function082222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        return;
                                    }
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                            }
                            z9 = false;
                            BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult42222, function072222, battleCreateResult42222, function082222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }, composer3, 54), z2 || BettingSheetContent$lambda$23(state52222), true, null, false, composer3, 200118, 192);
                    composer3.startReplaceGroup(-1355900919);
                    if (z5) {
                    }
                    composer3.endReplaceGroup();
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
                    }
                    placeBetResult2 = placeBetResult3;
                    function05 = function03;
                    battleCreateResult2 = battleCreateResult3;
                    function06 = function04;
                    z7 = z5;
                    tourState2 = tourState3;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i4 & 1024;
                if (i6 == 0) {
                }
                i8 = i4 & 2048;
                if (i8 == 0) {
                }
                int i172 = i7;
                i9 = i4 & 4096;
                if (i9 == 0) {
                }
                i10 = i4 & 8192;
                if (i10 != 0) {
                }
                if ((i4 & 32768) == 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                i172 |= i14;
                if ((i4 & 524288) != 0) {
                }
                if ((i4 & 1048576) != 0) {
                }
                i12 = i4 & 2097152;
                if (i12 != 0) {
                }
                int i182222 = i11;
                i13 = i4 & 4194304;
                if (i13 != 0) {
                }
                if ((i16 & 306259091) == 306259090) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (tourState3 == null) {
                }
                if (tourState3 == null) {
                }
                if (isTourActive) {
                }
                Boolean valueOf222222 = Boolean.valueOf(isTourActive);
                Boolean valueOf322222 = Boolean.valueOf(z5);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed = ((i182222 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf222222, currentStep, valueOf322222, (Function2) rememberedValue, startRestartGroup, (i182222 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                startRestartGroup.startReplaceGroup(5004770);
                changed2 = startRestartGroup.changed(bets);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BetModel BettingSheetContent$lambda$13$lambda$12;
                        BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                        return BettingSheetContent$lambda$13$lambda$12;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
                State state222222 = (State) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                changed3 = startRestartGroup.changed(bets);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BettingSheetContent$lambda$16$lambda$15;
                        BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                        return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue3);
                final State<Boolean> state322222 = (State) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                changed4 = startRestartGroup.changed(bets);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BettingSheetContent$lambda$19$lambda$18;
                        BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                        return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
                final State<Boolean> state422222 = (State) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                changed5 = startRestartGroup.changed(bets);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed5) {
                }
                rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BettingSheetContent$lambda$22$lambda$21;
                        BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                        return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue5);
                State state522222 = (State) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                BetModel BettingSheetContent$lambda$1432222 = BettingSheetContent$lambda$14(state222222);
                if (BettingSheetContent$lambda$1432222 == null) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                BetModel BettingSheetContent$lambda$14222222 = BettingSheetContent$lambda$14(state222222);
                if (BettingSheetContent$lambda$14222222 != null) {
                }
                if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState222222 = (MutableState) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i172 & 1879048192) != 536870912);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (changed6) {
                }
                j5 = max;
                quickBetTab = BettingSheetContent$lambda$25;
                alignment = null;
                l = valueOf;
                rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState222222, j4, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue8);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
                Alignment center22222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap42222 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default22222);
                Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally22222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion22222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap222222 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(composer2, companion22222);
                Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                final Long l222222 = l;
                composer3 = composer2;
                final PlaceBetResult placeBetResult422222 = placeBetResult3;
                final Function0<Unit> function0722222 = function03;
                final BattleCreateResult battleCreateResult422222 = battleCreateResult3;
                final Function0<Unit> function0822222 = function04;
                TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i19) {
                        if ((i19 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                        }
                        QuickBetHeaderKt.QuickBetHeader(null, null, l222222, null, false, false, false, false, composer4, 0, 251);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state222222, oddType, state522222, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer4, int i19) {
                        QuickBetTab BettingSheetContent$lambda$252;
                        boolean BettingSheetContent$lambda$17;
                        boolean z9;
                        boolean BettingSheetContent$lambda$20;
                        if ((i19 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                        }
                        BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                        long j6 = j;
                        BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state322222);
                        if (BettingSheetContent$lambda$17) {
                            BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state422222);
                            if (!BettingSheetContent$lambda$20) {
                                z9 = true;
                                BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult422222, function0722222, battleCreateResult422222, function0822222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                        }
                        z9 = false;
                        BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult422222, function0722222, battleCreateResult422222, function0822222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }, composer3, 54), z2 || BettingSheetContent$lambda$23(state522222), true, null, false, composer3, 200118, 192);
                composer3.startReplaceGroup(-1355900919);
                if (z5) {
                }
                composer3.endReplaceGroup();
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
                }
                placeBetResult2 = placeBetResult3;
                function05 = function03;
                battleCreateResult2 = battleCreateResult3;
                function06 = function04;
                z7 = z5;
                tourState2 = tourState3;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i16 |= i15;
            if ((i4 & 512) != 0) {
            }
            i6 = i4 & 1024;
            if (i6 == 0) {
            }
            i8 = i4 & 2048;
            if (i8 == 0) {
            }
            int i1722 = i7;
            i9 = i4 & 4096;
            if (i9 == 0) {
            }
            i10 = i4 & 8192;
            if (i10 != 0) {
            }
            if ((i4 & 32768) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            i1722 |= i14;
            if ((i4 & 524288) != 0) {
            }
            if ((i4 & 1048576) != 0) {
            }
            i12 = i4 & 2097152;
            if (i12 != 0) {
            }
            int i1822222 = i11;
            i13 = i4 & 4194304;
            if (i13 != 0) {
            }
            if ((i16 & 306259091) == 306259090) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (tourState3 == null) {
            }
            if (tourState3 == null) {
            }
            if (isTourActive) {
            }
            Boolean valueOf2222222 = Boolean.valueOf(isTourActive);
            Boolean valueOf3222222 = Boolean.valueOf(z5);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = ((i1822222 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2222222, currentStep, valueOf3222222, (Function2) rememberedValue, startRestartGroup, (i1822222 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
            startRestartGroup.startReplaceGroup(5004770);
            changed2 = startRestartGroup.changed(bets);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BetModel BettingSheetContent$lambda$13$lambda$12;
                    BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                    return BettingSheetContent$lambda$13$lambda$12;
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue2);
            State state2222222 = (State) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changed3 = startRestartGroup.changed(bets);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean BettingSheetContent$lambda$16$lambda$15;
                    BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                    return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue3);
            final State<Boolean> state3222222 = (State) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changed4 = startRestartGroup.changed(bets);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean BettingSheetContent$lambda$19$lambda$18;
                    BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                    return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue4);
            final State<Boolean> state4222222 = (State) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changed5 = startRestartGroup.changed(bets);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean BettingSheetContent$lambda$22$lambda$21;
                    BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                    return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue5);
            State state5222222 = (State) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            BetModel BettingSheetContent$lambda$14322222 = BettingSheetContent$lambda$14(state2222222);
            if (BettingSheetContent$lambda$14322222 == null) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            BetModel BettingSheetContent$lambda$142222222 = BettingSheetContent$lambda$14(state2222222);
            if (BettingSheetContent$lambda$142222222 != null) {
            }
            if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState2222222 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i1722 & 1879048192) != 536870912);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed6) {
            }
            j5 = max;
            quickBetTab = BettingSheetContent$lambda$25;
            alignment = null;
            l = valueOf;
            rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState2222222, j4, null);
            composer2 = startRestartGroup;
            composer2.updateRememberedValue(rememberedValue8);
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
            Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
            Alignment center222222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322222 = BoxKt.maybeCachedBoxMeasurePolicy(center222222, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap422222 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default222222);
            Function0<ComposeUiNode> constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally222222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion222222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222222, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2222222 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(composer2, companion222222);
            Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
            final Long l2222222 = l;
            composer3 = composer2;
            final PlaceBetResult placeBetResult4222222 = placeBetResult3;
            final Function0<Unit> function07222222 = function03;
            final BattleCreateResult battleCreateResult4222222 = battleCreateResult3;
            final Function0<Unit> function08222222 = function04;
            TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i19) {
                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                    }
                    QuickBetHeaderKt.QuickBetHeader(null, null, l2222222, null, false, false, false, false, composer4, 0, 251);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state2222222, oddType, state5222222, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer4, int i19) {
                    QuickBetTab BettingSheetContent$lambda$252;
                    boolean BettingSheetContent$lambda$17;
                    boolean z9;
                    boolean BettingSheetContent$lambda$20;
                    if ((i19 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                    }
                    BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                    long j6 = j;
                    BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state3222222);
                    if (BettingSheetContent$lambda$17) {
                        BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state4222222);
                        if (!BettingSheetContent$lambda$20) {
                            z9 = true;
                            BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult4222222, function07222222, battleCreateResult4222222, function08222222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                    }
                    z9 = false;
                    BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult4222222, function07222222, battleCreateResult4222222, function08222222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }, composer3, 54), z2 || BettingSheetContent$lambda$23(state5222222), true, null, false, composer3, 200118, 192);
            composer3.startReplaceGroup(-1355900919);
            if (z5) {
            }
            composer3.endReplaceGroup();
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
            }
            placeBetResult2 = placeBetResult3;
            function05 = function03;
            battleCreateResult2 = battleCreateResult3;
            function06 = function04;
            z7 = z5;
            tourState2 = tourState3;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) != 0) {
        }
        i16 |= i15;
        if ((i4 & 512) != 0) {
        }
        i6 = i4 & 1024;
        if (i6 == 0) {
        }
        i8 = i4 & 2048;
        if (i8 == 0) {
        }
        int i17222 = i7;
        i9 = i4 & 4096;
        if (i9 == 0) {
        }
        i10 = i4 & 8192;
        if (i10 != 0) {
        }
        if ((i4 & 32768) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        i17222 |= i14;
        if ((i4 & 524288) != 0) {
        }
        if ((i4 & 1048576) != 0) {
        }
        i12 = i4 & 2097152;
        if (i12 != 0) {
        }
        int i18222222 = i11;
        i13 = i4 & 4194304;
        if (i13 != 0) {
        }
        if ((i16 & 306259091) == 306259090) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (tourState3 == null) {
        }
        if (tourState3 == null) {
        }
        if (isTourActive) {
        }
        Boolean valueOf22222222 = Boolean.valueOf(isTourActive);
        Boolean valueOf32222222 = Boolean.valueOf(z5);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = ((i18222222 & 112) != 32) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(z6);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BettingSheetContentKt$BettingSheetContent$3$1(isTourActive, currentStep, z5, z6, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf22222222, currentStep, valueOf32222222, (Function2) rememberedValue, startRestartGroup, (i18222222 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
        startRestartGroup.startReplaceGroup(5004770);
        changed2 = startRestartGroup.changed(bets);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BetModel BettingSheetContent$lambda$13$lambda$12;
                BettingSheetContent$lambda$13$lambda$12 = BettingSheetContentKt.BettingSheetContent$lambda$13$lambda$12(bets);
                return BettingSheetContent$lambda$13$lambda$12;
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue2);
        State state22222222 = (State) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changed3 = startRestartGroup.changed(bets);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean BettingSheetContent$lambda$16$lambda$15;
                BettingSheetContent$lambda$16$lambda$15 = BettingSheetContentKt.BettingSheetContent$lambda$16$lambda$15(bets);
                return Boolean.valueOf(BettingSheetContent$lambda$16$lambda$15);
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue3);
        final State<Boolean> state32222222 = (State) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changed4 = startRestartGroup.changed(bets);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean BettingSheetContent$lambda$19$lambda$18;
                BettingSheetContent$lambda$19$lambda$18 = BettingSheetContentKt.BettingSheetContent$lambda$19$lambda$18(bets);
                return Boolean.valueOf(BettingSheetContent$lambda$19$lambda$18);
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue4);
        final State<Boolean> state42222222 = (State) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changed5 = startRestartGroup.changed(bets);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean BettingSheetContent$lambda$22$lambda$21;
                BettingSheetContent$lambda$22$lambda$21 = BettingSheetContentKt.BettingSheetContent$lambda$22$lambda$21(bets);
                return Boolean.valueOf(BettingSheetContent$lambda$22$lambda$21);
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue5);
        State state52222222 = (State) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        BetModel BettingSheetContent$lambda$143222222 = BettingSheetContent$lambda$14(state22222222);
        if (BettingSheetContent$lambda$143222222 == null) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        BetModel BettingSheetContent$lambda$1422222222 = BettingSheetContent$lambda$14(state22222222);
        if (BettingSheetContent$lambda$1422222222 != null) {
        }
        if (BettingSheetContent$lambda$25(mutableState) != QuickBetTab.BATTLE) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 != Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState22222222 = (MutableState) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        BettingSheetContent$lambda$25 = BettingSheetContent$lambda$25(mutableState);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed6 = ((i16 & 29360128) != 8388608) | ((i16 & 112) != 32) | startRestartGroup.changed(max) | ((i17222 & 1879048192) != 536870912);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (changed6) {
        }
        j5 = max;
        quickBetTab = BettingSheetContent$lambda$25;
        alignment = null;
        l = valueOf;
        rememberedValue8 = new BettingSheetContentKt$BettingSheetContent$4$1(j, max, onAmountChange, mutableState, mutableState22222222, j4, null);
        composer2 = startRestartGroup;
        composer2.updateRememberedValue(rememberedValue8);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(quickBetTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, 0);
        Modifier fillMaxWidth$default2222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, alignment);
        Alignment center2222222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3222222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222222, false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap4222222 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222222 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2222222);
        Function0<ComposeUiNode> constructor4222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3222222 = BoxScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally2222222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion2222222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222222, composer2, 48);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22222222 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(composer2, companion2222222);
        Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
        final Long l22222222 = l;
        composer3 = composer2;
        final PlaceBetResult placeBetResult42222222 = placeBetResult3;
        final Function0<Unit> function072222222 = function03;
        final BattleCreateResult battleCreateResult42222222 = battleCreateResult3;
        final Function0<Unit> function082222222 = function04;
        TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(Modifier.INSTANCE, alignment, false, 3, alignment), 0.0f, 1, alignment), QuickBetDimens.INSTANCE.m13589getTicketHorizontalPaddingD9Ej5fM(), 0.0f, 2, alignment), ComposableLambdaKt.rememberComposableLambda(-1516851271, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer4, int i19) {
                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                    composer4.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1516851271, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:239)");
                }
                QuickBetHeaderKt.QuickBetHeader(null, null, l22222222, null, false, false, false, false, composer4, 0, 251);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1736631878, true, new BettingSheetContentKt$BettingSheetContent$5$1$2(z8, j, j2, j5, onAmountChange, z, bets, state22222222, oddType, state52222222, mutableState), composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1956412485, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(Composer composer4, int i19) {
                QuickBetTab BettingSheetContent$lambda$252;
                boolean BettingSheetContent$lambda$17;
                boolean z9;
                boolean BettingSheetContent$lambda$20;
                if ((i19 & 3) == 2 && composer4.getSkipping()) {
                    composer4.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1956412485, i19, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:241)");
                }
                BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
                long j6 = j;
                BettingSheetContent$lambda$17 = BettingSheetContentKt.BettingSheetContent$lambda$17(state32222222);
                if (BettingSheetContent$lambda$17) {
                    BettingSheetContent$lambda$20 = BettingSheetContentKt.BettingSheetContent$lambda$20(state42222222);
                    if (!BettingSheetContent$lambda$20) {
                        z9 = true;
                        BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult42222222, function072222222, battleCreateResult42222222, function082222222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            return;
                        }
                        ComposerKt.traceEventEnd();
                        return;
                    }
                }
                z9 = false;
                BettingSheetContentKt.QuickBetBottomAction(BettingSheetContent$lambda$252, j6, z9, z8, z, battleOpponent, placeBetResult42222222, function072222222, battleCreateResult42222222, function082222222, onPlaceBetClick, onMultiBetClicked, onChallengeClick, onInviteUserClick, composer4, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }, composer3, 54), z2 || BettingSheetContent$lambda$23(state52222222), true, null, false, composer3, 200118, 192);
        composer3.startReplaceGroup(-1355900919);
        if (z5) {
        }
        composer3.endReplaceGroup();
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
        }
        placeBetResult2 = placeBetResult3;
        function05 = function03;
        battleCreateResult2 = battleCreateResult3;
        function06 = function04;
        z7 = z5;
        tourState2 = tourState3;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BetModel BettingSheetContent$lambda$13$lambda$12(List list) {
        return (BetModel) CollectionsKt.firstOrNull(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BettingSheetContent$lambda$16$lambda$15(List list) {
        BetModel betModel = (BetModel) CollectionsKt.firstOrNull(list);
        return (betModel == null || !betModel.isAvailable() || betModel.isDeleted()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BettingSheetContent$lambda$19$lambda$18(List list) {
        BetModel betModel = (BetModel) CollectionsKt.firstOrNull(list);
        return betModel != null && betModel.isDeleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BettingSheetContent$lambda$22$lambda$21(List list) {
        BetModel betModel = (BetModel) CollectionsKt.firstOrNull(list);
        return betModel != null && (!betModel.isAvailable() || betModel.isDeleted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickBetTab BettingSheetContent$lambda$25(MutableState<QuickBetTab> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long BettingSheetContent$lambda$28(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0171, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickBetBottomAction(final QuickBetTab quickBetTab, final long j, final boolean z, final boolean z2, final boolean z3, final BattleOpponent battleOpponent, final PlaceBetResult placeBetResult, final Function0<Unit> function0, final BattleCreateResult battleCreateResult, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, final Function0<Unit> function06, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        int i8;
        Function0 function07;
        Function0 function08;
        Composer startRestartGroup = composer.startRestartGroup(1374794245);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(quickBetTab.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(battleOpponent) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(placeBetResult) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(battleCreateResult) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function03) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function04) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function05) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function06) ? 2048 : 1024;
        }
        int i9 = i4;
        if ((i3 & 306783379) != 306783378 || (i9 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374794245, i3, i9, "org.betup.ui.fragment.bets.sheet.compose.QuickBetBottomAction (BettingSheetContent.kt:429)");
            }
            final Function1<HapticFeedbackType, Unit> rememberHapticFeedback = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed = startRestartGroup.changed(rememberHapticFeedback);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed) {
                i5 = i9;
            } else {
                i5 = i9;
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit QuickBetBottomAction$lambda$36$lambda$35;
                    QuickBetBottomAction$lambda$36$lambda$35 = BettingSheetContentKt.QuickBetBottomAction$lambda$36$lambda$35(Function1.this);
                    return QuickBetBottomAction$lambda$36$lambda$35;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed2 = startRestartGroup.changed(rememberHapticFeedback);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit QuickBetBottomAction$lambda$38$lambda$37;
                        QuickBetBottomAction$lambda$38$lambda$37 = BettingSheetContentKt.QuickBetBottomAction$lambda$38$lambda$37(Function1.this);
                        return QuickBetBottomAction$lambda$38$lambda$37;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function09 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed3 = startRestartGroup.changed(rememberHapticFeedback);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit QuickBetBottomAction$lambda$40$lambda$39;
                        QuickBetBottomAction$lambda$40$lambda$39 = BettingSheetContentKt.QuickBetBottomAction$lambda$40$lambda$39(Function1.this);
                        return QuickBetBottomAction$lambda$40$lambda$39;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function010 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1224400529);
            int i10 = 29360128 & i3;
            boolean changed4 = ((i3 & 3670016) == 1048576) | startRestartGroup.changed(function09) | startRestartGroup.changed(function010) | (i10 == 8388608);
            BettingSheetContentKt$QuickBetBottomAction$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                i6 = i5;
                i7 = i3;
                composer2 = startRestartGroup;
                i8 = i10;
                function07 = function09;
                function08 = function010;
                rememberedValue4 = new BettingSheetContentKt$QuickBetBottomAction$1$1(placeBetResult, function09, function010, function0, null);
                composer2.updateRememberedValue(rememberedValue4);
            } else {
                i7 = i3;
                composer2 = startRestartGroup;
                i8 = i10;
                function07 = function09;
                function08 = function010;
                i6 = i5;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(placeBetResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i7 >> 18) & 14);
            composer2.startReplaceGroup(-1224400529);
            int i11 = i7 & 1879048192;
            boolean changed5 = composer2.changed(function07) | ((i7 & 234881024) == 67108864) | composer2.changed(function08) | (i11 == 536870912);
            BettingSheetContentKt$QuickBetBottomAction$2$1 rememberedValue5 = composer2.rememberedValue();
            if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new BettingSheetContentKt$QuickBetBottomAction$2$1(battleCreateResult, function07, function08, function02, null);
                composer2.updateRememberedValue(rememberedValue5);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(battleCreateResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, (i7 >> 24) & 14);
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), QuickBetDimens.INSTANCE.m13551getCtaHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13552getCtaVerticalPaddingD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
            int i12 = WhenMappings.$EnumSwitchMapping$0[quickBetTab.ordinal()];
            if (i12 == 1) {
                composer2.startReplaceGroup(-758592373);
                if (Intrinsics.areEqual(placeBetResult, PlaceBetResult.Success.INSTANCE)) {
                    composer2.startReplaceGroup(-758560567);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String stringResource = StringResources_androidKt.stringResource(R.string.quick_bet_bet_placed, composer2, 6);
                    SolidColor solidColor = new SolidColor(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
                    long j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    composer2.startReplaceGroup(1849434622);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    composer2.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default, true, stringResource, true, false, false, (Function0) rememberedValue6, false, false, false, false, false, solidColor, Color.m5158boximpl(j2), false, false, null, null, null, null, null, composer2, 1575990, 0, 0, 2084784);
                    composer2.endReplaceGroup();
                } else if (Intrinsics.areEqual(placeBetResult, PlaceBetResult.Error.INSTANCE)) {
                    composer2.startReplaceGroup(-757957121);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String stringResource2 = StringResources_androidKt.stringResource(R.string.quick_bet_place_failed_retry, composer2, 6);
                    SolidColor solidColor2 = new SolidColor(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), null);
                    long j3 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    HapticFeedbackType hapticFeedbackType = HapticFeedbackType.Confirm;
                    composer2.startReplaceGroup(-1633490746);
                    boolean z4 = (i8 == 8388608) | ((i6 & 14) == 4);
                    Object rememberedValue7 = composer2.rememberedValue();
                    if (z4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit QuickBetBottomAction$lambda$51$lambda$46$lambda$45;
                                QuickBetBottomAction$lambda$51$lambda$46$lambda$45 = BettingSheetContentKt.QuickBetBottomAction$lambda$51$lambda$46$lambda$45(Function0.this, function03);
                                return QuickBetBottomAction$lambda$51$lambda$46$lambda$45;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default2, true, stringResource2, true, false, false, (Function0) rememberedValue7, false, false, false, false, false, solidColor2, Color.m5158boximpl(j3), true, false, null, null, null, null, hapticFeedbackType, composer2, 3126, 24576, 6, 1019824);
                    composer2.endReplaceGroup();
                } else {
                    if (placeBetResult != null) {
                        composer2.startReplaceGroup(806813815);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-757115347);
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.quick_bet_place_bet_amount, new Object[]{FormatHelper.getShopBetcoinsFormated(j)}, composer2, 6), true, false, z && !z3, function03, false, false, false, z3, false, null, null, true, false, null, null, null, null, HapticFeedbackType.Confirm, composer2, ((i6 << 18) & 3670016) | 3126, ((i7 >> 12) & 14) | 24576, 6, 1031056);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i12 == 2) {
                composer2.startReplaceGroup(-756286531);
                CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.quick_bet_add_to_betslip, composer2, 6), true, false, false, function04, false, false, false, false, false, new SolidColor(ComposeUtils.AppColorPalette.Blue.INSTANCE.getColor(), null), Color.m5158boximpl(ComposeUtils.AppColorPalette.White.INSTANCE.getColor()), true, false, null, null, null, null, HapticFeedbackType.Confirm, composer2, ((i6 << 15) & 3670016) | 3126, 24576, 6, 1019824);
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else {
                if (i12 != 3) {
                    composer2.startReplaceGroup(806815910);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-755562526);
                if (battleOpponent != null) {
                    composer2.startReplaceGroup(-755530286);
                    InvitedOpponentButton(battleOpponent, z2 && !z3, function06, composer2, ((i7 >> 15) & 14) | ((i6 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-755262756);
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(R.string.quick_bet_invite_user, composer2, 6), true, false, z2 && !z3, function06, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer2, ((i6 << 9) & 3670016) | 3126, 24576, 0, 2080656);
                    composer2.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13543getBattleButtonsSpacingD9Ej5fM()), composer2, 6);
                if (Intrinsics.areEqual(battleCreateResult, BattleCreateResult.Success.INSTANCE)) {
                    composer2.startReplaceGroup(-754609307);
                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String stringResource3 = StringResources_androidKt.stringResource(R.string.quick_bet_battle_created, composer2, 6);
                    SolidColor solidColor3 = new SolidColor(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
                    long j4 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    composer2.startReplaceGroup(1849434622);
                    Object rememberedValue8 = composer2.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit3;
                                unit3 = Unit.INSTANCE;
                                return unit3;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    composer2.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default3, true, stringResource3, true, false, false, (Function0) rememberedValue8, false, false, false, false, false, solidColor3, Color.m5158boximpl(j4), false, false, null, null, null, null, null, composer2, 1575990, 0, 0, 2084784);
                    composer2.endReplaceGroup();
                } else if (Intrinsics.areEqual(battleCreateResult, BattleCreateResult.Error.INSTANCE)) {
                    composer2.startReplaceGroup(-753997863);
                    Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String stringResource4 = StringResources_androidKt.stringResource(R.string.quick_bet_battle_failed_retry, composer2, 6);
                    SolidColor solidColor4 = new SolidColor(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), null);
                    long j5 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    HapticFeedbackType hapticFeedbackType2 = HapticFeedbackType.Confirm;
                    composer2.startReplaceGroup(-1633490746);
                    boolean z5 = (i11 == 536870912) | ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                    Object rememberedValue9 = composer2.rememberedValue();
                    if (z5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit QuickBetBottomAction$lambda$51$lambda$50$lambda$49;
                                QuickBetBottomAction$lambda$51$lambda$50$lambda$49 = BettingSheetContentKt.QuickBetBottomAction$lambda$51$lambda$50$lambda$49(Function0.this, function05);
                                return QuickBetBottomAction$lambda$51$lambda$50$lambda$49;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    composer2.endReplaceGroup();
                    CommonButtonKt.m12915CommonButtonUPEs2M4(fillMaxWidth$default4, true, stringResource4, true, false, false, (Function0) rememberedValue9, false, false, false, false, false, solidColor4, Color.m5158boximpl(j5), true, false, null, null, null, null, hapticFeedbackType2, composer2, 3126, 24576, 6, 1019824);
                    composer2.endReplaceGroup();
                } else {
                    if (battleCreateResult != null) {
                        composer2.startReplaceGroup(806941374);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-753139876);
                    CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, StringResources_androidKt.stringResource(battleOpponent != null ? R.string.quick_bet_create_private_battle : R.string.quick_bet_create_public_battle, composer2, 0), true, false, z2 && !z3, function05, false, false, false, z3, false, new SolidColor(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null), Color.m5158boximpl(ComposeUtils.AppColorPalette.White.INSTANCE.getColor()), true, false, null, null, null, null, HapticFeedbackType.Confirm, composer2, ((i6 << 12) & 3670016) | 3126, ((i7 >> 12) & 14) | 24576, 6, 1018768);
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Unit unit32 = Unit.INSTANCE;
            }
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuickBetBottomAction$lambda$52;
                    QuickBetBottomAction$lambda$52 = BettingSheetContentKt.QuickBetBottomAction$lambda$52(QuickBetTab.this, j, z, z2, z3, battleOpponent, placeBetResult, function0, battleCreateResult, function02, function03, function04, function05, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return QuickBetBottomAction$lambda$52;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetBottomAction$lambda$36$lambda$35(Function1 function1) {
        function1.invoke(HapticFeedbackType.Confirm);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetBottomAction$lambda$38$lambda$37(Function1 function1) {
        function1.invoke(HapticFeedbackType.PlaceBetSuccess);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetBottomAction$lambda$40$lambda$39(Function1 function1) {
        function1.invoke(HapticFeedbackType.Reject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetBottomAction$lambda$51$lambda$46$lambda$45(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetBottomAction$lambda$51$lambda$50$lambda$49(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    private static final void InvitedOpponentButton(final BattleOpponent battleOpponent, boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Brush brush;
        boolean z2;
        long j;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-737010733);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(battleOpponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-737010733, i2, -1, "org.betup.ui.fragment.bets.sheet.compose.InvitedOpponentButton (BettingSheetContent.kt:624)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            if (z) {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
            } else {
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
            }
            Brush brush2 = brush;
            float f = 100;
            z2 = z;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickAnimationModifierKt.subtleClickAnimation(ClipKt.clip(BackgroundKt.background$default(fillMaxWidth$default, brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), function0, null, z, 0, false, false, 0.97f, false, 0.18f, null, startRestartGroup, ((i2 >> 3) & 112) | 817889280 | ((i2 << 6) & 7168), 0, 698), QuickBetDimens.INSTANCE.m13561getOpponentPillHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13562getOpponentPillVerticalPaddingD9Ej5fM());
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
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(battleOpponent.getPhotoUrl(), null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13558getOpponentAvatarSizeD9Ej5fM()), RoundedCornerShapeKt.getCircleShape()), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, 32736);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13559getOpponentAvatarSpacingD9Ej5fM()), startRestartGroup, 6);
            String name = battleOpponent.getName();
            long m13560getOpponentFontSizeXSAIIZE = QuickBetDimens.INSTANCE.m13560getOpponentFontSizeXSAIIZE();
            FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            if (z2) {
                j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
            } else {
                j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
            }
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, m13560getOpponentFontSizeXSAIIZE, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 3120, 55294);
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
            z2 = z;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z3 = z2;
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InvitedOpponentButton$lambda$55;
                    InvitedOpponentButton$lambda$55 = BettingSheetContentKt.InvitedOpponentButton$lambda$55(BattleOpponent.this, z3, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return InvitedOpponentButton$lambda$55;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SpeechBubbleWithTip(final String str, final String str2, final TipPosition tipPosition, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(353898552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changed(tipPosition.ordinal()) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(353898552, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.SpeechBubbleWithTip (BettingSheetContent.kt:692)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                    Modifier.Companion companion = Modifier.INSTANCE;
                    long m5205getWhite0d7_KjU = Color.INSTANCE.m5205getWhite0d7_KjU();
                    float f = 24;
                    float m7774constructorimpl3 = Dp.m7774constructorimpl(f);
                    float m7774constructorimpl4 = Dp.m7774constructorimpl(f);
                    if (tipPosition == TipPosition.BOTTOM_LEFT) {
                        m7774constructorimpl = Dp.m7774constructorimpl(0);
                    } else {
                        m7774constructorimpl = Dp.m7774constructorimpl(f);
                    }
                    if (tipPosition != TipPosition.BOTTOM_RIGHT) {
                        if (tipPosition == TipPosition.RIGHT) {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(0);
                        } else {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(f);
                        }
                    } else {
                        m7774constructorimpl2 = Dp.m7774constructorimpl(0);
                    }
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(companion, m5205getWhite0d7_KjU, RoundedCornerShapeKt.m1811RoundedCornerShapea9UjIt4(m7774constructorimpl4, m7774constructorimpl3, m7774constructorimpl2, m7774constructorimpl)), Dp.m7774constructorimpl(16));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifier5 = modifier4;
                    TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200112, 0, 130512);
                    TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 0, 130544);
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
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SpeechBubbleWithTip$lambda$58;
                            SpeechBubbleWithTip$lambda$58 = BettingSheetContentKt.SpeechBubbleWithTip$lambda$58(str, str2, tipPosition, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SpeechBubbleWithTip$lambda$58;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            long m5205getWhite0d7_KjU2 = Color.INSTANCE.m5205getWhite0d7_KjU();
            float f2 = 24;
            float m7774constructorimpl32 = Dp.m7774constructorimpl(f2);
            float m7774constructorimpl42 = Dp.m7774constructorimpl(f2);
            if (tipPosition == TipPosition.BOTTOM_LEFT) {
            }
            if (tipPosition != TipPosition.BOTTOM_RIGHT) {
            }
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(companion2, m5205getWhite0d7_KjU2, RoundedCornerShapeKt.m1811RoundedCornerShapea9UjIt4(m7774constructorimpl42, m7774constructorimpl32, m7774constructorimpl2, m7774constructorimpl)), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifier52 = modifier4;
            TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200112, 0, 130512);
            TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 0, 130544);
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
            modifier3 = modifier52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion22 = Modifier.INSTANCE;
        long m5205getWhite0d7_KjU22 = Color.INSTANCE.m5205getWhite0d7_KjU();
        float f22 = 24;
        float m7774constructorimpl322 = Dp.m7774constructorimpl(f22);
        float m7774constructorimpl422 = Dp.m7774constructorimpl(f22);
        if (tipPosition == TipPosition.BOTTOM_LEFT) {
        }
        if (tipPosition != TipPosition.BOTTOM_RIGHT) {
        }
        Modifier m1516padding3ABfNKs22 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(companion22, m5205getWhite0d7_KjU22, RoundedCornerShapeKt.m1811RoundedCornerShapea9UjIt4(m7774constructorimpl422, m7774constructorimpl322, m7774constructorimpl2, m7774constructorimpl)), Dp.m7774constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        Modifier modifier522 = modifier4;
        TextKt.m2642Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200112, 0, 130512);
        TextKt.m2642Text4IGK_g(str2, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 3) & 14) | X2.b.f, 0, 130544);
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
        modifier3 = modifier522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final float QuickBetTopBar$lambda$5$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BetModel BettingSheetContent$lambda$14(State<? extends BetModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BettingSheetContent$lambda$17(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BettingSheetContent$lambda$20(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BettingSheetContent$lambda$23(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
