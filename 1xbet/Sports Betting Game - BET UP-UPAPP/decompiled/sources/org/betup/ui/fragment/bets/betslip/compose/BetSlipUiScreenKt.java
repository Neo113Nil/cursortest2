package org.betup.ui.fragment.bets.betslip.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;

/* compiled from: BetSlipUiScreen.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\u001aý\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010H\u0007¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"BetSlipUiScreen", "", "onPlaceBetClick", "Lkotlin/Function0;", "onAddCoinsClick", "onAmountChange", "Lkotlin/Function1;", "", "onSettingsClick", "onItemClick", "Lkotlin/Function2;", "", "Lorg/betup/model/remote/entity/matches/MatchState;", "onRemoveItem", "onNavigateToTopMatches", "amountFlow", "Lkotlinx/coroutines/flow/StateFlow;", "userAmountFlow", "isLoadingFlow", "", "betsModelFlow", "", "Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "highScoreFlow", "coefficientFlow", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/runtime/Composer;III)V", "app_release", "isLoading", "amount", "bets", "userAmount", "oddTypeValue", "highScore", "coefficient"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetSlipUiScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUiScreen$lambda$21(Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function2 function2, Function1 function12, Function0 function04, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, StateFlow stateFlow5, StateFlow stateFlow6, StateFlow stateFlow7, int i, int i2, int i3, Composer composer, int i4) {
        BetSlipUiScreen(function0, function02, function1, function03, function2, function12, function04, stateFlow, stateFlow2, stateFlow3, stateFlow4, stateFlow5, stateFlow6, stateFlow7, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUiScreen$lambda$5$lambda$4(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUiScreen$lambda$9$lambda$8(int i, MatchState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUiScreen$lambda$11$lambda$10(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetSlipUiScreen(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Long, Unit> function1, Function0<Unit> function03, Function2<? super Integer, ? super MatchState, Unit> function2, Function1<? super Long, Unit> function12, Function0<Unit> function04, final StateFlow<Long> amountFlow, final StateFlow<Long> userAmountFlow, final StateFlow<Boolean> isLoadingFlow, final StateFlow<? extends List<BetSlipUiModel>> betsModelFlow, final StateFlow<? extends OddType> oddType, final StateFlow<Long> highScoreFlow, final StateFlow<Double> coefficientFlow, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function05;
        Function0<Unit> function06;
        final Function1<? super Long, Unit> function13;
        Function0<Unit> function07;
        Function2<? super Integer, ? super MatchState, Unit> function22;
        Function2<? super Integer, ? super MatchState, Unit> function23;
        Function1<? super Long, Unit> function14;
        Function1<? super Long, Unit> function15;
        Function0<Unit> function08;
        Function0<Unit> function09;
        Function2<? super Integer, ? super MatchState, Unit> function24;
        Function1<? super Long, Unit> function16;
        Function0<Unit> function010;
        final Function0<Unit> function011;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(amountFlow, "amountFlow");
        Intrinsics.checkNotNullParameter(userAmountFlow, "userAmountFlow");
        Intrinsics.checkNotNullParameter(isLoadingFlow, "isLoadingFlow");
        Intrinsics.checkNotNullParameter(betsModelFlow, "betsModelFlow");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(highScoreFlow, "highScoreFlow");
        Intrinsics.checkNotNullParameter(coefficientFlow, "coefficientFlow");
        Composer startRestartGroup = composer.startRestartGroup(-587542616);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (startRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i14 = i4;
        int i15 = i3 & 4;
        if (i15 != 0) {
            i14 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i14 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i14 |= 3072;
            } else if ((i & 3072) == 0) {
                i14 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i14 |= 24576;
                } else if ((i & 24576) == 0) {
                    i14 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i14 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i14 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i14 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i14 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i14 |= startRestartGroup.changedInstance(amountFlow) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) != 0) {
                        i11 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(userAmountFlow) ? 67108864 : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            i10 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(isLoadingFlow) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                            if ((i3 & 1024) == 0) {
                                i9 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i9 = i2 | (startRestartGroup.changedInstance(betsModelFlow) ? 4 : 2);
                            } else {
                                i9 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i9 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i9 |= startRestartGroup.changedInstance(oddType) ? 32 : 16;
                            }
                            if ((i3 & 4096) == 0) {
                                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i9 |= startRestartGroup.changedInstance(highScoreFlow) ? 256 : 128;
                            }
                            if ((i3 & 8192) == 0) {
                                i9 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i9 |= startRestartGroup.changedInstance(coefficientFlow) ? 2048 : 1024;
                            }
                            if ((306783379 & i14) == 306783378 || (i9 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                if (i12 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function05 = (Function0) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function05 = function0;
                                }
                                if (i13 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function06 = (Function0) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function06 = function02;
                                }
                                if (i15 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit BetSlipUiScreen$lambda$5$lambda$4;
                                                BetSlipUiScreen$lambda$5$lambda$4 = BetSlipUiScreenKt.BetSlipUiScreen$lambda$5$lambda$4(((Long) obj).longValue());
                                                return BetSlipUiScreen$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function13 = (Function1) rememberedValue3;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function13 = function1;
                                }
                                if (i5 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function07 = (Function0) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function07 = function03;
                                }
                                if (i6 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit BetSlipUiScreen$lambda$9$lambda$8;
                                                BetSlipUiScreen$lambda$9$lambda$8 = BetSlipUiScreenKt.BetSlipUiScreen$lambda$9$lambda$8(((Integer) obj).intValue(), (MatchState) obj2);
                                                return BetSlipUiScreen$lambda$9$lambda$8;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    function22 = (Function2) rememberedValue5;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function22 = function2;
                                }
                                if (i7 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    function23 = function22;
                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit BetSlipUiScreen$lambda$11$lambda$10;
                                                BetSlipUiScreen$lambda$11$lambda$10 = BetSlipUiScreenKt.BetSlipUiScreen$lambda$11$lambda$10(((Long) obj).longValue());
                                                return BetSlipUiScreen$lambda$11$lambda$10;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    function14 = (Function1) rememberedValue6;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function23 = function22;
                                    function14 = function12;
                                }
                                if (i8 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    function15 = function14;
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    function08 = (Function0) rememberedValue7;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function15 = function14;
                                    function08 = function04;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    function09 = function08;
                                } else {
                                    function09 = function08;
                                    ComposerKt.traceEventStart(-587542616, i14, i9, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreen (BetSlipUiScreen.kt:29)");
                                }
                                Function0<Unit> function012 = function07;
                                BetSlipUiKt.BetSlipUi(function05, function06, function13, function012, function23, function15, function09, BetSlipUiScreen$lambda$14(SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, (i14 >> 27) & 14, 1)), BetSlipUiScreen$lambda$15(SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i14 >> 21) & 14, 1)), BetSlipUiScreen$lambda$16(SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, i9 & 14, 1)), BetSlipUiScreen$lambda$17(SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, (i14 >> 24) & 14, 1)), BetSlipUiScreen$lambda$18(SnapshotStateKt.collectAsState(oddType, null, startRestartGroup, (i9 >> 3) & 14, 1)), BetSlipUiScreen$lambda$19(SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i9 >> 6) & 14, 1)), BetSlipUiScreen$lambda$20(SnapshotStateKt.collectAsState(coefficientFlow, null, startRestartGroup, (i9 >> 9) & 14, 1)), startRestartGroup, i14 & 4194302, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function24 = function23;
                                function16 = function15;
                                function010 = function09;
                                function011 = function012;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function05 = function0;
                                function06 = function02;
                                function13 = function1;
                                function011 = function03;
                                function24 = function2;
                                function16 = function12;
                                function010 = function04;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Function0<Unit> function013 = function05;
                                final Function0<Unit> function014 = function06;
                                final Function2<? super Integer, ? super MatchState, Unit> function25 = function24;
                                final Function1<? super Long, Unit> function17 = function16;
                                final Function0<Unit> function015 = function010;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiScreenKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit BetSlipUiScreen$lambda$21;
                                        BetSlipUiScreen$lambda$21 = BetSlipUiScreenKt.BetSlipUiScreen$lambda$21(Function0.this, function014, function13, function011, function25, function17, function015, amountFlow, userAmountFlow, isLoadingFlow, betsModelFlow, oddType, highScoreFlow, coefficientFlow, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return BetSlipUiScreen$lambda$21;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 |= i10;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        if ((i3 & 8192) == 0) {
                        }
                        if ((306783379 & i14) == 306783378) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function0122 = function07;
                        BetSlipUiKt.BetSlipUi(function05, function06, function13, function0122, function23, function15, function09, BetSlipUiScreen$lambda$14(SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, (i14 >> 27) & 14, 1)), BetSlipUiScreen$lambda$15(SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i14 >> 21) & 14, 1)), BetSlipUiScreen$lambda$16(SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, i9 & 14, 1)), BetSlipUiScreen$lambda$17(SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, (i14 >> 24) & 14, 1)), BetSlipUiScreen$lambda$18(SnapshotStateKt.collectAsState(oddType, null, startRestartGroup, (i9 >> 3) & 14, 1)), BetSlipUiScreen$lambda$19(SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i9 >> 6) & 14, 1)), BetSlipUiScreen$lambda$20(SnapshotStateKt.collectAsState(coefficientFlow, null, startRestartGroup, (i9 >> 9) & 14, 1)), startRestartGroup, i14 & 4194302, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function24 = function23;
                        function16 = function15;
                        function010 = function09;
                        function011 = function0122;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i14 |= i11;
                    if ((i3 & 512) == 0) {
                    }
                    i14 |= i10;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    if ((i3 & 8192) == 0) {
                    }
                    if ((306783379 & i14) == 306783378) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Function0<Unit> function01222 = function07;
                    BetSlipUiKt.BetSlipUi(function05, function06, function13, function01222, function23, function15, function09, BetSlipUiScreen$lambda$14(SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, (i14 >> 27) & 14, 1)), BetSlipUiScreen$lambda$15(SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i14 >> 21) & 14, 1)), BetSlipUiScreen$lambda$16(SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, i9 & 14, 1)), BetSlipUiScreen$lambda$17(SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, (i14 >> 24) & 14, 1)), BetSlipUiScreen$lambda$18(SnapshotStateKt.collectAsState(oddType, null, startRestartGroup, (i9 >> 3) & 14, 1)), BetSlipUiScreen$lambda$19(SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i9 >> 6) & 14, 1)), BetSlipUiScreen$lambda$20(SnapshotStateKt.collectAsState(coefficientFlow, null, startRestartGroup, (i9 >> 9) & 14, 1)), startRestartGroup, i14 & 4194302, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function24 = function23;
                    function16 = function15;
                    function010 = function09;
                    function011 = function01222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                i14 |= i11;
                if ((i3 & 512) == 0) {
                }
                i14 |= i10;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if ((306783379 & i14) == 306783378) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Function0<Unit> function012222 = function07;
                BetSlipUiKt.BetSlipUi(function05, function06, function13, function012222, function23, function15, function09, BetSlipUiScreen$lambda$14(SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, (i14 >> 27) & 14, 1)), BetSlipUiScreen$lambda$15(SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i14 >> 21) & 14, 1)), BetSlipUiScreen$lambda$16(SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, i9 & 14, 1)), BetSlipUiScreen$lambda$17(SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, (i14 >> 24) & 14, 1)), BetSlipUiScreen$lambda$18(SnapshotStateKt.collectAsState(oddType, null, startRestartGroup, (i9 >> 3) & 14, 1)), BetSlipUiScreen$lambda$19(SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i9 >> 6) & 14, 1)), BetSlipUiScreen$lambda$20(SnapshotStateKt.collectAsState(coefficientFlow, null, startRestartGroup, (i9 >> 9) & 14, 1)), startRestartGroup, i14 & 4194302, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function24 = function23;
                function16 = function15;
                function010 = function09;
                function011 = function012222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i14 |= i11;
            if ((i3 & 512) == 0) {
            }
            i14 |= i10;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if ((306783379 & i14) == 306783378) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Function0<Unit> function0122222 = function07;
            BetSlipUiKt.BetSlipUi(function05, function06, function13, function0122222, function23, function15, function09, BetSlipUiScreen$lambda$14(SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, (i14 >> 27) & 14, 1)), BetSlipUiScreen$lambda$15(SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i14 >> 21) & 14, 1)), BetSlipUiScreen$lambda$16(SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, i9 & 14, 1)), BetSlipUiScreen$lambda$17(SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, (i14 >> 24) & 14, 1)), BetSlipUiScreen$lambda$18(SnapshotStateKt.collectAsState(oddType, null, startRestartGroup, (i9 >> 3) & 14, 1)), BetSlipUiScreen$lambda$19(SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i9 >> 6) & 14, 1)), BetSlipUiScreen$lambda$20(SnapshotStateKt.collectAsState(coefficientFlow, null, startRestartGroup, (i9 >> 9) & 14, 1)), startRestartGroup, i14 & 4194302, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function24 = function23;
            function16 = function15;
            function010 = function09;
            function011 = function0122222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i14 |= i11;
        if ((i3 & 512) == 0) {
        }
        i14 |= i10;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((306783379 & i14) == 306783378) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Function0<Unit> function01222222 = function07;
        BetSlipUiKt.BetSlipUi(function05, function06, function13, function01222222, function23, function15, function09, BetSlipUiScreen$lambda$14(SnapshotStateKt.collectAsState(isLoadingFlow, null, startRestartGroup, (i14 >> 27) & 14, 1)), BetSlipUiScreen$lambda$15(SnapshotStateKt.collectAsState(amountFlow, null, startRestartGroup, (i14 >> 21) & 14, 1)), BetSlipUiScreen$lambda$16(SnapshotStateKt.collectAsState(betsModelFlow, null, startRestartGroup, i9 & 14, 1)), BetSlipUiScreen$lambda$17(SnapshotStateKt.collectAsState(userAmountFlow, null, startRestartGroup, (i14 >> 24) & 14, 1)), BetSlipUiScreen$lambda$18(SnapshotStateKt.collectAsState(oddType, null, startRestartGroup, (i9 >> 3) & 14, 1)), BetSlipUiScreen$lambda$19(SnapshotStateKt.collectAsState(highScoreFlow, null, startRestartGroup, (i9 >> 6) & 14, 1)), BetSlipUiScreen$lambda$20(SnapshotStateKt.collectAsState(coefficientFlow, null, startRestartGroup, (i9 >> 9) & 14, 1)), startRestartGroup, i14 & 4194302, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function24 = function23;
        function16 = function15;
        function010 = function09;
        function011 = function01222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean BetSlipUiScreen$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long BetSlipUiScreen$lambda$15(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final List<BetSlipUiModel> BetSlipUiScreen$lambda$16(State<? extends List<BetSlipUiModel>> state) {
        return state.getValue();
    }

    private static final long BetSlipUiScreen$lambda$17(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final OddType BetSlipUiScreen$lambda$18(State<? extends OddType> state) {
        return state.getValue();
    }

    private static final long BetSlipUiScreen$lambda$19(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final double BetSlipUiScreen$lambda$20(State<Double> state) {
        return state.getValue().doubleValue();
    }
}
