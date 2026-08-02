package org.betup.ui.fragment.bets.sheet.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.bets.BattleCreateResult;
import org.betup.ui.fragment.bets.BattleOpponent;
import org.betup.ui.fragment.bets.PlaceBetResult;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.tour.compose.TourState;

/* compiled from: BettingSheetScreen.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0091\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00112\u0010\b\u0002\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00112\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0010\b\u0002\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00112\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010&\u001a\u00020\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010+\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u0004\u0018\u00010!X\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002"}, d2 = {"COEFFICIENT_REFRESH_INTERVAL_MS", "", "BettingSheetScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "onDismiss", "Lkotlin/Function0;", "onChallengeClick", "onSettingsClick", "onPlaceBetClick", "onAddCoinsClick", "onAmountChange", "Lkotlin/Function1;", "onMultiBetClicked", "onPeriodicRefresh", "amountFlow", "Lkotlinx/coroutines/flow/StateFlow;", "userAmountFlow", "isLoadingFlow", "", "betsModelFlow", "", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "oddTypeFlow", "Lorg/betup/model/local/entity/OddType;", "highScoreFlow", "isFirsBetAvailableFlow", "getMinBet", "onInviteUserClick", "battleOpponentFlow", "Lorg/betup/ui/fragment/bets/BattleOpponent;", "placeBetResultFlow", "Lorg/betup/ui/fragment/bets/PlaceBetResult;", "onPlaceBetResultConsumed", "battleCreateResultFlow", "Lorg/betup/ui/fragment/bets/BattleCreateResult;", "onBattleCreateResultConsumed", "isInTour", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;ZLorg/betup/ui/tour/compose/TourState;Landroidx/compose/runtime/Composer;IIII)V", "app_release", "isLoading", "amount", "bets", "oddType", "userAmount", "isFirsBetAvailable", "highScore", "battleOpponent", "placeBetResult", "battleCreateResult"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BettingSheetScreenKt {
    private static final long COEFFICIENT_REFRESH_INTERVAL_MS = 15000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long BettingSheetScreen$lambda$17$lambda$16() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BettingSheetScreen$lambda$36(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function0 function06, Function0 function07, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, StateFlow stateFlow5, StateFlow stateFlow6, StateFlow stateFlow7, Function0 function08, Function0 function09, StateFlow stateFlow8, StateFlow stateFlow9, Function0 function010, StateFlow stateFlow10, Function0 function011, boolean z, TourState tourState, int i, int i2, int i3, int i4, Composer composer, int i5) {
        BettingSheetScreen(modifier, function0, function02, function03, function04, function05, function1, function06, function07, stateFlow, stateFlow2, stateFlow3, stateFlow4, stateFlow5, stateFlow6, stateFlow7, function08, function09, stateFlow8, stateFlow9, function010, stateFlow10, function011, z, tourState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BettingSheetScreen$lambda$11$lambda$10(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BettingSheetScreen(Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function1<? super Long, Unit> function1, Function0<Unit> function06, Function0<Unit> function07, final StateFlow<Long> amountFlow, final StateFlow<Long> userAmountFlow, final StateFlow<Boolean> isLoadingFlow, final StateFlow<? extends List<? extends BetModel>> betsModelFlow, final StateFlow<? extends OddType> oddTypeFlow, final StateFlow<Long> highScoreFlow, final StateFlow<Boolean> isFirsBetAvailableFlow, Function0<Long> function08, Function0<Unit> function09, StateFlow<BattleOpponent> stateFlow, StateFlow<? extends PlaceBetResult> stateFlow2, Function0<Unit> function010, StateFlow<? extends BattleCreateResult> stateFlow3, Function0<Unit> function011, boolean z, TourState tourState, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Function0<Unit> function012;
        Modifier modifier2;
        Function0<Unit> function013;
        Function0<Unit> function014;
        Function0<Unit> function015;
        Function0<Unit> function016;
        Function0<Unit> function017;
        Function0<Unit> function018;
        Function0<Unit> function019;
        Function0<Unit> function020;
        Function1<? super Long, Unit> function12;
        Function0<Unit> function021;
        Function1<? super Long, Unit> function13;
        Function0<Unit> function022;
        Function0<Long> function023;
        Function0<Unit> function024;
        Function0<Unit> function025;
        Object obj;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Function0<Unit> function026;
        Function0<Unit> function027;
        MutableStateFlow mutableStateFlow3;
        StateFlow<? extends BattleCreateResult> stateFlow4;
        Function0<Unit> function028;
        Function0<Unit> function029;
        Function0<Unit> function030;
        Function0<Unit> function031;
        TourState tourState2;
        Function0<Unit> function032;
        boolean z2;
        Function0<Long> function033;
        StateFlow<BattleOpponent> stateFlow5;
        Modifier modifier3;
        Function0<Unit> function034;
        StateFlow<? extends BattleCreateResult> stateFlow6;
        Function0<Unit> function035;
        Function0<Unit> function036;
        Function1<? super Long, Unit> function14;
        int i21;
        int i22;
        Function0<Unit> function037;
        Function0<Unit> function038;
        Function0<Unit> function039;
        Function0<Unit> function040;
        boolean z3;
        BettingSheetScreenKt$BettingSheetScreen$13$1 bettingSheetScreenKt$BettingSheetScreen$13$1;
        boolean changed;
        Object rememberedValue;
        final Function1<? super Long, Unit> function15;
        final Function0<Unit> function041;
        final Function0<Unit> function042;
        final Function0<Unit> function043;
        final Function0<Unit> function044;
        final Function0<Unit> function045;
        final Modifier modifier4;
        final Function0<Unit> function046;
        final StateFlow<BattleOpponent> stateFlow7;
        final StateFlow<? extends PlaceBetResult> stateFlow8;
        final StateFlow<? extends BattleCreateResult> stateFlow9;
        final Function0<Unit> function047;
        final Function0<Long> function048;
        final Function0<Unit> function049;
        final Function0<Unit> function050;
        final Function0<Unit> function051;
        final boolean z4;
        final TourState tourState3;
        ScopeUpdateScope endRestartGroup;
        int i23;
        Intrinsics.checkNotNullParameter(amountFlow, "amountFlow");
        Intrinsics.checkNotNullParameter(userAmountFlow, "userAmountFlow");
        Intrinsics.checkNotNullParameter(isLoadingFlow, "isLoadingFlow");
        Intrinsics.checkNotNullParameter(betsModelFlow, "betsModelFlow");
        Intrinsics.checkNotNullParameter(oddTypeFlow, "oddTypeFlow");
        Intrinsics.checkNotNullParameter(highScoreFlow, "highScoreFlow");
        Intrinsics.checkNotNullParameter(isFirsBetAvailableFlow, "isFirsBetAvailableFlow");
        Composer startRestartGroup = composer.startRestartGroup(-278223230);
        int i24 = i4 & 1;
        if (i24 != 0) {
            i5 = i | 6;
        } else if ((i & 6) == 0) {
            i5 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i;
        }
        int i25 = i4 & 2;
        if (i25 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i26 = i5;
        int i27 = i4 & 4;
        if (i27 != 0) {
            i26 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i26 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i26 |= 3072;
            } else if ((i & 3072) == 0) {
                i26 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i26 |= 24576;
                } else if ((i & 24576) == 0) {
                    i26 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i26 |= startRestartGroup.changedInstance(function05) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i26 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i26 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i26 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i26 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i26 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i12 = i11;
                        i26 |= startRestartGroup.changedInstance(function07) ? 67108864 : 33554432;
                        if ((i4 & 512) == 0) {
                            i23 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(amountFlow) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                            if ((i4 & 1024) == 0) {
                                i13 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i13 = (startRestartGroup.changedInstance(userAmountFlow) ? 4 : 2) | i2;
                            } else {
                                i13 = i2;
                            }
                            if ((i4 & 2048) == 0) {
                                i13 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i13 |= startRestartGroup.changedInstance(isLoadingFlow) ? 32 : 16;
                            }
                            if ((i4 & 4096) == 0) {
                                i13 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i13 |= startRestartGroup.changedInstance(betsModelFlow) ? 256 : 128;
                            }
                            if ((i4 & 8192) == 0) {
                                i13 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i13 |= startRestartGroup.changedInstance(oddTypeFlow) ? 2048 : 1024;
                            }
                            if ((i4 & 16384) == 0) {
                                i13 |= 24576;
                            } else if ((i2 & 24576) == 0) {
                                i13 |= startRestartGroup.changedInstance(highScoreFlow) ? 16384 : 8192;
                            }
                            if ((32768 & i4) == 0) {
                                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i13 |= startRestartGroup.changedInstance(isFirsBetAvailableFlow) ? 131072 : 65536;
                            }
                            i14 = 65536 & i4;
                            if (i14 == 0) {
                                i13 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i13 |= startRestartGroup.changedInstance(function08) ? 1048576 : 524288;
                            }
                            i15 = i4 & 131072;
                            if (i15 == 0) {
                                i13 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                i13 |= startRestartGroup.changedInstance(function09) ? 8388608 : 4194304;
                            }
                            if ((i2 & 100663296) == 0) {
                                i13 |= ((i4 & 262144) == 0 && startRestartGroup.changedInstance(stateFlow)) ? 67108864 : 33554432;
                            }
                            if ((i2 & 805306368) == 0) {
                                i13 |= ((i4 & 524288) == 0 && startRestartGroup.changedInstance(stateFlow2)) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            }
                            i16 = i4 & 1048576;
                            if (i16 == 0) {
                                i17 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i17 = i3 | (startRestartGroup.changedInstance(function010) ? 4 : 2);
                            } else {
                                i17 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i17 |= ((i4 & 2097152) == 0 && startRestartGroup.changedInstance(stateFlow3)) ? 32 : 16;
                            }
                            int i28 = i17;
                            i18 = i4 & 4194304;
                            if (i18 == 0) {
                                i28 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i28 |= startRestartGroup.changedInstance(function011) ? 256 : 128;
                                i19 = i4 & 8388608;
                                if (i19 != 0) {
                                    i28 |= 3072;
                                } else if ((i3 & 3072) == 0) {
                                    i28 |= startRestartGroup.changed(z) ? 2048 : 1024;
                                    i20 = i4 & 16777216;
                                    if (i20 == 0) {
                                        i28 |= 24576;
                                    } else if ((i3 & 24576) == 0) {
                                        i28 |= startRestartGroup.changed(tourState) ? 16384 : 8192;
                                        if ((i26 & 306783379) == 306783378 || (306783379 & i13) != 306783378 || (i28 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i24 != 0 ? Modifier.INSTANCE : modifier;
                                                if (i25 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    }
                                                    function012 = (Function0) rememberedValue2;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function012 = function0;
                                                }
                                                if (i27 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                    modifier2 = companion;
                                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    function013 = (Function0) rememberedValue3;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    modifier2 = companion;
                                                    function013 = function02;
                                                }
                                                if (i6 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                    function014 = function013;
                                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda8
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    function015 = (Function0) rememberedValue4;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function014 = function013;
                                                    function015 = function03;
                                                }
                                                if (i7 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                                    function016 = function015;
                                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda9
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                                    }
                                                    function017 = (Function0) rememberedValue5;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function016 = function015;
                                                    function017 = function04;
                                                }
                                                if (i8 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                                    function018 = function017;
                                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda10
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                                    }
                                                    function019 = (Function0) rememberedValue6;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function018 = function017;
                                                    function019 = function05;
                                                }
                                                if (i9 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                                    function020 = function019;
                                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda11
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj2) {
                                                                Unit BettingSheetScreen$lambda$11$lambda$10;
                                                                BettingSheetScreen$lambda$11$lambda$10 = BettingSheetScreenKt.BettingSheetScreen$lambda$11$lambda$10(((Long) obj2).longValue());
                                                                return BettingSheetScreen$lambda$11$lambda$10;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                                    }
                                                    function12 = (Function1) rememberedValue7;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function020 = function019;
                                                    function12 = function1;
                                                }
                                                if (i10 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda12
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                                    }
                                                    function021 = (Function0) rememberedValue8;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function021 = function06;
                                                }
                                                if (i12 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                                                    function13 = function12;
                                                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda1
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                                    }
                                                    function022 = (Function0) rememberedValue9;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function13 = function12;
                                                    function022 = function07;
                                                }
                                                if (i14 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                long BettingSheetScreen$lambda$17$lambda$16;
                                                                BettingSheetScreen$lambda$17$lambda$16 = BettingSheetScreenKt.BettingSheetScreen$lambda$17$lambda$16();
                                                                return Long.valueOf(BettingSheetScreen$lambda$17$lambda$16);
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                                    }
                                                    function023 = (Function0) rememberedValue10;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function023 = function08;
                                                }
                                                if (i15 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                                                    function024 = function022;
                                                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue11 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda3
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                                    }
                                                    function025 = (Function0) rememberedValue11;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function024 = function022;
                                                    function025 = function09;
                                                }
                                                if ((262144 & i4) != 0) {
                                                    obj = null;
                                                    mutableStateFlow = StateFlowKt.MutableStateFlow(null);
                                                    i13 &= -234881025;
                                                } else {
                                                    obj = null;
                                                    mutableStateFlow = stateFlow;
                                                }
                                                if ((i4 & 524288) != 0) {
                                                    mutableStateFlow2 = StateFlowKt.MutableStateFlow(obj);
                                                    i13 &= -1879048193;
                                                } else {
                                                    mutableStateFlow2 = stateFlow2;
                                                }
                                                Function0<Unit> function052 = function025;
                                                if (i16 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                                                    function026 = function021;
                                                    if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue12 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda4
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                                    }
                                                    function027 = (Function0) rememberedValue12;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function026 = function021;
                                                    function027 = function010;
                                                }
                                                if ((2097152 & i4) != 0) {
                                                    mutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
                                                    i28 &= -113;
                                                } else {
                                                    mutableStateFlow3 = stateFlow3;
                                                }
                                                Function0<Unit> function053 = function027;
                                                if (i18 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue13 = startRestartGroup.rememberedValue();
                                                    stateFlow4 = mutableStateFlow3;
                                                    if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda5
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue13);
                                                    }
                                                    function028 = (Function0) rememberedValue13;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    stateFlow4 = mutableStateFlow3;
                                                    function028 = function011;
                                                }
                                                boolean z5 = i19 != 0 ? false : z;
                                                function029 = function024;
                                                function030 = function052;
                                                function031 = function053;
                                                if (i20 != 0) {
                                                    function032 = function028;
                                                    z2 = z5;
                                                    function033 = function023;
                                                    stateFlow5 = mutableStateFlow;
                                                    modifier3 = modifier2;
                                                    function034 = function026;
                                                    tourState2 = null;
                                                } else {
                                                    tourState2 = tourState;
                                                    function032 = function028;
                                                    z2 = z5;
                                                    function033 = function023;
                                                    stateFlow5 = mutableStateFlow;
                                                    modifier3 = modifier2;
                                                    function034 = function026;
                                                }
                                                stateFlow6 = stateFlow4;
                                                function035 = function014;
                                                function036 = function020;
                                                function14 = function13;
                                                i21 = i28;
                                                i22 = i13;
                                                function037 = function016;
                                                function038 = function018;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((262144 & i4) != 0) {
                                                    i13 &= -234881025;
                                                }
                                                if ((i4 & 524288) != 0) {
                                                    i13 &= -1879048193;
                                                }
                                                if ((2097152 & i4) != 0) {
                                                    i28 &= -113;
                                                }
                                                modifier3 = modifier;
                                                function012 = function0;
                                                function035 = function02;
                                                function038 = function04;
                                                function036 = function05;
                                                function14 = function1;
                                                function034 = function06;
                                                function029 = function07;
                                                function033 = function08;
                                                function030 = function09;
                                                stateFlow5 = stateFlow;
                                                mutableStateFlow2 = stateFlow2;
                                                function031 = function010;
                                                stateFlow6 = stateFlow3;
                                                function032 = function011;
                                                z2 = z;
                                                tourState2 = tourState;
                                                i21 = i28;
                                                i22 = i13;
                                                function037 = function03;
                                            }
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                function040 = function037;
                                                function039 = function035;
                                                ComposerKt.traceEventStart(-278223230, i26, i22, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreen (BettingSheetScreen.kt:50)");
                                            } else {
                                                function039 = function035;
                                                function040 = function037;
                                            }
                                            int i29 = i22 >> 3;
                                            Function0<Unit> function054 = function012;
                                            Modifier modifier5 = modifier3;
                                            State collectAsState = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i29 & 14, 1);
                                            State collectAsState2 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                                            State collectAsState3 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                                            Unit unit = Unit.INSTANCE;
                                            startRestartGroup.startReplaceGroup(5004770);
                                            z3 = (234881024 & i26) == 67108864;
                                            Object rememberedValue14 = startRestartGroup.rememberedValue();
                                            if (!z3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                                                startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                                            } else {
                                                bettingSheetScreenKt$BettingSheetScreen$13$1 = rememberedValue14;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                                            State collectAsState4 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                                            Function0<Unit> function055 = function029;
                                            State collectAsState5 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                                            State collectAsState6 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                                            State collectAsState7 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                                            List<BetModel> BettingSheetScreen$lambda$26 = BettingSheetScreen$lambda$26(collectAsState3);
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changed = startRestartGroup.changed(BettingSheetScreen$lambda$26);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = Long.valueOf(function033.invoke().longValue());
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            long longValue = ((Number) rememberedValue).longValue();
                                            startRestartGroup.endReplaceGroup();
                                            int i30 = i21 >> 3;
                                            StateFlow<BattleOpponent> stateFlow10 = stateFlow5;
                                            StateFlow<? extends PlaceBetResult> stateFlow11 = mutableStateFlow2;
                                            BettingSheetComposeUIKt.BettingSheetUi(modifier5, function054, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState), BettingSheetScreen$lambda$25(collectAsState2), BettingSheetScreen$lambda$26(collectAsState3), BettingSheetScreen$lambda$28(collectAsState4), BettingSheetScreen$lambda$29(collectAsState5), BettingSheetScreen$lambda$30(collectAsState6), BettingSheetScreen$lambda$31(collectAsState7), longValue, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i30 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i29 & 3670016) | ((i21 << 27) & 1879048192), i30 & 8176, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            function15 = function14;
                                            function041 = function036;
                                            function042 = function038;
                                            function043 = function040;
                                            function044 = function039;
                                            function045 = function054;
                                            modifier4 = modifier5;
                                            function046 = function055;
                                            stateFlow7 = stateFlow10;
                                            stateFlow8 = stateFlow11;
                                            stateFlow9 = stateFlow6;
                                            function047 = function034;
                                            function048 = function033;
                                            function049 = function030;
                                            function050 = function031;
                                            function051 = function032;
                                            z4 = z2;
                                            tourState3 = tourState2;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            function045 = function0;
                                            function044 = function02;
                                            function043 = function03;
                                            function042 = function04;
                                            function041 = function05;
                                            function15 = function1;
                                            function047 = function06;
                                            function046 = function07;
                                            function048 = function08;
                                            function049 = function09;
                                            stateFlow7 = stateFlow;
                                            stateFlow8 = stateFlow2;
                                            function050 = function010;
                                            stateFlow9 = stateFlow3;
                                            function051 = function011;
                                            z4 = z;
                                            tourState3 = tourState;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup != null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetScreenKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    Unit BettingSheetScreen$lambda$36;
                                                    BettingSheetScreen$lambda$36 = BettingSheetScreenKt.BettingSheetScreen$lambda$36(Modifier.this, function045, function044, function043, function042, function041, function15, function047, function046, amountFlow, userAmountFlow, isLoadingFlow, betsModelFlow, oddTypeFlow, highScoreFlow, isFirsBetAvailableFlow, function048, function049, stateFlow7, stateFlow8, function050, stateFlow9, function051, z4, tourState3, i, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                                                    return BettingSheetScreen$lambda$36;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    if ((i26 & 306783379) == 306783378) {
                                    }
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if (i25 != 0) {
                                    }
                                    if (i27 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if ((262144 & i4) != 0) {
                                    }
                                    if ((i4 & 524288) != 0) {
                                    }
                                    Function0<Unit> function0522 = function025;
                                    if (i16 != 0) {
                                    }
                                    if ((2097152 & i4) != 0) {
                                    }
                                    Function0<Unit> function0532 = function027;
                                    if (i18 != 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    function029 = function024;
                                    function030 = function0522;
                                    function031 = function0532;
                                    if (i20 != 0) {
                                    }
                                    stateFlow6 = stateFlow4;
                                    function035 = function014;
                                    function036 = function020;
                                    function14 = function13;
                                    i21 = i28;
                                    i22 = i13;
                                    function037 = function016;
                                    function038 = function018;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i292 = i22 >> 3;
                                    Function0<Unit> function0542 = function012;
                                    Modifier modifier52 = modifier3;
                                    State collectAsState8 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i292 & 14, 1);
                                    State collectAsState22 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                                    State collectAsState32 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                                    Unit unit2 = Unit.INSTANCE;
                                    startRestartGroup.startReplaceGroup(5004770);
                                    if ((234881024 & i26) == 67108864) {
                                    }
                                    Object rememberedValue142 = startRestartGroup.rememberedValue();
                                    if (z3) {
                                    }
                                    bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                                    startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                                    State collectAsState42 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                                    Function0<Unit> function0552 = function029;
                                    State collectAsState52 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                                    State collectAsState62 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                                    State collectAsState72 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                                    List<BetModel> BettingSheetScreen$lambda$262 = BettingSheetScreen$lambda$26(collectAsState32);
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changed = startRestartGroup.changed(BettingSheetScreen$lambda$262);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = Long.valueOf(function033.invoke().longValue());
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    long longValue2 = ((Number) rememberedValue).longValue();
                                    startRestartGroup.endReplaceGroup();
                                    int i302 = i21 >> 3;
                                    StateFlow<BattleOpponent> stateFlow102 = stateFlow5;
                                    StateFlow<? extends PlaceBetResult> stateFlow112 = mutableStateFlow2;
                                    BettingSheetComposeUIKt.BettingSheetUi(modifier52, function0542, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState8), BettingSheetScreen$lambda$25(collectAsState22), BettingSheetScreen$lambda$26(collectAsState32), BettingSheetScreen$lambda$28(collectAsState42), BettingSheetScreen$lambda$29(collectAsState52), BettingSheetScreen$lambda$30(collectAsState62), BettingSheetScreen$lambda$31(collectAsState72), longValue2, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i302 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i292 & 3670016) | ((i21 << 27) & 1879048192), i302 & 8176, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function15 = function14;
                                    function041 = function036;
                                    function042 = function038;
                                    function043 = function040;
                                    function044 = function039;
                                    function045 = function0542;
                                    modifier4 = modifier52;
                                    function046 = function0552;
                                    stateFlow7 = stateFlow102;
                                    stateFlow8 = stateFlow112;
                                    stateFlow9 = stateFlow6;
                                    function047 = function034;
                                    function048 = function033;
                                    function049 = function030;
                                    function050 = function031;
                                    function051 = function032;
                                    z4 = z2;
                                    tourState3 = tourState2;
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                i20 = i4 & 16777216;
                                if (i20 == 0) {
                                }
                                if ((i26 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                }
                                if (i24 != 0) {
                                }
                                if (i25 != 0) {
                                }
                                if (i27 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i14 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if ((262144 & i4) != 0) {
                                }
                                if ((i4 & 524288) != 0) {
                                }
                                Function0<Unit> function05222 = function025;
                                if (i16 != 0) {
                                }
                                if ((2097152 & i4) != 0) {
                                }
                                Function0<Unit> function05322 = function027;
                                if (i18 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                function029 = function024;
                                function030 = function05222;
                                function031 = function05322;
                                if (i20 != 0) {
                                }
                                stateFlow6 = stateFlow4;
                                function035 = function014;
                                function036 = function020;
                                function14 = function13;
                                i21 = i28;
                                i22 = i13;
                                function037 = function016;
                                function038 = function018;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i2922 = i22 >> 3;
                                Function0<Unit> function05422 = function012;
                                Modifier modifier522 = modifier3;
                                State collectAsState82 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i2922 & 14, 1);
                                State collectAsState222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                                State collectAsState322 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                                Unit unit22 = Unit.INSTANCE;
                                startRestartGroup.startReplaceGroup(5004770);
                                if ((234881024 & i26) == 67108864) {
                                }
                                Object rememberedValue1422 = startRestartGroup.rememberedValue();
                                if (z3) {
                                }
                                bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                                startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                                State collectAsState422 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                                Function0<Unit> function05522 = function029;
                                State collectAsState522 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                                State collectAsState622 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                                State collectAsState722 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                                List<BetModel> BettingSheetScreen$lambda$2622 = BettingSheetScreen$lambda$26(collectAsState322);
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(BettingSheetScreen$lambda$2622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = Long.valueOf(function033.invoke().longValue());
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                long longValue22 = ((Number) rememberedValue).longValue();
                                startRestartGroup.endReplaceGroup();
                                int i3022 = i21 >> 3;
                                StateFlow<BattleOpponent> stateFlow1022 = stateFlow5;
                                StateFlow<? extends PlaceBetResult> stateFlow1122 = mutableStateFlow2;
                                BettingSheetComposeUIKt.BettingSheetUi(modifier522, function05422, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState82), BettingSheetScreen$lambda$25(collectAsState222), BettingSheetScreen$lambda$26(collectAsState322), BettingSheetScreen$lambda$28(collectAsState422), BettingSheetScreen$lambda$29(collectAsState522), BettingSheetScreen$lambda$30(collectAsState622), BettingSheetScreen$lambda$31(collectAsState722), longValue22, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i3022 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i2922 & 3670016) | ((i21 << 27) & 1879048192), i3022 & 8176, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function15 = function14;
                                function041 = function036;
                                function042 = function038;
                                function043 = function040;
                                function044 = function039;
                                function045 = function05422;
                                modifier4 = modifier522;
                                function046 = function05522;
                                stateFlow7 = stateFlow1022;
                                stateFlow8 = stateFlow1122;
                                stateFlow9 = stateFlow6;
                                function047 = function034;
                                function048 = function033;
                                function049 = function030;
                                function050 = function031;
                                function051 = function032;
                                z4 = z2;
                                tourState3 = tourState2;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i19 = i4 & 8388608;
                            if (i19 != 0) {
                            }
                            i20 = i4 & 16777216;
                            if (i20 == 0) {
                            }
                            if ((i26 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i27 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if ((262144 & i4) != 0) {
                            }
                            if ((i4 & 524288) != 0) {
                            }
                            Function0<Unit> function052222 = function025;
                            if (i16 != 0) {
                            }
                            if ((2097152 & i4) != 0) {
                            }
                            Function0<Unit> function053222 = function027;
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            function029 = function024;
                            function030 = function052222;
                            function031 = function053222;
                            if (i20 != 0) {
                            }
                            stateFlow6 = stateFlow4;
                            function035 = function014;
                            function036 = function020;
                            function14 = function13;
                            i21 = i28;
                            i22 = i13;
                            function037 = function016;
                            function038 = function018;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i29222 = i22 >> 3;
                            Function0<Unit> function054222 = function012;
                            Modifier modifier5222 = modifier3;
                            State collectAsState822 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i29222 & 14, 1);
                            State collectAsState2222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                            State collectAsState3222 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                            Unit unit222 = Unit.INSTANCE;
                            startRestartGroup.startReplaceGroup(5004770);
                            if ((234881024 & i26) == 67108864) {
                            }
                            Object rememberedValue14222 = startRestartGroup.rememberedValue();
                            if (z3) {
                            }
                            bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                            startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                            State collectAsState4222 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                            Function0<Unit> function055222 = function029;
                            State collectAsState5222 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                            State collectAsState6222 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                            State collectAsState7222 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                            List<BetModel> BettingSheetScreen$lambda$26222 = BettingSheetScreen$lambda$26(collectAsState3222);
                            startRestartGroup.startReplaceGroup(5004770);
                            changed = startRestartGroup.changed(BettingSheetScreen$lambda$26222);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = Long.valueOf(function033.invoke().longValue());
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            long longValue222 = ((Number) rememberedValue).longValue();
                            startRestartGroup.endReplaceGroup();
                            int i30222 = i21 >> 3;
                            StateFlow<BattleOpponent> stateFlow10222 = stateFlow5;
                            StateFlow<? extends PlaceBetResult> stateFlow11222 = mutableStateFlow2;
                            BettingSheetComposeUIKt.BettingSheetUi(modifier5222, function054222, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState822), BettingSheetScreen$lambda$25(collectAsState2222), BettingSheetScreen$lambda$26(collectAsState3222), BettingSheetScreen$lambda$28(collectAsState4222), BettingSheetScreen$lambda$29(collectAsState5222), BettingSheetScreen$lambda$30(collectAsState6222), BettingSheetScreen$lambda$31(collectAsState7222), longValue222, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i30222 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i29222 & 3670016) | ((i21 << 27) & 1879048192), i30222 & 8176, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function15 = function14;
                            function041 = function036;
                            function042 = function038;
                            function043 = function040;
                            function044 = function039;
                            function045 = function054222;
                            modifier4 = modifier5222;
                            function046 = function055222;
                            stateFlow7 = stateFlow10222;
                            stateFlow8 = stateFlow11222;
                            stateFlow9 = stateFlow6;
                            function047 = function034;
                            function048 = function033;
                            function049 = function030;
                            function050 = function031;
                            function051 = function032;
                            z4 = z2;
                            tourState3 = tourState2;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i26 |= i23;
                        if ((i4 & 1024) == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        if ((i4 & 4096) == 0) {
                        }
                        if ((i4 & 8192) == 0) {
                        }
                        if ((i4 & 16384) == 0) {
                        }
                        if ((32768 & i4) == 0) {
                        }
                        i14 = 65536 & i4;
                        if (i14 == 0) {
                        }
                        i15 = i4 & 131072;
                        if (i15 == 0) {
                        }
                        if ((i2 & 100663296) == 0) {
                        }
                        if ((i2 & 805306368) == 0) {
                        }
                        i16 = i4 & 1048576;
                        if (i16 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        int i282 = i17;
                        i18 = i4 & 4194304;
                        if (i18 == 0) {
                        }
                        i19 = i4 & 8388608;
                        if (i19 != 0) {
                        }
                        i20 = i4 & 16777216;
                        if (i20 == 0) {
                        }
                        if ((i26 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (i27 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if ((262144 & i4) != 0) {
                        }
                        if ((i4 & 524288) != 0) {
                        }
                        Function0<Unit> function0522222 = function025;
                        if (i16 != 0) {
                        }
                        if ((2097152 & i4) != 0) {
                        }
                        Function0<Unit> function0532222 = function027;
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        function029 = function024;
                        function030 = function0522222;
                        function031 = function0532222;
                        if (i20 != 0) {
                        }
                        stateFlow6 = stateFlow4;
                        function035 = function014;
                        function036 = function020;
                        function14 = function13;
                        i21 = i282;
                        i22 = i13;
                        function037 = function016;
                        function038 = function018;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i292222 = i22 >> 3;
                        Function0<Unit> function0542222 = function012;
                        Modifier modifier52222 = modifier3;
                        State collectAsState8222 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i292222 & 14, 1);
                        State collectAsState22222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                        State collectAsState32222 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                        Unit unit2222 = Unit.INSTANCE;
                        startRestartGroup.startReplaceGroup(5004770);
                        if ((234881024 & i26) == 67108864) {
                        }
                        Object rememberedValue142222 = startRestartGroup.rememberedValue();
                        if (z3) {
                        }
                        bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                        startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                        State collectAsState42222 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                        Function0<Unit> function0552222 = function029;
                        State collectAsState52222 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                        State collectAsState62222 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                        State collectAsState72222 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                        List<BetModel> BettingSheetScreen$lambda$262222 = BettingSheetScreen$lambda$26(collectAsState32222);
                        startRestartGroup.startReplaceGroup(5004770);
                        changed = startRestartGroup.changed(BettingSheetScreen$lambda$262222);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = Long.valueOf(function033.invoke().longValue());
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        long longValue2222 = ((Number) rememberedValue).longValue();
                        startRestartGroup.endReplaceGroup();
                        int i302222 = i21 >> 3;
                        StateFlow<BattleOpponent> stateFlow102222 = stateFlow5;
                        StateFlow<? extends PlaceBetResult> stateFlow112222 = mutableStateFlow2;
                        BettingSheetComposeUIKt.BettingSheetUi(modifier52222, function0542222, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState8222), BettingSheetScreen$lambda$25(collectAsState22222), BettingSheetScreen$lambda$26(collectAsState32222), BettingSheetScreen$lambda$28(collectAsState42222), BettingSheetScreen$lambda$29(collectAsState52222), BettingSheetScreen$lambda$30(collectAsState62222), BettingSheetScreen$lambda$31(collectAsState72222), longValue2222, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i302222 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i292222 & 3670016) | ((i21 << 27) & 1879048192), i302222 & 8176, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function15 = function14;
                        function041 = function036;
                        function042 = function038;
                        function043 = function040;
                        function044 = function039;
                        function045 = function0542222;
                        modifier4 = modifier52222;
                        function046 = function0552222;
                        stateFlow7 = stateFlow102222;
                        stateFlow8 = stateFlow112222;
                        stateFlow9 = stateFlow6;
                        function047 = function034;
                        function048 = function033;
                        function049 = function030;
                        function050 = function031;
                        function051 = function032;
                        z4 = z2;
                        tourState3 = tourState2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i12 = i11;
                    if ((i4 & 512) == 0) {
                    }
                    i26 |= i23;
                    if ((i4 & 1024) == 0) {
                    }
                    if ((i4 & 2048) == 0) {
                    }
                    if ((i4 & 4096) == 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i4 & 16384) == 0) {
                    }
                    if ((32768 & i4) == 0) {
                    }
                    i14 = 65536 & i4;
                    if (i14 == 0) {
                    }
                    i15 = i4 & 131072;
                    if (i15 == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i2 & 805306368) == 0) {
                    }
                    i16 = i4 & 1048576;
                    if (i16 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i2822 = i17;
                    i18 = i4 & 4194304;
                    if (i18 == 0) {
                    }
                    i19 = i4 & 8388608;
                    if (i19 != 0) {
                    }
                    i20 = i4 & 16777216;
                    if (i20 == 0) {
                    }
                    if ((i26 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if ((262144 & i4) != 0) {
                    }
                    if ((i4 & 524288) != 0) {
                    }
                    Function0<Unit> function05222222 = function025;
                    if (i16 != 0) {
                    }
                    if ((2097152 & i4) != 0) {
                    }
                    Function0<Unit> function05322222 = function027;
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    function029 = function024;
                    function030 = function05222222;
                    function031 = function05322222;
                    if (i20 != 0) {
                    }
                    stateFlow6 = stateFlow4;
                    function035 = function014;
                    function036 = function020;
                    function14 = function13;
                    i21 = i2822;
                    i22 = i13;
                    function037 = function016;
                    function038 = function018;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i2922222 = i22 >> 3;
                    Function0<Unit> function05422222 = function012;
                    Modifier modifier522222 = modifier3;
                    State collectAsState82222 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i2922222 & 14, 1);
                    State collectAsState222222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                    State collectAsState322222 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                    Unit unit22222 = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((234881024 & i26) == 67108864) {
                    }
                    Object rememberedValue1422222 = startRestartGroup.rememberedValue();
                    if (z3) {
                    }
                    bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                    startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                    State collectAsState422222 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                    Function0<Unit> function05522222 = function029;
                    State collectAsState522222 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                    State collectAsState622222 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                    State collectAsState722222 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                    List<BetModel> BettingSheetScreen$lambda$2622222 = BettingSheetScreen$lambda$26(collectAsState322222);
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(BettingSheetScreen$lambda$2622222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = Long.valueOf(function033.invoke().longValue());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    long longValue22222 = ((Number) rememberedValue).longValue();
                    startRestartGroup.endReplaceGroup();
                    int i3022222 = i21 >> 3;
                    StateFlow<BattleOpponent> stateFlow1022222 = stateFlow5;
                    StateFlow<? extends PlaceBetResult> stateFlow1122222 = mutableStateFlow2;
                    BettingSheetComposeUIKt.BettingSheetUi(modifier522222, function05422222, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState82222), BettingSheetScreen$lambda$25(collectAsState222222), BettingSheetScreen$lambda$26(collectAsState322222), BettingSheetScreen$lambda$28(collectAsState422222), BettingSheetScreen$lambda$29(collectAsState522222), BettingSheetScreen$lambda$30(collectAsState622222), BettingSheetScreen$lambda$31(collectAsState722222), longValue22222, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i3022222 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i2922222 & 3670016) | ((i21 << 27) & 1879048192), i3022222 & 8176, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function15 = function14;
                    function041 = function036;
                    function042 = function038;
                    function043 = function040;
                    function044 = function039;
                    function045 = function05422222;
                    modifier4 = modifier522222;
                    function046 = function05522222;
                    stateFlow7 = stateFlow1022222;
                    stateFlow8 = stateFlow1122222;
                    stateFlow9 = stateFlow6;
                    function047 = function034;
                    function048 = function033;
                    function049 = function030;
                    function050 = function031;
                    function051 = function032;
                    z4 = z2;
                    tourState3 = tourState2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i4 & 512) == 0) {
                }
                i26 |= i23;
                if ((i4 & 1024) == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                if ((i4 & 4096) == 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((32768 & i4) == 0) {
                }
                i14 = 65536 & i4;
                if (i14 == 0) {
                }
                i15 = i4 & 131072;
                if (i15 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                i16 = i4 & 1048576;
                if (i16 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i28222 = i17;
                i18 = i4 & 4194304;
                if (i18 == 0) {
                }
                i19 = i4 & 8388608;
                if (i19 != 0) {
                }
                i20 = i4 & 16777216;
                if (i20 == 0) {
                }
                if ((i26 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (i27 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if ((262144 & i4) != 0) {
                }
                if ((i4 & 524288) != 0) {
                }
                Function0<Unit> function052222222 = function025;
                if (i16 != 0) {
                }
                if ((2097152 & i4) != 0) {
                }
                Function0<Unit> function053222222 = function027;
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                function029 = function024;
                function030 = function052222222;
                function031 = function053222222;
                if (i20 != 0) {
                }
                stateFlow6 = stateFlow4;
                function035 = function014;
                function036 = function020;
                function14 = function13;
                i21 = i28222;
                i22 = i13;
                function037 = function016;
                function038 = function018;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i29222222 = i22 >> 3;
                Function0<Unit> function054222222 = function012;
                Modifier modifier5222222 = modifier3;
                State collectAsState822222 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i29222222 & 14, 1);
                State collectAsState2222222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
                State collectAsState3222222 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
                Unit unit222222 = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                if ((234881024 & i26) == 67108864) {
                }
                Object rememberedValue14222222 = startRestartGroup.rememberedValue();
                if (z3) {
                }
                bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
                startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
                State collectAsState4222222 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
                Function0<Unit> function055222222 = function029;
                State collectAsState5222222 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
                State collectAsState6222222 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
                State collectAsState7222222 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
                List<BetModel> BettingSheetScreen$lambda$26222222 = BettingSheetScreen$lambda$26(collectAsState3222222);
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(BettingSheetScreen$lambda$26222222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = Long.valueOf(function033.invoke().longValue());
                startRestartGroup.updateRememberedValue(rememberedValue);
                long longValue222222 = ((Number) rememberedValue).longValue();
                startRestartGroup.endReplaceGroup();
                int i30222222 = i21 >> 3;
                StateFlow<BattleOpponent> stateFlow10222222 = stateFlow5;
                StateFlow<? extends PlaceBetResult> stateFlow11222222 = mutableStateFlow2;
                BettingSheetComposeUIKt.BettingSheetUi(modifier5222222, function054222222, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState822222), BettingSheetScreen$lambda$25(collectAsState2222222), BettingSheetScreen$lambda$26(collectAsState3222222), BettingSheetScreen$lambda$28(collectAsState4222222), BettingSheetScreen$lambda$29(collectAsState5222222), BettingSheetScreen$lambda$30(collectAsState6222222), BettingSheetScreen$lambda$31(collectAsState7222222), longValue222222, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i30222222 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i29222222 & 3670016) | ((i21 << 27) & 1879048192), i30222222 & 8176, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function15 = function14;
                function041 = function036;
                function042 = function038;
                function043 = function040;
                function044 = function039;
                function045 = function054222222;
                modifier4 = modifier5222222;
                function046 = function055222222;
                stateFlow7 = stateFlow10222222;
                stateFlow8 = stateFlow11222222;
                stateFlow9 = stateFlow6;
                function047 = function034;
                function048 = function033;
                function049 = function030;
                function050 = function031;
                function051 = function032;
                z4 = z2;
                tourState3 = tourState2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i4 & 512) == 0) {
            }
            i26 |= i23;
            if ((i4 & 1024) == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            if ((i4 & 4096) == 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((32768 & i4) == 0) {
            }
            i14 = 65536 & i4;
            if (i14 == 0) {
            }
            i15 = i4 & 131072;
            if (i15 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            i16 = i4 & 1048576;
            if (i16 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i282222 = i17;
            i18 = i4 & 4194304;
            if (i18 == 0) {
            }
            i19 = i4 & 8388608;
            if (i19 != 0) {
            }
            i20 = i4 & 16777216;
            if (i20 == 0) {
            }
            if ((i26 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (i27 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if ((262144 & i4) != 0) {
            }
            if ((i4 & 524288) != 0) {
            }
            Function0<Unit> function0522222222 = function025;
            if (i16 != 0) {
            }
            if ((2097152 & i4) != 0) {
            }
            Function0<Unit> function0532222222 = function027;
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            function029 = function024;
            function030 = function0522222222;
            function031 = function0532222222;
            if (i20 != 0) {
            }
            stateFlow6 = stateFlow4;
            function035 = function014;
            function036 = function020;
            function14 = function13;
            i21 = i282222;
            i22 = i13;
            function037 = function016;
            function038 = function018;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i292222222 = i22 >> 3;
            Function0<Unit> function0542222222 = function012;
            Modifier modifier52222222 = modifier3;
            State collectAsState8222222 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i292222222 & 14, 1);
            State collectAsState22222222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
            State collectAsState32222222 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
            Unit unit2222222 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            if ((234881024 & i26) == 67108864) {
            }
            Object rememberedValue142222222 = startRestartGroup.rememberedValue();
            if (z3) {
            }
            bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
            startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
            State collectAsState42222222 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
            Function0<Unit> function0552222222 = function029;
            State collectAsState52222222 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
            State collectAsState62222222 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
            State collectAsState72222222 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
            List<BetModel> BettingSheetScreen$lambda$262222222 = BettingSheetScreen$lambda$26(collectAsState32222222);
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(BettingSheetScreen$lambda$262222222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = Long.valueOf(function033.invoke().longValue());
            startRestartGroup.updateRememberedValue(rememberedValue);
            long longValue2222222 = ((Number) rememberedValue).longValue();
            startRestartGroup.endReplaceGroup();
            int i302222222 = i21 >> 3;
            StateFlow<BattleOpponent> stateFlow102222222 = stateFlow5;
            StateFlow<? extends PlaceBetResult> stateFlow112222222 = mutableStateFlow2;
            BettingSheetComposeUIKt.BettingSheetUi(modifier52222222, function0542222222, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState8222222), BettingSheetScreen$lambda$25(collectAsState22222222), BettingSheetScreen$lambda$26(collectAsState32222222), BettingSheetScreen$lambda$28(collectAsState42222222), BettingSheetScreen$lambda$29(collectAsState52222222), BettingSheetScreen$lambda$30(collectAsState62222222), BettingSheetScreen$lambda$31(collectAsState72222222), longValue2222222, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i302222222 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i292222222 & 3670016) | ((i21 << 27) & 1879048192), i302222222 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function15 = function14;
            function041 = function036;
            function042 = function038;
            function043 = function040;
            function044 = function039;
            function045 = function0542222222;
            modifier4 = modifier52222222;
            function046 = function0552222222;
            stateFlow7 = stateFlow102222222;
            stateFlow8 = stateFlow112222222;
            stateFlow9 = stateFlow6;
            function047 = function034;
            function048 = function033;
            function049 = function030;
            function050 = function031;
            function051 = function032;
            z4 = z2;
            tourState3 = tourState2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i4 & 512) == 0) {
        }
        i26 |= i23;
        if ((i4 & 1024) == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((32768 & i4) == 0) {
        }
        i14 = 65536 & i4;
        if (i14 == 0) {
        }
        i15 = i4 & 131072;
        if (i15 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i16 = i4 & 1048576;
        if (i16 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i2822222 = i17;
        i18 = i4 & 4194304;
        if (i18 == 0) {
        }
        i19 = i4 & 8388608;
        if (i19 != 0) {
        }
        i20 = i4 & 16777216;
        if (i20 == 0) {
        }
        if ((i26 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i27 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if ((262144 & i4) != 0) {
        }
        if ((i4 & 524288) != 0) {
        }
        Function0<Unit> function05222222222 = function025;
        if (i16 != 0) {
        }
        if ((2097152 & i4) != 0) {
        }
        Function0<Unit> function05322222222 = function027;
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        function029 = function024;
        function030 = function05222222222;
        function031 = function05322222222;
        if (i20 != 0) {
        }
        stateFlow6 = stateFlow4;
        function035 = function014;
        function036 = function020;
        function14 = function13;
        i21 = i2822222;
        i22 = i13;
        function037 = function016;
        function038 = function018;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i2922222222 = i22 >> 3;
        Function0<Unit> function05422222222 = function012;
        Modifier modifier522222222 = modifier3;
        State collectAsState82222222 = SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, i2922222222 & 14, 1);
        State collectAsState222222222 = SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i26 >> 27) & 14, 1);
        State collectAsState322222222 = SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, (i22 >> 6) & 14, 1);
        Unit unit22222222 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        if ((234881024 & i26) == 67108864) {
        }
        Object rememberedValue1422222222 = startRestartGroup.rememberedValue();
        if (z3) {
        }
        bettingSheetScreenKt$BettingSheetScreen$13$1 = new BettingSheetScreenKt$BettingSheetScreen$13$1(function029, null);
        startRestartGroup.updateRememberedValue(bettingSheetScreenKt$BettingSheetScreen$13$1);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit22222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) bettingSheetScreenKt$BettingSheetScreen$13$1, startRestartGroup, 6);
        State collectAsState422222222 = SnapshotStateKt.collectAsState(oddTypeFlow, null, startRestartGroup, (i22 >> 9) & 14, 1);
        Function0<Unit> function05522222222 = function029;
        State collectAsState522222222 = SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, i22 & 14, 1);
        State collectAsState622222222 = SnapshotStateKt.collectAsState(isFirsBetAvailableFlow, null, startRestartGroup, (i22 >> 15) & 14, 1);
        State collectAsState722222222 = SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i22 >> 12) & 14, 1);
        List<BetModel> BettingSheetScreen$lambda$2622222222 = BettingSheetScreen$lambda$26(collectAsState322222222);
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(BettingSheetScreen$lambda$2622222222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Long.valueOf(function033.invoke().longValue());
        startRestartGroup.updateRememberedValue(rememberedValue);
        long longValue22222222 = ((Number) rememberedValue).longValue();
        startRestartGroup.endReplaceGroup();
        int i3022222222 = i21 >> 3;
        StateFlow<BattleOpponent> stateFlow1022222222 = stateFlow5;
        StateFlow<? extends PlaceBetResult> stateFlow1122222222 = mutableStateFlow2;
        BettingSheetComposeUIKt.BettingSheetUi(modifier522222222, function05422222222, function039, function040, function038, function036, function14, function034, BettingSheetScreen$lambda$24(collectAsState82222222), BettingSheetScreen$lambda$25(collectAsState222222222), BettingSheetScreen$lambda$26(collectAsState322222222), BettingSheetScreen$lambda$28(collectAsState422222222), BettingSheetScreen$lambda$29(collectAsState522222222), BettingSheetScreen$lambda$30(collectAsState622222222), BettingSheetScreen$lambda$31(collectAsState722222222), longValue22222222, function030, BettingSheetScreen$lambda$33(SnapshotStateKt.collectAsState(stateFlow5, null, startRestartGroup, (i22 >> 24) & 14, 1)), BettingSheetScreen$lambda$34(SnapshotStateKt.collectAsState(mutableStateFlow2, null, startRestartGroup, (i22 >> 27) & 14, 1)), function031, BettingSheetScreen$lambda$35(SnapshotStateKt.collectAsState(stateFlow6, null, startRestartGroup, i3022222222 & 14, 1)), function032, z2, tourState2, startRestartGroup, i26 & 33554430, (i2922222222 & 3670016) | ((i21 << 27) & 1879048192), i3022222222 & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function15 = function14;
        function041 = function036;
        function042 = function038;
        function043 = function040;
        function044 = function039;
        function045 = function05422222222;
        modifier4 = modifier522222222;
        function046 = function05522222222;
        stateFlow7 = stateFlow1022222222;
        stateFlow8 = stateFlow1122222222;
        stateFlow9 = stateFlow6;
        function047 = function034;
        function048 = function033;
        function049 = function030;
        function050 = function031;
        function051 = function032;
        z4 = z2;
        tourState3 = tourState2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean BettingSheetScreen$lambda$24(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long BettingSheetScreen$lambda$25(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final List<BetModel> BettingSheetScreen$lambda$26(State<? extends List<? extends BetModel>> state) {
        return (List) state.getValue();
    }

    private static final OddType BettingSheetScreen$lambda$28(State<? extends OddType> state) {
        return state.getValue();
    }

    private static final long BettingSheetScreen$lambda$29(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final boolean BettingSheetScreen$lambda$30(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long BettingSheetScreen$lambda$31(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final BattleOpponent BettingSheetScreen$lambda$33(State<BattleOpponent> state) {
        return state.getValue();
    }

    private static final PlaceBetResult BettingSheetScreen$lambda$34(State<? extends PlaceBetResult> state) {
        return state.getValue();
    }

    private static final BattleCreateResult BettingSheetScreen$lambda$35(State<? extends BattleCreateResult> state) {
        return state.getValue();
    }
}
