package org.betup.ui.tour.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.services.user.UserService;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TourScreen.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÏ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"TourScreen", "", "tourManager", "Lorg/betup/ui/tour/compose/TourManager;", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "tourFavoriteSportsController", "Lorg/betup/ui/tour/controller/TourFavoriteSportsController;", "userService", "Lorg/betup/services/user/UserService;", "onTourComplete", "Lkotlin/Function0;", "isOnHomePage", "", "onTourStart", "onTourEnd", "onSportButtonClick", "onSportItemClick", "Lkotlin/Function1;", "", "onLeagueItemClick", "onMatchItemClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/tour/compose/TourManager;Lorg/betup/ui/tour/compose/TourState;Lorg/betup/ui/tour/controller/TourFavoriteSportsController;Lorg/betup/services/user/UserService;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TourScreen$lambda$1$lambda$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourScreen$lambda$18(TourManager tourManager, TourState tourState, TourFavoriteSportsController tourFavoriteSportsController, UserService userService, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        TourScreen(tourManager, tourState, tourFavoriteSportsController, userService, function0, function02, function03, function04, function05, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourScreen(final TourManager tourManager, final TourState tourState, final TourFavoriteSportsController tourFavoriteSportsController, final UserService userService, final Function0<Unit> onTourComplete, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Long, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Function0<Boolean> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        boolean changed;
        TourScreenKt$TourScreen$4$1 rememberedValue;
        boolean changed2;
        TourScreenKt$TourScreen$5$1 rememberedValue2;
        boolean changed3;
        TourScreenKt$TourScreen$6$1 rememberedValue3;
        boolean changed4;
        TourScreenKt$TourScreen$7$1 rememberedValue4;
        boolean changed5;
        TourScreenKt$TourScreen$8$1 rememberedValue5;
        boolean changed6;
        TourScreenKt$TourScreen$9$1 rememberedValue6;
        boolean changed7;
        TourScreenKt$TourScreen$10$1 rememberedValue7;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean shouldShowTourOverlay;
        Composer composer2;
        Modifier modifier2;
        Function0<Unit> function08;
        final Function1<? super Long, Unit> function14;
        final Function0<Boolean> function09;
        final Function0<Unit> function010;
        final Function1<? super Long, Unit> function15;
        final Function1<? super Long, Unit> function16;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(tourManager, "tourManager");
        Intrinsics.checkNotNullParameter(tourState, "tourState");
        Intrinsics.checkNotNullParameter(tourFavoriteSportsController, "tourFavoriteSportsController");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(onTourComplete, "onTourComplete");
        Composer startRestartGroup = composer.startRestartGroup(-1243683907);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(tourManager) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(tourState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(tourFavoriteSportsController) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(userService) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onTourComplete) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function04) ? 67108864 : 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changedInstance(function12) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        int i13 = i5;
        int i14 = i3 & 4096;
        if (i14 != 0) {
            i13 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 256 : 128;
            if ((i4 & 306783379) == 306783378 || (i13 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                if (i6 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function0() { // from class: org.betup.ui.tour.compose.TourScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean TourScreen$lambda$1$lambda$0;
                                TourScreen$lambda$1$lambda$0 = TourScreenKt.TourScreen$lambda$1$lambda$0();
                                return Boolean.valueOf(TourScreen$lambda$1$lambda$0);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    startRestartGroup.endReplaceGroup();
                    function05 = (Function0) rememberedValue8;
                } else {
                    function05 = function0;
                }
                if (i7 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function0() { // from class: org.betup.ui.tour.compose.TourScreenKt$$ExternalSyntheticLambda1
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
                    function06 = (Function0) rememberedValue9;
                } else {
                    function06 = function02;
                }
                if (i8 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new Function0() { // from class: org.betup.ui.tour.compose.TourScreenKt$$ExternalSyntheticLambda2
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
                    function07 = (Function0) rememberedValue10;
                } else {
                    function07 = function03;
                }
                Function0<Unit> function013 = i9 == 0 ? null : function04;
                Function1<? super Long, Unit> function17 = i10 == 0 ? null : function1;
                Function1<? super Long, Unit> function18 = i11 == 0 ? null : function12;
                Function1<? super Long, Unit> function19 = i12 == 0 ? null : function13;
                Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1243683907, i4, i13, "org.betup.ui.tour.compose.TourScreen (TourScreen.kt:28)");
                }
                boolean isOverlayVisible = tourState.isOverlayVisible();
                TourStep currentStep = tourState.getCurrentStep();
                Boolean valueOf = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1746271574);
                changed = ((i4 & 3670016) != 1048576) | startRestartGroup.changed(isOverlayVisible) | ((29360128 & i4) != 8388608);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new TourScreenKt$TourScreen$4$1(isOverlayVisible, function06, function07, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
                Boolean valueOf2 = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1224400529);
                int i15 = i4 & 112;
                changed2 = startRestartGroup.changed(isOverlayVisible) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i15 != 32);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new TourScreenKt$TourScreen$5$1(isOverlayVisible, currentStep, tourManager, tourState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2, currentStep, (Function2) rememberedValue2, startRestartGroup, 0);
                Boolean valueOf3 = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed3 = startRestartGroup.changed(isOverlayVisible) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i15 != 32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new TourScreenKt$TourScreen$6$1(isOverlayVisible, currentStep, tourManager, tourState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf3, currentStep, (Function2) rememberedValue3, startRestartGroup, 0);
                Boolean valueOf4 = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed4 = startRestartGroup.changed(isOverlayVisible) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i15 != 32);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new TourScreenKt$TourScreen$7$1(isOverlayVisible, currentStep, tourManager, tourState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf4, currentStep, (Function2) rememberedValue4, startRestartGroup, 0);
                Boolean valueOf5 = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed5 = startRestartGroup.changed(isOverlayVisible) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i15 != 32);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new TourScreenKt$TourScreen$8$1(isOverlayVisible, currentStep, tourManager, tourState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf5, currentStep, (Function2) rememberedValue5, startRestartGroup, 0);
                Boolean valueOf6 = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed6 = startRestartGroup.changed(isOverlayVisible) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i15 != 32);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new TourScreenKt$TourScreen$9$1(isOverlayVisible, currentStep, tourManager, tourState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf6, currentStep, (Function2) rememberedValue6, startRestartGroup, 0);
                Boolean valueOf7 = Boolean.valueOf(isOverlayVisible);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed7 = startRestartGroup.changed(isOverlayVisible) | startRestartGroup.changed(currentStep != null ? -1 : currentStep.ordinal()) | (i15 != 32) | startRestartGroup.changedInstance(tourManager);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new TourScreenKt$TourScreen$10$1(isOverlayVisible, currentStep, tourState, tourManager, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf7, currentStep, (Function2) rememberedValue7, startRestartGroup, 0);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function0<Unit> function014 = function07;
                Function0<Unit> function015 = function06;
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
                shouldShowTourOverlay = HomeTourScroll.INSTANCE.shouldShowTourOverlay(isOverlayVisible, currentStep, tourState.isSportScrollComplete(), tourState.isLeagueScrollComplete(), tourState.isMatchScrollComplete(), tourState.isHomeScrollComplete(), tourState.isDemoWinRewardDialogBlockingHomeTour());
                startRestartGroup.startReplaceGroup(24406847);
                if (shouldShowTourOverlay) {
                    composer2 = startRestartGroup;
                    modifier2 = modifier4;
                    function08 = function014;
                } else {
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean changedInstance = startRestartGroup.changedInstance(tourManager);
                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new Function0() { // from class: org.betup.ui.tour.compose.TourScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TourScreen$lambda$17$lambda$14$lambda$13;
                                TourScreen$lambda$17$lambda$14$lambda$13 = TourScreenKt.TourScreen$lambda$17$lambda$14$lambda$13(TourManager.this);
                                return TourScreen$lambda$17$lambda$14$lambda$13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    Function0 function016 = (Function0) rememberedValue11;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    boolean changedInstance2 = startRestartGroup.changedInstance(tourManager) | ((57344 & i4) == 16384);
                    Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new Function0() { // from class: org.betup.ui.tour.compose.TourScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TourScreen$lambda$17$lambda$16$lambda$15;
                                TourScreen$lambda$17$lambda$16$lambda$15 = TourScreenKt.TourScreen$lambda$17$lambda$16$lambda$15(TourManager.this, onTourComplete);
                                return TourScreen$lambda$17$lambda$16$lambda$15;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    startRestartGroup.endReplaceGroup();
                    int i16 = (i4 >> 3) & 1022;
                    int i17 = i4 >> 6;
                    int i18 = i16 | (3670016 & i17) | (i17 & 29360128);
                    int i19 = i13 << 24;
                    composer2 = startRestartGroup;
                    function08 = function014;
                    modifier2 = modifier4;
                    TourOverlayKt.TourOverlay(tourState, tourFavoriteSportsController, userService, function016, (Function0) rememberedValue12, function05.invoke().booleanValue(), function013, function17, function18, function19, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, i18 | (234881024 & i19) | (i19 & 1879048192), 6, 0);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function14 = function17;
                function09 = function05;
                function010 = function013;
                function15 = function18;
                function16 = function19;
                function011 = function015;
                function012 = function08;
                modifier3 = modifier2;
            } else {
                startRestartGroup.skipToGroupEnd();
                function09 = function0;
                function011 = function02;
                function012 = function03;
                function14 = function1;
                function15 = function12;
                function16 = function13;
                modifier3 = modifier;
                composer2 = startRestartGroup;
                function010 = function04;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourScreen$lambda$18;
                        TourScreen$lambda$18 = TourScreenKt.TourScreen$lambda$18(TourManager.this, tourState, tourFavoriteSportsController, userService, onTourComplete, function09, function011, function012, function010, function14, function15, function16, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return TourScreen$lambda$18;
                    }
                });
                return;
            }
            return;
        }
        if ((i4 & 306783379) == 306783378) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        boolean isOverlayVisible2 = tourState.isOverlayVisible();
        TourStep currentStep2 = tourState.getCurrentStep();
        Boolean valueOf8 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = ((i4 & 3670016) != 1048576) | startRestartGroup.changed(isOverlayVisible2) | ((29360128 & i4) != 8388608);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new TourScreenKt$TourScreen$4$1(isOverlayVisible2, function06, function07, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
        Boolean valueOf22 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1224400529);
        int i152 = i4 & 112;
        changed2 = startRestartGroup.changed(isOverlayVisible2) | startRestartGroup.changed(currentStep2 != null ? -1 : currentStep2.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i152 != 32);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new TourScreenKt$TourScreen$5$1(isOverlayVisible2, currentStep2, tourManager, tourState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf22, currentStep2, (Function2) rememberedValue2, startRestartGroup, 0);
        Boolean valueOf32 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed3 = startRestartGroup.changed(isOverlayVisible2) | startRestartGroup.changed(currentStep2 != null ? -1 : currentStep2.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i152 != 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new TourScreenKt$TourScreen$6$1(isOverlayVisible2, currentStep2, tourManager, tourState, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32, currentStep2, (Function2) rememberedValue3, startRestartGroup, 0);
        Boolean valueOf42 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed4 = startRestartGroup.changed(isOverlayVisible2) | startRestartGroup.changed(currentStep2 != null ? -1 : currentStep2.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i152 != 32);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = new TourScreenKt$TourScreen$7$1(isOverlayVisible2, currentStep2, tourManager, tourState, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf42, currentStep2, (Function2) rememberedValue4, startRestartGroup, 0);
        Boolean valueOf52 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed5 = startRestartGroup.changed(isOverlayVisible2) | startRestartGroup.changed(currentStep2 != null ? -1 : currentStep2.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i152 != 32);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        rememberedValue5 = new TourScreenKt$TourScreen$8$1(isOverlayVisible2, currentStep2, tourManager, tourState, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf52, currentStep2, (Function2) rememberedValue5, startRestartGroup, 0);
        Boolean valueOf62 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed6 = startRestartGroup.changed(isOverlayVisible2) | startRestartGroup.changed(currentStep2 != null ? -1 : currentStep2.ordinal()) | startRestartGroup.changedInstance(tourManager) | (i152 != 32);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed6) {
        }
        rememberedValue6 = new TourScreenKt$TourScreen$9$1(isOverlayVisible2, currentStep2, tourManager, tourState, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf62, currentStep2, (Function2) rememberedValue6, startRestartGroup, 0);
        Boolean valueOf72 = Boolean.valueOf(isOverlayVisible2);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed7 = startRestartGroup.changed(isOverlayVisible2) | startRestartGroup.changed(currentStep2 != null ? -1 : currentStep2.ordinal()) | (i152 != 32) | startRestartGroup.changedInstance(tourManager);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed7) {
        }
        rememberedValue7 = new TourScreenKt$TourScreen$10$1(isOverlayVisible2, currentStep2, tourState, tourManager, null);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf72, currentStep2, (Function2) rememberedValue7, startRestartGroup, 0);
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function0<Unit> function0142 = function07;
        Function0<Unit> function0152 = function06;
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
        shouldShowTourOverlay = HomeTourScroll.INSTANCE.shouldShowTourOverlay(isOverlayVisible2, currentStep2, tourState.isSportScrollComplete(), tourState.isLeagueScrollComplete(), tourState.isMatchScrollComplete(), tourState.isHomeScrollComplete(), tourState.isDemoWinRewardDialogBlockingHomeTour());
        startRestartGroup.startReplaceGroup(24406847);
        if (shouldShowTourOverlay) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function14 = function17;
        function09 = function05;
        function010 = function013;
        function15 = function18;
        function16 = function19;
        function011 = function0152;
        function012 = function08;
        modifier3 = modifier2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourScreen$lambda$17$lambda$14$lambda$13(TourManager tourManager) {
        tourManager.onStepComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourScreen$lambda$17$lambda$16$lambda$15(TourManager tourManager, Function0 function0) {
        tourManager.skipTour();
        function0.invoke();
        return Unit.INSTANCE;
    }
}
