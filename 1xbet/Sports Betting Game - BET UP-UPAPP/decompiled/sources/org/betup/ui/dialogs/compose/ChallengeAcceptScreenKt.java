package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.material3.TextKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.google.logging.type.LogSeverity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.C;
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
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BattleBetHighlightStyle;
import org.betup.utils.BattleBetOutcomeResolverKt;
import org.betup.utils.NavigationHelper;
import org.betup.utils.OddHelper;

/* compiled from: ChallengeAcceptScreen.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a}\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\"\u001aç\u0001\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0002\u0010/\u001a;\u00100\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00101\u001a\u00020!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000103H\u0007¢\u0006\u0002\u00104¨\u00065²\u0006\f\u00106\u001a\u0004\u0018\u00010!X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\fX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0004\u0018\u000109X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020!X\u008a\u0084\u0002"}, d2 = {"ChallengeAcceptScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/dialogs/controller/ChallengeAcceptController;", "betsController", "Lorg/betup/ui/fragment/bets/BetsController;", "onDismiss", "Lkotlin/Function0;", "onBack", "showBackButton", "", "onNavigateToLeague", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "leagueId", "isLive", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/controller/ChallengeAcceptController;Lorg/betup/ui/fragment/bets/BetsController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BattleBetInfoRow", "betName", "", "groupName", "varietyName", "coefficient", "", "firstUserImage", "firstUserName", "oddType", "Lorg/betup/model/local/entity/OddType;", "firstUserId", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lorg/betup/model/local/entity/OddType;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BattleBetInfoRowTwoUsers", "betNameTwo", "groupNameTwo", "varietyNameTwo", "coefficientTwo", "secondUserImage", "secondUserName", "firstHighlight", "Lorg/betup/utils/BattleBetHighlightStyle;", "secondHighlight", "outcomeMessage", "secondUserId", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lorg/betup/model/local/entity/OddType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/utils/BattleBetHighlightStyle;Lorg/betup/utils/BattleBetHighlightStyle;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "BattleBetDetailsSummary", "amount", "onAmountChange", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;JLjava/lang/Double;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "userId", "isLoading", "matchDetails", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "userAmount", "secondUserPhoto", "isUserCreator", "isVideoRewardAvailable", "videoRewardAmount"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeAcceptScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetDetailsSummary$lambda$53(Modifier modifier, long j, Double d, Function1 function1, int i, Composer composer, int i2) {
        BattleBetDetailsSummary(modifier, j, d, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetInfoRow$lambda$21(Modifier modifier, String str, String str2, String str3, Double d, String str4, String str5, OddType oddType, Long l, Function0 function0, int i, int i2, Composer composer, int i3) {
        BattleBetInfoRow(modifier, str, str2, str3, d, str4, str5, oddType, l, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetInfoRowTwoUsers$lambda$34(Modifier modifier, String str, String str2, String str3, Double d, String str4, String str5, OddType oddType, String str6, String str7, String str8, String str9, String str10, String str11, BattleBetHighlightStyle battleBetHighlightStyle, BattleBetHighlightStyle battleBetHighlightStyle2, String str12, Long l, Long l2, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        BattleBetInfoRowTwoUsers(modifier, str, str2, str3, d, str4, str5, oddType, str6, str7, str8, str9, str10, str11, battleBetHighlightStyle, battleBetHighlightStyle2, str12, l, l2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeAcceptScreen$lambda$13(Modifier modifier, ChallengeAcceptController challengeAcceptController, BetsController betsController, Function0 function0, Function0 function02, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        ChallengeAcceptScreen(modifier, challengeAcceptController, betsController, function0, function02, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChallengeAcceptScreen(Modifier modifier, final ChallengeAcceptController controller, final BetsController betsController, final Function0<Unit> onDismiss, Function0<Unit> function0, boolean z, Function2<? super Integer, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        final boolean z2;
        int i4;
        Function2<? super Integer, ? super Boolean, Unit> function22;
        Modifier modifier3;
        boolean z3;
        int i5;
        Function0<Unit> function03;
        Function2<? super Integer, ? super Boolean, Unit> function23;
        boolean changed;
        Object obj;
        Object obj2;
        boolean z4;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        final Modifier modifier4;
        final Function0<Unit> function04;
        final Function2<? super Integer, ? super Boolean, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(betsController, "betsController");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-871649375);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= startRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(betsController) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                function02 = function0;
                if (startRestartGroup.changedInstance(function02)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                function02 = function0;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            function02 = function0;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                function22 = function2;
            } else {
                function22 = function2;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                }
            }
            if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        function02 = onDismiss;
                    }
                    modifier3 = companion;
                    z3 = i8 == 0 ? true : z;
                    i5 = i3;
                    function03 = function02;
                    if (i4 != 0) {
                        function23 = null;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-871649375, i5, -1, "org.betup.ui.dialogs.compose.ChallengeAcceptScreen (ChallengeAcceptScreen.kt:85)");
                        }
                        State collectAsState = SnapshotStateKt.collectAsState(controller.getUserId(), null, startRestartGroup, 0, 1);
                        State collectAsState2 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                        State collectAsState3 = SnapshotStateKt.collectAsState(controller.getMatchDetails(), null, startRestartGroup, 0, 1);
                        State collectAsState4 = SnapshotStateKt.collectAsState(betsController.getAmount(), null, startRestartGroup, 0, 1);
                        State collectAsState5 = SnapshotStateKt.collectAsState(betsController.getUserAmountFlow(), null, startRestartGroup, 0, 1);
                        State collectAsState6 = SnapshotStateKt.collectAsState(betsController.getOddType(), null, startRestartGroup, 0, 1);
                        ShortUserProfileModel shortProfile = controller.getUserServiceP().getShortProfile();
                        State collectAsState7 = SnapshotStateKt.collectAsState(controller.getSecondUserPhoto(), null, startRestartGroup, 0, 1);
                        State collectAsState8 = SnapshotStateKt.collectAsState(controller.isUserCreator(), null, startRestartGroup, 0, 1);
                        Long ChallengeAcceptScreen$lambda$0 = ChallengeAcceptScreen$lambda$0(collectAsState);
                        String ChallengeAcceptScreen$lambda$6 = ChallengeAcceptScreen$lambda$6(collectAsState7);
                        Boolean valueOf = Boolean.valueOf(ChallengeAcceptScreen$lambda$7(collectAsState8));
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState7) | startRestartGroup.changed(collectAsState8);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            obj = null;
                            obj2 = (Function2) new ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1(collectAsState, collectAsState7, collectAsState8, null);
                            startRestartGroup.updateRememberedValue(obj2);
                        } else {
                            obj2 = rememberedValue2;
                            obj = null;
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(ChallengeAcceptScreen$lambda$0, ChallengeAcceptScreen$lambda$6, valueOf, (Function2) obj2, startRestartGroup, 0);
                        startRestartGroup.startReplaceGroup(5004770);
                        z4 = (i5 & 7168) == 2048;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit ChallengeAcceptScreen$lambda$10$lambda$9;
                                    ChallengeAcceptScreen$lambda$10$lambda$9 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$10$lambda$9(Function0.this);
                                    return ChallengeAcceptScreen$lambda$10$lambda$9;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(modifier3, false, null, null, (Function0) rememberedValue, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
                        float f = 32;
                        Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(28), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                        Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0);
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
                        int i9 = i5 >> 6;
                        TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, z3, false, startRestartGroup, (i9 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i9 & 112) | 24576 | (458752 & i5), 72);
                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                        composer2 = startRestartGroup;
                        TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableLambdaKt.rememberComposableLambda(1941102797, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                String stringResource;
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1941102797, i10, -1, "org.betup.ui.dialogs.compose.ChallengeAcceptScreen.<anonymous>.<anonymous>.<anonymous> (ChallengeAcceptScreen.kt:135)");
                                }
                                if (ChallengeAcceptController.this.get_challengeId() != null) {
                                    composer3.startReplaceGroup(-46140841);
                                    stringResource = StringResources_androidKt.stringResource(R.string.accept_battle, composer3, 6);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-46041641);
                                    stringResource = StringResources_androidKt.stringResource(R.string.create_battle, composer3, 6);
                                    composer3.endReplaceGroup();
                                }
                                QuickBetHeaderKt.QuickBetHeader(null, stringResource, null, null, false, false, false, false, composer3, 0, 253);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(225504206, true, new ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2(controller, shortProfile, collectAsState7, onDismiss, betsController, collectAsState2, collectAsState3, function23, collectAsState6, collectAsState4, collectAsState5), composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1490094385, true, new ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3(collectAsState2, controller, collectAsState, collectAsState8, collectAsState4), composer2, 54), false, true, null, false, composer2, 224694, 192);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), composer2, 6);
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
                        modifier4 = modifier3;
                        function04 = function03;
                        z2 = z3;
                        function24 = function23;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    z3 = z;
                    modifier3 = modifier2;
                    i5 = i3;
                    function03 = function02;
                }
                function23 = function22;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                State collectAsState9 = SnapshotStateKt.collectAsState(controller.getUserId(), null, startRestartGroup, 0, 1);
                State collectAsState22 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                State collectAsState32 = SnapshotStateKt.collectAsState(controller.getMatchDetails(), null, startRestartGroup, 0, 1);
                State collectAsState42 = SnapshotStateKt.collectAsState(betsController.getAmount(), null, startRestartGroup, 0, 1);
                State collectAsState52 = SnapshotStateKt.collectAsState(betsController.getUserAmountFlow(), null, startRestartGroup, 0, 1);
                State collectAsState62 = SnapshotStateKt.collectAsState(betsController.getOddType(), null, startRestartGroup, 0, 1);
                ShortUserProfileModel shortProfile2 = controller.getUserServiceP().getShortProfile();
                State collectAsState72 = SnapshotStateKt.collectAsState(controller.getSecondUserPhoto(), null, startRestartGroup, 0, 1);
                State collectAsState82 = SnapshotStateKt.collectAsState(controller.isUserCreator(), null, startRestartGroup, 0, 1);
                Long ChallengeAcceptScreen$lambda$02 = ChallengeAcceptScreen$lambda$0(collectAsState9);
                String ChallengeAcceptScreen$lambda$62 = ChallengeAcceptScreen$lambda$6(collectAsState72);
                Boolean valueOf2 = Boolean.valueOf(ChallengeAcceptScreen$lambda$7(collectAsState82));
                startRestartGroup.startReplaceGroup(-1746271574);
                changed = startRestartGroup.changed(collectAsState9) | startRestartGroup.changed(collectAsState72) | startRestartGroup.changed(collectAsState82);
                Object rememberedValue22 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                obj = null;
                obj2 = (Function2) new ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1(collectAsState9, collectAsState72, collectAsState82, null);
                startRestartGroup.updateRememberedValue(obj2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(ChallengeAcceptScreen$lambda$02, ChallengeAcceptScreen$lambda$62, valueOf2, (Function2) obj2, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i5 & 7168) == 2048) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ChallengeAcceptScreen$lambda$10$lambda$9;
                        ChallengeAcceptScreen$lambda$10$lambda$9 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$10$lambda$9(Function0.this);
                        return ChallengeAcceptScreen$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(modifier3, false, null, null, (Function0) rememberedValue, 7, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
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
                float f2 = 32;
                Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(28), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2));
                Arrangement.HorizontalOrVertical spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceEvenly2, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR02);
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
                int i92 = i5 >> 6;
                TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, z3, false, startRestartGroup, (i92 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i92 & 112) | 24576 | (458752 & i5), 72);
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                composer2 = startRestartGroup;
                TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableLambdaKt.rememberComposableLambda(1941102797, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        String stringResource;
                        if ((i10 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1941102797, i10, -1, "org.betup.ui.dialogs.compose.ChallengeAcceptScreen.<anonymous>.<anonymous>.<anonymous> (ChallengeAcceptScreen.kt:135)");
                        }
                        if (ChallengeAcceptController.this.get_challengeId() != null) {
                            composer3.startReplaceGroup(-46140841);
                            stringResource = StringResources_androidKt.stringResource(R.string.accept_battle, composer3, 6);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-46041641);
                            stringResource = StringResources_androidKt.stringResource(R.string.create_battle, composer3, 6);
                            composer3.endReplaceGroup();
                        }
                        QuickBetHeaderKt.QuickBetHeader(null, stringResource, null, null, false, false, false, false, composer3, 0, 253);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(225504206, true, new ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2(controller, shortProfile2, collectAsState72, onDismiss, betsController, collectAsState22, collectAsState32, function23, collectAsState62, collectAsState42, collectAsState52), composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1490094385, true, new ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3(collectAsState22, controller, collectAsState9, collectAsState82, collectAsState42), composer2, 54), false, true, null, false, composer2, 224694, 192);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), composer2, 6);
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
                modifier4 = modifier3;
                function04 = function03;
                z2 = z3;
                function24 = function23;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                function04 = function02;
                function24 = function22;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit ChallengeAcceptScreen$lambda$13;
                        ChallengeAcceptScreen$lambda$13 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$13(Modifier.this, controller, betsController, onDismiss, function04, z2, function24, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                        return ChallengeAcceptScreen$lambda$13;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        modifier3 = companion;
        z3 = i8 == 0 ? true : z;
        i5 = i3;
        function03 = function02;
        if (i4 != 0) {
        }
        function23 = function22;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState92 = SnapshotStateKt.collectAsState(controller.getUserId(), null, startRestartGroup, 0, 1);
        State collectAsState222 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
        State collectAsState322 = SnapshotStateKt.collectAsState(controller.getMatchDetails(), null, startRestartGroup, 0, 1);
        State collectAsState422 = SnapshotStateKt.collectAsState(betsController.getAmount(), null, startRestartGroup, 0, 1);
        State collectAsState522 = SnapshotStateKt.collectAsState(betsController.getUserAmountFlow(), null, startRestartGroup, 0, 1);
        State collectAsState622 = SnapshotStateKt.collectAsState(betsController.getOddType(), null, startRestartGroup, 0, 1);
        ShortUserProfileModel shortProfile22 = controller.getUserServiceP().getShortProfile();
        State collectAsState722 = SnapshotStateKt.collectAsState(controller.getSecondUserPhoto(), null, startRestartGroup, 0, 1);
        State collectAsState822 = SnapshotStateKt.collectAsState(controller.isUserCreator(), null, startRestartGroup, 0, 1);
        Long ChallengeAcceptScreen$lambda$022 = ChallengeAcceptScreen$lambda$0(collectAsState92);
        String ChallengeAcceptScreen$lambda$622 = ChallengeAcceptScreen$lambda$6(collectAsState722);
        Boolean valueOf22 = Boolean.valueOf(ChallengeAcceptScreen$lambda$7(collectAsState822));
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = startRestartGroup.changed(collectAsState92) | startRestartGroup.changed(collectAsState722) | startRestartGroup.changed(collectAsState822);
        Object rememberedValue222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        obj = null;
        obj2 = (Function2) new ChallengeAcceptScreenKt$ChallengeAcceptScreen$1$1(collectAsState92, collectAsState722, collectAsState822, null);
        startRestartGroup.updateRememberedValue(obj2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(ChallengeAcceptScreen$lambda$022, ChallengeAcceptScreen$lambda$622, valueOf22, (Function2) obj2, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i5 & 7168) == 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ChallengeAcceptScreen$lambda$10$lambda$9;
                ChallengeAcceptScreen$lambda$10$lambda$9 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$10$lambda$9(Function0.this);
                return ChallengeAcceptScreen$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(modifier3, false, null, null, (Function0) rememberedValue, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
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
        float f22 = 32;
        Modifier m1519paddingqDBjuR022 = PaddingKt.m1519paddingqDBjuR0(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(28), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f22));
        Arrangement.HorizontalOrVertical spaceEvenly22 = Arrangement.INSTANCE.getSpaceEvenly();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(spaceEvenly22, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR022);
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
        int i922 = i5 >> 6;
        TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, z3, false, startRestartGroup, (i922 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i922 & 112) | 24576 | (458752 & i5), 72);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(16)), startRestartGroup, 6);
        composer2 = startRestartGroup;
        TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableLambdaKt.rememberComposableLambda(1941102797, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i10) {
                String stringResource;
                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1941102797, i10, -1, "org.betup.ui.dialogs.compose.ChallengeAcceptScreen.<anonymous>.<anonymous>.<anonymous> (ChallengeAcceptScreen.kt:135)");
                }
                if (ChallengeAcceptController.this.get_challengeId() != null) {
                    composer3.startReplaceGroup(-46140841);
                    stringResource = StringResources_androidKt.stringResource(R.string.accept_battle, composer3, 6);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-46041641);
                    stringResource = StringResources_androidKt.stringResource(R.string.create_battle, composer3, 6);
                    composer3.endReplaceGroup();
                }
                QuickBetHeaderKt.QuickBetHeader(null, stringResource, null, null, false, false, false, false, composer3, 0, 253);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(225504206, true, new ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2(controller, shortProfile22, collectAsState722, onDismiss, betsController, collectAsState222, collectAsState322, function23, collectAsState622, collectAsState422, collectAsState522), composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1490094385, true, new ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3(collectAsState222, controller, collectAsState92, collectAsState822, collectAsState422), composer2, 54), false, true, null, false, composer2, 224694, 192);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22)), composer2, 6);
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
        modifier4 = modifier3;
        function04 = function03;
        z2 = z3;
        function24 = function23;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeAcceptScreen$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0495  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleBetInfoRow(Modifier modifier, final String str, final String str2, String str3, final Double d, final String str4, String str5, final OddType oddType, Long l, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str6;
        int i4;
        String str7;
        int i5;
        int i6;
        final Long l2;
        final Function0<Unit> function02;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        boolean z;
        Object rememberedValue;
        String str8;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        String str9;
        String str10;
        int i7;
        Brush brush;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        String str11;
        long j;
        final String str12;
        final String str13;
        Function0<Unit> function03;
        Long l3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Composer startRestartGroup = composer.startRestartGroup(47608735);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
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
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str6 = str3;
            i3 |= startRestartGroup.changed(str6) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(d) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
                i4 = i2 & 64;
                if (i4 != 0) {
                    i3 |= 1572864;
                    str7 = str5;
                } else {
                    str7 = str5;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(str7) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) == 0) {
                    i8 = (12582912 & i) == 0 ? startRestartGroup.changed(oddType.ordinal()) ? 8388608 : 4194304 : 12582912;
                    i5 = i2 & 256;
                    if (i5 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(l) ? 67108864 : 33554432;
                    }
                    i6 = i2 & 512;
                    if (i6 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                        String str14 = i10 == 0 ? null : str6;
                        String str15 = i4 == 0 ? null : str7;
                        l2 = i5 == 0 ? null : l;
                        function02 = i6 == 0 ? null : function0;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(47608735, i3, -1, "org.betup.ui.dialogs.compose.BattleBetInfoRow (ChallengeAcceptScreen.kt:423)");
                        }
                        float f = 12;
                        modifier2 = companion;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
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
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                        Modifier clip = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(38)), RoundedCornerShapeKt.getCircleShape());
                        boolean z2 = l2 == null;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        z = ((234881024 & i3) != 67108864) | ((1879048192 & i3) != 536870912);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                                    BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15 = ChallengeAcceptScreenKt.BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15(l2, function02);
                                    return BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip, z2, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                        startRestartGroup.startReplaceGroup(1042479068);
                        str8 = str15;
                        if (str8 == null && !StringsKt.isBlank(str8)) {
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                            TextKt.m3621Text4IGK_g(str15, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 18) & 14, 3072, 57342);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(474954403);
                        str9 = str14;
                        if (str9 != null || StringsKt.isBlank(str9)) {
                            str10 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            i7 = -692256719;
                        } else {
                            str10 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            i7 = -692256719;
                            TextKt.m3621Text4IGK_g(str14, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, (i3 >> 9) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                        }
                        startRestartGroup.endReplaceGroup();
                        TextKt.m3621Text4IGK_g(str2 != null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                        TextKt.m3621Text4IGK_g(str != null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        if (d == null && d.doubleValue() > 0.0d) {
                            brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                        } else {
                            brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush();
                        }
                        Modifier background$default = BackgroundKt.background$default(companion3, brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)), 0.0f, 4, null);
                        float f2 = 16;
                        float f3 = 8;
                        Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(background$default, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str10);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i7, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (d == null && d.doubleValue() > 0.0d) {
                            str11 = OddHelper.format(oddType, d.doubleValue());
                        } else {
                            str11 = "-";
                        }
                        String str16 = str11;
                        Intrinsics.checkNotNull(str16);
                        long sp = TextUnitKt.getSp(12);
                        FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                        FontWeight medium = FontWeight.INSTANCE.getMedium();
                        if (d == null && d.doubleValue() > 0.0d) {
                            j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                        } else {
                            j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                        }
                        androidx.compose.material.TextKt.m2642Text4IGK_g(str16, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                        str12 = str14;
                        str13 = str15;
                        function03 = function02;
                        l3 = l2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        l3 = l;
                        function03 = function0;
                        str12 = str6;
                        str13 = str7;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final Long l4 = l3;
                        final Function0<Unit> function04 = function03;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BattleBetInfoRow$lambda$21;
                                BattleBetInfoRow$lambda$21 = ChallengeAcceptScreenKt.BattleBetInfoRow$lambda$21(Modifier.this, str, str2, str12, d, str4, str13, oddType, l4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return BattleBetInfoRow$lambda$21;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i8;
                i5 = i2 & 256;
                if (i5 == 0) {
                }
                i6 = i2 & 512;
                if (i6 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                float f4 = 12;
                modifier2 = companion;
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(f4), Dp.m7774constructorimpl(f4));
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f4));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion22 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                Modifier clip2 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(38)), RoundedCornerShapeKt.getCircleShape());
                if (l2 == null) {
                }
                startRestartGroup.startReplaceGroup(-1633490746);
                z = ((234881024 & i3) != 67108864) | ((1879048192 & i3) != 536870912);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                        BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15 = ChallengeAcceptScreenKt.BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15(l2, function02);
                        return BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip2, z2, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                startRestartGroup.startReplaceGroup(1042479068);
                str8 = str15;
                if (str8 == null) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(474954403);
                str9 = str14;
                if (str9 != null) {
                }
                str10 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                i7 = -692256719;
                startRestartGroup.endReplaceGroup();
                if (str2 != null) {
                }
                TextKt.m3621Text4IGK_g(str2 != null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                if (str != null) {
                }
                TextKt.m3621Text4IGK_g(str != null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                if (d == null) {
                }
                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush();
                Modifier background$default2 = BackgroundKt.background$default(companion32, brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)), 0.0f, 4, null);
                float f22 = 16;
                float f32 = 8;
                Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(background$default2, Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str10);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR02);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i7, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (d == null) {
                }
                str11 = "-";
                String str162 = str11;
                Intrinsics.checkNotNull(str162);
                long sp2 = TextUnitKt.getSp(12);
                FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight medium2 = FontWeight.INSTANCE.getMedium();
                if (d == null) {
                }
                j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                androidx.compose.material.TextKt.m2642Text4IGK_g(str162, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp2, medium2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                str12 = str14;
                str13 = str15;
                function03 = function02;
                l3 = l2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i8;
            i5 = i2 & 256;
            if (i5 == 0) {
            }
            i6 = i2 & 512;
            if (i6 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f42 = 12;
            modifier2 = companion;
            Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(f42), Dp.m7774constructorimpl(f42));
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f42));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically22, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash52);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
            Modifier clip22 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(38)), RoundedCornerShapeKt.getCircleShape());
            if (l2 == null) {
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            z = ((234881024 & i3) != 67108864) | ((1879048192 & i3) != 536870912);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                    BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15 = ChallengeAcceptScreenKt.BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15(l2, function02);
                    return BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip22, z2, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            startRestartGroup.startReplaceGroup(1042479068);
            str8 = str15;
            if (str8 == null) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier weight$default22 = RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(474954403);
            str9 = str14;
            if (str9 != null) {
            }
            str10 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            i7 = -692256719;
            startRestartGroup.endReplaceGroup();
            if (str2 != null) {
            }
            TextKt.m3621Text4IGK_g(str2 != null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
            if (str != null) {
            }
            TextKt.m3621Text4IGK_g(str != null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier.Companion companion322 = Modifier.INSTANCE;
            if (d == null) {
            }
            brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush();
            Modifier background$default22 = BackgroundKt.background$default(companion322, brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)), 0.0f, 4, null);
            float f222 = 16;
            float f322 = 8;
            Modifier m1519paddingqDBjuR022 = PaddingKt.m1519paddingqDBjuR0(background$default22, Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f322), Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f322));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str10);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR022);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i7, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            if (d == null) {
            }
            str11 = "-";
            String str1622 = str11;
            Intrinsics.checkNotNull(str1622);
            long sp22 = TextUnitKt.getSp(12);
            FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            FontWeight medium22 = FontWeight.INSTANCE.getMedium();
            if (d == null) {
            }
            j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            androidx.compose.material.TextKt.m2642Text4IGK_g(str1622, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp22, medium22, (FontStyle) null, (FontSynthesis) null, sfProFontFamily22, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            str12 = str14;
            str13 = str15;
            function03 = function02;
            l3 = l2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str6 = str3;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i8;
        i5 = i2 & 256;
        if (i5 == 0) {
        }
        i6 = i2 & 512;
        if (i6 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f422 = 12;
        modifier2 = companion;
        Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(f422), Dp.m7774constructorimpl(f422));
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f422));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4222, centerVertically222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash522);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
        Modifier clip222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(38)), RoundedCornerShapeKt.getCircleShape());
        if (l2 == null) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        z = ((234881024 & i3) != 67108864) | ((1879048192 & i3) != 536870912);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
                BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15 = ChallengeAcceptScreenKt.BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15(l2, function02);
                return BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip222, z2, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i3 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        startRestartGroup.startReplaceGroup(1042479068);
        str8 = str15;
        if (str8 == null) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier weight$default222 = RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(474954403);
        str9 = str14;
        if (str9 != null) {
        }
        str10 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        i7 = -692256719;
        startRestartGroup.endReplaceGroup();
        if (str2 != null) {
        }
        TextKt.m3621Text4IGK_g(str2 != null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
        if (str != null) {
        }
        TextKt.m3621Text4IGK_g(str != null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier.Companion companion3222 = Modifier.INSTANCE;
        if (d == null) {
        }
        brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush();
        Modifier background$default222 = BackgroundKt.background$default(companion3222, brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100)), 0.0f, 4, null);
        float f2222 = 16;
        float f3222 = 8;
        Modifier m1519paddingqDBjuR0222 = PaddingKt.m1519paddingqDBjuR0(background$default222, Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(f3222), Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(f3222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str10);
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i7, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        if (d == null) {
        }
        str11 = "-";
        String str16222 = str11;
        Intrinsics.checkNotNull(str16222);
        long sp222 = TextUnitKt.getSp(12);
        FontFamily sfProFontFamily222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight medium222 = FontWeight.INSTANCE.getMedium();
        if (d == null) {
        }
        j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
        androidx.compose.material.TextKt.m2642Text4IGK_g(str16222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, sp222, medium222, (FontStyle) null, (FontSynthesis) null, sfProFontFamily222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        str12 = str14;
        str13 = str15;
        function03 = function02;
        l3 = l2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetInfoRow$lambda$20$lambda$17$lambda$16$lambda$15(Long l, Function0 function0) {
        if (l != null) {
            long longValue = l.longValue();
            if (function0 != null) {
                function0.invoke();
            }
            NavigationHelper.navigateToForeignUser$default(NavigationHelper.INSTANCE, (int) longValue, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0e8e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0e9a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0fa5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x105d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleBetInfoRowTwoUsers(Modifier modifier, final String str, final String str2, String str3, final Double d, final String str4, String str5, final OddType oddType, final String str6, final String str7, String str8, final String coefficientTwo, final String str9, String str10, BattleBetHighlightStyle battleBetHighlightStyle, BattleBetHighlightStyle battleBetHighlightStyle2, String str11, Long l, Long l2, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Long l3;
        int i14;
        String str12;
        final Long l4;
        final Function0<Unit> function02;
        int currentCompositeKeyHash;
        String str13;
        Composer m4610constructorimpl;
        Long l5;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean z;
        Object rememberedValue;
        Function0<Unit> function03;
        float f;
        String str14;
        float f2;
        int i15;
        String str15;
        float f3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        String str16;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        boolean z2;
        Object rememberedValue2;
        final Long l6;
        final Function0<Unit> function04;
        float f4;
        String str17;
        float f5;
        int i16;
        String str18;
        int currentCompositeKeyHash6;
        Composer m4610constructorimpl6;
        String str19;
        final Long l7;
        final String str20;
        final Function0<Unit> function05;
        final Long l8;
        final BattleBetHighlightStyle battleBetHighlightStyle3;
        final String str21;
        final String str22;
        final String str23;
        final Modifier modifier2;
        final String str24;
        final BattleBetHighlightStyle battleBetHighlightStyle4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(coefficientTwo, "coefficientTwo");
        Composer startRestartGroup = composer.startRestartGroup(-284270404);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(d) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(str4) ? 131072 : 65536;
                i5 = i3 & 64;
                if (i5 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(str5) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(oddType.ordinal()) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(str6) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(str7) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                i6 = i3 & 1024;
                if (i6 != 0) {
                    i7 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i7 = i2 | (startRestartGroup.changed(str8) ? 4 : 2);
                } else {
                    i7 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i7 |= 48;
                } else if ((i2 & 48) == 0) {
                    i7 |= startRestartGroup.changed(coefficientTwo) ? 32 : 16;
                }
                int i19 = i7;
                if ((i3 & 4096) != 0) {
                    i19 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i19 |= startRestartGroup.changed(str9) ? 256 : 128;
                    i8 = i3 & 8192;
                    if (i8 == 0) {
                        i19 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        i19 |= startRestartGroup.changed(str10) ? 2048 : 1024;
                        i9 = i3 & 16384;
                        if (i9 != 0) {
                            i19 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i19 |= startRestartGroup.changed(battleBetHighlightStyle == null ? -1 : battleBetHighlightStyle.ordinal()) ? 16384 : 8192;
                        }
                        i10 = 32768 & i3;
                        if (i10 != 0) {
                            i19 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i19 |= startRestartGroup.changed(battleBetHighlightStyle2 == null ? -1 : battleBetHighlightStyle2.ordinal()) ? 131072 : 65536;
                        }
                        i11 = 65536 & i3;
                        if (i11 != 0) {
                            i19 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i19 |= startRestartGroup.changed(str11) ? 1048576 : 524288;
                        }
                        i12 = i3 & 131072;
                        if (i12 != 0) {
                            i19 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i19 |= startRestartGroup.changed(l) ? 8388608 : 4194304;
                        }
                        i13 = i3 & 262144;
                        if (i13 != 0) {
                            i19 |= 100663296;
                            l3 = l2;
                        } else {
                            l3 = l2;
                            if ((i2 & 100663296) == 0) {
                                i19 |= startRestartGroup.changed(l3) ? 67108864 : 33554432;
                            }
                        }
                        i14 = i3 & 524288;
                        if (i14 != 0) {
                            i19 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i19 |= startRestartGroup.changedInstance(function0) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        if ((i4 & 306783379) == 306783378 || (306783379 & i19) != 306783378 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier;
                            String str25 = i18 != 0 ? null : str3;
                            String str26 = i5 != 0 ? null : str5;
                            str12 = i6 != 0 ? null : str8;
                            String str27 = i8 != 0 ? null : str10;
                            BattleBetHighlightStyle battleBetHighlightStyle5 = i9 != 0 ? BattleBetHighlightStyle.DEFAULT : battleBetHighlightStyle;
                            BattleBetHighlightStyle battleBetHighlightStyle6 = i10 != 0 ? BattleBetHighlightStyle.DEFAULT : battleBetHighlightStyle2;
                            String str28 = i11 != 0 ? null : str11;
                            l4 = i12 != 0 ? null : l;
                            if (i13 != 0) {
                                l3 = null;
                            }
                            function02 = i14 != 0 ? null : function0;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-284270404, i4, i19, "org.betup.ui.dialogs.compose.BattleBetInfoRowTwoUsers (ChallengeAcceptScreen.kt:567)");
                            }
                            BattleBetHighlightStyle battleBetHighlightStyle7 = battleBetHighlightStyle5;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Modifier modifier3 = companion;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            str13 = str28;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            BattleBetHighlightStyle battleBetHighlightStyle8 = battleBetHighlightStyle6;
                            String str29 = str27;
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
                            float f6 = 8;
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f6));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            l5 = l3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
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
                            if (startRestartGroup.getInserting()) {
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
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            float f7 = 42;
                            Modifier clip = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape());
                            boolean z3 = l4 != null;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            int i20 = 1879048192 & i19;
                            z = ((29360128 & i19) == 8388608) | (i20 == 536870912);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                                        BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23(l4, function02);
                                        return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            function03 = function02;
                            int i21 = i4;
                            Long l9 = l4;
                            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip, z3, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i4 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                            f = 3;
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(697351363);
                            str14 = str26;
                            if (str14 != null || StringsKt.isBlank(str14)) {
                                f2 = f;
                                i15 = 6;
                            } else {
                                f2 = f;
                                TextKt.m3621Text4IGK_g(str26, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, (i21 >> 18) & 14, 3072, 57342);
                                i15 = 6;
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(697372449);
                            str15 = str25;
                            if (str15 == null && !StringsKt.isBlank(str15)) {
                                TextKt.m3621Text4IGK_g(str25, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i15), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, (i21 >> 9) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                i15 = 6;
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                            }
                            startRestartGroup.endReplaceGroup();
                            TextKt.m3621Text4IGK_g(str2 == null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i15), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            float f8 = 6;
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f8)), startRestartGroup, 6);
                            TextKt.m3621Text4IGK_g(str == null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f8)), startRestartGroup, 6);
                            float f9 = (float) 0.5d;
                            int i22 = (i19 >> 12) & 14;
                            float f10 = 100;
                            f3 = 16;
                            Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f9)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle7, startRestartGroup, i22), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f10))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0);
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
                            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (d == null && d.doubleValue() > 0.0d) {
                                str16 = OddHelper.format(oddType, d.doubleValue());
                            } else {
                                str16 = "-";
                            }
                            String str30 = str16;
                            Intrinsics.checkNotNull(str30);
                            androidx.compose.material.TextKt.m2642Text4IGK_g(str30, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle7, startRestartGroup, i22), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), "VS", SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(47)), Dp.m7774constructorimpl(38)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                            Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
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
                            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                            Modifier clip2 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7)), RoundedCornerShapeKt.getCircleShape());
                            boolean z4 = l5 != null;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            z2 = (i20 == 536870912) | ((234881024 & i19) == 67108864);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                l6 = l5;
                                function04 = function03;
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                                        BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28(l6, function04);
                                        return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            } else {
                                l6 = l5;
                                function04 = function03;
                            }
                            startRestartGroup.endReplaceGroup();
                            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str9, null, ClickableKt.m1059clickableXHw0xAI$default(clip2, z4, null, null, (Function0) rememberedValue2, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i19 >> 6) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                            f4 = 4;
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(-765245554);
                            str17 = str29;
                            if (str17 != null || StringsKt.isBlank(str17)) {
                                f5 = f4;
                                i16 = 500;
                            } else {
                                f5 = f4;
                                i16 = 500;
                                TextKt.m3621Text4IGK_g(str29, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, (i19 >> 9) & 14, 3072, 57342);
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-765224400);
                            str18 = str12;
                            if (str18 != null && !StringsKt.isBlank(str18)) {
                                TextKt.m3621Text4IGK_g(str12, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i19 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), startRestartGroup, 6);
                            }
                            startRestartGroup.endReplaceGroup();
                            TextKt.m3621Text4IGK_g(str7 == null ? "" : str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), startRestartGroup, 6);
                            TextKt.m3621Text4IGK_g(str6 == null ? "" : str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), startRestartGroup, 6);
                            int i23 = (i19 >> 15) & 14;
                            Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f9)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle8, startRestartGroup, i23), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f10))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR02);
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor6);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            androidx.compose.material.TextKt.m2642Text4IGK_g(coefficientTwo, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle8, startRestartGroup, i23), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i19 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(1067049141);
                            str19 = str13;
                            if (str19 != null && !StringsKt.isBlank(str19)) {
                                TextKt.m3621Text4IGK_g(str13, PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f5)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, ((i19 >> 18) & 14) | 48, 0, 65532);
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
                            l7 = l9;
                            str20 = str13;
                            function05 = function04;
                            l8 = l6;
                            battleBetHighlightStyle3 = battleBetHighlightStyle8;
                            str21 = str25;
                            str22 = str26;
                            str23 = str12;
                            modifier2 = modifier3;
                            str24 = str29;
                            battleBetHighlightStyle4 = battleBetHighlightStyle7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            str21 = str3;
                            str22 = str5;
                            str23 = str8;
                            str24 = str10;
                            battleBetHighlightStyle4 = battleBetHighlightStyle;
                            battleBetHighlightStyle3 = battleBetHighlightStyle2;
                            str20 = str11;
                            l7 = l;
                            function05 = function0;
                            l8 = l3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BattleBetInfoRowTwoUsers$lambda$34;
                                    BattleBetInfoRowTwoUsers$lambda$34 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$34(Modifier.this, str, str2, str21, d, str4, str22, oddType, str6, str7, str23, coefficientTwo, str9, str24, battleBetHighlightStyle4, battleBetHighlightStyle3, str20, l7, l8, function05, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BattleBetInfoRowTwoUsers$lambda$34;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i3 & 16384;
                    if (i9 != 0) {
                    }
                    i10 = 32768 & i3;
                    if (i10 != 0) {
                    }
                    i11 = 65536 & i3;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 131072;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 262144;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 524288;
                    if (i14 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BattleBetHighlightStyle battleBetHighlightStyle72 = battleBetHighlightStyle5;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier modifier32 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                    str13 = str28;
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    BattleBetHighlightStyle battleBetHighlightStyle82 = battleBetHighlightStyle6;
                    String str292 = str27;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    float f62 = 8;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f62));
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    l5 = l3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
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
                    Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier weight$default3 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default3);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    float f72 = 42;
                    Modifier clip3 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72)), RoundedCornerShapeKt.getCircleShape());
                    if (l4 != null) {
                    }
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i202 = 1879048192 & i19;
                    z = ((29360128 & i19) == 8388608) | (i202 == 536870912);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                            BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23(l4, function02);
                            return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    function03 = function02;
                    int i212 = i4;
                    Long l92 = l4;
                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip3, z3, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i4 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    f = 3;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(697351363);
                    str14 = str26;
                    if (str14 != null) {
                    }
                    f2 = f;
                    i15 = 6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(697372449);
                    str15 = str25;
                    if (str15 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (str2 == null) {
                    }
                    TextKt.m3621Text4IGK_g(str2 == null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i15), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    float f82 = 6;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f82)), startRestartGroup, 6);
                    if (str == null) {
                    }
                    TextKt.m3621Text4IGK_g(str == null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f82)), startRestartGroup, 6);
                    float f92 = (float) 0.5d;
                    int i222 = (i19 >> 12) & 14;
                    float f102 = 100;
                    f3 = 16;
                    Modifier m1519paddingqDBjuR03 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f92)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle72, startRestartGroup, i222), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f102))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR03);
                    Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting()) {
                    }
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (d == null) {
                    }
                    str16 = "-";
                    String str302 = str16;
                    Intrinsics.checkNotNull(str302);
                    androidx.compose.material.TextKt.m2642Text4IGK_g(str302, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle72, startRestartGroup, i222), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), "VS", SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(47)), Dp.m7774constructorimpl(38)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                    Alignment.Horizontal centerHorizontally32 = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier weight$default22 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally32, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
                    Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl5.getInserting()) {
                    }
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                    Modifier clip22 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72)), RoundedCornerShapeKt.getCircleShape());
                    if (l5 != null) {
                    }
                    startRestartGroup.startReplaceGroup(-1633490746);
                    if ((234881024 & i19) == 67108864) {
                    }
                    z2 = (i202 == 536870912) | ((234881024 & i19) == 67108864);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2) {
                    }
                    l6 = l5;
                    function04 = function03;
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                            BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28(l6, function04);
                            return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str9, null, ClickableKt.m1059clickableXHw0xAI$default(clip22, z4, null, null, (Function0) rememberedValue2, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i19 >> 6) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    f4 = 4;
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(-765245554);
                    str17 = str292;
                    if (str17 != null) {
                    }
                    f5 = f4;
                    i16 = 500;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-765224400);
                    str18 = str12;
                    if (str18 != null) {
                        TextKt.m3621Text4IGK_g(str12, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(10), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i19 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (str7 == null) {
                    }
                    TextKt.m3621Text4IGK_g(str7 == null ? "" : str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f62)), startRestartGroup, 6);
                    if (str6 == null) {
                    }
                    TextKt.m3621Text4IGK_g(str6 == null ? "" : str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f62)), startRestartGroup, 6);
                    int i232 = (i19 >> 15) & 14;
                    Modifier m1519paddingqDBjuR022 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f92)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle82, startRestartGroup, i232), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f102))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR022);
                    Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl6.getInserting()) {
                    }
                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62);
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    androidx.compose.material.TextKt.m2642Text4IGK_g(coefficientTwo, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle82, startRestartGroup, i232), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i19 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(1067049141);
                    str19 = str13;
                    if (str19 != null) {
                        TextKt.m3621Text4IGK_g(str13, PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f5)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(11), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, ((i19 >> 18) & 14) | 48, 0, 65532);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    l7 = l92;
                    str20 = str13;
                    function05 = function04;
                    l8 = l6;
                    battleBetHighlightStyle3 = battleBetHighlightStyle82;
                    str21 = str25;
                    str22 = str26;
                    str23 = str12;
                    modifier2 = modifier32;
                    str24 = str292;
                    battleBetHighlightStyle4 = battleBetHighlightStyle72;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i3 & 8192;
                if (i8 == 0) {
                }
                i9 = i3 & 16384;
                if (i9 != 0) {
                }
                i10 = 32768 & i3;
                if (i10 != 0) {
                }
                i11 = 65536 & i3;
                if (i11 != 0) {
                }
                i12 = i3 & 131072;
                if (i12 != 0) {
                }
                i13 = i3 & 262144;
                if (i13 != 0) {
                }
                i14 = i3 & 524288;
                if (i14 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BattleBetHighlightStyle battleBetHighlightStyle722 = battleBetHighlightStyle5;
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally42 = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifier322 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally42, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                str13 = str28;
                Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                BattleBetHighlightStyle battleBetHighlightStyle822 = battleBetHighlightStyle6;
                String str2922 = str27;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash72);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
                float f622 = 8;
                Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f622));
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
                l5 = l3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                Modifier weight$default32 = RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default32);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                float f722 = 42;
                Modifier clip32 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f722)), RoundedCornerShapeKt.getCircleShape());
                if (l4 != null) {
                }
                startRestartGroup.startReplaceGroup(-1633490746);
                int i2022 = 1879048192 & i19;
                z = ((29360128 & i19) == 8388608) | (i2022 == 536870912);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                        BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23(l4, function02);
                        return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                function03 = function02;
                int i2122 = i4;
                Long l922 = l4;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip32, z3, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i4 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                f = 3;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(697351363);
                str14 = str26;
                if (str14 != null) {
                }
                f2 = f;
                i15 = 6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(697372449);
                str15 = str25;
                if (str15 == null) {
                }
                startRestartGroup.endReplaceGroup();
                if (str2 == null) {
                }
                TextKt.m3621Text4IGK_g(str2 == null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i15), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                float f822 = 6;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f822)), startRestartGroup, 6);
                if (str == null) {
                }
                TextKt.m3621Text4IGK_g(str == null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f822)), startRestartGroup, 6);
                float f922 = (float) 0.5d;
                int i2222 = (i19 >> 12) & 14;
                float f1022 = 100;
                f3 = 16;
                Modifier m1519paddingqDBjuR032 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f922)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle722, startRestartGroup, i2222), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f1022))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f622), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f622));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR032);
                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                if (d == null) {
                }
                str16 = "-";
                String str3022 = str16;
                Intrinsics.checkNotNull(str3022);
                androidx.compose.material.TextKt.m2642Text4IGK_g(str3022, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle722, startRestartGroup, i2222), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), "VS", SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(47)), Dp.m7774constructorimpl(38)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                Alignment.Horizontal centerHorizontally322 = Alignment.INSTANCE.getCenterHorizontally();
                Modifier weight$default222 = RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally322, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting()) {
                }
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
                Modifier clip222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f722)), RoundedCornerShapeKt.getCircleShape());
                if (l5 != null) {
                }
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((234881024 & i19) == 67108864) {
                }
                z2 = (i2022 == 536870912) | ((234881024 & i19) == 67108864);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2) {
                }
                l6 = l5;
                function04 = function03;
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                        BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28(l6, function04);
                        return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str9, null, ClickableKt.m1059clickableXHw0xAI$default(clip222, z4, null, null, (Function0) rememberedValue2, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i19 >> 6) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                f4 = 4;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(-765245554);
                str17 = str2922;
                if (str17 != null) {
                }
                f5 = f4;
                i16 = 500;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-765224400);
                str18 = str12;
                if (str18 != null) {
                }
                startRestartGroup.endReplaceGroup();
                if (str7 == null) {
                }
                TextKt.m3621Text4IGK_g(str7 == null ? "" : str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f622)), startRestartGroup, 6);
                if (str6 == null) {
                }
                TextKt.m3621Text4IGK_g(str6 == null ? "" : str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f622)), startRestartGroup, 6);
                int i2322 = (i19 >> 15) & 14;
                Modifier m1519paddingqDBjuR0222 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f922)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle822, startRestartGroup, i2322), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f1022))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f622), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f622));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0222);
                Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl6.getInserting()) {
                }
                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash622);
                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                androidx.compose.material.TextKt.m2642Text4IGK_g(coefficientTwo, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle822, startRestartGroup, i2322), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i19 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(1067049141);
                str19 = str13;
                if (str19 != null) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                l7 = l922;
                str20 = str13;
                function05 = function04;
                l8 = l6;
                battleBetHighlightStyle3 = battleBetHighlightStyle822;
                str21 = str25;
                str22 = str26;
                str23 = str12;
                modifier2 = modifier322;
                str24 = str2922;
                battleBetHighlightStyle4 = battleBetHighlightStyle722;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 64;
            if (i5 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i6 = i3 & 1024;
            if (i6 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i192 = i7;
            if ((i3 & 4096) != 0) {
            }
            i8 = i3 & 8192;
            if (i8 == 0) {
            }
            i9 = i3 & 16384;
            if (i9 != 0) {
            }
            i10 = 32768 & i3;
            if (i10 != 0) {
            }
            i11 = 65536 & i3;
            if (i11 != 0) {
            }
            i12 = i3 & 131072;
            if (i12 != 0) {
            }
            i13 = i3 & 262144;
            if (i13 != 0) {
            }
            i14 = i3 & 524288;
            if (i14 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BattleBetHighlightStyle battleBetHighlightStyle7222 = battleBetHighlightStyle5;
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally422 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifier3222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy422 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally422, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap722 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier722 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
            str13 = str28;
            Function0<ComposeUiNode> constructor722 = ComposeUiNode.INSTANCE.getConstructor();
            BattleBetHighlightStyle battleBetHighlightStyle8222 = battleBetHighlightStyle6;
            String str29222 = str27;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash722);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance422 = ColumnScopeInstance.INSTANCE;
            float f6222 = 8;
            Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f6222));
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
            l5 = l3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier weight$default322 = RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default322);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            float f7222 = 42;
            Modifier clip322 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7222)), RoundedCornerShapeKt.getCircleShape());
            if (l4 != null) {
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            int i20222 = 1879048192 & i192;
            z = ((29360128 & i192) == 8388608) | (i20222 == 536870912);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                    BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23(l4, function02);
                    return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            function03 = function02;
            int i21222 = i4;
            Long l9222 = l4;
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip322, z3, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i4 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            f = 3;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(697351363);
            str14 = str26;
            if (str14 != null) {
            }
            f2 = f;
            i15 = 6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(697372449);
            str15 = str25;
            if (str15 == null) {
            }
            startRestartGroup.endReplaceGroup();
            if (str2 == null) {
            }
            TextKt.m3621Text4IGK_g(str2 == null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i15), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            float f8222 = 6;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f8222)), startRestartGroup, 6);
            if (str == null) {
            }
            TextKt.m3621Text4IGK_g(str == null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f8222)), startRestartGroup, 6);
            float f9222 = (float) 0.5d;
            int i22222 = (i192 >> 12) & 14;
            float f10222 = 100;
            f3 = 16;
            Modifier m1519paddingqDBjuR0322 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f9222)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle7222, startRestartGroup, i22222), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f10222))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6222), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6222));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR0322);
            Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
            if (d == null) {
            }
            str16 = "-";
            String str30222 = str16;
            Intrinsics.checkNotNull(str30222);
            androidx.compose.material.TextKt.m2642Text4IGK_g(str30222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle7222, startRestartGroup, i22222), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), "VS", SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(47)), Dp.m7774constructorimpl(38)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            Alignment.Horizontal centerHorizontally3222 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier weight$default2222 = RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2222);
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5222);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
            Modifier clip2222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7222)), RoundedCornerShapeKt.getCircleShape());
            if (l5 != null) {
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((234881024 & i192) == 67108864) {
            }
            z2 = (i20222 == 536870912) | ((234881024 & i192) == 67108864);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2) {
            }
            l6 = l5;
            function04 = function03;
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                    BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28(l6, function04);
                    return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str9, null, ClickableKt.m1059clickableXHw0xAI$default(clip2222, z4, null, null, (Function0) rememberedValue2, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i192 >> 6) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            f4 = 4;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(-765245554);
            str17 = str29222;
            if (str17 != null) {
            }
            f5 = f4;
            i16 = 500;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-765224400);
            str18 = str12;
            if (str18 != null) {
            }
            startRestartGroup.endReplaceGroup();
            if (str7 == null) {
            }
            TextKt.m3621Text4IGK_g(str7 == null ? "" : str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6222)), startRestartGroup, 6);
            if (str6 == null) {
            }
            TextKt.m3621Text4IGK_g(str6 == null ? "" : str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6222)), startRestartGroup, 6);
            int i23222 = (i192 >> 15) & 14;
            Modifier m1519paddingqDBjuR02222 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f9222)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle8222, startRestartGroup, i23222), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f10222))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6222), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f6222));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR02222);
            Function0<ComposeUiNode> constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl6.getInserting()) {
            }
            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6222);
            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            androidx.compose.material.TextKt.m2642Text4IGK_g(coefficientTwo, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle8222, startRestartGroup, i23222), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i192 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1067049141);
            str19 = str13;
            if (str19 != null) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            l7 = l9222;
            str20 = str13;
            function05 = function04;
            l8 = l6;
            battleBetHighlightStyle3 = battleBetHighlightStyle8222;
            str21 = str25;
            str22 = str26;
            str23 = str12;
            modifier2 = modifier3222;
            str24 = str29222;
            battleBetHighlightStyle4 = battleBetHighlightStyle7222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i6 = i3 & 1024;
        if (i6 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i1922 = i7;
        if ((i3 & 4096) != 0) {
        }
        i8 = i3 & 8192;
        if (i8 == 0) {
        }
        i9 = i3 & 16384;
        if (i9 != 0) {
        }
        i10 = 32768 & i3;
        if (i10 != 0) {
        }
        i11 = 65536 & i3;
        if (i11 != 0) {
        }
        i12 = i3 & 131072;
        if (i12 != 0) {
        }
        i13 = i3 & 262144;
        if (i13 != 0) {
        }
        i14 = i3 & 524288;
        if (i14 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        BattleBetHighlightStyle battleBetHighlightStyle72222 = battleBetHighlightStyle5;
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally4222 = Alignment.INSTANCE.getCenterHorizontally();
        Modifier modifier32222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier7222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
        str13 = str28;
        Function0<ComposeUiNode> constructor7222 = ComposeUiNode.INSTANCE.getConstructor();
        BattleBetHighlightStyle battleBetHighlightStyle82222 = battleBetHighlightStyle6;
        String str292222 = str27;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap7222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash7222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier7222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance4222 = ColumnScopeInstance.INSTANCE;
        float f62222 = 8;
        Modifier m1517paddingVpY3zN42222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f62222));
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center2222 = Arrangement.INSTANCE.getCenter();
        l5 = l3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(center2222, centerVertically2222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally22222 = Alignment.INSTANCE.getCenterHorizontally();
        Modifier weight$default3222 = RowScope.weight$default(rowScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default3222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        float f72222 = 42;
        Modifier clip3222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72222)), RoundedCornerShapeKt.getCircleShape());
        if (l4 != null) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        int i202222 = 1879048192 & i1922;
        z = ((29360128 & i1922) == 8388608) | (i202222 == 536870912);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
                BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23(l4, function02);
                return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        function03 = function02;
        int i212222 = i4;
        Long l92222 = l4;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str4, null, ClickableKt.m1059clickableXHw0xAI$default(clip3222, z3, null, null, (Function0) rememberedValue, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i4 >> 15) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        f = 3;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(697351363);
        str14 = str26;
        if (str14 != null) {
        }
        f2 = f;
        i15 = 6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(697372449);
        str15 = str25;
        if (str15 == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (str2 == null) {
        }
        TextKt.m3621Text4IGK_g(str2 == null ? "" : str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, i15), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        float f82222 = 6;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f82222)), startRestartGroup, 6);
        if (str == null) {
        }
        TextKt.m3621Text4IGK_g(str == null ? "" : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f82222)), startRestartGroup, 6);
        float f92222 = (float) 0.5d;
        int i222222 = (i1922 >> 12) & 14;
        float f102222 = 100;
        f3 = 16;
        Modifier m1519paddingqDBjuR03222 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f92222)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle72222, startRestartGroup, i222222), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f102222))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62222), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR03222);
        Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
        if (d == null) {
        }
        str16 = "-";
        String str302222 = str16;
        Intrinsics.checkNotNull(str302222);
        androidx.compose.material.TextKt.m2642Text4IGK_g(str302222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle72222, startRestartGroup, i222222), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vs_img, startRestartGroup, 6), "VS", SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(47)), Dp.m7774constructorimpl(38)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
        Alignment.Horizontal centerHorizontally32222 = Alignment.INSTANCE.getCenterHorizontally();
        Modifier weight$default22222 = RowScope.weight$default(rowScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy32222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally32222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22222);
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52222);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance32222 = ColumnScopeInstance.INSTANCE;
        Modifier clip22222 = ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72222)), RoundedCornerShapeKt.getCircleShape());
        if (l5 != null) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((234881024 & i1922) == 67108864) {
        }
        z2 = (i202222 == 536870912) | ((234881024 & i1922) == 67108864);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (z2) {
        }
        l6 = l5;
        function04 = function03;
        rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
                BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28 = ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28(l6, function04);
                return BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str9, null, ClickableKt.m1059clickableXHw0xAI$default(clip22222, z4, null, null, (Function0) rememberedValue2, 6, null), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, ((i1922 >> 6) & 14) | 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        f4 = 4;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-765245554);
        str17 = str292222;
        if (str17 != null) {
        }
        f5 = f4;
        i16 = 500;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-765224400);
        str18 = str12;
        if (str18 != null) {
        }
        startRestartGroup.endReplaceGroup();
        if (str7 == null) {
        }
        TextKt.m3621Text4IGK_g(str7 == null ? "" : str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f62222)), startRestartGroup, 6);
        if (str6 == null) {
        }
        TextKt.m3621Text4IGK_g(str6 == null ? "" : str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, true, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(i16), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, 0, 3456, 53246);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f62222)), startRestartGroup, 6);
        int i232222 = (i1922 >> 15) & 14;
        Modifier m1519paddingqDBjuR022222 = PaddingKt.m1519paddingqDBjuR0(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f92222)), BattleBetOutcomeResolverKt.battleBetHighlightBackgroundColor(battleBetHighlightStyle82222, startRestartGroup, i232222), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f102222))), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62222), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f62222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap62222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier62222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1519paddingqDBjuR022222);
        Function0<ComposeUiNode> constructor62222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl6.getInserting()) {
        }
        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62222);
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        androidx.compose.material.TextKt.m2642Text4IGK_g(coefficientTwo, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(BattleBetOutcomeResolverKt.battleBetHighlightTextColor(battleBetHighlightStyle82222, startRestartGroup, i232222), TextUnitKt.getSp(12), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, (i1922 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(1067049141);
        str19 = str13;
        if (str19 != null) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        l7 = l92222;
        str20 = str13;
        function05 = function04;
        l8 = l6;
        battleBetHighlightStyle3 = battleBetHighlightStyle82222;
        str21 = str25;
        str22 = str26;
        str23 = str12;
        modifier2 = modifier32222;
        str24 = str292222;
        battleBetHighlightStyle4 = battleBetHighlightStyle72222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$26$lambda$24$lambda$23(Long l, Function0 function0) {
        if (l != null) {
            long longValue = l.longValue();
            if (function0 != null) {
                function0.invoke();
            }
            NavigationHelper.navigateToForeignUser$default(NavigationHelper.INSTANCE, (int) longValue, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetInfoRowTwoUsers$lambda$33$lambda$32$lambda$31$lambda$29$lambda$28(Long l, Function0 function0) {
        if (l != null) {
            long longValue = l.longValue();
            if (function0 != null) {
                function0.invoke();
            }
            NavigationHelper.navigateToForeignUser$default(NavigationHelper.INSTANCE, (int) longValue, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void BattleBetDetailsSummary(final Modifier modifier, final long j, final Double d, final Function1<? super Long, Unit> onAmountChange, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onAmountChange, "onAmountChange");
        Composer startRestartGroup = composer.startRestartGroup(807719160);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onAmountChange) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807719160, i3, -1, "org.betup.ui.dialogs.compose.BattleBetDetailsSummary (ChallengeAcceptScreen.kt:825)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
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
            androidx.compose.material.TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.buy_in, startRestartGroup, 6) + ":", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            androidx.compose.material.TextKt.m2642Text4IGK_g(String.valueOf(j), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            float f = 4;
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, startRestartGroup, 6), "Coin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
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
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically4, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor6);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long j2 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            Modifier.Companion companion5 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, companion5);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor7);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f2 = 8;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(BorderKt.m1036borderxT4_qwU(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(modifier, Dp.m7774constructorimpl(28)), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), Dp.m7774constructorimpl(1), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f2))), Dp.m7774constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Vertical centerVertically6 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically6, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor8);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
            }
            Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.new_betcoin, startRestartGroup, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$39$lambda$38;
                        BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$39$lambda$38 = ChallengeAcceptScreenKt.BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$39$lambda$38((SaverScope) obj, (TextFieldValue) obj2);
                        return BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$39$lambda$38;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function2 function2 = (Function2) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TextFieldValue BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$41$lambda$40;
                        BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$41$lambda$40 = ChallengeAcceptScreenKt.BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$41$lambda$40((String) obj);
                        return BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$41$lambda$40;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Saver Saver = SaverKt.Saver(function2, (Function1) rememberedValue2);
            startRestartGroup.startReplaceGroup(5004770);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$43$lambda$42;
                        BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$43$lambda$42 = ChallengeAcceptScreenKt.BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$43$lambda$42(j);
                        return BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$43$lambda$42;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, Saver, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 4);
            Long valueOf = Long.valueOf(j);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed = startRestartGroup.changed(rememberSaveable) | (i4 == 32);
            ChallengeAcceptScreenKt$BattleBetDetailsSummary$1$1$2$2$1$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new ChallengeAcceptScreenKt$BattleBetDetailsSummary$1$1$2$2$1$1$1(j, rememberSaveable, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, (i3 >> 3) & 14);
            TextFieldValue textFieldValue = (TextFieldValue) rememberSaveable.getValue();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7474getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
            SolidColor solidColor = new SolidColor(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), null);
            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(14), 0.0f, Dp.m7774constructorimpl(40), 0.0f, 10, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed2 = startRestartGroup.changed(rememberSaveable) | ((i3 & 7168) == 2048);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46;
                        BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46 = ChallengeAcceptScreenKt.BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46(MutableState.this, onAmountChange, (TextFieldValue) obj);
                        return BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) rememberedValue5, m1520paddingqDBjuR0$default2, false, false, textStyle, keyboardOptions, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, startRestartGroup, 102236160, 0, 48792);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleBetDetailsSummary$lambda$53;
                    BattleBetDetailsSummary$lambda$53 = ChallengeAcceptScreenKt.BattleBetDetailsSummary$lambda$53(Modifier.this, j, d, onAmountChange, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleBetDetailsSummary$lambda$53;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$39$lambda$38(SaverScope Saver, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$41$lambda$40(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextFieldValue(it, TextRangeKt.TextRange(it.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$43$lambda$42(long j) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(String.valueOf(j), TextRangeKt.TextRange(String.valueOf(j).length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleBetDetailsSummary$lambda$52$lambda$51$lambda$50$lambda$49$lambda$48$lambda$47$lambda$46(MutableState mutableState, Function1 function1, TextFieldValue tfv) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long ChallengeAcceptScreen$lambda$0(State<Long> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChallengeAcceptScreen$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchShortInfoModel ChallengeAcceptScreen$lambda$2(State<MatchShortInfoModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ChallengeAcceptScreen$lambda$3(State<Long> state) {
        return state.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ChallengeAcceptScreen$lambda$4(State<Long> state) {
        return state.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OddType ChallengeAcceptScreen$lambda$5(State<? extends OddType> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChallengeAcceptScreen$lambda$6(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChallengeAcceptScreen$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
