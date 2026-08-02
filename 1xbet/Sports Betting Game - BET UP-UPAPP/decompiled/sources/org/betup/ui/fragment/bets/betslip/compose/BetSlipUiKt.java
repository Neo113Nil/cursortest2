package org.betup.ui.fragment.bets.betslip.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.common.compose.slider.BetAmountSliderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.BetDetailsSummaryKt;

/* compiled from: BetSlipUi.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u001aá\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"BetSlipUi", "", "onPlaceBetClick", "Lkotlin/Function0;", "onAddCoinsClick", "onAmountChange", "Lkotlin/Function1;", "", "onSettingsClick", "onItemClick", "Lkotlin/Function2;", "", "Lorg/betup/model/remote/entity/matches/MatchState;", "onRemoveItem", "onNavigateToTopMatches", "isLoading", "", "amount", "bets", "", "Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "userAmount", "oddType", "Lorg/betup/model/local/entity/OddType;", "highScore", "coefficient", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZJLjava/util/List;JLorg/betup/model/local/entity/OddType;JDLandroidx/compose/runtime/Composer;III)V", "PreviewBetSlipUi", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "isLocked"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetSlipUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUi$lambda$18(Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function2 function2, Function1 function12, Function0 function04, boolean z, long j, List list, long j2, OddType oddType, long j3, double d, int i, int i2, int i3, Composer composer, int i4) {
        BetSlipUi(function0, function02, function1, function03, function2, function12, function04, z, j, list, j2, oddType, j3, d, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetSlipUi$lambda$25(int i, Composer composer, int i2) {
        PreviewBetSlipUi(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUi$lambda$5$lambda$4(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUi$lambda$9$lambda$8(int i, MatchState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipUi$lambda$11$lambda$10(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetSlipUi(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Long, Unit> function1, Function0<Unit> function03, Function2<? super Integer, ? super MatchState, Unit> function2, Function1<? super Long, Unit> function12, Function0<Unit> function04, boolean z, long j, List<BetSlipUiModel> list, long j2, OddType oddType, long j3, double d, Composer composer, final int i, final int i2, final int i3) {
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
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function1<? super Long, Unit> function13;
        Function0<Unit> function07;
        Function2<? super Integer, ? super MatchState, Unit> function22;
        Function1<? super Long, Unit> function14;
        Function0<Unit> function08;
        Function0<Unit> function09;
        long j4;
        final List<BetSlipUiModel> emptyList;
        long j5;
        boolean changed;
        Object rememberedValue;
        final Function0<Unit> function010;
        final Function0<Unit> function011;
        final Function1<? super Long, Unit> function15;
        final Function1<? super Long, Unit> function16;
        final boolean z2;
        final Function0<Unit> function012;
        final long j6;
        final double d2;
        final OddType oddType2;
        final Function2<? super Integer, ? super MatchState, Unit> function23;
        final Function0<Unit> function013;
        final List<BetSlipUiModel> list2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1952540921);
        int i19 = i3 & 1;
        if (i19 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(j) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(list) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i13 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i13 = i2 | (startRestartGroup.changed(j2) ? 4 : 2);
                    } else {
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i13 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 32 : 16;
                    }
                    int i21 = i13;
                    i15 = i3 & 4096;
                    if (i15 == 0) {
                        i21 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        i16 = i11;
                    } else {
                        i16 = i11;
                        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i17 = i9;
                            i21 |= startRestartGroup.changed(j3) ? 256 : 128;
                            i18 = i3 & 8192;
                            if (i18 != 0) {
                                i21 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i21 |= startRestartGroup.changed(d) ? 2048 : 1024;
                            }
                            if ((306783363 & i4) == 306783362 || (i21 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                if (i19 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function05 = (Function0) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function05 = function0;
                                }
                                if ((i3 & 2) != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function06 = (Function0) rememberedValue3;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function06 = function02;
                                }
                                if (i20 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit BetSlipUi$lambda$5$lambda$4;
                                                BetSlipUi$lambda$5$lambda$4 = BetSlipUiKt.BetSlipUi$lambda$5$lambda$4(((Long) obj).longValue());
                                                return BetSlipUi$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function13 = (Function1) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function13 = function1;
                                }
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    function07 = (Function0) rememberedValue5;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function07 = function03;
                                }
                                if (i6 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit BetSlipUi$lambda$9$lambda$8;
                                                BetSlipUi$lambda$9$lambda$8 = BetSlipUiKt.BetSlipUi$lambda$9$lambda$8(((Integer) obj).intValue(), (MatchState) obj2);
                                                return BetSlipUi$lambda$9$lambda$8;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    function22 = (Function2) rememberedValue6;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function22 = function2;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit BetSlipUi$lambda$11$lambda$10;
                                                BetSlipUi$lambda$11$lambda$10 = BetSlipUiKt.BetSlipUi$lambda$11$lambda$10(((Long) obj).longValue());
                                                return BetSlipUi$lambda$11$lambda$10;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    function14 = (Function1) rememberedValue7;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function14 = function12;
                                }
                                if (i8 != 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    function08 = function06;
                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    function09 = (Function0) rememberedValue8;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function08 = function06;
                                    function09 = function04;
                                }
                                final boolean z3 = i17 != 0 ? false : z;
                                j4 = i10 != 0 ? 50L : j;
                                emptyList = i16 != 0 ? CollectionsKt.emptyList() : list;
                                long j7 = i12 != 0 ? ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS : j2;
                                OddType oddType3 = i14 != 0 ? OddType.DECIMAL : oddType;
                                j5 = i15 != 0 ? 0L : j3;
                                double d3 = i18 != 0 ? 0.0d : d;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1952540921, i4, i21, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi (BetSlipUi.kt:35)");
                                }
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(emptyList);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean BetSlipUi$lambda$16$lambda$15;
                                            BetSlipUi$lambda$16$lambda$15 = BetSlipUiKt.BetSlipUi$lambda$16$lambda$15(emptyList);
                                            return Boolean.valueOf(BetSlipUi$lambda$16$lambda$15);
                                        }
                                    });
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                final State state = (State) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                float f = 12;
                                final long j8 = j4;
                                final long j9 = j7;
                                final Function1<? super Long, Unit> function17 = function13;
                                final double d4 = d3;
                                final OddType oddType4 = oddType3;
                                final long j10 = j5;
                                final Function0<Unit> function014 = function07;
                                final boolean z4 = z3;
                                final List<BetSlipUiModel> list3 = emptyList;
                                final Function2<? super Integer, ? super MatchState, Unit> function24 = function22;
                                final Function1<? super Long, Unit> function18 = function14;
                                final Function0<Unit> function015 = function09;
                                function010 = function05;
                                List<BetSlipUiModel> list4 = emptyList;
                                TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), Dp.m7774constructorimpl(f), 0.0f, 2, null), null, ComposableLambdaKt.rememberComposableLambda(-1067028888, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i22) {
                                        if ((i22 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1067028888, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:57)");
                                        }
                                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(30), 0.0f, 2, null);
                                        long j11 = j8;
                                        long j12 = j9;
                                        Function1<Long, Unit> function19 = function17;
                                        double d5 = d4;
                                        OddType oddType5 = oddType4;
                                        long j13 = j10;
                                        Function0<Unit> function016 = function014;
                                        boolean z5 = z4;
                                        List<BetSlipUiModel> list5 = list3;
                                        Function2<Integer, MatchState, Unit> function25 = function24;
                                        Function1<Long, Unit> function110 = function18;
                                        Function0<Unit> function017 = function015;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
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
                                        Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        BetSlipContentStateKt.BetSlipContentState(z5, list5, function25, function110, function017, oddType5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1572864, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        BetAmountSliderKt.BetAmountSlider(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(6), 0.0f, 2, null), j11, j12, 0L, function19, false, 0L, false, composer2, 196614, 200);
                                        BetDetailsSummaryKt.BetDetailsSummary(null, j11, function19, d5, j12, oddType5, (int) j13, false, function016, composer2, 0, 129);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1551974137, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i22) {
                                        boolean BetSlipUi$lambda$17;
                                        if ((i22 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1551974137, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:48)");
                                        }
                                        int size = emptyList.size();
                                        BetSlipUi$lambda$17 = BetSlipUiKt.BetSlipUi$lambda$17(state);
                                        PlaceBetButtonKt.PlaceBetButton(size, BetSlipUi$lambda$17, z3, function010, null, composer2, 0, 16);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), false, false, null, false, startRestartGroup, 28086, 224);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function011 = function08;
                                function15 = function13;
                                function16 = function14;
                                z2 = z3;
                                function012 = function09;
                                j6 = j7;
                                d2 = d3;
                                oddType2 = oddType3;
                                function23 = function22;
                                function013 = function07;
                                list2 = list4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function010 = function0;
                                function011 = function02;
                                function15 = function1;
                                function013 = function03;
                                function23 = function2;
                                function16 = function12;
                                function012 = function04;
                                z2 = z;
                                j4 = j;
                                list2 = list;
                                j6 = j2;
                                oddType2 = oddType;
                                j5 = j3;
                                d2 = d;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final Function0<Unit> function016 = function010;
                                final long j11 = j4;
                                final long j12 = j5;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit BetSlipUi$lambda$18;
                                        BetSlipUi$lambda$18 = BetSlipUiKt.BetSlipUi$lambda$18(Function0.this, function011, function15, function013, function23, function16, function012, z2, j11, list2, j6, oddType2, j12, d2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return BetSlipUi$lambda$18;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    i17 = i9;
                    i18 = i3 & 8192;
                    if (i18 != 0) {
                    }
                    if ((306783363 & i4) == 306783362) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(emptyList);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean BetSlipUi$lambda$16$lambda$15;
                            BetSlipUi$lambda$16$lambda$15 = BetSlipUiKt.BetSlipUi$lambda$16$lambda$15(emptyList);
                            return Boolean.valueOf(BetSlipUi$lambda$16$lambda$15);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final State<Boolean> state2 = (State) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    float f2 = 12;
                    final long j82 = j4;
                    final long j92 = j7;
                    final Function1<? super Long, Unit> function172 = function13;
                    final double d42 = d3;
                    final OddType oddType42 = oddType3;
                    final long j102 = j5;
                    final Function0<Unit> function0142 = function07;
                    final boolean z42 = z3;
                    final List<BetSlipUiModel> list32 = emptyList;
                    final Function2<? super Integer, ? super MatchState, Unit> function242 = function22;
                    final Function1<? super Long, Unit> function182 = function14;
                    final Function0<Unit> function0152 = function09;
                    function010 = function05;
                    List<BetSlipUiModel> list42 = emptyList;
                    TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f2), 7, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null), null, ComposableLambdaKt.rememberComposableLambda(-1067028888, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i22) {
                            if ((i22 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1067028888, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:57)");
                            }
                            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(30), 0.0f, 2, null);
                            long j112 = j82;
                            long j122 = j92;
                            Function1<Long, Unit> function19 = function172;
                            double d5 = d42;
                            OddType oddType5 = oddType42;
                            long j13 = j102;
                            Function0<Unit> function0162 = function0142;
                            boolean z5 = z42;
                            List<BetSlipUiModel> list5 = list32;
                            Function2<Integer, MatchState, Unit> function25 = function242;
                            Function1<Long, Unit> function110 = function182;
                            Function0<Unit> function017 = function0152;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
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
                            Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BetSlipContentStateKt.BetSlipContentState(z5, list5, function25, function110, function017, oddType5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1572864, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            BetAmountSliderKt.BetAmountSlider(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(6), 0.0f, 2, null), j112, j122, 0L, function19, false, 0L, false, composer2, 196614, 200);
                            BetDetailsSummaryKt.BetDetailsSummary(null, j112, function19, d5, j122, oddType5, (int) j13, false, function0162, composer2, 0, 129);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1551974137, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i22) {
                            boolean BetSlipUi$lambda$17;
                            if ((i22 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1551974137, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:48)");
                            }
                            int size = emptyList.size();
                            BetSlipUi$lambda$17 = BetSlipUiKt.BetSlipUi$lambda$17(state2);
                            PlaceBetButtonKt.PlaceBetButton(size, BetSlipUi$lambda$17, z3, function010, null, composer2, 0, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), false, false, null, false, startRestartGroup, 28086, 224);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function011 = function08;
                    function15 = function13;
                    function16 = function14;
                    z2 = z3;
                    function012 = function09;
                    j6 = j7;
                    d2 = d3;
                    oddType2 = oddType3;
                    function23 = function22;
                    function013 = function07;
                    list2 = list42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                int i212 = i13;
                i15 = i3 & 4096;
                if (i15 == 0) {
                }
                i17 = i9;
                i18 = i3 & 8192;
                if (i18 != 0) {
                }
                if ((306783363 & i4) == 306783362) {
                }
                if (i19 != 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if (i20 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i17 != 0) {
                }
                if (i10 != 0) {
                }
                if (i16 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i18 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(emptyList);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BetSlipUi$lambda$16$lambda$15;
                        BetSlipUi$lambda$16$lambda$15 = BetSlipUiKt.BetSlipUi$lambda$16$lambda$15(emptyList);
                        return Boolean.valueOf(BetSlipUi$lambda$16$lambda$15);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
                final State<Boolean> state22 = (State) rememberedValue;
                startRestartGroup.endReplaceGroup();
                float f22 = 12;
                final long j822 = j4;
                final long j922 = j7;
                final Function1<? super Long, Unit> function1722 = function13;
                final double d422 = d3;
                final OddType oddType422 = oddType3;
                final long j1022 = j5;
                final Function0<Unit> function01422 = function07;
                final boolean z422 = z3;
                final List<BetSlipUiModel> list322 = emptyList;
                final Function2<? super Integer, ? super MatchState, Unit> function2422 = function22;
                final Function1<? super Long, Unit> function1822 = function14;
                final Function0<Unit> function01522 = function09;
                function010 = function05;
                List<BetSlipUiModel> list422 = emptyList;
                TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f22), 7, null), Dp.m7774constructorimpl(f22), 0.0f, 2, null), null, ComposableLambdaKt.rememberComposableLambda(-1067028888, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i22) {
                        if ((i22 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1067028888, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:57)");
                        }
                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(30), 0.0f, 2, null);
                        long j112 = j822;
                        long j122 = j922;
                        Function1<Long, Unit> function19 = function1722;
                        double d5 = d422;
                        OddType oddType5 = oddType422;
                        long j13 = j1022;
                        Function0<Unit> function0162 = function01422;
                        boolean z5 = z422;
                        List<BetSlipUiModel> list5 = list322;
                        Function2<Integer, MatchState, Unit> function25 = function2422;
                        Function1<Long, Unit> function110 = function1822;
                        Function0<Unit> function017 = function01522;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
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
                        Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BetSlipContentStateKt.BetSlipContentState(z5, list5, function25, function110, function017, oddType5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1572864, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        BetAmountSliderKt.BetAmountSlider(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(6), 0.0f, 2, null), j112, j122, 0L, function19, false, 0L, false, composer2, 196614, 200);
                        BetDetailsSummaryKt.BetDetailsSummary(null, j112, function19, d5, j122, oddType5, (int) j13, false, function0162, composer2, 0, 129);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1551974137, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i22) {
                        boolean BetSlipUi$lambda$17;
                        if ((i22 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1551974137, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:48)");
                        }
                        int size = emptyList.size();
                        BetSlipUi$lambda$17 = BetSlipUiKt.BetSlipUi$lambda$17(state22);
                        PlaceBetButtonKt.PlaceBetButton(size, BetSlipUi$lambda$17, z3, function010, null, composer2, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), false, false, null, false, startRestartGroup, 28086, 224);
                if (ComposerKt.isTraceInProgress()) {
                }
                function011 = function08;
                function15 = function13;
                function16 = function14;
                z2 = z3;
                function012 = function09;
                j6 = j7;
                d2 = d3;
                oddType2 = oddType3;
                function23 = function22;
                function013 = function07;
                list2 = list422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            int i2122 = i13;
            i15 = i3 & 4096;
            if (i15 == 0) {
            }
            i17 = i9;
            i18 = i3 & 8192;
            if (i18 != 0) {
            }
            if ((306783363 & i4) == 306783362) {
            }
            if (i19 != 0) {
            }
            if ((i3 & 2) != 0) {
            }
            if (i20 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i17 != 0) {
            }
            if (i10 != 0) {
            }
            if (i16 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i18 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(emptyList);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean BetSlipUi$lambda$16$lambda$15;
                    BetSlipUi$lambda$16$lambda$15 = BetSlipUiKt.BetSlipUi$lambda$16$lambda$15(emptyList);
                    return Boolean.valueOf(BetSlipUi$lambda$16$lambda$15);
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue);
            final State<Boolean> state222 = (State) rememberedValue;
            startRestartGroup.endReplaceGroup();
            float f222 = 12;
            final long j8222 = j4;
            final long j9222 = j7;
            final Function1<? super Long, Unit> function17222 = function13;
            final double d4222 = d3;
            final OddType oddType4222 = oddType3;
            final long j10222 = j5;
            final Function0<Unit> function014222 = function07;
            final boolean z4222 = z3;
            final List<BetSlipUiModel> list3222 = emptyList;
            final Function2<? super Integer, ? super MatchState, Unit> function24222 = function22;
            final Function1<? super Long, Unit> function18222 = function14;
            final Function0<Unit> function015222 = function09;
            function010 = function05;
            List<BetSlipUiModel> list4222 = emptyList;
            TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f222), 7, null), Dp.m7774constructorimpl(f222), 0.0f, 2, null), null, ComposableLambdaKt.rememberComposableLambda(-1067028888, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    if ((i22 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1067028888, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:57)");
                    }
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(30), 0.0f, 2, null);
                    long j112 = j8222;
                    long j122 = j9222;
                    Function1<Long, Unit> function19 = function17222;
                    double d5 = d4222;
                    OddType oddType5 = oddType4222;
                    long j13 = j10222;
                    Function0<Unit> function0162 = function014222;
                    boolean z5 = z4222;
                    List<BetSlipUiModel> list5 = list3222;
                    Function2<Integer, MatchState, Unit> function25 = function24222;
                    Function1<Long, Unit> function110 = function18222;
                    Function0<Unit> function017 = function015222;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
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
                    Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BetSlipContentStateKt.BetSlipContentState(z5, list5, function25, function110, function017, oddType5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1572864, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    BetAmountSliderKt.BetAmountSlider(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(6), 0.0f, 2, null), j112, j122, 0L, function19, false, 0L, false, composer2, 196614, 200);
                    BetDetailsSummaryKt.BetDetailsSummary(null, j112, function19, d5, j122, oddType5, (int) j13, false, function0162, composer2, 0, 129);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1551974137, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    boolean BetSlipUi$lambda$17;
                    if ((i22 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1551974137, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:48)");
                    }
                    int size = emptyList.size();
                    BetSlipUi$lambda$17 = BetSlipUiKt.BetSlipUi$lambda$17(state222);
                    PlaceBetButtonKt.PlaceBetButton(size, BetSlipUi$lambda$17, z3, function010, null, composer2, 0, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), false, false, null, false, startRestartGroup, 28086, 224);
            if (ComposerKt.isTraceInProgress()) {
            }
            function011 = function08;
            function15 = function13;
            function16 = function14;
            z2 = z3;
            function012 = function09;
            j6 = j7;
            d2 = d3;
            oddType2 = oddType3;
            function23 = function22;
            function013 = function07;
            list2 = list4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        int i21222 = i13;
        i15 = i3 & 4096;
        if (i15 == 0) {
        }
        i17 = i9;
        i18 = i3 & 8192;
        if (i18 != 0) {
        }
        if ((306783363 & i4) == 306783362) {
        }
        if (i19 != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if (i20 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i17 != 0) {
        }
        if (i10 != 0) {
        }
        if (i16 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i18 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(emptyList);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean BetSlipUi$lambda$16$lambda$15;
                BetSlipUi$lambda$16$lambda$15 = BetSlipUiKt.BetSlipUi$lambda$16$lambda$15(emptyList);
                return Boolean.valueOf(BetSlipUi$lambda$16$lambda$15);
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue);
        final State<Boolean> state2222 = (State) rememberedValue;
        startRestartGroup.endReplaceGroup();
        float f2222 = 12;
        final long j82222 = j4;
        final long j92222 = j7;
        final Function1<? super Long, Unit> function172222 = function13;
        final double d42222 = d3;
        final OddType oddType42222 = oddType3;
        final long j102222 = j5;
        final Function0<Unit> function0142222 = function07;
        final boolean z42222 = z3;
        final List<BetSlipUiModel> list32222 = emptyList;
        final Function2<? super Integer, ? super MatchState, Unit> function242222 = function22;
        final Function1<? super Long, Unit> function182222 = function14;
        final Function0<Unit> function0152222 = function09;
        function010 = function05;
        List<BetSlipUiModel> list42222 = emptyList;
        TicketDarkKt.TicketDark(PaddingKt.m1518paddingVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f2222), 7, null), Dp.m7774constructorimpl(f2222), 0.0f, 2, null), null, ComposableLambdaKt.rememberComposableLambda(-1067028888, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i22) {
                if ((i22 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1067028888, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:57)");
                }
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(30), 0.0f, 2, null);
                long j112 = j82222;
                long j122 = j92222;
                Function1<Long, Unit> function19 = function172222;
                double d5 = d42222;
                OddType oddType5 = oddType42222;
                long j13 = j102222;
                Function0<Unit> function0162 = function0142222;
                boolean z5 = z42222;
                List<BetSlipUiModel> list5 = list32222;
                Function2<Integer, MatchState, Unit> function25 = function242222;
                Function1<Long, Unit> function110 = function182222;
                Function0<Unit> function017 = function0152222;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default);
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
                Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BetSlipContentStateKt.BetSlipContentState(z5, list5, function25, function110, function017, oddType5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1572864, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                BetAmountSliderKt.BetAmountSlider(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(6), 0.0f, 2, null), j112, j122, 0L, function19, false, 0L, false, composer2, 196614, 200);
                BetDetailsSummaryKt.BetDetailsSummary(null, j112, function19, d5, j122, oddType5, (int) j13, false, function0162, composer2, 0, 129);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1551974137, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$BetSlipUi$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i22) {
                boolean BetSlipUi$lambda$17;
                if ((i22 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1551974137, i22, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipUi.<anonymous> (BetSlipUi.kt:48)");
                }
                int size = emptyList.size();
                BetSlipUi$lambda$17 = BetSlipUiKt.BetSlipUi$lambda$17(state2222);
                PlaceBetButtonKt.PlaceBetButton(size, BetSlipUi$lambda$17, z3, function010, null, composer2, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), false, false, null, false, startRestartGroup, 28086, 224);
        if (ComposerKt.isTraceInProgress()) {
        }
        function011 = function08;
        function15 = function13;
        function16 = function14;
        z2 = z3;
        function012 = function09;
        j6 = j7;
        d2 = d3;
        oddType2 = oddType3;
        function23 = function22;
        function013 = function07;
        list2 = list42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BetSlipUi$lambda$16$lambda$15(List list) {
        if (!list.isEmpty()) {
            List<BetSlipUiModel> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (BetSlipUiModel betSlipUiModel : list2) {
                    if (betSlipUiModel.isAvailable() || !betSlipUiModel.getUserBetAvailable()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void PreviewBetSlipUi(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(280318829);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(280318829, i, -1, "org.betup.ui.fragment.bets.betslip.compose.PreviewBetSlipUi (BetSlipUi.kt:105)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda12
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
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda1
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
                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewBetSlipUi$lambda$24$lambda$23;
                        PreviewBetSlipUi$lambda$24$lambda$23 = BetSlipUiKt.PreviewBetSlipUi$lambda$24$lambda$23(((Long) obj).longValue());
                        return PreviewBetSlipUi$lambda$24$lambda$23;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            BetSlipUi(function0, function02, (Function1) rememberedValue3, null, null, null, null, false, 100L, CollectionsKt.emptyList(), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, OddType.DECIMAL, 500L, 2.5d, composer2, 918553014, 3510, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipUiKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBetSlipUi$lambda$25;
                    PreviewBetSlipUi$lambda$25 = BetSlipUiKt.PreviewBetSlipUi$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBetSlipUi$lambda$25;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetSlipUi$lambda$24$lambda$23(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BetSlipUi$lambda$17(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
