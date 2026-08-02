package org.betup.ui.common.compose;

import android.graphics.Rect;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.services.offer.VideoRewardService;

/* compiled from: HomeNavigationSection.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008f\u0003\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dH\u0007¢\u0006\u0002\u0010$¨\u0006%"}, d2 = {"HomeNavigationSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "showDailyButtonInTopRow", "", "showFlashBetInTopRow", "dailyActive", "bonusOfferActive", "adsActive", "adsAmount", "", "adsQuotaLabel", "", "adsTimerText", "adsLoading", "onAdsClick", "Lkotlin/Function0;", "onDailyClick", "onBonusOfferClick", "onBattlesClick", "onCompetitionsClick", "onRankingClick", "onTvBetClick", "onMinigamesClick", "onTopMatchesClick", "onBattlesBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onCompetitionsBoundsReported", "onRankingBoundsReported", "onTvBetBoundsReported", "onMinigamesBoundsReported", "onTopMatchesBoundsReported", "(Landroidx/compose/ui/Modifier;Lorg/betup/services/offer/VideoRewardService;ZZZZZJLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeNavigationSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeNavigationSection$lambda$3(Modifier modifier, VideoRewardService videoRewardService, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, String str, String str2, boolean z6, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, int i2, int i3, int i4, Composer composer, int i5) {
        HomeNavigationSection(modifier, videoRewardService, z, z2, z3, z4, z5, j, str, str2, z6, function0, function02, function03, function04, function05, function06, function07, function08, function09, function1, function12, function13, function14, function15, function16, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeNavigationSection(Modifier modifier, final VideoRewardService videoRewardService, boolean z, boolean z2, final boolean z3, final boolean z4, final boolean z5, long j, String str, String str2, boolean z6, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, final Function0<Unit> onBattlesClick, final Function0<Unit> onCompetitionsClick, final Function0<Unit> onRankingClick, final Function0<Unit> onTvBetClick, final Function0<Unit> onMinigamesClick, final Function0<Unit> onTopMatchesClick, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Function1<? super Rect, Unit> function14, Function1<? super Rect, Unit> function15, Function1<? super Rect, Unit> function16, Composer composer, final int i, final int i2, final int i3, final int i4) {
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
        Function1<? super Rect, Unit> function17;
        int i25;
        int i26;
        Function0<Unit> function04;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final boolean z7;
        final boolean z8;
        final long j2;
        final String str3;
        final String str4;
        final boolean z9;
        final Function0<Unit> function05;
        final Function1<? super Rect, Unit> function18;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        final Function1<? super Rect, Unit> function19;
        final Function1<? super Rect, Unit> function110;
        final Function1<? super Rect, Unit> function111;
        final Modifier modifier2;
        final Function1<? super Rect, Unit> function112;
        final Function1<? super Rect, Unit> function113;
        ScopeUpdateScope endRestartGroup;
        int i27;
        int i28;
        int i29;
        Intrinsics.checkNotNullParameter(videoRewardService, "videoRewardService");
        Intrinsics.checkNotNullParameter(onBattlesClick, "onBattlesClick");
        Intrinsics.checkNotNullParameter(onCompetitionsClick, "onCompetitionsClick");
        Intrinsics.checkNotNullParameter(onRankingClick, "onRankingClick");
        Intrinsics.checkNotNullParameter(onTvBetClick, "onTvBetClick");
        Intrinsics.checkNotNullParameter(onMinigamesClick, "onMinigamesClick");
        Intrinsics.checkNotNullParameter(onTopMatchesClick, "onTopMatchesClick");
        Composer startRestartGroup = composer.startRestartGroup(287776747);
        int i30 = i4 & 1;
        if (i30 != 0) {
            i5 = i | 6;
        } else if ((i & 6) == 0) {
            i5 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(videoRewardService) ? 32 : 16;
        }
        int i31 = i5;
        int i32 = i4 & 4;
        if (i32 != 0) {
            i31 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i31 |= startRestartGroup.changed(z) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i31 |= 3072;
            } else if ((i & 3072) == 0) {
                i31 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i4 & 16) != 0) {
                    i31 |= 24576;
                } else if ((i & 24576) == 0) {
                    i31 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((i4 & 32) == 0) {
                        i31 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i31 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i31 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i31 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                    }
                    i7 = i4 & 128;
                    if (i7 == 0) {
                        i31 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i8 = i30;
                        i9 = i7;
                        i31 |= startRestartGroup.changed(j) ? 8388608 : 4194304;
                        i10 = i4 & 256;
                        if (i10 != 0) {
                            i31 |= 100663296;
                        } else if ((100663296 & i) == 0) {
                            i31 |= startRestartGroup.changed(str) ? 67108864 : 33554432;
                            i11 = i4 & 512;
                            if (i11 == 0) {
                                i31 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i31 |= startRestartGroup.changed(str2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            }
                            i12 = i4 & 1024;
                            if (i12 == 0) {
                                i13 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i13 = i2 | (startRestartGroup.changed(z6) ? 4 : 2);
                            } else {
                                i13 = i2;
                            }
                            i14 = i4 & 2048;
                            if (i14 == 0) {
                                i13 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i13 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                            }
                            int i33 = i13;
                            i15 = i4 & 4096;
                            if (i15 == 0) {
                                i33 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                i16 = i15;
                            } else {
                                i16 = i15;
                                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i33 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                                    i17 = i4 & 8192;
                                    if (i17 != 0) {
                                        i33 |= 3072;
                                        i18 = i17;
                                    } else {
                                        i18 = i17;
                                        if ((i2 & 3072) == 0) {
                                            i33 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                                            if ((i4 & 16384) == 0) {
                                                i33 |= 24576;
                                            } else if ((i2 & 24576) == 0) {
                                                i33 |= startRestartGroup.changedInstance(onBattlesClick) ? 16384 : 8192;
                                            }
                                            if ((32768 & i4) == 0) {
                                                i33 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i33 |= startRestartGroup.changedInstance(onCompetitionsClick) ? 131072 : 65536;
                                            }
                                            if ((i4 & 65536) == 0) {
                                                i33 |= 1572864;
                                            } else if ((i2 & 1572864) == 0) {
                                                i33 |= startRestartGroup.changedInstance(onRankingClick) ? 1048576 : 524288;
                                            }
                                            if ((i4 & 131072) != 0) {
                                                i29 = (12582912 & i2) == 0 ? startRestartGroup.changedInstance(onTvBetClick) ? 8388608 : 4194304 : 12582912;
                                                if ((262144 & i4) == 0) {
                                                    i28 = (100663296 & i2) == 0 ? startRestartGroup.changedInstance(onMinigamesClick) ? 67108864 : 33554432 : 100663296;
                                                    if ((524288 & i4) != 0) {
                                                        i27 = (805306368 & i2) == 0 ? startRestartGroup.changedInstance(onTopMatchesClick) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456 : 805306368;
                                                        i19 = 1048576 & i4;
                                                        if (i19 != 0) {
                                                            i20 = i3 | 6;
                                                        } else if ((i3 & 6) == 0) {
                                                            i20 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                                                        } else {
                                                            i20 = i3;
                                                        }
                                                        i21 = i4 & 2097152;
                                                        if (i21 != 0) {
                                                            i20 |= 48;
                                                        } else if ((i3 & 48) == 0) {
                                                            i20 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                                                        }
                                                        int i34 = i20;
                                                        i22 = i4 & 4194304;
                                                        if (i22 != 0) {
                                                            i34 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                                        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                                            i34 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                                                            i23 = i4 & 8388608;
                                                            if (i23 == 0) {
                                                                i34 |= 3072;
                                                            } else if ((i3 & 3072) == 0) {
                                                                i34 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                                                                i24 = i4 & 16777216;
                                                                if (i24 != 0) {
                                                                    i34 |= 24576;
                                                                } else if ((i3 & 24576) == 0) {
                                                                    function17 = function15;
                                                                    i34 |= startRestartGroup.changedInstance(function17) ? 16384 : 8192;
                                                                    i25 = i4 & 33554432;
                                                                    if (i25 == 0) {
                                                                        i34 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                                                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                                        i34 |= startRestartGroup.changedInstance(function16) ? 131072 : 65536;
                                                                    }
                                                                    i26 = i34;
                                                                    if ((306783379 & i31) == 306783378 || (306783379 & i33) != 306783378 || (i26 & 74899) != 74898 || !startRestartGroup.getSkipping()) {
                                                                        Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                                        boolean z10 = i32 == 0 ? false : z;
                                                                        boolean z11 = i6 == 0 ? false : z2;
                                                                        long j3 = i9 == 0 ? 0L : j;
                                                                        String str5 = i10 == 0 ? null : str;
                                                                        String str6 = i11 == 0 ? null : str2;
                                                                        boolean z12 = i12 == 0 ? false : z6;
                                                                        if (i14 == 0) {
                                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                                rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.HomeNavigationSectionKt$$ExternalSyntheticLambda0
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    public final Object invoke() {
                                                                                        Unit unit;
                                                                                        unit = Unit.INSTANCE;
                                                                                        return unit;
                                                                                    }
                                                                                };
                                                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                                            }
                                                                            startRestartGroup.endReplaceGroup();
                                                                            function04 = (Function0) rememberedValue;
                                                                        } else {
                                                                            function04 = function0;
                                                                        }
                                                                        Function0<Unit> function08 = i16 == 0 ? null : function02;
                                                                        Function0<Unit> function09 = i18 == 0 ? null : function03;
                                                                        Function1<? super Rect, Unit> function114 = i19 == 0 ? null : function1;
                                                                        Function1<? super Rect, Unit> function115 = i21 == 0 ? null : function12;
                                                                        Function1<? super Rect, Unit> function116 = i22 == 0 ? null : function13;
                                                                        Function1<? super Rect, Unit> function117 = i23 == 0 ? null : function14;
                                                                        Function1<? super Rect, Unit> function118 = i24 == 0 ? null : function17;
                                                                        Function1<? super Rect, Unit> function119 = i25 == 0 ? null : function16;
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(287776747, i31, i33, "org.betup.ui.common.compose.HomeNavigationSection (HomeNavigationSection.kt:47)");
                                                                        }
                                                                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                                                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
                                                                        composer2 = startRestartGroup;
                                                                        Modifier modifier4 = modifier3;
                                                                        int i35 = i33;
                                                                        TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                                                        int i36 = i35 >> 9;
                                                                        int i37 = i26 << 9;
                                                                        OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i36 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i36 & 112) | 6 | (i37 & 7168) | (i37 & 57344), 0);
                                                                        int i38 = i26 >> 3;
                                                                        int i39 = i35 >> 3;
                                                                        BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i38 & 57344) | (i38 & 112) | 6 | (i38 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i38 & 7168) | (458752 & i39) | (3670016 & i39) | (29360128 & i39) | (i39 & 234881024), 0);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                        composer2.endNode();
                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                        z7 = z11;
                                                                        z8 = z10;
                                                                        j2 = j3;
                                                                        str3 = str5;
                                                                        str4 = str6;
                                                                        z9 = z12;
                                                                        function05 = function04;
                                                                        function18 = function115;
                                                                        function06 = function08;
                                                                        function07 = function09;
                                                                        function19 = function114;
                                                                        function110 = function116;
                                                                        function111 = function117;
                                                                        modifier2 = modifier4;
                                                                        function112 = function118;
                                                                        function113 = function119;
                                                                    } else {
                                                                        startRestartGroup.skipToGroupEnd();
                                                                        modifier2 = modifier;
                                                                        z8 = z;
                                                                        str3 = str;
                                                                        str4 = str2;
                                                                        z9 = z6;
                                                                        function05 = function0;
                                                                        function06 = function02;
                                                                        function07 = function03;
                                                                        function19 = function1;
                                                                        function18 = function12;
                                                                        function110 = function13;
                                                                        function111 = function14;
                                                                        function113 = function16;
                                                                        composer2 = startRestartGroup;
                                                                        function112 = function17;
                                                                        z7 = z2;
                                                                        j2 = j;
                                                                    }
                                                                    endRestartGroup = composer2.endRestartGroup();
                                                                    if (endRestartGroup == null) {
                                                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.HomeNavigationSectionKt$$ExternalSyntheticLambda1
                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(Object obj, Object obj2) {
                                                                                Unit HomeNavigationSection$lambda$3;
                                                                                HomeNavigationSection$lambda$3 = HomeNavigationSectionKt.HomeNavigationSection$lambda$3(Modifier.this, videoRewardService, z8, z7, z3, z4, z5, j2, str3, str4, z9, function05, function06, function07, onBattlesClick, onCompetitionsClick, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, function19, function18, function110, function111, function112, function113, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                                                return HomeNavigationSection$lambda$3;
                                                                            }
                                                                        });
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                function17 = function15;
                                                                i25 = i4 & 33554432;
                                                                if (i25 == 0) {
                                                                }
                                                                i26 = i34;
                                                                if ((306783379 & i31) == 306783378) {
                                                                }
                                                                if (i8 == 0) {
                                                                }
                                                                if (i32 == 0) {
                                                                }
                                                                if (i6 == 0) {
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
                                                                if (i16 == 0) {
                                                                }
                                                                if (i18 == 0) {
                                                                }
                                                                if (i19 == 0) {
                                                                }
                                                                if (i21 == 0) {
                                                                }
                                                                if (i22 == 0) {
                                                                }
                                                                if (i23 == 0) {
                                                                }
                                                                if (i24 == 0) {
                                                                }
                                                                if (i25 == 0) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
                                                                composer2 = startRestartGroup;
                                                                Modifier modifier42 = modifier3;
                                                                int i352 = i33;
                                                                TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                                                int i362 = i352 >> 9;
                                                                int i372 = i26 << 9;
                                                                OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i362 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i362 & 112) | 6 | (i372 & 7168) | (i372 & 57344), 0);
                                                                int i382 = i26 >> 3;
                                                                int i392 = i352 >> 3;
                                                                BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i382 & 57344) | (i382 & 112) | 6 | (i382 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i382 & 7168) | (458752 & i392) | (3670016 & i392) | (29360128 & i392) | (i392 & 234881024), 0);
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                composer2.endNode();
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                z7 = z11;
                                                                z8 = z10;
                                                                j2 = j3;
                                                                str3 = str5;
                                                                str4 = str6;
                                                                z9 = z12;
                                                                function05 = function04;
                                                                function18 = function115;
                                                                function06 = function08;
                                                                function07 = function09;
                                                                function19 = function114;
                                                                function110 = function116;
                                                                function111 = function117;
                                                                modifier2 = modifier42;
                                                                function112 = function118;
                                                                function113 = function119;
                                                                endRestartGroup = composer2.endRestartGroup();
                                                                if (endRestartGroup == null) {
                                                                }
                                                            }
                                                            i24 = i4 & 16777216;
                                                            if (i24 != 0) {
                                                            }
                                                            function17 = function15;
                                                            i25 = i4 & 33554432;
                                                            if (i25 == 0) {
                                                            }
                                                            i26 = i34;
                                                            if ((306783379 & i31) == 306783378) {
                                                            }
                                                            if (i8 == 0) {
                                                            }
                                                            if (i32 == 0) {
                                                            }
                                                            if (i6 == 0) {
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
                                                            if (i16 == 0) {
                                                            }
                                                            if (i18 == 0) {
                                                            }
                                                            if (i19 == 0) {
                                                            }
                                                            if (i21 == 0) {
                                                            }
                                                            if (i22 == 0) {
                                                            }
                                                            if (i23 == 0) {
                                                            }
                                                            if (i24 == 0) {
                                                            }
                                                            if (i25 == 0) {
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
                                                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            }
                                                            startRestartGroup.startReusableNode();
                                                            if (!startRestartGroup.getInserting()) {
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
                                                            composer2 = startRestartGroup;
                                                            Modifier modifier422 = modifier3;
                                                            int i3522 = i33;
                                                            TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                                            int i3622 = i3522 >> 9;
                                                            int i3722 = i26 << 9;
                                                            OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i3622 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3622 & 112) | 6 | (i3722 & 7168) | (i3722 & 57344), 0);
                                                            int i3822 = i26 >> 3;
                                                            int i3922 = i3522 >> 3;
                                                            BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i3822 & 57344) | (i3822 & 112) | 6 | (i3822 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3822 & 7168) | (458752 & i3922) | (3670016 & i3922) | (29360128 & i3922) | (i3922 & 234881024), 0);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            composer2.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            z7 = z11;
                                                            z8 = z10;
                                                            j2 = j3;
                                                            str3 = str5;
                                                            str4 = str6;
                                                            z9 = z12;
                                                            function05 = function04;
                                                            function18 = function115;
                                                            function06 = function08;
                                                            function07 = function09;
                                                            function19 = function114;
                                                            function110 = function116;
                                                            function111 = function117;
                                                            modifier2 = modifier422;
                                                            function112 = function118;
                                                            function113 = function119;
                                                            endRestartGroup = composer2.endRestartGroup();
                                                            if (endRestartGroup == null) {
                                                            }
                                                        }
                                                        i23 = i4 & 8388608;
                                                        if (i23 == 0) {
                                                        }
                                                        i24 = i4 & 16777216;
                                                        if (i24 != 0) {
                                                        }
                                                        function17 = function15;
                                                        i25 = i4 & 33554432;
                                                        if (i25 == 0) {
                                                        }
                                                        i26 = i34;
                                                        if ((306783379 & i31) == 306783378) {
                                                        }
                                                        if (i8 == 0) {
                                                        }
                                                        if (i32 == 0) {
                                                        }
                                                        if (i6 == 0) {
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
                                                        if (i16 == 0) {
                                                        }
                                                        if (i18 == 0) {
                                                        }
                                                        if (i19 == 0) {
                                                        }
                                                        if (i21 == 0) {
                                                        }
                                                        if (i22 == 0) {
                                                        }
                                                        if (i23 == 0) {
                                                        }
                                                        if (i24 == 0) {
                                                        }
                                                        if (i25 == 0) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222);
                                                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (!startRestartGroup.getInserting()) {
                                                        }
                                                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl.getInserting()) {
                                                        }
                                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                                                        composer2 = startRestartGroup;
                                                        Modifier modifier4222 = modifier3;
                                                        int i35222 = i33;
                                                        TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                                        int i36222 = i35222 >> 9;
                                                        int i37222 = i26 << 9;
                                                        OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i36222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i36222 & 112) | 6 | (i37222 & 7168) | (i37222 & 57344), 0);
                                                        int i38222 = i26 >> 3;
                                                        int i39222 = i35222 >> 3;
                                                        BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i38222 & 57344) | (i38222 & 112) | 6 | (i38222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i38222 & 7168) | (458752 & i39222) | (3670016 & i39222) | (29360128 & i39222) | (i39222 & 234881024), 0);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        composer2.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        z7 = z11;
                                                        z8 = z10;
                                                        j2 = j3;
                                                        str3 = str5;
                                                        str4 = str6;
                                                        z9 = z12;
                                                        function05 = function04;
                                                        function18 = function115;
                                                        function06 = function08;
                                                        function07 = function09;
                                                        function19 = function114;
                                                        function110 = function116;
                                                        function111 = function117;
                                                        modifier2 = modifier4222;
                                                        function112 = function118;
                                                        function113 = function119;
                                                        endRestartGroup = composer2.endRestartGroup();
                                                        if (endRestartGroup == null) {
                                                        }
                                                    }
                                                    i33 |= i27;
                                                    i19 = 1048576 & i4;
                                                    if (i19 != 0) {
                                                    }
                                                    i21 = i4 & 2097152;
                                                    if (i21 != 0) {
                                                    }
                                                    int i342 = i20;
                                                    i22 = i4 & 4194304;
                                                    if (i22 != 0) {
                                                    }
                                                    i23 = i4 & 8388608;
                                                    if (i23 == 0) {
                                                    }
                                                    i24 = i4 & 16777216;
                                                    if (i24 != 0) {
                                                    }
                                                    function17 = function15;
                                                    i25 = i4 & 33554432;
                                                    if (i25 == 0) {
                                                    }
                                                    i26 = i342;
                                                    if ((306783379 & i31) == 306783378) {
                                                    }
                                                    if (i8 == 0) {
                                                    }
                                                    if (i32 == 0) {
                                                    }
                                                    if (i6 == 0) {
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
                                                    if (i16 == 0) {
                                                    }
                                                    if (i18 == 0) {
                                                    }
                                                    if (i19 == 0) {
                                                    }
                                                    if (i21 == 0) {
                                                    }
                                                    if (i22 == 0) {
                                                    }
                                                    if (i23 == 0) {
                                                    }
                                                    if (i24 == 0) {
                                                    }
                                                    if (i25 == 0) {
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    Modifier m1520paddingqDBjuR0$default2222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222);
                                                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    }
                                                    startRestartGroup.startReusableNode();
                                                    if (!startRestartGroup.getInserting()) {
                                                    }
                                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl.getInserting()) {
                                                    }
                                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                                                    composer2 = startRestartGroup;
                                                    Modifier modifier42222 = modifier3;
                                                    int i352222 = i33;
                                                    TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                                    int i362222 = i352222 >> 9;
                                                    int i372222 = i26 << 9;
                                                    OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i362222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i362222 & 112) | 6 | (i372222 & 7168) | (i372222 & 57344), 0);
                                                    int i382222 = i26 >> 3;
                                                    int i392222 = i352222 >> 3;
                                                    BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i382222 & 57344) | (i382222 & 112) | 6 | (i382222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i382222 & 7168) | (458752 & i392222) | (3670016 & i392222) | (29360128 & i392222) | (i392222 & 234881024), 0);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    z7 = z11;
                                                    z8 = z10;
                                                    j2 = j3;
                                                    str3 = str5;
                                                    str4 = str6;
                                                    z9 = z12;
                                                    function05 = function04;
                                                    function18 = function115;
                                                    function06 = function08;
                                                    function07 = function09;
                                                    function19 = function114;
                                                    function110 = function116;
                                                    function111 = function117;
                                                    modifier2 = modifier42222;
                                                    function112 = function118;
                                                    function113 = function119;
                                                    endRestartGroup = composer2.endRestartGroup();
                                                    if (endRestartGroup == null) {
                                                    }
                                                }
                                                i33 |= i28;
                                                if ((524288 & i4) != 0) {
                                                }
                                                i33 |= i27;
                                                i19 = 1048576 & i4;
                                                if (i19 != 0) {
                                                }
                                                i21 = i4 & 2097152;
                                                if (i21 != 0) {
                                                }
                                                int i3422 = i20;
                                                i22 = i4 & 4194304;
                                                if (i22 != 0) {
                                                }
                                                i23 = i4 & 8388608;
                                                if (i23 == 0) {
                                                }
                                                i24 = i4 & 16777216;
                                                if (i24 != 0) {
                                                }
                                                function17 = function15;
                                                i25 = i4 & 33554432;
                                                if (i25 == 0) {
                                                }
                                                i26 = i3422;
                                                if ((306783379 & i31) == 306783378) {
                                                }
                                                if (i8 == 0) {
                                                }
                                                if (i32 == 0) {
                                                }
                                                if (i6 == 0) {
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
                                                if (i16 == 0) {
                                                }
                                                if (i18 == 0) {
                                                }
                                                if (i19 == 0) {
                                                }
                                                if (i21 == 0) {
                                                }
                                                if (i22 == 0) {
                                                }
                                                if (i23 == 0) {
                                                }
                                                if (i24 == 0) {
                                                }
                                                if (i25 == 0) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                Modifier m1520paddingqDBjuR0$default22222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_422222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22222);
                                                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (!startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl.getInserting()) {
                                                }
                                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
                                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                                                composer2 = startRestartGroup;
                                                Modifier modifier422222 = modifier3;
                                                int i3522222 = i33;
                                                TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                                int i3622222 = i3522222 >> 9;
                                                int i3722222 = i26 << 9;
                                                OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i3622222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3622222 & 112) | 6 | (i3722222 & 7168) | (i3722222 & 57344), 0);
                                                int i3822222 = i26 >> 3;
                                                int i3922222 = i3522222 >> 3;
                                                BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i3822222 & 57344) | (i3822222 & 112) | 6 | (i3822222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3822222 & 7168) | (458752 & i3922222) | (3670016 & i3922222) | (29360128 & i3922222) | (i3922222 & 234881024), 0);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                z7 = z11;
                                                z8 = z10;
                                                j2 = j3;
                                                str3 = str5;
                                                str4 = str6;
                                                z9 = z12;
                                                function05 = function04;
                                                function18 = function115;
                                                function06 = function08;
                                                function07 = function09;
                                                function19 = function114;
                                                function110 = function116;
                                                function111 = function117;
                                                modifier2 = modifier422222;
                                                function112 = function118;
                                                function113 = function119;
                                                endRestartGroup = composer2.endRestartGroup();
                                                if (endRestartGroup == null) {
                                                }
                                            }
                                            i33 |= i29;
                                            if ((262144 & i4) == 0) {
                                            }
                                            i33 |= i28;
                                            if ((524288 & i4) != 0) {
                                            }
                                            i33 |= i27;
                                            i19 = 1048576 & i4;
                                            if (i19 != 0) {
                                            }
                                            i21 = i4 & 2097152;
                                            if (i21 != 0) {
                                            }
                                            int i34222 = i20;
                                            i22 = i4 & 4194304;
                                            if (i22 != 0) {
                                            }
                                            i23 = i4 & 8388608;
                                            if (i23 == 0) {
                                            }
                                            i24 = i4 & 16777216;
                                            if (i24 != 0) {
                                            }
                                            function17 = function15;
                                            i25 = i4 & 33554432;
                                            if (i25 == 0) {
                                            }
                                            i26 = i34222;
                                            if ((306783379 & i31) == 306783378) {
                                            }
                                            if (i8 == 0) {
                                            }
                                            if (i32 == 0) {
                                            }
                                            if (i6 == 0) {
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
                                            if (i16 == 0) {
                                            }
                                            if (i18 == 0) {
                                            }
                                            if (i19 == 0) {
                                            }
                                            if (i21 == 0) {
                                            }
                                            if (i22 == 0) {
                                            }
                                            if (i23 == 0) {
                                            }
                                            if (i24 == 0) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            Modifier m1520paddingqDBjuR0$default222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222222);
                                            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (!startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting()) {
                                            }
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                                            composer2 = startRestartGroup;
                                            Modifier modifier4222222 = modifier3;
                                            int i35222222 = i33;
                                            TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                            int i36222222 = i35222222 >> 9;
                                            int i37222222 = i26 << 9;
                                            OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i36222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i36222222 & 112) | 6 | (i37222222 & 7168) | (i37222222 & 57344), 0);
                                            int i38222222 = i26 >> 3;
                                            int i39222222 = i35222222 >> 3;
                                            BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i38222222 & 57344) | (i38222222 & 112) | 6 | (i38222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i38222222 & 7168) | (458752 & i39222222) | (3670016 & i39222222) | (29360128 & i39222222) | (i39222222 & 234881024), 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z7 = z11;
                                            z8 = z10;
                                            j2 = j3;
                                            str3 = str5;
                                            str4 = str6;
                                            z9 = z12;
                                            function05 = function04;
                                            function18 = function115;
                                            function06 = function08;
                                            function07 = function09;
                                            function19 = function114;
                                            function110 = function116;
                                            function111 = function117;
                                            modifier2 = modifier4222222;
                                            function112 = function118;
                                            function113 = function119;
                                            endRestartGroup = composer2.endRestartGroup();
                                            if (endRestartGroup == null) {
                                            }
                                        }
                                    }
                                    if ((i4 & 16384) == 0) {
                                    }
                                    if ((32768 & i4) == 0) {
                                    }
                                    if ((i4 & 65536) == 0) {
                                    }
                                    if ((i4 & 131072) != 0) {
                                    }
                                    i33 |= i29;
                                    if ((262144 & i4) == 0) {
                                    }
                                    i33 |= i28;
                                    if ((524288 & i4) != 0) {
                                    }
                                    i33 |= i27;
                                    i19 = 1048576 & i4;
                                    if (i19 != 0) {
                                    }
                                    i21 = i4 & 2097152;
                                    if (i21 != 0) {
                                    }
                                    int i342222 = i20;
                                    i22 = i4 & 4194304;
                                    if (i22 != 0) {
                                    }
                                    i23 = i4 & 8388608;
                                    if (i23 == 0) {
                                    }
                                    i24 = i4 & 16777216;
                                    if (i24 != 0) {
                                    }
                                    function17 = function15;
                                    i25 = i4 & 33554432;
                                    if (i25 == 0) {
                                    }
                                    i26 = i342222;
                                    if ((306783379 & i31) == 306783378) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if (i6 == 0) {
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
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Modifier m1520paddingqDBjuR0$default2222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222222);
                                    Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
                                    composer2 = startRestartGroup;
                                    Modifier modifier42222222 = modifier3;
                                    int i352222222 = i33;
                                    TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                                    int i362222222 = i352222222 >> 9;
                                    int i372222222 = i26 << 9;
                                    OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i362222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i362222222 & 112) | 6 | (i372222222 & 7168) | (i372222222 & 57344), 0);
                                    int i382222222 = i26 >> 3;
                                    int i392222222 = i352222222 >> 3;
                                    BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i382222222 & 57344) | (i382222222 & 112) | 6 | (i382222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i382222222 & 7168) | (458752 & i392222222) | (3670016 & i392222222) | (29360128 & i392222222) | (i392222222 & 234881024), 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z7 = z11;
                                    z8 = z10;
                                    j2 = j3;
                                    str3 = str5;
                                    str4 = str6;
                                    z9 = z12;
                                    function05 = function04;
                                    function18 = function115;
                                    function06 = function08;
                                    function07 = function09;
                                    function19 = function114;
                                    function110 = function116;
                                    function111 = function117;
                                    modifier2 = modifier42222222;
                                    function112 = function118;
                                    function113 = function119;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                            }
                            i17 = i4 & 8192;
                            if (i17 != 0) {
                            }
                            if ((i4 & 16384) == 0) {
                            }
                            if ((32768 & i4) == 0) {
                            }
                            if ((i4 & 65536) == 0) {
                            }
                            if ((i4 & 131072) != 0) {
                            }
                            i33 |= i29;
                            if ((262144 & i4) == 0) {
                            }
                            i33 |= i28;
                            if ((524288 & i4) != 0) {
                            }
                            i33 |= i27;
                            i19 = 1048576 & i4;
                            if (i19 != 0) {
                            }
                            i21 = i4 & 2097152;
                            if (i21 != 0) {
                            }
                            int i3422222 = i20;
                            i22 = i4 & 4194304;
                            if (i22 != 0) {
                            }
                            i23 = i4 & 8388608;
                            if (i23 == 0) {
                            }
                            i24 = i4 & 16777216;
                            if (i24 != 0) {
                            }
                            function17 = function15;
                            i25 = i4 & 33554432;
                            if (i25 == 0) {
                            }
                            i26 = i3422222;
                            if ((306783379 & i31) == 306783378) {
                            }
                            if (i8 == 0) {
                            }
                            if (i32 == 0) {
                            }
                            if (i6 == 0) {
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
                            if (i16 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier m1520paddingqDBjuR0$default22222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy22222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22222222);
                            Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222222);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
                            composer2 = startRestartGroup;
                            Modifier modifier422222222 = modifier3;
                            int i3522222222 = i33;
                            TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33 & 8190, 0);
                            int i3622222222 = i3522222222 >> 9;
                            int i3722222222 = i26 << 9;
                            OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i3622222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3622222222 & 112) | 6 | (i3722222222 & 7168) | (i3722222222 & 57344), 0);
                            int i3822222222 = i26 >> 3;
                            int i3922222222 = i3522222222 >> 3;
                            BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i3822222222 & 57344) | (i3822222222 & 112) | 6 | (i3822222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3822222222 & 7168) | (458752 & i3922222222) | (3670016 & i3922222222) | (29360128 & i3922222222) | (i3922222222 & 234881024), 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z7 = z11;
                            z8 = z10;
                            j2 = j3;
                            str3 = str5;
                            str4 = str6;
                            z9 = z12;
                            function05 = function04;
                            function18 = function115;
                            function06 = function08;
                            function07 = function09;
                            function19 = function114;
                            function110 = function116;
                            function111 = function117;
                            modifier2 = modifier422222222;
                            function112 = function118;
                            function113 = function119;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i11 = i4 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i4 & 1024;
                        if (i12 == 0) {
                        }
                        i14 = i4 & 2048;
                        if (i14 == 0) {
                        }
                        int i332 = i13;
                        i15 = i4 & 4096;
                        if (i15 == 0) {
                        }
                        i17 = i4 & 8192;
                        if (i17 != 0) {
                        }
                        if ((i4 & 16384) == 0) {
                        }
                        if ((32768 & i4) == 0) {
                        }
                        if ((i4 & 65536) == 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        i332 |= i29;
                        if ((262144 & i4) == 0) {
                        }
                        i332 |= i28;
                        if ((524288 & i4) != 0) {
                        }
                        i332 |= i27;
                        i19 = 1048576 & i4;
                        if (i19 != 0) {
                        }
                        i21 = i4 & 2097152;
                        if (i21 != 0) {
                        }
                        int i34222222 = i20;
                        i22 = i4 & 4194304;
                        if (i22 != 0) {
                        }
                        i23 = i4 & 8388608;
                        if (i23 == 0) {
                        }
                        i24 = i4 & 16777216;
                        if (i24 != 0) {
                        }
                        function17 = function15;
                        i25 = i4 & 33554432;
                        if (i25 == 0) {
                        }
                        i26 = i34222222;
                        if ((306783379 & i31) == 306783378) {
                        }
                        if (i8 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i6 == 0) {
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
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier m1520paddingqDBjuR0$default222222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy222222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4222222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222222222);
                        Function0<ComposeUiNode> constructor222222222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222222222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222222222 = ColumnScopeInstance.INSTANCE;
                        composer2 = startRestartGroup;
                        Modifier modifier4222222222 = modifier3;
                        int i35222222222 = i332;
                        TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i332 & 8190, 0);
                        int i36222222222 = i35222222222 >> 9;
                        int i37222222222 = i26 << 9;
                        OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i36222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i36222222222 & 112) | 6 | (i37222222222 & 7168) | (i37222222222 & 57344), 0);
                        int i38222222222 = i26 >> 3;
                        int i39222222222 = i35222222222 >> 3;
                        BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i38222222222 & 57344) | (i38222222222 & 112) | 6 | (i38222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i38222222222 & 7168) | (458752 & i39222222222) | (3670016 & i39222222222) | (29360128 & i39222222222) | (i39222222222 & 234881024), 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z7 = z11;
                        z8 = z10;
                        j2 = j3;
                        str3 = str5;
                        str4 = str6;
                        z9 = z12;
                        function05 = function04;
                        function18 = function115;
                        function06 = function08;
                        function07 = function09;
                        function19 = function114;
                        function110 = function116;
                        function111 = function117;
                        modifier2 = modifier4222222222;
                        function112 = function118;
                        function113 = function119;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i30;
                    i9 = i7;
                    i10 = i4 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                    }
                    i14 = i4 & 2048;
                    if (i14 == 0) {
                    }
                    int i3322 = i13;
                    i15 = i4 & 4096;
                    if (i15 == 0) {
                    }
                    i17 = i4 & 8192;
                    if (i17 != 0) {
                    }
                    if ((i4 & 16384) == 0) {
                    }
                    if ((32768 & i4) == 0) {
                    }
                    if ((i4 & 65536) == 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    i3322 |= i29;
                    if ((262144 & i4) == 0) {
                    }
                    i3322 |= i28;
                    if ((524288 & i4) != 0) {
                    }
                    i3322 |= i27;
                    i19 = 1048576 & i4;
                    if (i19 != 0) {
                    }
                    i21 = i4 & 2097152;
                    if (i21 != 0) {
                    }
                    int i342222222 = i20;
                    i22 = i4 & 4194304;
                    if (i22 != 0) {
                    }
                    i23 = i4 & 8388608;
                    if (i23 == 0) {
                    }
                    i24 = i4 & 16777216;
                    if (i24 != 0) {
                    }
                    function17 = function15;
                    i25 = i4 & 33554432;
                    if (i25 == 0) {
                    }
                    i26 = i342222222;
                    if ((306783379 & i31) == 306783378) {
                    }
                    if (i8 == 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i6 == 0) {
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
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m1520paddingqDBjuR0$default2222222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2222222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42222222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222222222);
                    Function0<ComposeUiNode> constructor2222222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222222222 = ColumnScopeInstance.INSTANCE;
                    composer2 = startRestartGroup;
                    Modifier modifier42222222222 = modifier3;
                    int i352222222222 = i3322;
                    TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i3322 & 8190, 0);
                    int i362222222222 = i352222222222 >> 9;
                    int i372222222222 = i26 << 9;
                    OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i362222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i362222222222 & 112) | 6 | (i372222222222 & 7168) | (i372222222222 & 57344), 0);
                    int i382222222222 = i26 >> 3;
                    int i392222222222 = i352222222222 >> 3;
                    BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i382222222222 & 57344) | (i382222222222 & 112) | 6 | (i382222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i382222222222 & 7168) | (458752 & i392222222222) | (3670016 & i392222222222) | (29360128 & i392222222222) | (i392222222222 & 234881024), 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z7 = z11;
                    z8 = z10;
                    j2 = j3;
                    str3 = str5;
                    str4 = str6;
                    z9 = z12;
                    function05 = function04;
                    function18 = function115;
                    function06 = function08;
                    function07 = function09;
                    function19 = function114;
                    function110 = function116;
                    function111 = function117;
                    modifier2 = modifier42222222222;
                    function112 = function118;
                    function113 = function119;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i4 & 32) == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                i7 = i4 & 128;
                if (i7 == 0) {
                }
                i8 = i30;
                i9 = i7;
                i10 = i4 & 256;
                if (i10 != 0) {
                }
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                i12 = i4 & 1024;
                if (i12 == 0) {
                }
                i14 = i4 & 2048;
                if (i14 == 0) {
                }
                int i33222 = i13;
                i15 = i4 & 4096;
                if (i15 == 0) {
                }
                i17 = i4 & 8192;
                if (i17 != 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((32768 & i4) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                i33222 |= i29;
                if ((262144 & i4) == 0) {
                }
                i33222 |= i28;
                if ((524288 & i4) != 0) {
                }
                i33222 |= i27;
                i19 = 1048576 & i4;
                if (i19 != 0) {
                }
                i21 = i4 & 2097152;
                if (i21 != 0) {
                }
                int i3422222222 = i20;
                i22 = i4 & 4194304;
                if (i22 != 0) {
                }
                i23 = i4 & 8388608;
                if (i23 == 0) {
                }
                i24 = i4 & 16777216;
                if (i24 != 0) {
                }
                function17 = function15;
                i25 = i4 & 33554432;
                if (i25 == 0) {
                }
                i26 = i3422222222;
                if ((306783379 & i31) == 306783378) {
                }
                if (i8 == 0) {
                }
                if (i32 == 0) {
                }
                if (i6 == 0) {
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
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if (i25 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m1520paddingqDBjuR0$default22222222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_422222222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22222222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422222222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22222222222);
                Function0<ComposeUiNode> constructor22222222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222222222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222222222 = ColumnScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                Modifier modifier422222222222 = modifier3;
                int i3522222222222 = i33222;
                TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i33222 & 8190, 0);
                int i3622222222222 = i3522222222222 >> 9;
                int i3722222222222 = i26 << 9;
                OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i3622222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3622222222222 & 112) | 6 | (i3722222222222 & 7168) | (i3722222222222 & 57344), 0);
                int i3822222222222 = i26 >> 3;
                int i3922222222222 = i3522222222222 >> 3;
                BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i3822222222222 & 57344) | (i3822222222222 & 112) | 6 | (i3822222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3822222222222 & 7168) | (458752 & i3922222222222) | (3670016 & i3922222222222) | (29360128 & i3922222222222) | (i3922222222222 & 234881024), 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z7 = z11;
                z8 = z10;
                j2 = j3;
                str3 = str5;
                str4 = str6;
                z9 = z12;
                function05 = function04;
                function18 = function115;
                function06 = function08;
                function07 = function09;
                function19 = function114;
                function110 = function116;
                function111 = function117;
                modifier2 = modifier422222222222;
                function112 = function118;
                function113 = function119;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i7 = i4 & 128;
            if (i7 == 0) {
            }
            i8 = i30;
            i9 = i7;
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            i12 = i4 & 1024;
            if (i12 == 0) {
            }
            i14 = i4 & 2048;
            if (i14 == 0) {
            }
            int i332222 = i13;
            i15 = i4 & 4096;
            if (i15 == 0) {
            }
            i17 = i4 & 8192;
            if (i17 != 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((32768 & i4) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            i332222 |= i29;
            if ((262144 & i4) == 0) {
            }
            i332222 |= i28;
            if ((524288 & i4) != 0) {
            }
            i332222 |= i27;
            i19 = 1048576 & i4;
            if (i19 != 0) {
            }
            i21 = i4 & 2097152;
            if (i21 != 0) {
            }
            int i34222222222 = i20;
            i22 = i4 & 4194304;
            if (i22 != 0) {
            }
            i23 = i4 & 8388608;
            if (i23 == 0) {
            }
            i24 = i4 & 16777216;
            if (i24 != 0) {
            }
            function17 = function15;
            i25 = i4 & 33554432;
            if (i25 == 0) {
            }
            i26 = i34222222222;
            if ((306783379 & i31) == 306783378) {
            }
            if (i8 == 0) {
            }
            if (i32 == 0) {
            }
            if (i6 == 0) {
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
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if (i25 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m1520paddingqDBjuR0$default222222222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222222222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222222222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4222222222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default222222222222);
            Function0<ComposeUiNode> constructor222222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier222222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222222222 = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            Modifier modifier4222222222222 = modifier3;
            int i35222222222222 = i332222;
            TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i332222 & 8190, 0);
            int i36222222222222 = i35222222222222 >> 9;
            int i37222222222222 = i26 << 9;
            OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i36222222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i36222222222222 & 112) | 6 | (i37222222222222 & 7168) | (i37222222222222 & 57344), 0);
            int i38222222222222 = i26 >> 3;
            int i39222222222222 = i35222222222222 >> 3;
            BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i38222222222222 & 57344) | (i38222222222222 & 112) | 6 | (i38222222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i38222222222222 & 7168) | (458752 & i39222222222222) | (3670016 & i39222222222222) | (29360128 & i39222222222222) | (i39222222222222 & 234881024), 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z7 = z11;
            z8 = z10;
            j2 = j3;
            str3 = str5;
            str4 = str6;
            z9 = z12;
            function05 = function04;
            function18 = function115;
            function06 = function08;
            function07 = function09;
            function19 = function114;
            function110 = function116;
            function111 = function117;
            modifier2 = modifier4222222222222;
            function112 = function118;
            function113 = function119;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i7 = i4 & 128;
        if (i7 == 0) {
        }
        i8 = i30;
        i9 = i7;
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 == 0) {
        }
        i12 = i4 & 1024;
        if (i12 == 0) {
        }
        i14 = i4 & 2048;
        if (i14 == 0) {
        }
        int i3322222 = i13;
        i15 = i4 & 4096;
        if (i15 == 0) {
        }
        i17 = i4 & 8192;
        if (i17 != 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((32768 & i4) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        i3322222 |= i29;
        if ((262144 & i4) == 0) {
        }
        i3322222 |= i28;
        if ((524288 & i4) != 0) {
        }
        i3322222 |= i27;
        i19 = 1048576 & i4;
        if (i19 != 0) {
        }
        i21 = i4 & 2097152;
        if (i21 != 0) {
        }
        int i342222222222 = i20;
        i22 = i4 & 4194304;
        if (i22 != 0) {
        }
        i23 = i4 & 8388608;
        if (i23 == 0) {
        }
        i24 = i4 & 16777216;
        if (i24 != 0) {
        }
        function17 = function15;
        i25 = i4 & 33554432;
        if (i25 == 0) {
        }
        i26 = i342222222222;
        if ((306783379 & i31) == 306783378) {
        }
        if (i8 == 0) {
        }
        if (i32 == 0) {
        }
        if (i6 == 0) {
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
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if (i25 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1520paddingqDBjuR0$default2222222222222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222222222222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222222222222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42222222222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2222222222222);
        Function0<ComposeUiNode> constructor2222222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222222222222 = ColumnScopeInstance.INSTANCE;
        composer2 = startRestartGroup;
        Modifier modifier42222222222222 = modifier3;
        int i352222222222222 = i3322222;
        TopNavigationButtonsKt.TopNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), videoRewardService, z10, z11, z3, z4, z5, j3, str5, str6, z12, function04, function08, function09, composer2, (i31 & 112) | 6 | (i31 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i3322222 & 8190, 0);
        int i362222222222222 = i352222222222222 >> 9;
        int i372222222222222 = i26 << 9;
        OverlappingNavigationButtonsKt.OverlappingNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), onBattlesClick, onCompetitionsClick, function114, function115, composer2, (i362222222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i362222222222222 & 112) | 6 | (i372222222222222 & 7168) | (i372222222222222 & 57344), 0);
        int i382222222222222 = i26 >> 3;
        int i392222222222222 = i352222222222222 >> 3;
        BottomNavigationButtonsKt.BottomNavigationButtons(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function116, function117, function118, function119, onRankingClick, onTvBetClick, onMinigamesClick, onTopMatchesClick, composer2, (i382222222222222 & 57344) | (i382222222222222 & 112) | 6 | (i382222222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i382222222222222 & 7168) | (458752 & i392222222222222) | (3670016 & i392222222222222) | (29360128 & i392222222222222) | (i392222222222222 & 234881024), 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z7 = z11;
        z8 = z10;
        j2 = j3;
        str3 = str5;
        str4 = str6;
        z9 = z12;
        function05 = function04;
        function18 = function115;
        function06 = function08;
        function07 = function09;
        function19 = function114;
        function110 = function116;
        function111 = function117;
        modifier2 = modifier42222222222222;
        function112 = function118;
        function113 = function119;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
