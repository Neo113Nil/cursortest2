package org.betup.ui.fragment.bets.sheet.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.model.local.entity.OddType;
import org.betup.ui.fragment.bets.BattleCreateResult;
import org.betup.ui.fragment.bets.BattleOpponent;
import org.betup.ui.fragment.bets.PlaceBetResult;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.tour.compose.TourState;

/* compiled from: BettingSheetComposeUI.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÍ\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010#\u001a\u00020\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0002\u0010&\u001a\r\u0010'\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(¨\u0006*"}, d2 = {"BettingSheetUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "onDismiss", "Lkotlin/Function0;", "onChallengeClick", "onSettingsClick", "onPlaceBetClick", "onAddCoinsClick", "onAmountChange", "Lkotlin/Function1;", "", "onMultiBetClicked", "isLoading", "", "amount", "bets", "", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "userAmount", "isFirsBetAvailable", "highScore", "minBet", "onInviteUserClick", "battleOpponent", "Lorg/betup/ui/fragment/bets/BattleOpponent;", "placeBetResult", "Lorg/betup/ui/fragment/bets/PlaceBetResult;", "onPlaceBetResultConsumed", "battleCreateResult", "Lorg/betup/ui/fragment/bets/BattleCreateResult;", "onBattleCreateResultConsumed", "isInTour", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZJLjava/util/List;Lorg/betup/model/local/entity/OddType;JZJJLkotlin/jvm/functions/Function0;Lorg/betup/ui/fragment/bets/BattleOpponent;Lorg/betup/ui/fragment/bets/PlaceBetResult;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/fragment/bets/BattleCreateResult;Lkotlin/jvm/functions/Function0;ZLorg/betup/ui/tour/compose/TourState;Landroidx/compose/runtime/Composer;IIII)V", "PreviewBettingSheetUi", "(Landroidx/compose/runtime/Composer;I)V", "PreviewBettingSheetUiScreens", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BettingSheetComposeUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BettingSheetUi$lambda$20(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function0 function06, boolean z, long j, List list, OddType oddType, long j2, boolean z2, long j3, long j4, Function0 function07, BattleOpponent battleOpponent, PlaceBetResult placeBetResult, Function0 function08, BattleCreateResult battleCreateResult, Function0 function09, boolean z3, TourState tourState, int i, int i2, int i3, int i4, Composer composer, int i5) {
        BettingSheetUi(modifier, function0, function02, function03, function04, function05, function1, function06, z, j, list, oddType, j2, z2, j3, j4, function07, battleOpponent, placeBetResult, function08, battleCreateResult, function09, z3, tourState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBettingSheetUi$lambda$35(int i, Composer composer, int i2) {
        PreviewBettingSheetUi(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBettingSheetUiScreens$lambda$36(int i, Composer composer, int i2) {
        PreviewBettingSheetUiScreens(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BettingSheetUi$lambda$11$lambda$10(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0345  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BettingSheetUi(Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function1<? super Long, Unit> function1, Function0<Unit> function06, boolean z, long j, List<? extends BetModel> list, OddType oddType, long j2, boolean z2, long j3, long j4, Function0<Unit> function07, BattleOpponent battleOpponent, PlaceBetResult placeBetResult, Function0<Unit> function08, BattleCreateResult battleCreateResult, Function0<Unit> function09, boolean z3, TourState tourState, Composer composer, final int i, final int i2, final int i3, final int i4) {
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
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Function0<Unit> function012;
        Function0<Unit> function013;
        Modifier modifier2;
        Function0<Unit> function014;
        Function1<? super Long, Unit> function12;
        Function0<Unit> function015;
        Function0<Unit> function016;
        Function1<? super Long, Unit> function13;
        Function0<Unit> function017;
        Function0<Unit> function018;
        Function0<Unit> function019;
        Function0<Unit> function020;
        Function0<Unit> function021;
        Function0<Unit> function022;
        Composer composer2;
        Function0<Unit> function023;
        Composer composer3;
        final PlaceBetResult placeBetResult2;
        final Function0<Unit> function024;
        final Function1<? super Long, Unit> function14;
        final Function0<Unit> function025;
        final Function0<Unit> function026;
        final BattleOpponent battleOpponent2;
        final Function0<Unit> function027;
        final BattleCreateResult battleCreateResult2;
        final Function0<Unit> function028;
        final boolean z4;
        final List<? extends BetModel> list2;
        Function0<Unit> function029;
        Modifier modifier3;
        final OddType oddType2;
        final Function0<Unit> function030;
        final long j5;
        final boolean z5;
        final long j6;
        final Function0<Unit> function031;
        final boolean z6;
        final TourState tourState2;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1546993678);
        int i33 = i4 & 2;
        if (i33 != 0) {
            i5 = i | 48;
        } else if ((i & 48) == 0) {
            i5 = (startRestartGroup.changedInstance(function0) ? 32 : 16) | i;
        } else {
            i5 = i;
        }
        int i34 = i4 & 4;
        if (i34 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i & 24576) == 0) {
                    i5 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changedInstance(function05) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i5 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    i12 = i4 & 512;
                    if (i12 == 0) {
                        i5 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i5 |= startRestartGroup.changed(j) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i14 = i2 | (startRestartGroup.changedInstance(list) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i14 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 32 : 16;
                    }
                    int i35 = i14;
                    i16 = i4 & 4096;
                    if (i16 == 0) {
                        i35 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i17 = i15;
                        i18 = i16;
                        i35 |= startRestartGroup.changed(j2) ? 256 : 128;
                        i19 = i4 & 8192;
                        if (i19 != 0) {
                            i35 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i35 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                            i20 = i4 & 16384;
                            if (i20 == 0) {
                                i35 |= 24576;
                                i22 = i19;
                                i21 = i20;
                            } else {
                                i21 = i20;
                                i22 = i19;
                                if ((i2 & 24576) == 0) {
                                    i35 |= startRestartGroup.changed(j3) ? 16384 : 8192;
                                    i23 = i4 & 32768;
                                    if (i23 != 0) {
                                        i35 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i35 |= startRestartGroup.changed(j4) ? 131072 : 65536;
                                    }
                                    i24 = i4 & 65536;
                                    if (i24 != 0) {
                                        i35 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i35 |= startRestartGroup.changedInstance(function07) ? 1048576 : 524288;
                                    }
                                    i25 = 131072 & i4;
                                    if (i25 != 0) {
                                        i35 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i35 |= startRestartGroup.changed(battleOpponent) ? 8388608 : 4194304;
                                    }
                                    i26 = i4 & 262144;
                                    if (i26 != 0) {
                                        i35 |= 100663296;
                                    } else if ((i2 & 100663296) == 0) {
                                        i35 |= startRestartGroup.changed(placeBetResult) ? 67108864 : 33554432;
                                    }
                                    i27 = i4 & 524288;
                                    if (i27 != 0) {
                                        i35 |= 805306368;
                                    } else if ((i2 & 805306368) == 0) {
                                        i35 |= startRestartGroup.changedInstance(function08) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    }
                                    i28 = i4 & 1048576;
                                    if (i28 != 0) {
                                        i29 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        i29 = i3 | (startRestartGroup.changed(battleCreateResult) ? 4 : 2);
                                    } else {
                                        i29 = i3;
                                    }
                                    i30 = i4 & 2097152;
                                    if (i30 != 0) {
                                        i29 |= 48;
                                    } else if ((i3 & 48) == 0) {
                                        i29 |= startRestartGroup.changedInstance(function09) ? 32 : 16;
                                    }
                                    int i36 = i29;
                                    i31 = i4 & 4194304;
                                    if (i31 != 0) {
                                        i36 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                    } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i36 |= startRestartGroup.changed(z3) ? 256 : 128;
                                        i32 = i4 & 8388608;
                                        if (i32 == 0) {
                                            i36 |= 3072;
                                        } else if ((i3 & 3072) == 0) {
                                            i36 |= startRestartGroup.changed(tourState) ? 2048 : 1024;
                                            if ((i5 & 306783377) == 306783376 || (306783379 & i35) != 306783378 || (i36 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                                Modifier.Companion companion = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
                                                if (i33 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda11
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    function010 = (Function0) rememberedValue;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function010 = function0;
                                                }
                                                if (i34 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda13
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    }
                                                    function011 = (Function0) rememberedValue2;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function011 = function02;
                                                }
                                                if (i6 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda14
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    function012 = (Function0) rememberedValue3;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function012 = function03;
                                                }
                                                if (i7 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda15
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    function013 = (Function0) rememberedValue4;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function013 = function04;
                                                }
                                                if (i8 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                                    modifier2 = companion;
                                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda16
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                                    }
                                                    function014 = (Function0) rememberedValue5;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    modifier2 = companion;
                                                    function014 = function05;
                                                }
                                                if (i9 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda17
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                Unit BettingSheetUi$lambda$11$lambda$10;
                                                                BettingSheetUi$lambda$11$lambda$10 = BettingSheetComposeUIKt.BettingSheetUi$lambda$11$lambda$10(((Long) obj).longValue());
                                                                return BettingSheetUi$lambda$11$lambda$10;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                                    }
                                                    function12 = (Function1) rememberedValue6;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function12 = function1;
                                                }
                                                if (i10 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda18
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                                    }
                                                    function015 = (Function0) rememberedValue7;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function015 = function06;
                                                }
                                                boolean z7 = i11 != 0 ? false : z;
                                                long j9 = i12 != 0 ? 50L : j;
                                                List<? extends BetModel> emptyList = i13 != 0 ? CollectionsKt.emptyList() : list;
                                                OddType oddType3 = i17 != 0 ? OddType.DECIMAL : oddType;
                                                long j10 = i18 != 0 ? ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS : j2;
                                                boolean z8 = i22 != 0 ? false : z2;
                                                long j11 = i21 != 0 ? 0L : j3;
                                                long j12 = i23 != 0 ? 0L : j4;
                                                if (i24 != 0) {
                                                    function016 = function015;
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                                    function13 = function12;
                                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda19
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                                    }
                                                    function017 = (Function0) rememberedValue8;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function016 = function015;
                                                    function13 = function12;
                                                    function017 = function07;
                                                }
                                                BattleOpponent battleOpponent3 = i25 != 0 ? null : battleOpponent;
                                                PlaceBetResult placeBetResult3 = i26 != 0 ? null : placeBetResult;
                                                if (i27 != 0) {
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                                                    function018 = function014;
                                                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda1
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                                    }
                                                    function019 = (Function0) rememberedValue9;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function018 = function014;
                                                    function019 = function08;
                                                }
                                                BattleCreateResult battleCreateResult3 = i28 != 0 ? null : battleCreateResult;
                                                if (i30 != 0) {
                                                    function021 = function013;
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                                                    function020 = function011;
                                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue10 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit unit;
                                                                unit = Unit.INSTANCE;
                                                                return unit;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                                    }
                                                    function022 = (Function0) rememberedValue10;
                                                    startRestartGroup.endReplaceGroup();
                                                } else {
                                                    function020 = function011;
                                                    function021 = function013;
                                                    function022 = function09;
                                                }
                                                boolean z9 = i31 != 0 ? false : z3;
                                                TourState tourState3 = i32 != 0 ? null : tourState;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    composer2 = startRestartGroup;
                                                    function023 = function022;
                                                    ComposerKt.traceEventStart(1546993678, i5, i35, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi (BettingSheetComposeUI.kt:41)");
                                                } else {
                                                    composer2 = startRestartGroup;
                                                    function023 = function022;
                                                }
                                                final Function0<Unit> function032 = function010;
                                                final Function0<Unit> function033 = function012;
                                                final boolean z10 = z9;
                                                final boolean z11 = z7;
                                                final long j13 = j9;
                                                final List<? extends BetModel> list3 = emptyList;
                                                final OddType oddType4 = oddType3;
                                                final long j14 = j10;
                                                final boolean z12 = z8;
                                                final long j15 = j11;
                                                final long j16 = j12;
                                                final Function0<Unit> function034 = function017;
                                                final BattleOpponent battleOpponent4 = battleOpponent3;
                                                final PlaceBetResult placeBetResult4 = placeBetResult3;
                                                final Function0<Unit> function035 = function019;
                                                final BattleCreateResult battleCreateResult4 = battleCreateResult3;
                                                final Function0<Unit> function036 = function023;
                                                final Function0<Unit> function037 = function020;
                                                final Function0<Unit> function038 = function021;
                                                final Function0<Unit> function039 = function018;
                                                final Function1<? super Long, Unit> function15 = function13;
                                                final Function0<Unit> function040 = function016;
                                                final TourState tourState4 = tourState3;
                                                Function0<Unit> function041 = function010;
                                                composer3 = composer2;
                                                QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i37) {
                                                        if ((i37 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                                                        }
                                                        final Function0<Unit> function042 = function032;
                                                        final Function0<Unit> function043 = function033;
                                                        final boolean z13 = z10;
                                                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer5, int i38) {
                                                                if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                                                }
                                                                BettingSheetContentKt.QuickBetTopBar(function042, function043, z13, null, composer5, 0, 8);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, composer4, 54);
                                                        final boolean z14 = z11;
                                                        final long j17 = j13;
                                                        final List<BetModel> list4 = list3;
                                                        final OddType oddType5 = oddType4;
                                                        final long j18 = j14;
                                                        final boolean z15 = z12;
                                                        final long j19 = j15;
                                                        final long j20 = j16;
                                                        final Function0<Unit> function044 = function034;
                                                        final BattleOpponent battleOpponent5 = battleOpponent4;
                                                        final PlaceBetResult placeBetResult5 = placeBetResult4;
                                                        final Function0<Unit> function045 = function035;
                                                        final BattleCreateResult battleCreateResult5 = battleCreateResult4;
                                                        final Function0<Unit> function046 = function036;
                                                        final Function0<Unit> function047 = function032;
                                                        final Function0<Unit> function048 = function037;
                                                        final Function0<Unit> function049 = function033;
                                                        final Function0<Unit> function050 = function038;
                                                        final Function0<Unit> function051 = function039;
                                                        final Function1<Long, Unit> function16 = function15;
                                                        final Function0<Unit> function052 = function040;
                                                        final boolean z16 = z10;
                                                        final TourState tourState5 = tourState4;
                                                        BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer5, int i38) {
                                                                if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                                                }
                                                                BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, composer4, 54), composer4, 54);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54), composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                placeBetResult2 = placeBetResult3;
                                                function024 = function021;
                                                function14 = function13;
                                                function025 = function018;
                                                function026 = function019;
                                                battleOpponent2 = battleOpponent3;
                                                function027 = function017;
                                                battleCreateResult2 = battleCreateResult3;
                                                function028 = function016;
                                                z4 = z7;
                                                list2 = emptyList;
                                                function029 = function041;
                                                modifier3 = modifier2;
                                                boolean z13 = z9;
                                                oddType2 = oddType3;
                                                function030 = function012;
                                                j5 = j9;
                                                z5 = z8;
                                                j6 = j10;
                                                function031 = function023;
                                                z6 = z13;
                                                tourState2 = tourState3;
                                                j7 = j12;
                                                j8 = j11;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                modifier3 = modifier;
                                                function029 = function0;
                                                function020 = function02;
                                                function030 = function03;
                                                function024 = function04;
                                                function025 = function05;
                                                function14 = function1;
                                                function028 = function06;
                                                z4 = z;
                                                j5 = j;
                                                list2 = list;
                                                oddType2 = oddType;
                                                j6 = j2;
                                                z5 = z2;
                                                j8 = j3;
                                                j7 = j4;
                                                function027 = function07;
                                                battleOpponent2 = battleOpponent;
                                                placeBetResult2 = placeBetResult;
                                                function026 = function08;
                                                battleCreateResult2 = battleCreateResult;
                                                function031 = function09;
                                                z6 = z3;
                                                tourState2 = tourState;
                                                composer3 = startRestartGroup;
                                            }
                                            endRestartGroup = composer3.endRestartGroup();
                                            if (endRestartGroup != null) {
                                                final Modifier modifier4 = modifier3;
                                                final Function0<Unit> function042 = function029;
                                                final Function0<Unit> function043 = function020;
                                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda12
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        Unit BettingSheetUi$lambda$20;
                                                        BettingSheetUi$lambda$20 = BettingSheetComposeUIKt.BettingSheetUi$lambda$20(Modifier.this, function042, function043, function030, function024, function025, function14, function028, z4, j5, list2, oddType2, j6, z5, j8, j7, function027, battleOpponent2, placeBetResult2, function026, battleCreateResult2, function031, z6, tourState2, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                        return BettingSheetUi$lambda$20;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        if ((i5 & 306783377) == 306783376) {
                                        }
                                        if ((i4 & 1) != 0) {
                                        }
                                        if (i33 != 0) {
                                        }
                                        if (i34 != 0) {
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
                                        if (i11 != 0) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        if (i13 != 0) {
                                        }
                                        if (i17 != 0) {
                                        }
                                        if (i18 != 0) {
                                        }
                                        if (i22 != 0) {
                                        }
                                        if (i21 != 0) {
                                        }
                                        if (i23 != 0) {
                                        }
                                        if (i24 != 0) {
                                        }
                                        if (i25 != 0) {
                                        }
                                        if (i26 != 0) {
                                        }
                                        if (i27 != 0) {
                                        }
                                        if (i28 != 0) {
                                        }
                                        if (i30 != 0) {
                                        }
                                        if (i31 != 0) {
                                        }
                                        if (i32 != 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        final Function0<Unit> function0322 = function010;
                                        final Function0<Unit> function0332 = function012;
                                        final boolean z102 = z9;
                                        final boolean z112 = z7;
                                        final long j132 = j9;
                                        final List<? extends BetModel> list32 = emptyList;
                                        final OddType oddType42 = oddType3;
                                        final long j142 = j10;
                                        final boolean z122 = z8;
                                        final long j152 = j11;
                                        final long j162 = j12;
                                        final Function0<Unit> function0342 = function017;
                                        final BattleOpponent battleOpponent42 = battleOpponent3;
                                        final PlaceBetResult placeBetResult42 = placeBetResult3;
                                        final Function0<Unit> function0352 = function019;
                                        final BattleCreateResult battleCreateResult42 = battleCreateResult3;
                                        final Function0<Unit> function0362 = function023;
                                        final Function0<Unit> function0372 = function020;
                                        final Function0<Unit> function0382 = function021;
                                        final Function0<Unit> function0392 = function018;
                                        final Function1<? super Long, Unit> function152 = function13;
                                        final Function0<Unit> function0402 = function016;
                                        final TourState tourState42 = tourState3;
                                        Function0<Unit> function0412 = function010;
                                        composer3 = composer2;
                                        QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i37) {
                                                if ((i37 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                                                }
                                                final Function0<Unit> function0422 = function0322;
                                                final Function0<Unit> function0432 = function0332;
                                                final boolean z132 = z102;
                                                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i38) {
                                                        if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                                        }
                                                        BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z132, null, composer5, 0, 8);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54);
                                                final boolean z14 = z112;
                                                final long j17 = j132;
                                                final List<? extends BetModel> list4 = list32;
                                                final OddType oddType5 = oddType42;
                                                final long j18 = j142;
                                                final boolean z15 = z122;
                                                final long j19 = j152;
                                                final long j20 = j162;
                                                final Function0<Unit> function044 = function0342;
                                                final BattleOpponent battleOpponent5 = battleOpponent42;
                                                final PlaceBetResult placeBetResult5 = placeBetResult42;
                                                final Function0<Unit> function045 = function0352;
                                                final BattleCreateResult battleCreateResult5 = battleCreateResult42;
                                                final Function0<Unit> function046 = function0362;
                                                final Function0<Unit> function047 = function0322;
                                                final Function0<Unit> function048 = function0372;
                                                final Function0<Unit> function049 = function0332;
                                                final Function0<Unit> function050 = function0382;
                                                final Function0<Unit> function051 = function0392;
                                                final Function1<? super Long, Unit> function16 = function152;
                                                final Function0<Unit> function052 = function0402;
                                                final boolean z16 = z102;
                                                final TourState tourState5 = tourState42;
                                                BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i38) {
                                                        if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                                        }
                                                        BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, 54);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        placeBetResult2 = placeBetResult3;
                                        function024 = function021;
                                        function14 = function13;
                                        function025 = function018;
                                        function026 = function019;
                                        battleOpponent2 = battleOpponent3;
                                        function027 = function017;
                                        battleCreateResult2 = battleCreateResult3;
                                        function028 = function016;
                                        z4 = z7;
                                        list2 = emptyList;
                                        function029 = function0412;
                                        modifier3 = modifier2;
                                        boolean z132 = z9;
                                        oddType2 = oddType3;
                                        function030 = function012;
                                        j5 = j9;
                                        z5 = z8;
                                        j6 = j10;
                                        function031 = function023;
                                        z6 = z132;
                                        tourState2 = tourState3;
                                        j7 = j12;
                                        j8 = j11;
                                        endRestartGroup = composer3.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                    i32 = i4 & 8388608;
                                    if (i32 == 0) {
                                    }
                                    if ((i5 & 306783377) == 306783376) {
                                    }
                                    if ((i4 & 1) != 0) {
                                    }
                                    if (i33 != 0) {
                                    }
                                    if (i34 != 0) {
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
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i17 != 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i22 != 0) {
                                    }
                                    if (i21 != 0) {
                                    }
                                    if (i23 != 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if (i25 != 0) {
                                    }
                                    if (i26 != 0) {
                                    }
                                    if (i27 != 0) {
                                    }
                                    if (i28 != 0) {
                                    }
                                    if (i30 != 0) {
                                    }
                                    if (i31 != 0) {
                                    }
                                    if (i32 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final Function0<Unit> function03222 = function010;
                                    final Function0<Unit> function03322 = function012;
                                    final boolean z1022 = z9;
                                    final boolean z1122 = z7;
                                    final long j1322 = j9;
                                    final List<? extends BetModel> list322 = emptyList;
                                    final OddType oddType422 = oddType3;
                                    final long j1422 = j10;
                                    final boolean z1222 = z8;
                                    final long j1522 = j11;
                                    final long j1622 = j12;
                                    final Function0<Unit> function03422 = function017;
                                    final BattleOpponent battleOpponent422 = battleOpponent3;
                                    final PlaceBetResult placeBetResult422 = placeBetResult3;
                                    final Function0<Unit> function03522 = function019;
                                    final BattleCreateResult battleCreateResult422 = battleCreateResult3;
                                    final Function0<Unit> function03622 = function023;
                                    final Function0<Unit> function03722 = function020;
                                    final Function0<Unit> function03822 = function021;
                                    final Function0<Unit> function03922 = function018;
                                    final Function1<? super Long, Unit> function1522 = function13;
                                    final Function0<Unit> function04022 = function016;
                                    final TourState tourState422 = tourState3;
                                    Function0<Unit> function04122 = function010;
                                    composer3 = composer2;
                                    QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i37) {
                                            if ((i37 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                                            }
                                            final Function0<Unit> function0422 = function03222;
                                            final Function0<Unit> function0432 = function03322;
                                            final boolean z1322 = z1022;
                                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i38) {
                                                    if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                                    }
                                                    BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z1322, null, composer5, 0, 8);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54);
                                            final boolean z14 = z1122;
                                            final long j17 = j1322;
                                            final List<? extends BetModel> list4 = list322;
                                            final OddType oddType5 = oddType422;
                                            final long j18 = j1422;
                                            final boolean z15 = z1222;
                                            final long j19 = j1522;
                                            final long j20 = j1622;
                                            final Function0<Unit> function044 = function03422;
                                            final BattleOpponent battleOpponent5 = battleOpponent422;
                                            final PlaceBetResult placeBetResult5 = placeBetResult422;
                                            final Function0<Unit> function045 = function03522;
                                            final BattleCreateResult battleCreateResult5 = battleCreateResult422;
                                            final Function0<Unit> function046 = function03622;
                                            final Function0<Unit> function047 = function03222;
                                            final Function0<Unit> function048 = function03722;
                                            final Function0<Unit> function049 = function03322;
                                            final Function0<Unit> function050 = function03822;
                                            final Function0<Unit> function051 = function03922;
                                            final Function1<? super Long, Unit> function16 = function1522;
                                            final Function0<Unit> function052 = function04022;
                                            final boolean z16 = z1022;
                                            final TourState tourState5 = tourState422;
                                            BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i38) {
                                                    if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                                    }
                                                    BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54), composer4, 54);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    placeBetResult2 = placeBetResult3;
                                    function024 = function021;
                                    function14 = function13;
                                    function025 = function018;
                                    function026 = function019;
                                    battleOpponent2 = battleOpponent3;
                                    function027 = function017;
                                    battleCreateResult2 = battleCreateResult3;
                                    function028 = function016;
                                    z4 = z7;
                                    list2 = emptyList;
                                    function029 = function04122;
                                    modifier3 = modifier2;
                                    boolean z1322 = z9;
                                    oddType2 = oddType3;
                                    function030 = function012;
                                    j5 = j9;
                                    z5 = z8;
                                    j6 = j10;
                                    function031 = function023;
                                    z6 = z1322;
                                    tourState2 = tourState3;
                                    j7 = j12;
                                    j8 = j11;
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                            }
                            i23 = i4 & 32768;
                            if (i23 != 0) {
                            }
                            i24 = i4 & 65536;
                            if (i24 != 0) {
                            }
                            i25 = 131072 & i4;
                            if (i25 != 0) {
                            }
                            i26 = i4 & 262144;
                            if (i26 != 0) {
                            }
                            i27 = i4 & 524288;
                            if (i27 != 0) {
                            }
                            i28 = i4 & 1048576;
                            if (i28 != 0) {
                            }
                            i30 = i4 & 2097152;
                            if (i30 != 0) {
                            }
                            int i362 = i29;
                            i31 = i4 & 4194304;
                            if (i31 != 0) {
                            }
                            i32 = i4 & 8388608;
                            if (i32 == 0) {
                            }
                            if ((i5 & 306783377) == 306783376) {
                            }
                            if ((i4 & 1) != 0) {
                            }
                            if (i33 != 0) {
                            }
                            if (i34 != 0) {
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
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i26 != 0) {
                            }
                            if (i27 != 0) {
                            }
                            if (i28 != 0) {
                            }
                            if (i30 != 0) {
                            }
                            if (i31 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Function0<Unit> function032222 = function010;
                            final Function0<Unit> function033222 = function012;
                            final boolean z10222 = z9;
                            final boolean z11222 = z7;
                            final long j13222 = j9;
                            final List<? extends BetModel> list3222 = emptyList;
                            final OddType oddType4222 = oddType3;
                            final long j14222 = j10;
                            final boolean z12222 = z8;
                            final long j15222 = j11;
                            final long j16222 = j12;
                            final Function0<Unit> function034222 = function017;
                            final BattleOpponent battleOpponent4222 = battleOpponent3;
                            final PlaceBetResult placeBetResult4222 = placeBetResult3;
                            final Function0<Unit> function035222 = function019;
                            final BattleCreateResult battleCreateResult4222 = battleCreateResult3;
                            final Function0<Unit> function036222 = function023;
                            final Function0<Unit> function037222 = function020;
                            final Function0<Unit> function038222 = function021;
                            final Function0<Unit> function039222 = function018;
                            final Function1<? super Long, Unit> function15222 = function13;
                            final Function0<Unit> function040222 = function016;
                            final TourState tourState4222 = tourState3;
                            Function0<Unit> function041222 = function010;
                            composer3 = composer2;
                            QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i37) {
                                    if ((i37 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                                    }
                                    final Function0<Unit> function0422 = function032222;
                                    final Function0<Unit> function0432 = function033222;
                                    final boolean z13222 = z10222;
                                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i38) {
                                            if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                            }
                                            BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z13222, null, composer5, 0, 8);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54);
                                    final boolean z14 = z11222;
                                    final long j17 = j13222;
                                    final List<? extends BetModel> list4 = list3222;
                                    final OddType oddType5 = oddType4222;
                                    final long j18 = j14222;
                                    final boolean z15 = z12222;
                                    final long j19 = j15222;
                                    final long j20 = j16222;
                                    final Function0<Unit> function044 = function034222;
                                    final BattleOpponent battleOpponent5 = battleOpponent4222;
                                    final PlaceBetResult placeBetResult5 = placeBetResult4222;
                                    final Function0<Unit> function045 = function035222;
                                    final BattleCreateResult battleCreateResult5 = battleCreateResult4222;
                                    final Function0<Unit> function046 = function036222;
                                    final Function0<Unit> function047 = function032222;
                                    final Function0<Unit> function048 = function037222;
                                    final Function0<Unit> function049 = function033222;
                                    final Function0<Unit> function050 = function038222;
                                    final Function0<Unit> function051 = function039222;
                                    final Function1<? super Long, Unit> function16 = function15222;
                                    final Function0<Unit> function052 = function040222;
                                    final boolean z16 = z10222;
                                    final TourState tourState5 = tourState4222;
                                    BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i38) {
                                            if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                            }
                                            BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            placeBetResult2 = placeBetResult3;
                            function024 = function021;
                            function14 = function13;
                            function025 = function018;
                            function026 = function019;
                            battleOpponent2 = battleOpponent3;
                            function027 = function017;
                            battleCreateResult2 = battleCreateResult3;
                            function028 = function016;
                            z4 = z7;
                            list2 = emptyList;
                            function029 = function041222;
                            modifier3 = modifier2;
                            boolean z13222 = z9;
                            oddType2 = oddType3;
                            function030 = function012;
                            j5 = j9;
                            z5 = z8;
                            j6 = j10;
                            function031 = function023;
                            z6 = z13222;
                            tourState2 = tourState3;
                            j7 = j12;
                            j8 = j11;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i20 = i4 & 16384;
                        if (i20 == 0) {
                        }
                        i23 = i4 & 32768;
                        if (i23 != 0) {
                        }
                        i24 = i4 & 65536;
                        if (i24 != 0) {
                        }
                        i25 = 131072 & i4;
                        if (i25 != 0) {
                        }
                        i26 = i4 & 262144;
                        if (i26 != 0) {
                        }
                        i27 = i4 & 524288;
                        if (i27 != 0) {
                        }
                        i28 = i4 & 1048576;
                        if (i28 != 0) {
                        }
                        i30 = i4 & 2097152;
                        if (i30 != 0) {
                        }
                        int i3622 = i29;
                        i31 = i4 & 4194304;
                        if (i31 != 0) {
                        }
                        i32 = i4 & 8388608;
                        if (i32 == 0) {
                        }
                        if ((i5 & 306783377) == 306783376) {
                        }
                        if ((i4 & 1) != 0) {
                        }
                        if (i33 != 0) {
                        }
                        if (i34 != 0) {
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
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (i26 != 0) {
                        }
                        if (i27 != 0) {
                        }
                        if (i28 != 0) {
                        }
                        if (i30 != 0) {
                        }
                        if (i31 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Function0<Unit> function0322222 = function010;
                        final Function0<Unit> function0332222 = function012;
                        final boolean z102222 = z9;
                        final boolean z112222 = z7;
                        final long j132222 = j9;
                        final List<? extends BetModel> list32222 = emptyList;
                        final OddType oddType42222 = oddType3;
                        final long j142222 = j10;
                        final boolean z122222 = z8;
                        final long j152222 = j11;
                        final long j162222 = j12;
                        final Function0<Unit> function0342222 = function017;
                        final BattleOpponent battleOpponent42222 = battleOpponent3;
                        final PlaceBetResult placeBetResult42222 = placeBetResult3;
                        final Function0<Unit> function0352222 = function019;
                        final BattleCreateResult battleCreateResult42222 = battleCreateResult3;
                        final Function0<Unit> function0362222 = function023;
                        final Function0<Unit> function0372222 = function020;
                        final Function0<Unit> function0382222 = function021;
                        final Function0<Unit> function0392222 = function018;
                        final Function1<? super Long, Unit> function152222 = function13;
                        final Function0<Unit> function0402222 = function016;
                        final TourState tourState42222 = tourState3;
                        Function0<Unit> function0412222 = function010;
                        composer3 = composer2;
                        QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i37) {
                                if ((i37 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                                }
                                final Function0<Unit> function0422 = function0322222;
                                final Function0<Unit> function0432 = function0332222;
                                final boolean z132222 = z102222;
                                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i38) {
                                        if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                        }
                                        BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z132222, null, composer5, 0, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                final boolean z14 = z112222;
                                final long j17 = j132222;
                                final List<? extends BetModel> list4 = list32222;
                                final OddType oddType5 = oddType42222;
                                final long j18 = j142222;
                                final boolean z15 = z122222;
                                final long j19 = j152222;
                                final long j20 = j162222;
                                final Function0<Unit> function044 = function0342222;
                                final BattleOpponent battleOpponent5 = battleOpponent42222;
                                final PlaceBetResult placeBetResult5 = placeBetResult42222;
                                final Function0<Unit> function045 = function0352222;
                                final BattleCreateResult battleCreateResult5 = battleCreateResult42222;
                                final Function0<Unit> function046 = function0362222;
                                final Function0<Unit> function047 = function0322222;
                                final Function0<Unit> function048 = function0372222;
                                final Function0<Unit> function049 = function0332222;
                                final Function0<Unit> function050 = function0382222;
                                final Function0<Unit> function051 = function0392222;
                                final Function1<? super Long, Unit> function16 = function152222;
                                final Function0<Unit> function052 = function0402222;
                                final boolean z16 = z102222;
                                final TourState tourState5 = tourState42222;
                                BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i38) {
                                        if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                        }
                                        BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        placeBetResult2 = placeBetResult3;
                        function024 = function021;
                        function14 = function13;
                        function025 = function018;
                        function026 = function019;
                        battleOpponent2 = battleOpponent3;
                        function027 = function017;
                        battleCreateResult2 = battleCreateResult3;
                        function028 = function016;
                        z4 = z7;
                        list2 = emptyList;
                        function029 = function0412222;
                        modifier3 = modifier2;
                        boolean z132222 = z9;
                        oddType2 = oddType3;
                        function030 = function012;
                        j5 = j9;
                        z5 = z8;
                        j6 = j10;
                        function031 = function023;
                        z6 = z132222;
                        tourState2 = tourState3;
                        j7 = j12;
                        j8 = j11;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i15;
                    i18 = i16;
                    i19 = i4 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i4 & 16384;
                    if (i20 == 0) {
                    }
                    i23 = i4 & 32768;
                    if (i23 != 0) {
                    }
                    i24 = i4 & 65536;
                    if (i24 != 0) {
                    }
                    i25 = 131072 & i4;
                    if (i25 != 0) {
                    }
                    i26 = i4 & 262144;
                    if (i26 != 0) {
                    }
                    i27 = i4 & 524288;
                    if (i27 != 0) {
                    }
                    i28 = i4 & 1048576;
                    if (i28 != 0) {
                    }
                    i30 = i4 & 2097152;
                    if (i30 != 0) {
                    }
                    int i36222 = i29;
                    i31 = i4 & 4194304;
                    if (i31 != 0) {
                    }
                    i32 = i4 & 8388608;
                    if (i32 == 0) {
                    }
                    if ((i5 & 306783377) == 306783376) {
                    }
                    if ((i4 & 1) != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if (i34 != 0) {
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
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function0<Unit> function03222222 = function010;
                    final Function0<Unit> function03322222 = function012;
                    final boolean z1022222 = z9;
                    final boolean z1122222 = z7;
                    final long j1322222 = j9;
                    final List<? extends BetModel> list322222 = emptyList;
                    final OddType oddType422222 = oddType3;
                    final long j1422222 = j10;
                    final boolean z1222222 = z8;
                    final long j1522222 = j11;
                    final long j1622222 = j12;
                    final Function0<Unit> function03422222 = function017;
                    final BattleOpponent battleOpponent422222 = battleOpponent3;
                    final PlaceBetResult placeBetResult422222 = placeBetResult3;
                    final Function0<Unit> function03522222 = function019;
                    final BattleCreateResult battleCreateResult422222 = battleCreateResult3;
                    final Function0<Unit> function03622222 = function023;
                    final Function0<Unit> function03722222 = function020;
                    final Function0<Unit> function03822222 = function021;
                    final Function0<Unit> function03922222 = function018;
                    final Function1<? super Long, Unit> function1522222 = function13;
                    final Function0<Unit> function04022222 = function016;
                    final TourState tourState422222 = tourState3;
                    Function0<Unit> function04122222 = function010;
                    composer3 = composer2;
                    QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i37) {
                            if ((i37 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                            }
                            final Function0<Unit> function0422 = function03222222;
                            final Function0<Unit> function0432 = function03322222;
                            final boolean z1322222 = z1022222;
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i38) {
                                    if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                    }
                                    BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z1322222, null, composer5, 0, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54);
                            final boolean z14 = z1122222;
                            final long j17 = j1322222;
                            final List<? extends BetModel> list4 = list322222;
                            final OddType oddType5 = oddType422222;
                            final long j18 = j1422222;
                            final boolean z15 = z1222222;
                            final long j19 = j1522222;
                            final long j20 = j1622222;
                            final Function0<Unit> function044 = function03422222;
                            final BattleOpponent battleOpponent5 = battleOpponent422222;
                            final PlaceBetResult placeBetResult5 = placeBetResult422222;
                            final Function0<Unit> function045 = function03522222;
                            final BattleCreateResult battleCreateResult5 = battleCreateResult422222;
                            final Function0<Unit> function046 = function03622222;
                            final Function0<Unit> function047 = function03222222;
                            final Function0<Unit> function048 = function03722222;
                            final Function0<Unit> function049 = function03322222;
                            final Function0<Unit> function050 = function03822222;
                            final Function0<Unit> function051 = function03922222;
                            final Function1<? super Long, Unit> function16 = function1522222;
                            final Function0<Unit> function052 = function04022222;
                            final boolean z16 = z1022222;
                            final TourState tourState5 = tourState422222;
                            BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i38) {
                                    if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                    }
                                    BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    placeBetResult2 = placeBetResult3;
                    function024 = function021;
                    function14 = function13;
                    function025 = function018;
                    function026 = function019;
                    battleOpponent2 = battleOpponent3;
                    function027 = function017;
                    battleCreateResult2 = battleCreateResult3;
                    function028 = function016;
                    z4 = z7;
                    list2 = emptyList;
                    function029 = function04122222;
                    modifier3 = modifier2;
                    boolean z1322222 = z9;
                    oddType2 = oddType3;
                    function030 = function012;
                    j5 = j9;
                    z5 = z8;
                    j6 = j10;
                    function031 = function023;
                    z6 = z1322222;
                    tourState2 = tourState3;
                    j7 = j12;
                    j8 = j11;
                    endRestartGroup = composer3.endRestartGroup();
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
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                int i352 = i14;
                i16 = i4 & 4096;
                if (i16 == 0) {
                }
                i17 = i15;
                i18 = i16;
                i19 = i4 & 8192;
                if (i19 != 0) {
                }
                i20 = i4 & 16384;
                if (i20 == 0) {
                }
                i23 = i4 & 32768;
                if (i23 != 0) {
                }
                i24 = i4 & 65536;
                if (i24 != 0) {
                }
                i25 = 131072 & i4;
                if (i25 != 0) {
                }
                i26 = i4 & 262144;
                if (i26 != 0) {
                }
                i27 = i4 & 524288;
                if (i27 != 0) {
                }
                i28 = i4 & 1048576;
                if (i28 != 0) {
                }
                i30 = i4 & 2097152;
                if (i30 != 0) {
                }
                int i362222 = i29;
                i31 = i4 & 4194304;
                if (i31 != 0) {
                }
                i32 = i4 & 8388608;
                if (i32 == 0) {
                }
                if ((i5 & 306783377) == 306783376) {
                }
                if ((i4 & 1) != 0) {
                }
                if (i33 != 0) {
                }
                if (i34 != 0) {
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
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i22 != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (i26 != 0) {
                }
                if (i27 != 0) {
                }
                if (i28 != 0) {
                }
                if (i30 != 0) {
                }
                if (i31 != 0) {
                }
                if (i32 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function0<Unit> function032222222 = function010;
                final Function0<Unit> function033222222 = function012;
                final boolean z10222222 = z9;
                final boolean z11222222 = z7;
                final long j13222222 = j9;
                final List<? extends BetModel> list3222222 = emptyList;
                final OddType oddType4222222 = oddType3;
                final long j14222222 = j10;
                final boolean z12222222 = z8;
                final long j15222222 = j11;
                final long j16222222 = j12;
                final Function0<Unit> function034222222 = function017;
                final BattleOpponent battleOpponent4222222 = battleOpponent3;
                final PlaceBetResult placeBetResult4222222 = placeBetResult3;
                final Function0<Unit> function035222222 = function019;
                final BattleCreateResult battleCreateResult4222222 = battleCreateResult3;
                final Function0<Unit> function036222222 = function023;
                final Function0<Unit> function037222222 = function020;
                final Function0<Unit> function038222222 = function021;
                final Function0<Unit> function039222222 = function018;
                final Function1<? super Long, Unit> function15222222 = function13;
                final Function0<Unit> function040222222 = function016;
                final TourState tourState4222222 = tourState3;
                Function0<Unit> function041222222 = function010;
                composer3 = composer2;
                QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i37) {
                        if ((i37 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                        }
                        final Function0<Unit> function0422 = function032222222;
                        final Function0<Unit> function0432 = function033222222;
                        final boolean z13222222 = z10222222;
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i38) {
                                if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                                }
                                BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z13222222, null, composer5, 0, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54);
                        final boolean z14 = z11222222;
                        final long j17 = j13222222;
                        final List<? extends BetModel> list4 = list3222222;
                        final OddType oddType5 = oddType4222222;
                        final long j18 = j14222222;
                        final boolean z15 = z12222222;
                        final long j19 = j15222222;
                        final long j20 = j16222222;
                        final Function0<Unit> function044 = function034222222;
                        final BattleOpponent battleOpponent5 = battleOpponent4222222;
                        final PlaceBetResult placeBetResult5 = placeBetResult4222222;
                        final Function0<Unit> function045 = function035222222;
                        final BattleCreateResult battleCreateResult5 = battleCreateResult4222222;
                        final Function0<Unit> function046 = function036222222;
                        final Function0<Unit> function047 = function032222222;
                        final Function0<Unit> function048 = function037222222;
                        final Function0<Unit> function049 = function033222222;
                        final Function0<Unit> function050 = function038222222;
                        final Function0<Unit> function051 = function039222222;
                        final Function1<? super Long, Unit> function16 = function15222222;
                        final Function0<Unit> function052 = function040222222;
                        final boolean z16 = z10222222;
                        final TourState tourState5 = tourState4222222;
                        BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i38) {
                                if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                                }
                                BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), composer4, 54);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                placeBetResult2 = placeBetResult3;
                function024 = function021;
                function14 = function13;
                function025 = function018;
                function026 = function019;
                battleOpponent2 = battleOpponent3;
                function027 = function017;
                battleCreateResult2 = battleCreateResult3;
                function028 = function016;
                z4 = z7;
                list2 = emptyList;
                function029 = function041222222;
                modifier3 = modifier2;
                boolean z13222222 = z9;
                oddType2 = oddType3;
                function030 = function012;
                j5 = j9;
                z5 = z8;
                j6 = j10;
                function031 = function023;
                z6 = z13222222;
                tourState2 = tourState3;
                j7 = j12;
                j8 = j11;
                endRestartGroup = composer3.endRestartGroup();
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
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            int i3522 = i14;
            i16 = i4 & 4096;
            if (i16 == 0) {
            }
            i17 = i15;
            i18 = i16;
            i19 = i4 & 8192;
            if (i19 != 0) {
            }
            i20 = i4 & 16384;
            if (i20 == 0) {
            }
            i23 = i4 & 32768;
            if (i23 != 0) {
            }
            i24 = i4 & 65536;
            if (i24 != 0) {
            }
            i25 = 131072 & i4;
            if (i25 != 0) {
            }
            i26 = i4 & 262144;
            if (i26 != 0) {
            }
            i27 = i4 & 524288;
            if (i27 != 0) {
            }
            i28 = i4 & 1048576;
            if (i28 != 0) {
            }
            i30 = i4 & 2097152;
            if (i30 != 0) {
            }
            int i3622222 = i29;
            i31 = i4 & 4194304;
            if (i31 != 0) {
            }
            i32 = i4 & 8388608;
            if (i32 == 0) {
            }
            if ((i5 & 306783377) == 306783376) {
            }
            if ((i4 & 1) != 0) {
            }
            if (i33 != 0) {
            }
            if (i34 != 0) {
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
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i22 != 0) {
            }
            if (i21 != 0) {
            }
            if (i23 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (i26 != 0) {
            }
            if (i27 != 0) {
            }
            if (i28 != 0) {
            }
            if (i30 != 0) {
            }
            if (i31 != 0) {
            }
            if (i32 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Function0<Unit> function0322222222 = function010;
            final Function0<Unit> function0332222222 = function012;
            final boolean z102222222 = z9;
            final boolean z112222222 = z7;
            final long j132222222 = j9;
            final List<? extends BetModel> list32222222 = emptyList;
            final OddType oddType42222222 = oddType3;
            final long j142222222 = j10;
            final boolean z122222222 = z8;
            final long j152222222 = j11;
            final long j162222222 = j12;
            final Function0<Unit> function0342222222 = function017;
            final BattleOpponent battleOpponent42222222 = battleOpponent3;
            final PlaceBetResult placeBetResult42222222 = placeBetResult3;
            final Function0<Unit> function0352222222 = function019;
            final BattleCreateResult battleCreateResult42222222 = battleCreateResult3;
            final Function0<Unit> function0362222222 = function023;
            final Function0<Unit> function0372222222 = function020;
            final Function0<Unit> function0382222222 = function021;
            final Function0<Unit> function0392222222 = function018;
            final Function1<? super Long, Unit> function152222222 = function13;
            final Function0<Unit> function0402222222 = function016;
            final TourState tourState42222222 = tourState3;
            Function0<Unit> function0412222222 = function010;
            composer3 = composer2;
            QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i37) {
                    if ((i37 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                    }
                    final Function0<Unit> function0422 = function0322222222;
                    final Function0<Unit> function0432 = function0332222222;
                    final boolean z132222222 = z102222222;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i38) {
                            if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                            }
                            BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z132222222, null, composer5, 0, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54);
                    final boolean z14 = z112222222;
                    final long j17 = j132222222;
                    final List<? extends BetModel> list4 = list32222222;
                    final OddType oddType5 = oddType42222222;
                    final long j18 = j142222222;
                    final boolean z15 = z122222222;
                    final long j19 = j152222222;
                    final long j20 = j162222222;
                    final Function0<Unit> function044 = function0342222222;
                    final BattleOpponent battleOpponent5 = battleOpponent42222222;
                    final PlaceBetResult placeBetResult5 = placeBetResult42222222;
                    final Function0<Unit> function045 = function0352222222;
                    final BattleCreateResult battleCreateResult5 = battleCreateResult42222222;
                    final Function0<Unit> function046 = function0362222222;
                    final Function0<Unit> function047 = function0322222222;
                    final Function0<Unit> function048 = function0372222222;
                    final Function0<Unit> function049 = function0332222222;
                    final Function0<Unit> function050 = function0382222222;
                    final Function0<Unit> function051 = function0392222222;
                    final Function1<? super Long, Unit> function16 = function152222222;
                    final Function0<Unit> function052 = function0402222222;
                    final boolean z16 = z102222222;
                    final TourState tourState5 = tourState42222222;
                    BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i38) {
                            if ((i38 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                            }
                            BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer4, 54), composer4, 54);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            placeBetResult2 = placeBetResult3;
            function024 = function021;
            function14 = function13;
            function025 = function018;
            function026 = function019;
            battleOpponent2 = battleOpponent3;
            function027 = function017;
            battleCreateResult2 = battleCreateResult3;
            function028 = function016;
            z4 = z7;
            list2 = emptyList;
            function029 = function0412222222;
            modifier3 = modifier2;
            boolean z132222222 = z9;
            oddType2 = oddType3;
            function030 = function012;
            j5 = j9;
            z5 = z8;
            j6 = j10;
            function031 = function023;
            z6 = z132222222;
            tourState2 = tourState3;
            j7 = j12;
            j8 = j11;
            endRestartGroup = composer3.endRestartGroup();
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
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        int i35222 = i14;
        i16 = i4 & 4096;
        if (i16 == 0) {
        }
        i17 = i15;
        i18 = i16;
        i19 = i4 & 8192;
        if (i19 != 0) {
        }
        i20 = i4 & 16384;
        if (i20 == 0) {
        }
        i23 = i4 & 32768;
        if (i23 != 0) {
        }
        i24 = i4 & 65536;
        if (i24 != 0) {
        }
        i25 = 131072 & i4;
        if (i25 != 0) {
        }
        i26 = i4 & 262144;
        if (i26 != 0) {
        }
        i27 = i4 & 524288;
        if (i27 != 0) {
        }
        i28 = i4 & 1048576;
        if (i28 != 0) {
        }
        i30 = i4 & 2097152;
        if (i30 != 0) {
        }
        int i36222222 = i29;
        i31 = i4 & 4194304;
        if (i31 != 0) {
        }
        i32 = i4 & 8388608;
        if (i32 == 0) {
        }
        if ((i5 & 306783377) == 306783376) {
        }
        if ((i4 & 1) != 0) {
        }
        if (i33 != 0) {
        }
        if (i34 != 0) {
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
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i22 != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i26 != 0) {
        }
        if (i27 != 0) {
        }
        if (i28 != 0) {
        }
        if (i30 != 0) {
        }
        if (i31 != 0) {
        }
        if (i32 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final Function0<Unit> function03222222222 = function010;
        final Function0<Unit> function03322222222 = function012;
        final boolean z1022222222 = z9;
        final boolean z1122222222 = z7;
        final long j1322222222 = j9;
        final List<? extends BetModel> list322222222 = emptyList;
        final OddType oddType422222222 = oddType3;
        final long j1422222222 = j10;
        final boolean z1222222222 = z8;
        final long j1522222222 = j11;
        final long j1622222222 = j12;
        final Function0<Unit> function03422222222 = function017;
        final BattleOpponent battleOpponent422222222 = battleOpponent3;
        final PlaceBetResult placeBetResult422222222 = placeBetResult3;
        final Function0<Unit> function03522222222 = function019;
        final BattleCreateResult battleCreateResult422222222 = battleCreateResult3;
        final Function0<Unit> function03622222222 = function023;
        final Function0<Unit> function03722222222 = function020;
        final Function0<Unit> function03822222222 = function021;
        final Function0<Unit> function03922222222 = function018;
        final Function1<? super Long, Unit> function1522222222 = function13;
        final Function0<Unit> function04022222222 = function016;
        final TourState tourState422222222 = tourState3;
        Function0<Unit> function04122222222 = function010;
        composer3 = composer2;
        QuickBetDimensKt.QuickBetProportionalScale(ComposableLambdaKt.rememberComposableLambda(244532196, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer4, int i37) {
                if ((i37 & 3) == 2 && composer4.getSkipping()) {
                    composer4.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(244532196, i37, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous> (BettingSheetComposeUI.kt:43)");
                }
                final Function0<Unit> function0422 = function03222222222;
                final Function0<Unit> function0432 = function03322222222;
                final boolean z1322222222 = z1022222222;
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1778801119, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i38) {
                        if ((i38 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1778801119, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:45)");
                        }
                        BettingSheetContentKt.QuickBetTopBar(function0422, function0432, z1322222222, null, composer5, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54);
                final boolean z14 = z1122222222;
                final long j17 = j1322222222;
                final List<? extends BetModel> list4 = list322222222;
                final OddType oddType5 = oddType422222222;
                final long j18 = j1422222222;
                final boolean z15 = z1222222222;
                final long j19 = j1522222222;
                final long j20 = j1622222222;
                final Function0<Unit> function044 = function03422222222;
                final BattleOpponent battleOpponent5 = battleOpponent422222222;
                final PlaceBetResult placeBetResult5 = placeBetResult422222222;
                final Function0<Unit> function045 = function03522222222;
                final BattleCreateResult battleCreateResult5 = battleCreateResult422222222;
                final Function0<Unit> function046 = function03622222222;
                final Function0<Unit> function047 = function03222222222;
                final Function0<Unit> function048 = function03722222222;
                final Function0<Unit> function049 = function03322222222;
                final Function0<Unit> function050 = function03822222222;
                final Function0<Unit> function051 = function03922222222;
                final Function1<? super Long, Unit> function16 = function1522222222;
                final Function0<Unit> function052 = function04022222222;
                final boolean z16 = z1022222222;
                final TourState tourState5 = tourState422222222;
                BettingSheetOverlayKt.BettingSheetOverlay(rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1191409376, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$BettingSheetUi$11.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i38) {
                        if ((i38 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1191409376, i38, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetUi.<anonymous>.<anonymous> (BettingSheetComposeUI.kt:52)");
                        }
                        BettingSheetContentKt.BettingSheetContent(z14, j17, list4, oddType5, j18, z15, j19, j20, function044, battleOpponent5, placeBetResult5, function045, battleCreateResult5, function046, function047, function048, function049, function050, function051, function16, function052, z16, tourState5, composer5, 0, 0, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), composer4, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer3, 54), composer3, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        placeBetResult2 = placeBetResult3;
        function024 = function021;
        function14 = function13;
        function025 = function018;
        function026 = function019;
        battleOpponent2 = battleOpponent3;
        function027 = function017;
        battleCreateResult2 = battleCreateResult3;
        function028 = function016;
        z4 = z7;
        list2 = emptyList;
        function029 = function04122222222;
        modifier3 = modifier2;
        boolean z1322222222 = z9;
        oddType2 = oddType3;
        function030 = function012;
        j5 = j9;
        z5 = z8;
        j6 = j10;
        function031 = function023;
        z6 = z1322222222;
        tourState2 = tourState3;
        j7 = j12;
        j8 = j11;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PreviewBettingSheetUi(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(805483927);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805483927, i, -1, "org.betup.ui.fragment.bets.sheet.compose.PreviewBettingSheetUi (BettingSheetComposeUI.kt:83)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda3
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
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Function0 function03 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Function0 function04 = (Function0) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Function0 function05 = (Function0) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewBettingSheetUi$lambda$32$lambda$31;
                        PreviewBettingSheetUi$lambda$32$lambda$31 = BettingSheetComposeUIKt.PreviewBettingSheetUi$lambda$32$lambda$31(((Long) obj).longValue());
                        return PreviewBettingSheetUi$lambda$32$lambda$31;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            Function1 function1 = (Function1) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            BettingSheetUi(fillMaxWidth$default, function0, function02, function03, function04, function05, function1, (Function0) rememberedValue7, false, 100L, CollectionsKt.emptyList(), OddType.DECIMAL, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, true, 500L, 0L, null, null, null, null, null, null, false, null, composer2, 920350134, 28086, 0, 16744448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBettingSheetUi$lambda$35;
                    PreviewBettingSheetUi$lambda$35 = BettingSheetComposeUIKt.PreviewBettingSheetUi$lambda$35(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBettingSheetUi$lambda$35;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBettingSheetUi$lambda$32$lambda$31(long j) {
        return Unit.INSTANCE;
    }

    @QuickBetScreenPreviews
    private static final void PreviewBettingSheetUiScreens(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(710740972);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(710740972, i, -1, "org.betup.ui.fragment.bets.sheet.compose.PreviewBettingSheetUiScreens (BettingSheetComposeUI.kt:109)");
            }
            BettingSheetUi(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, null, null, false, 1000L, CollectionsKt.emptyList(), OddType.DECIMAL, 5630L, true, 500L, 100L, null, null, null, null, null, null, false, null, startRestartGroup, 905969670, 224694, 0, 16711934);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetComposeUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBettingSheetUiScreens$lambda$36;
                    PreviewBettingSheetUiScreens$lambda$36 = BettingSheetComposeUIKt.PreviewBettingSheetUiScreens$lambda$36(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBettingSheetUiScreens$lambda$36;
                }
            });
        }
    }
}
