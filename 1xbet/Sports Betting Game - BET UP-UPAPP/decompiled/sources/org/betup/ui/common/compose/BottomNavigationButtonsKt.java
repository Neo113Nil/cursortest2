package org.betup.ui.common.compose;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BottomNavigationButtons.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a·\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"BottomNavigationButtons", "", "modifier", "Landroidx/compose/ui/Modifier;", "onRankingBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onTvBetBoundsReported", "onMinigamesBoundsReported", "onTopMatchesBoundsReported", "onRankingClick", "Lkotlin/Function0;", "onTvBetClick", "onMinigamesClick", "onTopMatchesClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomNavigationButtonsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$31(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, int i2, Composer composer, int i3) {
        BottomNavigationButtons(modifier, function1, function12, function13, function14, function0, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$1$lambda$0() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.RANKINGS, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$3$lambda$2() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TVBET, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$5$lambda$4() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MINI_GAMES_HOME_ACTIVITY, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$7$lambda$6() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCHES, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomNavigationButtons(Modifier modifier, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Function1<? super Rect, Unit> function14, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Composer composer, final int i, final int i2) {
        int i3;
        final Function1<? super Rect, Unit> function15;
        int i4;
        Function1<? super Rect, Unit> function16;
        int i5;
        Function1<? super Rect, Unit> function17;
        int i6;
        Function1<? super Rect, Unit> function18;
        int i7;
        int i8;
        int i9;
        int i10;
        final Function1<? super Rect, Unit> function19;
        final Function1<? super Rect, Unit> function110;
        final Function0<Unit> function05;
        Function0<Unit> function06;
        final Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        int currentCompositeKeyHash;
        Modifier modifier2;
        Composer m4610constructorimpl;
        Function0<Unit> function010;
        boolean changedInstance;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Function1<? super Rect, Unit> function111;
        boolean changedInstance2;
        Object rememberedValue3;
        boolean z2;
        Object rememberedValue4;
        final Function0<Unit> function011;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean changedInstance3;
        Object rememberedValue5;
        boolean z3;
        Object rememberedValue6;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        boolean changedInstance4;
        Object rememberedValue7;
        final Function1<? super Rect, Unit> function112;
        boolean z4;
        Object rememberedValue8;
        final Function0<Unit> function012;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        final Function0<Unit> function013;
        final Function1<? super Rect, Unit> function113;
        final Function0<Unit> function014;
        final Function0<Unit> function015;
        final Function1<? super Rect, Unit> function114;
        final Function1<? super Rect, Unit> function115;
        final Function0<Unit> function016;
        final Function1<? super Rect, Unit> function116;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1332642978);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function15 = function1;
            i3 |= startRestartGroup.changedInstance(function15) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function16 = function12;
                i3 |= startRestartGroup.changedInstance(function16) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function17 = function13;
                    i3 |= startRestartGroup.changedInstance(function17) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function18 = function14;
                        i3 |= startRestartGroup.changedInstance(function18) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                        }
                        i10 = i2 & 256;
                        if (i10 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function04) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i11 != 0 ? Modifier.INSTANCE : modifier;
                            if (i12 != 0) {
                                function15 = null;
                            }
                            function19 = i4 != 0 ? null : function16;
                            function110 = i5 != 0 ? null : function17;
                            Function1<? super Rect, Unit> function117 = i6 != 0 ? null : function18;
                            if (i7 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue9 = startRestartGroup.rememberedValue();
                                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue9 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomNavigationButtons$lambda$1$lambda$0;
                                            BottomNavigationButtons$lambda$1$lambda$0 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$1$lambda$0();
                                            return BottomNavigationButtons$lambda$1$lambda$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                }
                                startRestartGroup.endReplaceGroup();
                                function05 = (Function0) rememberedValue9;
                            } else {
                                function05 = function0;
                            }
                            if (i8 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue10 = startRestartGroup.rememberedValue();
                                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue10 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomNavigationButtons$lambda$3$lambda$2;
                                            BottomNavigationButtons$lambda$3$lambda$2 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$3$lambda$2();
                                            return BottomNavigationButtons$lambda$3$lambda$2;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                }
                                startRestartGroup.endReplaceGroup();
                                function06 = (Function0) rememberedValue10;
                            } else {
                                function06 = function02;
                            }
                            if (i9 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue11 = startRestartGroup.rememberedValue();
                                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue11 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomNavigationButtons$lambda$5$lambda$4;
                                            BottomNavigationButtons$lambda$5$lambda$4 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$5$lambda$4();
                                            return BottomNavigationButtons$lambda$5$lambda$4;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                }
                                function07 = (Function0) rememberedValue11;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function07 = function03;
                            }
                            if (i10 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue12 = startRestartGroup.rememberedValue();
                                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue12 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit BottomNavigationButtons$lambda$7$lambda$6;
                                            BottomNavigationButtons$lambda$7$lambda$6 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$7$lambda$6();
                                            return BottomNavigationButtons$lambda$7$lambda$6;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                }
                                function08 = (Function0) rememberedValue12;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function08 = function04;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1332642978, i3, -1, "org.betup.ui.common.compose.BottomNavigationButtons (BottomNavigationButtons.kt:45)");
                            }
                            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localView);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final View view = (View) consume;
                            function09 = function06;
                            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                            Arrangement.Horizontal m1398spacedByD5KLDUw = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw, centerVertically, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            modifier2 = companion;
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
                            function010 = function08;
                            Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance = startRestartGroup.changedInstance(view) | ((i3 & 112) == 32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                                        BottomNavigationButtons$lambda$30$lambda$11$lambda$10 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$11$lambda$10(Function1.this, view, (LayoutCoordinates) obj);
                                        return BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default, (Function1) rememberedValue);
                            startRestartGroup.startReplaceGroup(5004770);
                            z = (458752 & i3) == 131072;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                                        BottomNavigationButtons$lambda$30$lambda$13$lambda$12 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$13$lambda$12(Function0.this);
                                        return BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            Function0<Unit> function017 = function05;
                            Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned, (Function0) rememberedValue2, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function1<? super Rect, Unit> function118 = function15;
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
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function111 = function117;
                            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getRankingDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier aspectRatio$default2 = AspectRatioKt.aspectRatio$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance2 = startRestartGroup.changedInstance(view) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                                        BottomNavigationButtons$lambda$30$lambda$16$lambda$15 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$16$lambda$15(Function1.this, view, (LayoutCoordinates) obj);
                                        return BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default2, (Function1) rememberedValue3);
                            startRestartGroup.startReplaceGroup(5004770);
                            z2 = (3670016 & i3) == 1048576;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                function011 = function09;
                                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                                        BottomNavigationButtons$lambda$30$lambda$18$lambda$17 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$18$lambda$17(Function0.this);
                                        return BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else {
                                function011 = function09;
                            }
                            startRestartGroup.endReplaceGroup();
                            Function0<Unit> function018 = function011;
                            Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned2, (Function0) rememberedValue4, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
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
                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Function1<? super Rect, Unit> function119 = function19;
                            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTvBetDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier aspectRatio$default3 = AspectRatioKt.aspectRatio$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance3 = startRestartGroup.changedInstance(view) | ((i3 & 7168) == 2048);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                                        BottomNavigationButtons$lambda$30$lambda$21$lambda$20 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$21$lambda$20(Function1.this, view, (LayoutCoordinates) obj);
                                        return BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default3, (Function1) rememberedValue5);
                            startRestartGroup.startReplaceGroup(5004770);
                            z3 = (29360128 & i3) == 8388608;
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!z3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                                        BottomNavigationButtons$lambda$30$lambda$23$lambda$22 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$23$lambda$22(Function0.this);
                                        return BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier clickAnimation3 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned3, (Function0) rememberedValue6, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation3);
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
                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getMinigamesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier aspectRatio$default4 = AspectRatioKt.aspectRatio$default(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance4 = startRestartGroup.changedInstance(view) | ((57344 & i3) == 16384);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changedInstance4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                function112 = function111;
                                rememberedValue7 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                                        BottomNavigationButtons$lambda$30$lambda$26$lambda$25 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$26$lambda$25(Function1.this, view, (LayoutCoordinates) obj);
                                        return BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            } else {
                                function112 = function111;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier onGloballyPositioned4 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default4, (Function1) rememberedValue7);
                            startRestartGroup.startReplaceGroup(5004770);
                            z4 = (234881024 & i3) == 67108864;
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                function012 = function010;
                                rememberedValue8 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                                        BottomNavigationButtons$lambda$30$lambda$28$lambda$27 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$28$lambda$27(Function0.this);
                                        return BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            } else {
                                function012 = function010;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier clickAnimation4 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned4, (Function0) rememberedValue8, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation4);
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
                            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTopMatchesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
                            function013 = function07;
                            function113 = function110;
                            function014 = function018;
                            function015 = function017;
                            function114 = function118;
                            function115 = function119;
                            Function1<? super Rect, Unit> function120 = function112;
                            function016 = function012;
                            function116 = function120;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function015 = function0;
                            function014 = function02;
                            function016 = function04;
                            function114 = function15;
                            function116 = function18;
                            function115 = function16;
                            function113 = function17;
                            function013 = function03;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomNavigationButtons$lambda$31;
                                    BottomNavigationButtons$lambda$31 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$31(Modifier.this, function114, function115, function113, function116, function015, function014, function013, function016, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomNavigationButtons$lambda$31;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function18 = function14;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
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
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localView2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final View view2 = (View) consume2;
                    function09 = function06;
                    Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                    Arrangement.Horizontal m1398spacedByD5KLDUw2 = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw2, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2);
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    modifier2 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    function010 = function08;
                    Modifier aspectRatio$default5 = AspectRatioKt.aspectRatio$default(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = startRestartGroup.changedInstance(view2) | ((i3 & 112) == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                            BottomNavigationButtons$lambda$30$lambda$11$lambda$10 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$11$lambda$10(Function1.this, view2, (LayoutCoordinates) obj);
                            return BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned5 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default5, (Function1) rememberedValue);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((458752 & i3) == 131072) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                            BottomNavigationButtons$lambda$30$lambda$13$lambda$12 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$13$lambda$12(Function0.this);
                            return BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    Function0<Unit> function0172 = function05;
                    Modifier clickAnimation5 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned5, (Function0) rememberedValue2, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation5);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Function1<? super Rect, Unit> function1182 = function15;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    function111 = function117;
                    ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getRankingDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier aspectRatio$default22 = AspectRatioKt.aspectRatio$default(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance2 = startRestartGroup.changedInstance(view2) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                            BottomNavigationButtons$lambda$30$lambda$16$lambda$15 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$16$lambda$15(Function1.this, view2, (LayoutCoordinates) obj);
                            return BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default22, (Function1) rememberedValue3);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((3670016 & i3) == 1048576) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z2) {
                    }
                    function011 = function09;
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                            BottomNavigationButtons$lambda$30$lambda$18$lambda$17 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$18$lambda$17(Function0.this);
                            return BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    Function0<Unit> function0182 = function011;
                    Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned22, (Function0) rememberedValue4, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    Function1<? super Rect, Unit> function1192 = function19;
                    ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTvBetDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier aspectRatio$default32 = AspectRatioKt.aspectRatio$default(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance3 = startRestartGroup.changedInstance(view2) | ((i3 & 7168) == 2048);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                            BottomNavigationButtons$lambda$30$lambda$21$lambda$20 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$21$lambda$20(Function1.this, view2, (LayoutCoordinates) obj);
                            return BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default32, (Function1) rememberedValue5);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((29360128 & i3) == 8388608) {
                    }
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                            BottomNavigationButtons$lambda$30$lambda$23$lambda$22 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$23$lambda$22(Function0.this);
                            return BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceGroup();
                    Modifier clickAnimation32 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned32, (Function0) rememberedValue6, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation32);
                    Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting()) {
                    }
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getMinigamesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier aspectRatio$default42 = AspectRatioKt.aspectRatio$default(rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance4 = startRestartGroup.changedInstance(view2) | ((57344 & i3) == 16384);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance4) {
                    }
                    function112 = function111;
                    rememberedValue7 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                            BottomNavigationButtons$lambda$30$lambda$26$lambda$25 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$26$lambda$25(Function1.this, view2, (LayoutCoordinates) obj);
                            return BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    startRestartGroup.endReplaceGroup();
                    Modifier onGloballyPositioned42 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default42, (Function1) rememberedValue7);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((234881024 & i3) == 67108864) {
                    }
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (z4) {
                    }
                    function012 = function010;
                    rememberedValue8 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                            BottomNavigationButtons$lambda$30$lambda$28$lambda$27 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$28$lambda$27(Function0.this);
                            return BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    startRestartGroup.endReplaceGroup();
                    Modifier clickAnimation42 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned42, (Function0) rememberedValue8, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation42);
                    Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl5.getInserting()) {
                    }
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTopMatchesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
                    function013 = function07;
                    function113 = function110;
                    function014 = function0182;
                    function015 = function0172;
                    function114 = function1182;
                    function115 = function1192;
                    Function1<? super Rect, Unit> function1202 = function112;
                    function016 = function012;
                    function116 = function1202;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function17 = function13;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function18 = function14;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
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
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localView22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final View view22 = (View) consume22;
                function09 = function06;
                Modifier wrapContentHeight$default22 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
                Arrangement.Horizontal m1398spacedByD5KLDUw22 = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw22, centerVertically22, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default22);
                Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                modifier2 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                function010 = function08;
                Modifier aspectRatio$default52 = AspectRatioKt.aspectRatio$default(rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(view22) | ((i3 & 112) == 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                        BottomNavigationButtons$lambda$30$lambda$11$lambda$10 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$11$lambda$10(Function1.this, view22, (LayoutCoordinates) obj);
                        return BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned52 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default52, (Function1) rememberedValue);
                startRestartGroup.startReplaceGroup(5004770);
                if ((458752 & i3) == 131072) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                        BottomNavigationButtons$lambda$30$lambda$13$lambda$12 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$13$lambda$12(Function0.this);
                        return BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                Function0<Unit> function01722 = function05;
                Modifier clickAnimation52 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned52, (Function0) rememberedValue2, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy52 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation52);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Function1<? super Rect, Unit> function11822 = function15;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance52 = BoxScopeInstance.INSTANCE;
                function111 = function117;
                ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getRankingDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier aspectRatio$default222 = AspectRatioKt.aspectRatio$default(rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance2 = startRestartGroup.changedInstance(view22) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                        BottomNavigationButtons$lambda$30$lambda$16$lambda$15 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$16$lambda$15(Function1.this, view22, (LayoutCoordinates) obj);
                        return BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default222, (Function1) rememberedValue3);
                startRestartGroup.startReplaceGroup(5004770);
                if ((3670016 & i3) == 1048576) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (z2) {
                }
                function011 = function09;
                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                        BottomNavigationButtons$lambda$30$lambda$18$lambda$17 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$18$lambda$17(Function0.this);
                        return BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                Function0<Unit> function01822 = function011;
                Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned222, (Function0) rememberedValue4, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Function1<? super Rect, Unit> function11922 = function19;
                ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTvBetDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier aspectRatio$default322 = AspectRatioKt.aspectRatio$default(rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance3 = startRestartGroup.changedInstance(view22) | ((i3 & 7168) == 2048);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                        BottomNavigationButtons$lambda$30$lambda$21$lambda$20 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$21$lambda$20(Function1.this, view22, (LayoutCoordinates) obj);
                        return BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default322, (Function1) rememberedValue5);
                startRestartGroup.startReplaceGroup(5004770);
                if ((29360128 & i3) == 8388608) {
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                        BottomNavigationButtons$lambda$30$lambda$23$lambda$22 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$23$lambda$22(Function0.this);
                        return BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceGroup();
                Modifier clickAnimation322 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned322, (Function0) rememberedValue6, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation322);
                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getMinigamesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier aspectRatio$default422 = AspectRatioKt.aspectRatio$default(rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance4 = startRestartGroup.changedInstance(view22) | ((57344 & i3) == 16384);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance4) {
                }
                function112 = function111;
                rememberedValue7 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                        BottomNavigationButtons$lambda$30$lambda$26$lambda$25 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$26$lambda$25(Function1.this, view22, (LayoutCoordinates) obj);
                        return BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
                startRestartGroup.endReplaceGroup();
                Modifier onGloballyPositioned422 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default422, (Function1) rememberedValue7);
                startRestartGroup.startReplaceGroup(5004770);
                if ((234881024 & i3) == 67108864) {
                }
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (z4) {
                }
                function012 = function010;
                rememberedValue8 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                        BottomNavigationButtons$lambda$30$lambda$28$lambda$27 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$28$lambda$27(Function0.this);
                        return BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceGroup();
                Modifier clickAnimation422 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned422, (Function0) rememberedValue8, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation422);
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting()) {
                }
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTopMatchesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
                function013 = function07;
                function113 = function110;
                function014 = function01822;
                function015 = function01722;
                function114 = function11822;
                function115 = function11922;
                Function1<? super Rect, Unit> function12022 = function112;
                function016 = function012;
                function116 = function12022;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function16 = function12;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function17 = function13;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function18 = function14;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
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
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<View> localView222 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localView222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final View view222 = (View) consume222;
            function09 = function06;
            Modifier wrapContentHeight$default222 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            Arrangement.Horizontal m1398spacedByD5KLDUw222 = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw222, centerVertically222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default222);
            Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
            modifier2 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            function010 = function08;
            Modifier aspectRatio$default522 = AspectRatioKt.aspectRatio$default(rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(view222) | ((i3 & 112) == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                    BottomNavigationButtons$lambda$30$lambda$11$lambda$10 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$11$lambda$10(Function1.this, view222, (LayoutCoordinates) obj);
                    return BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned522 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default522, (Function1) rememberedValue);
            startRestartGroup.startReplaceGroup(5004770);
            if ((458752 & i3) == 131072) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                    BottomNavigationButtons$lambda$30$lambda$13$lambda$12 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$13$lambda$12(Function0.this);
                    return BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            Function0<Unit> function017222 = function05;
            Modifier clickAnimation522 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned522, (Function0) rememberedValue2, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy522 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation522);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Function1<? super Rect, Unit> function118222 = function15;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance522 = BoxScopeInstance.INSTANCE;
            function111 = function117;
            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getRankingDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier aspectRatio$default2222 = AspectRatioKt.aspectRatio$default(rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance2 = startRestartGroup.changedInstance(view222) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                    BottomNavigationButtons$lambda$30$lambda$16$lambda$15 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$16$lambda$15(Function1.this, view222, (LayoutCoordinates) obj);
                    return BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default2222, (Function1) rememberedValue3);
            startRestartGroup.startReplaceGroup(5004770);
            if ((3670016 & i3) == 1048576) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (z2) {
            }
            function011 = function09;
            rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                    BottomNavigationButtons$lambda$30$lambda$18$lambda$17 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$18$lambda$17(Function0.this);
                    return BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            Function0<Unit> function018222 = function011;
            Modifier clickAnimation2222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned2222, (Function0) rememberedValue4, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Function1<? super Rect, Unit> function119222 = function19;
            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTvBetDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier aspectRatio$default3222 = AspectRatioKt.aspectRatio$default(rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance3 = startRestartGroup.changedInstance(view222) | ((i3 & 7168) == 2048);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                    BottomNavigationButtons$lambda$30$lambda$21$lambda$20 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$21$lambda$20(Function1.this, view222, (LayoutCoordinates) obj);
                    return BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default3222, (Function1) rememberedValue5);
            startRestartGroup.startReplaceGroup(5004770);
            if ((29360128 & i3) == 8388608) {
            }
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                    BottomNavigationButtons$lambda$30$lambda$23$lambda$22 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$23$lambda$22(Function0.this);
                    return BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            Modifier clickAnimation3222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned3222, (Function0) rememberedValue6, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation3222);
            Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getMinigamesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier aspectRatio$default4222 = AspectRatioKt.aspectRatio$default(rowScopeInstance222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance4 = startRestartGroup.changedInstance(view222) | ((57344 & i3) == 16384);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance4) {
            }
            function112 = function111;
            rememberedValue7 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                    BottomNavigationButtons$lambda$30$lambda$26$lambda$25 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$26$lambda$25(Function1.this, view222, (LayoutCoordinates) obj);
                    return BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            Modifier onGloballyPositioned4222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default4222, (Function1) rememberedValue7);
            startRestartGroup.startReplaceGroup(5004770);
            if ((234881024 & i3) == 67108864) {
            }
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (z4) {
            }
            function012 = function010;
            rememberedValue8 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                    BottomNavigationButtons$lambda$30$lambda$28$lambda$27 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$28$lambda$27(Function0.this);
                    return BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceGroup();
            Modifier clickAnimation4222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned4222, (Function0) rememberedValue8, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy4222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation4222);
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5222);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4222 = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTopMatchesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
            function013 = function07;
            function113 = function110;
            function014 = function018222;
            function015 = function017222;
            function114 = function118222;
            function115 = function119222;
            Function1<? super Rect, Unit> function120222 = function112;
            function016 = function012;
            function116 = function120222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function15 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function16 = function12;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function17 = function13;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function18 = function14;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
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
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<View> localView2222 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localView2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view2222 = (View) consume2222;
        function09 = function06;
        Modifier wrapContentHeight$default2222 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
        Arrangement.Horizontal m1398spacedByD5KLDUw2222 = Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(m1398spacedByD5KLDUw2222, centerVertically2222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2222);
        Function0<ComposeUiNode> constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
        modifier2 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        function010 = function08;
        Modifier aspectRatio$default5222 = AspectRatioKt.aspectRatio$default(rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(view2222) | ((i3 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
                BottomNavigationButtons$lambda$30$lambda$11$lambda$10 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$11$lambda$10(Function1.this, view2222, (LayoutCoordinates) obj);
                return BottomNavigationButtons$lambda$30$lambda$11$lambda$10;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned5222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default5222, (Function1) rememberedValue);
        startRestartGroup.startReplaceGroup(5004770);
        if ((458752 & i3) == 131072) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
                BottomNavigationButtons$lambda$30$lambda$13$lambda$12 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$13$lambda$12(Function0.this);
                return BottomNavigationButtons$lambda$30$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        Function0<Unit> function0172222 = function05;
        Modifier clickAnimation5222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned5222, (Function0) rememberedValue2, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy5222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation5222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Function1<? super Rect, Unit> function1182222 = function15;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy5222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance5222 = BoxScopeInstance.INSTANCE;
        function111 = function117;
        ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getRankingDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier aspectRatio$default22222 = AspectRatioKt.aspectRatio$default(rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance2 = startRestartGroup.changedInstance(view2222) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
                BottomNavigationButtons$lambda$30$lambda$16$lambda$15 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$16$lambda$15(Function1.this, view2222, (LayoutCoordinates) obj);
                return BottomNavigationButtons$lambda$30$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default22222, (Function1) rememberedValue3);
        startRestartGroup.startReplaceGroup(5004770);
        if ((3670016 & i3) == 1048576) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (z2) {
        }
        function011 = function09;
        rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
                BottomNavigationButtons$lambda$30$lambda$18$lambda$17 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$18$lambda$17(Function0.this);
                return BottomNavigationButtons$lambda$30$lambda$18$lambda$17;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        Function0<Unit> function0182222 = function011;
        Modifier clickAnimation22222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned22222, (Function0) rememberedValue4, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Function1<? super Rect, Unit> function1192222 = function19;
        ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTvBetDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier aspectRatio$default32222 = AspectRatioKt.aspectRatio$default(rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance3 = startRestartGroup.changedInstance(view2222) | ((i3 & 7168) == 2048);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
                BottomNavigationButtons$lambda$30$lambda$21$lambda$20 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$21$lambda$20(Function1.this, view2222, (LayoutCoordinates) obj);
                return BottomNavigationButtons$lambda$30$lambda$21$lambda$20;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned32222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default32222, (Function1) rememberedValue5);
        startRestartGroup.startReplaceGroup(5004770);
        if ((29360128 & i3) == 8388608) {
        }
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
                BottomNavigationButtons$lambda$30$lambda$23$lambda$22 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$23$lambda$22(Function0.this);
                return BottomNavigationButtons$lambda$30$lambda$23$lambda$22;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        Modifier clickAnimation32222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned32222, (Function0) rememberedValue6, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation32222);
        Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getMinigamesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier aspectRatio$default42222 = AspectRatioKt.aspectRatio$default(rowScopeInstance2222.weight(Modifier.INSTANCE, 1.0f, false), 1.2333333f, false, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance4 = startRestartGroup.changedInstance(view2222) | ((57344 & i3) == 16384);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (changedInstance4) {
        }
        function112 = function111;
        rememberedValue7 = new Function1() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
                BottomNavigationButtons$lambda$30$lambda$26$lambda$25 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$26$lambda$25(Function1.this, view2222, (LayoutCoordinates) obj);
                return BottomNavigationButtons$lambda$30$lambda$26$lambda$25;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        Modifier onGloballyPositioned42222 = OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default42222, (Function1) rememberedValue7);
        startRestartGroup.startReplaceGroup(5004770);
        if ((234881024 & i3) == 67108864) {
        }
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (z4) {
        }
        function012 = function010;
        rememberedValue8 = new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
                BottomNavigationButtons$lambda$30$lambda$28$lambda$27 = BottomNavigationButtonsKt.BottomNavigationButtons$lambda$30$lambda$28$lambda$27(Function0.this);
                return BottomNavigationButtons$lambda$30$lambda$28$lambda$27;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        Modifier clickAnimation42222 = ClickAnimationModifierKt.clickAnimation(onGloballyPositioned42222, (Function0) rememberedValue8, null, false, null, 500, 0, 0, 0.9f, 1.2f, false, false, null, startRestartGroup, 906166272, 0, 3694);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy42222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation42222);
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy42222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52222);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance42222 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(NavigationImageHelper.INSTANCE.getTopMatchesDrawable(), startRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 25008, 104);
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
        function013 = function07;
        function113 = function110;
        function014 = function0182222;
        function015 = function0172222;
        function114 = function1182222;
        function115 = function1192222;
        Function1<? super Rect, Unit> function1202222 = function112;
        function016 = function012;
        function116 = function1202222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void BottomNavigationButtons$reportBounds(View view, final Function1<? super Rect, Unit> function1, LayoutCoordinates layoutCoordinates) {
        if (function1 != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            int intBitsToFloat = iArr[0] + ((int) Float.intBitsToFloat((int) (positionInRoot >> 32)));
            int intBitsToFloat2 = iArr[1] + ((int) Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
            final Rect rect = new Rect(intBitsToFloat, intBitsToFloat2, ((int) (layoutCoordinates.mo6536getSizeYbymL2g() >> 32)) + intBitsToFloat, ((int) (layoutCoordinates.mo6536getSizeYbymL2g() & 4294967295L)) + intBitsToFloat2);
            ComposeLayoutIdleKt.postWhenComposeLayoutIdle(view, new Function0() { // from class: org.betup.ui.common.compose.BottomNavigationButtonsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BottomNavigationButtons$reportBounds$lambda$9$lambda$8;
                    BottomNavigationButtons$reportBounds$lambda$9$lambda$8 = BottomNavigationButtonsKt.BottomNavigationButtons$reportBounds$lambda$9$lambda$8(Function1.this, rect);
                    return BottomNavigationButtons$reportBounds$lambda$9$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$reportBounds$lambda$9$lambda$8(Function1 function1, Rect rect) {
        function1.invoke(rect);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$11$lambda$10(Function1 function1, View view, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BottomNavigationButtons$reportBounds(view, function1, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$13$lambda$12(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$16$lambda$15(Function1 function1, View view, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BottomNavigationButtons$reportBounds(view, function1, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$18$lambda$17(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$21$lambda$20(Function1 function1, View view, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BottomNavigationButtons$reportBounds(view, function1, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$23$lambda$22(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$26$lambda$25(Function1 function1, View view, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BottomNavigationButtons$reportBounds(view, function1, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationButtons$lambda$30$lambda$28$lambda$27(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
