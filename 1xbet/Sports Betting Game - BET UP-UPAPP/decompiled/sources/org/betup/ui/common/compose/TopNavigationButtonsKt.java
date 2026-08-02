package org.betup.ui.common.compose;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.ironsource.InterfaceC3497ge;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TopNavigationButtons.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\u001a«\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010%\u001a\u0015\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010%\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\rH\u0003¢\u0006\u0002\u0010*¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, d2 = {"TopNavigationButtons", "", "modifier", "Landroidx/compose/ui/Modifier;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "showDailyButtonInTopRow", "", "showFlashBetInTopRow", "dailyActive", "bonusOfferActive", "adsActive", "adsAmount", "", "adsQuotaLabel", "", "adsTimerText", "adsLoading", "onAdsClick", "Lkotlin/Function0;", "onDailyClick", "onBonusOfferClick", "(Landroidx/compose/ui/Modifier;Lorg/betup/services/offer/VideoRewardService;ZZZZZJLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "TopNavAdsBadgesColumn", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "TopNavAdsPulsingIcon", "isActive", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(ZLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;I)V", "TopNavigationButton", "item", "Lorg/betup/ui/common/compose/TopNavigationItem;", "onShowNoVideoToast", "(Lorg/betup/ui/common/compose/TopNavigationItem;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AdsQuotaBadge", "quotaLabel", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "AdsCooldownBadge", "timerText", "AdsBetcoinBadge", "amount", "(JLandroidx/compose/runtime/Composer;I)V", "app_release", "scale", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopNavigationButtonsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdsBetcoinBadge$lambda$33(long j, int i, Composer composer, int i2) {
        AdsBetcoinBadge(j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdsCooldownBadge$lambda$31(String str, int i, Composer composer, int i2) {
        AdsCooldownBadge(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdsQuotaBadge$lambda$30(String str, int i, Composer composer, int i2) {
        AdsQuotaBadge(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavAdsBadgesColumn$lambda$18(Long l, String str, String str2, int i, Composer composer, int i2) {
        TopNavAdsBadgesColumn(l, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavAdsBadgesColumn$lambda$20(Long l, String str, String str2, int i, Composer composer, int i2) {
        TopNavAdsBadgesColumn(l, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavAdsPulsingIcon$lambda$22(boolean z, ColorFilter colorFilter, int i, Composer composer, int i2) {
        TopNavAdsPulsingIcon(z, colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButton$lambda$29(TopNavigationItem topNavigationItem, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        TopNavigationButton(topNavigationItem, modifier, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$17(Modifier modifier, VideoRewardService videoRewardService, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, String str, String str2, boolean z6, Function0 function0, Function0 function02, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        TopNavigationButtons(modifier, videoRewardService, z, z2, z3, z4, z5, j, str, str2, z6, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopNavigationButtons(Modifier modifier, final VideoRewardService videoRewardService, boolean z, boolean z2, final boolean z3, final boolean z4, final boolean z5, long j, String str, String str2, boolean z6, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2, final int i3) {
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
        boolean z7;
        boolean z8;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        TopNavigationItem topNavigationItem;
        TopNavigationItem topNavigationItem2;
        Object rememberedValue;
        boolean z9;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean z10;
        Object rememberedValue4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Function0<Unit> function06;
        final boolean z11;
        final Function0<Unit> function07;
        final boolean z12;
        final boolean z13;
        final long j2;
        final String str3;
        Function0<Unit> function08;
        final String str4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(videoRewardService, "videoRewardService");
        Composer startRestartGroup = composer.startRestartGroup(-1583255263);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(j) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(str) ? 67108864 : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(str2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (startRestartGroup.changed(z6) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i10 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                    }
                    i12 = i10;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i12 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i12 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i12 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i12 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                            if ((i4 & 306783363) == 306783362 || (i12 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i15 == 0 ? Modifier.INSTANCE : modifier;
                                z7 = i16 == 0 ? true : z;
                                z8 = i5 == 0 ? false : z2;
                                long j3 = i6 == 0 ? 0L : j;
                                String str5 = i7 == 0 ? null : str;
                                String str6 = i8 == 0 ? null : str2;
                                boolean z14 = i9 == 0 ? false : z6;
                                if (i11 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    function04 = (Function0) rememberedValue5;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function04 = function0;
                                }
                                final Function0<Unit> function09 = i13 == 0 ? null : function02;
                                function05 = i14 == 0 ? null : function03;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1583255263, i4, i12, "org.betup.ui.common.compose.TopNavigationButtons (TopNavigationButtons.kt:75)");
                                }
                                TopNavigationItem[] topNavigationItemArr = new TopNavigationItem[6];
                                startRestartGroup.startReplaceGroup(-1089863979);
                                if (z7) {
                                    topNavigationItem = null;
                                } else {
                                    TopNavigationItemType topNavigationItemType = TopNavigationItemType.DAILY;
                                    startRestartGroup.startReplaceGroup(5004770);
                                    boolean z15 = (i12 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (z15 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TopNavigationButtons$lambda$3$lambda$2;
                                                TopNavigationButtons$lambda$3$lambda$2 = TopNavigationButtonsKt.TopNavigationButtons$lambda$3$lambda$2(Function0.this);
                                                return TopNavigationButtons$lambda$3$lambda$2;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    topNavigationItem = new TopNavigationItem(topNavigationItemType, R.string.daily_bonus, R.drawable.ic_calendar, z3, null, null, null, (Function0) rememberedValue6, 112, null);
                                }
                                startRestartGroup.endReplaceGroup();
                                topNavigationItemArr[0] = topNavigationItem;
                                startRestartGroup.startReplaceGroup(-1089852707);
                                if (z8) {
                                    topNavigationItem2 = null;
                                } else {
                                    TopNavigationItemType topNavigationItemType2 = TopNavigationItemType.FLASH_BET;
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda13
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TopNavigationButtons$lambda$5$lambda$4;
                                                TopNavigationButtons$lambda$5$lambda$4 = TopNavigationButtonsKt.TopNavigationButtons$lambda$5$lambda$4();
                                                return TopNavigationButtons$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    topNavigationItem2 = new TopNavigationItem(topNavigationItemType2, R.string.flash_bet, R.drawable.flash_ele, true, null, null, null, (Function0) rememberedValue7, 112, null);
                                }
                                startRestartGroup.endReplaceGroup();
                                topNavigationItemArr[1] = topNavigationItem2;
                                TopNavigationItemType topNavigationItemType3 = TopNavigationItemType.TASKS;
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopNavigationButtons$lambda$7$lambda$6;
                                            TopNavigationButtons$lambda$7$lambda$6 = TopNavigationButtonsKt.TopNavigationButtons$lambda$7$lambda$6();
                                            return TopNavigationButtons$lambda$7$lambda$6;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                topNavigationItemArr[2] = new TopNavigationItem(topNavigationItemType3, R.string.drawer_achievements, R.drawable.ic_task, true, null, null, null, (Function0) rememberedValue, 112, null);
                                TopNavigationItemType topNavigationItemType4 = TopNavigationItemType.BONUS_OFFER;
                                startRestartGroup.startReplaceGroup(5004770);
                                z9 = (i12 & 7168) != 2048;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z9 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopNavigationButtons$lambda$9$lambda$8;
                                            TopNavigationButtons$lambda$9$lambda$8 = TopNavigationButtonsKt.TopNavigationButtons$lambda$9$lambda$8(Function0.this);
                                            return TopNavigationButtons$lambda$9$lambda$8;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                topNavigationItemArr[3] = new TopNavigationItem(topNavigationItemType4, R.string.bonus_offer, R.drawable.ic_gift, z4, null, null, null, (Function0) rememberedValue2, 112, null);
                                TopNavigationItemType topNavigationItemType5 = TopNavigationItemType.SCORES;
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopNavigationButtons$lambda$11$lambda$10;
                                            TopNavigationButtons$lambda$11$lambda$10 = TopNavigationButtonsKt.TopNavigationButtons$lambda$11$lambda$10();
                                            return TopNavigationButtons$lambda$11$lambda$10;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceGroup();
                                topNavigationItemArr[4] = new TopNavigationItem(topNavigationItemType5, R.string.scores, R.drawable.ic_score, true, null, null, null, (Function0) rememberedValue3, 112, null);
                                TopNavigationItemType topNavigationItemType6 = TopNavigationItemType.ADS;
                                Long valueOf = Long.valueOf(j3);
                                startRestartGroup.startReplaceGroup(5004770);
                                z10 = (i12 & 112) != 32;
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!z10 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda17
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopNavigationButtons$lambda$13$lambda$12;
                                            TopNavigationButtons$lambda$13$lambda$12 = TopNavigationButtonsKt.TopNavigationButtons$lambda$13$lambda$12(Function0.this);
                                            return TopNavigationButtons$lambda$13$lambda$12;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceGroup();
                                topNavigationItemArr[5] = new TopNavigationItem(topNavigationItemType6, R.string.ad_reward_label, R.drawable.ic_play, z5, valueOf, str5, str6, (Function0) rememberedValue4);
                                List<TopNavigationItem> listOfNotNull = CollectionsKt.listOfNotNull((Object[]) topNavigationItemArr);
                                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContext);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Context context = (Context) consume;
                                String str7 = str5;
                                modifier2 = companion;
                                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(8), 0.0f, 2, null);
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, bottom, startRestartGroup, 54);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                boolean z16 = z14;
                                String str8 = str6;
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
                                startRestartGroup.startReplaceGroup(-1938196451);
                                for (TopNavigationItem topNavigationItem3 : listOfNotNull) {
                                    Modifier weight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true);
                                    boolean z17 = topNavigationItem3.getType() == TopNavigationItemType.ADS ? z16 : false;
                                    startRestartGroup.startReplaceGroup(5004770);
                                    boolean changedInstance = startRestartGroup.changedInstance(context);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit TopNavigationButtons$lambda$16$lambda$15$lambda$14;
                                                TopNavigationButtons$lambda$16$lambda$15$lambda$14 = TopNavigationButtonsKt.TopNavigationButtons$lambda$16$lambda$15$lambda$14(context);
                                                return TopNavigationButtons$lambda$16$lambda$15$lambda$14;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    TopNavigationButton(topNavigationItem3, weight, z17, (Function0) rememberedValue8, startRestartGroup, 0, 0);
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
                                function06 = function04;
                                z11 = z7;
                                function07 = function09;
                                z12 = z8;
                                z13 = z16;
                                j2 = j3;
                                str3 = str7;
                                function08 = function05;
                                str4 = str8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z11 = z;
                                z12 = z2;
                                j2 = j;
                                str3 = str;
                                str4 = str2;
                                z13 = z6;
                                function06 = function0;
                                function07 = function02;
                                function08 = function03;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier3 = modifier2;
                                final Function0<Unit> function010 = function08;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit TopNavigationButtons$lambda$17;
                                        TopNavigationButtons$lambda$17 = TopNavigationButtonsKt.TopNavigationButtons$lambda$17(Modifier.this, videoRewardService, z11, z12, z3, z4, z5, j2, str3, str4, z13, function06, function07, function010, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return TopNavigationButtons$lambda$17;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i4 & 306783363) == 306783362) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TopNavigationItem[] topNavigationItemArr2 = new TopNavigationItem[6];
                        startRestartGroup.startReplaceGroup(-1089863979);
                        if (z7) {
                        }
                        startRestartGroup.endReplaceGroup();
                        topNavigationItemArr2[0] = topNavigationItem;
                        startRestartGroup.startReplaceGroup(-1089852707);
                        if (z8) {
                        }
                        startRestartGroup.endReplaceGroup();
                        topNavigationItemArr2[1] = topNavigationItem2;
                        TopNavigationItemType topNavigationItemType32 = TopNavigationItemType.TASKS;
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        topNavigationItemArr2[2] = new TopNavigationItem(topNavigationItemType32, R.string.drawer_achievements, R.drawable.ic_task, true, null, null, null, (Function0) rememberedValue, 112, null);
                        TopNavigationItemType topNavigationItemType42 = TopNavigationItemType.BONUS_OFFER;
                        startRestartGroup.startReplaceGroup(5004770);
                        if ((i12 & 7168) != 2048) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z9) {
                        }
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TopNavigationButtons$lambda$9$lambda$8;
                                TopNavigationButtons$lambda$9$lambda$8 = TopNavigationButtonsKt.TopNavigationButtons$lambda$9$lambda$8(Function0.this);
                                return TopNavigationButtons$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        topNavigationItemArr2[3] = new TopNavigationItem(topNavigationItemType42, R.string.bonus_offer, R.drawable.ic_gift, z4, null, null, null, (Function0) rememberedValue2, 112, null);
                        TopNavigationItemType topNavigationItemType52 = TopNavigationItemType.SCORES;
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        topNavigationItemArr2[4] = new TopNavigationItem(topNavigationItemType52, R.string.scores, R.drawable.ic_score, true, null, null, null, (Function0) rememberedValue3, 112, null);
                        TopNavigationItemType topNavigationItemType62 = TopNavigationItemType.ADS;
                        Long valueOf2 = Long.valueOf(j3);
                        startRestartGroup.startReplaceGroup(5004770);
                        if ((i12 & 112) != 32) {
                        }
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z10) {
                        }
                        rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TopNavigationButtons$lambda$13$lambda$12;
                                TopNavigationButtons$lambda$13$lambda$12 = TopNavigationButtonsKt.TopNavigationButtons$lambda$13$lambda$12(Function0.this);
                                return TopNavigationButtons$lambda$13$lambda$12;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceGroup();
                        topNavigationItemArr2[5] = new TopNavigationItem(topNavigationItemType62, R.string.ad_reward_label, R.drawable.ic_play, z5, valueOf2, str5, str6, (Function0) rememberedValue4);
                        List<TopNavigationItem> listOfNotNull2 = CollectionsKt.listOfNotNull((Object[]) topNavigationItemArr2);
                        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localContext2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context2 = (Context) consume2;
                        String str72 = str5;
                        modifier2 = companion;
                        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(8), 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Vertical bottom2 = Alignment.INSTANCE.getBottom();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, bottom2, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        boolean z162 = z14;
                        String str82 = str6;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1938196451);
                        while (r0.hasNext()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function06 = function04;
                        z11 = z7;
                        function07 = function09;
                        z12 = z8;
                        z13 = z162;
                        j2 = j3;
                        str3 = str72;
                        function08 = function05;
                        str4 = str82;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i4 & 306783363) == 306783362) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TopNavigationItem[] topNavigationItemArr22 = new TopNavigationItem[6];
                    startRestartGroup.startReplaceGroup(-1089863979);
                    if (z7) {
                    }
                    startRestartGroup.endReplaceGroup();
                    topNavigationItemArr22[0] = topNavigationItem;
                    startRestartGroup.startReplaceGroup(-1089852707);
                    if (z8) {
                    }
                    startRestartGroup.endReplaceGroup();
                    topNavigationItemArr22[1] = topNavigationItem2;
                    TopNavigationItemType topNavigationItemType322 = TopNavigationItemType.TASKS;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    topNavigationItemArr22[2] = new TopNavigationItem(topNavigationItemType322, R.string.drawer_achievements, R.drawable.ic_task, true, null, null, null, (Function0) rememberedValue, 112, null);
                    TopNavigationItemType topNavigationItemType422 = TopNavigationItemType.BONUS_OFFER;
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i12 & 7168) != 2048) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z9) {
                    }
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TopNavigationButtons$lambda$9$lambda$8;
                            TopNavigationButtons$lambda$9$lambda$8 = TopNavigationButtonsKt.TopNavigationButtons$lambda$9$lambda$8(Function0.this);
                            return TopNavigationButtons$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    topNavigationItemArr22[3] = new TopNavigationItem(topNavigationItemType422, R.string.bonus_offer, R.drawable.ic_gift, z4, null, null, null, (Function0) rememberedValue2, 112, null);
                    TopNavigationItemType topNavigationItemType522 = TopNavigationItemType.SCORES;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    topNavigationItemArr22[4] = new TopNavigationItem(topNavigationItemType522, R.string.scores, R.drawable.ic_score, true, null, null, null, (Function0) rememberedValue3, 112, null);
                    TopNavigationItemType topNavigationItemType622 = TopNavigationItemType.ADS;
                    Long valueOf22 = Long.valueOf(j3);
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i12 & 112) != 32) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z10) {
                    }
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TopNavigationButtons$lambda$13$lambda$12;
                            TopNavigationButtons$lambda$13$lambda$12 = TopNavigationButtonsKt.TopNavigationButtons$lambda$13$lambda$12(Function0.this);
                            return TopNavigationButtons$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    topNavigationItemArr22[5] = new TopNavigationItem(topNavigationItemType622, R.string.ad_reward_label, R.drawable.ic_play, z5, valueOf22, str5, str6, (Function0) rememberedValue4);
                    List<TopNavigationItem> listOfNotNull22 = CollectionsKt.listOfNotNull((Object[]) topNavigationItemArr22);
                    ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localContext22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context22 = (Context) consume22;
                    String str722 = str5;
                    modifier2 = companion;
                    Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(8), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical bottom22 = Alignment.INSTANCE.getBottom();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, bottom22, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    boolean z1622 = z14;
                    String str822 = str6;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1938196451);
                    while (r0.hasNext()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function06 = function04;
                    z11 = z7;
                    function07 = function09;
                    z12 = z8;
                    z13 = z1622;
                    j2 = j3;
                    str3 = str722;
                    function08 = function05;
                    str4 = str822;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                i6 = i3 & 128;
                if (i6 == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i3 & 1024;
                if (i9 == 0) {
                }
                i11 = i3 & 2048;
                if (i11 == 0) {
                }
                i12 = i10;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i4 & 306783363) == 306783362) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                TopNavigationItem[] topNavigationItemArr222 = new TopNavigationItem[6];
                startRestartGroup.startReplaceGroup(-1089863979);
                if (z7) {
                }
                startRestartGroup.endReplaceGroup();
                topNavigationItemArr222[0] = topNavigationItem;
                startRestartGroup.startReplaceGroup(-1089852707);
                if (z8) {
                }
                startRestartGroup.endReplaceGroup();
                topNavigationItemArr222[1] = topNavigationItem2;
                TopNavigationItemType topNavigationItemType3222 = TopNavigationItemType.TASKS;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                topNavigationItemArr222[2] = new TopNavigationItem(topNavigationItemType3222, R.string.drawer_achievements, R.drawable.ic_task, true, null, null, null, (Function0) rememberedValue, 112, null);
                TopNavigationItemType topNavigationItemType4222 = TopNavigationItemType.BONUS_OFFER;
                startRestartGroup.startReplaceGroup(5004770);
                if ((i12 & 7168) != 2048) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z9) {
                }
                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TopNavigationButtons$lambda$9$lambda$8;
                        TopNavigationButtons$lambda$9$lambda$8 = TopNavigationButtonsKt.TopNavigationButtons$lambda$9$lambda$8(Function0.this);
                        return TopNavigationButtons$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                topNavigationItemArr222[3] = new TopNavigationItem(topNavigationItemType4222, R.string.bonus_offer, R.drawable.ic_gift, z4, null, null, null, (Function0) rememberedValue2, 112, null);
                TopNavigationItemType topNavigationItemType5222 = TopNavigationItemType.SCORES;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                topNavigationItemArr222[4] = new TopNavigationItem(topNavigationItemType5222, R.string.scores, R.drawable.ic_score, true, null, null, null, (Function0) rememberedValue3, 112, null);
                TopNavigationItemType topNavigationItemType6222 = TopNavigationItemType.ADS;
                Long valueOf222 = Long.valueOf(j3);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i12 & 112) != 32) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z10) {
                }
                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TopNavigationButtons$lambda$13$lambda$12;
                        TopNavigationButtons$lambda$13$lambda$12 = TopNavigationButtonsKt.TopNavigationButtons$lambda$13$lambda$12(Function0.this);
                        return TopNavigationButtons$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                topNavigationItemArr222[5] = new TopNavigationItem(topNavigationItemType6222, R.string.ad_reward_label, R.drawable.ic_play, z5, valueOf222, str5, str6, (Function0) rememberedValue4);
                List<TopNavigationItem> listOfNotNull222 = CollectionsKt.listOfNotNull((Object[]) topNavigationItemArr222);
                ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localContext222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context222 = (Context) consume222;
                String str7222 = str5;
                modifier2 = companion;
                Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(8), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical bottom222 = Alignment.INSTANCE.getBottom();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween222, bottom222, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                boolean z16222 = z14;
                String str8222 = str6;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1938196451);
                while (r0.hasNext()) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function06 = function04;
                z11 = z7;
                function07 = function09;
                z12 = z8;
                z13 = z16222;
                j2 = j3;
                str3 = str7222;
                function08 = function05;
                str4 = str8222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            i6 = i3 & 128;
            if (i6 == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
            }
            i11 = i3 & 2048;
            if (i11 == 0) {
            }
            i12 = i10;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i4 & 306783363) == 306783362) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            TopNavigationItem[] topNavigationItemArr2222 = new TopNavigationItem[6];
            startRestartGroup.startReplaceGroup(-1089863979);
            if (z7) {
            }
            startRestartGroup.endReplaceGroup();
            topNavigationItemArr2222[0] = topNavigationItem;
            startRestartGroup.startReplaceGroup(-1089852707);
            if (z8) {
            }
            startRestartGroup.endReplaceGroup();
            topNavigationItemArr2222[1] = topNavigationItem2;
            TopNavigationItemType topNavigationItemType32222 = TopNavigationItemType.TASKS;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            topNavigationItemArr2222[2] = new TopNavigationItem(topNavigationItemType32222, R.string.drawer_achievements, R.drawable.ic_task, true, null, null, null, (Function0) rememberedValue, 112, null);
            TopNavigationItemType topNavigationItemType42222 = TopNavigationItemType.BONUS_OFFER;
            startRestartGroup.startReplaceGroup(5004770);
            if ((i12 & 7168) != 2048) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z9) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TopNavigationButtons$lambda$9$lambda$8;
                    TopNavigationButtons$lambda$9$lambda$8 = TopNavigationButtonsKt.TopNavigationButtons$lambda$9$lambda$8(Function0.this);
                    return TopNavigationButtons$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            topNavigationItemArr2222[3] = new TopNavigationItem(topNavigationItemType42222, R.string.bonus_offer, R.drawable.ic_gift, z4, null, null, null, (Function0) rememberedValue2, 112, null);
            TopNavigationItemType topNavigationItemType52222 = TopNavigationItemType.SCORES;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            topNavigationItemArr2222[4] = new TopNavigationItem(topNavigationItemType52222, R.string.scores, R.drawable.ic_score, true, null, null, null, (Function0) rememberedValue3, 112, null);
            TopNavigationItemType topNavigationItemType62222 = TopNavigationItemType.ADS;
            Long valueOf2222 = Long.valueOf(j3);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i12 & 112) != 32) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z10) {
            }
            rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TopNavigationButtons$lambda$13$lambda$12;
                    TopNavigationButtons$lambda$13$lambda$12 = TopNavigationButtonsKt.TopNavigationButtons$lambda$13$lambda$12(Function0.this);
                    return TopNavigationButtons$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            topNavigationItemArr2222[5] = new TopNavigationItem(topNavigationItemType62222, R.string.ad_reward_label, R.drawable.ic_play, z5, valueOf2222, str5, str6, (Function0) rememberedValue4);
            List<TopNavigationItem> listOfNotNull2222 = CollectionsKt.listOfNotNull((Object[]) topNavigationItemArr2222);
            ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localContext2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context2222 = (Context) consume2222;
            String str72222 = str5;
            modifier2 = companion;
            Modifier m1518paddingVpY3zN4$default2222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(8), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical spaceBetween2222 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical bottom2222 = Alignment.INSTANCE.getBottom();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(spaceBetween2222, bottom2222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            boolean z162222 = z14;
            String str82222 = str6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1938196451);
            while (r0.hasNext()) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function06 = function04;
            z11 = z7;
            function07 = function09;
            z12 = z8;
            z13 = z162222;
            j2 = j3;
            str3 = str72222;
            function08 = function05;
            str4 = str82222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i11 = i3 & 2048;
        if (i11 == 0) {
        }
        i12 = i10;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i4 & 306783363) == 306783362) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        TopNavigationItem[] topNavigationItemArr22222 = new TopNavigationItem[6];
        startRestartGroup.startReplaceGroup(-1089863979);
        if (z7) {
        }
        startRestartGroup.endReplaceGroup();
        topNavigationItemArr22222[0] = topNavigationItem;
        startRestartGroup.startReplaceGroup(-1089852707);
        if (z8) {
        }
        startRestartGroup.endReplaceGroup();
        topNavigationItemArr22222[1] = topNavigationItem2;
        TopNavigationItemType topNavigationItemType322222 = TopNavigationItemType.TASKS;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        topNavigationItemArr22222[2] = new TopNavigationItem(topNavigationItemType322222, R.string.drawer_achievements, R.drawable.ic_task, true, null, null, null, (Function0) rememberedValue, 112, null);
        TopNavigationItemType topNavigationItemType422222 = TopNavigationItemType.BONUS_OFFER;
        startRestartGroup.startReplaceGroup(5004770);
        if ((i12 & 7168) != 2048) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z9) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TopNavigationButtons$lambda$9$lambda$8;
                TopNavigationButtons$lambda$9$lambda$8 = TopNavigationButtonsKt.TopNavigationButtons$lambda$9$lambda$8(Function0.this);
                return TopNavigationButtons$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        topNavigationItemArr22222[3] = new TopNavigationItem(topNavigationItemType422222, R.string.bonus_offer, R.drawable.ic_gift, z4, null, null, null, (Function0) rememberedValue2, 112, null);
        TopNavigationItemType topNavigationItemType522222 = TopNavigationItemType.SCORES;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        topNavigationItemArr22222[4] = new TopNavigationItem(topNavigationItemType522222, R.string.scores, R.drawable.ic_score, true, null, null, null, (Function0) rememberedValue3, 112, null);
        TopNavigationItemType topNavigationItemType622222 = TopNavigationItemType.ADS;
        Long valueOf22222 = Long.valueOf(j3);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i12 & 112) != 32) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z10) {
        }
        rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TopNavigationButtons$lambda$13$lambda$12;
                TopNavigationButtons$lambda$13$lambda$12 = TopNavigationButtonsKt.TopNavigationButtons$lambda$13$lambda$12(Function0.this);
                return TopNavigationButtons$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        topNavigationItemArr22222[5] = new TopNavigationItem(topNavigationItemType622222, R.string.ad_reward_label, R.drawable.ic_play, z5, valueOf22222, str5, str6, (Function0) rememberedValue4);
        List<TopNavigationItem> listOfNotNull22222 = CollectionsKt.listOfNotNull((Object[]) topNavigationItemArr22222);
        ProvidableCompositionLocal<Context> localContext22222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localContext22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context22222 = (Context) consume22222;
        String str722222 = str5;
        modifier2 = companion;
        Modifier m1518paddingVpY3zN4$default22222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7774constructorimpl(8), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical spaceBetween22222 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical bottom22222 = Alignment.INSTANCE.getBottom();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(spaceBetween22222, bottom22222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        boolean z1622222 = z14;
        String str822222 = str6;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1938196451);
        while (r0.hasNext()) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function06 = function04;
        z11 = z7;
        function07 = function09;
        z12 = z8;
        z13 = z1622222;
        j2 = j3;
        str3 = str722222;
        function08 = function05;
        str4 = str822222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$3$lambda$2(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$5$lambda$4() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$7$lambda$6() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.ACHIEVEMENTS, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$9$lambda$8(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$11$lambda$10() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SCORES, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$13$lambda$12(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButtons$lambda$16$lambda$15$lambda$14(Context context) {
        SnackbarHelper.showShort(context, R.string.no_video_ads_available);
        return Unit.INSTANCE;
    }

    private static final void TopNavAdsBadgesColumn(final Long l, String str, final String str2, Composer composer, final int i) {
        int i2;
        final String str3 = str;
        Composer startRestartGroup = composer.startRestartGroup(866396557);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(866396557, i2, -1, "org.betup.ui.common.compose.TopNavAdsBadgesColumn (TopNavigationButtons.kt:164)");
            }
            String str4 = str2;
            boolean z = str4 == null || StringsKt.isBlank(str4);
            long longValue = l != null ? l.longValue() : 0L;
            boolean z2 = longValue > 0;
            String str5 = str3;
            boolean z3 = str5 == null || StringsKt.isBlank(str5);
            if (z && !z2 && z3) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TopNavAdsBadgesColumn$lambda$18;
                            TopNavAdsBadgesColumn$lambda$18 = TopNavigationButtonsKt.TopNavAdsBadgesColumn$lambda$18(l, str3, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                            return TopNavAdsBadgesColumn$lambda$18;
                        }
                    });
                    return;
                }
                return;
            }
            float f = 2;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
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
            if (!z) {
                startRestartGroup.startReplaceGroup(400568769);
                AdsCooldownBadge(str2, startRestartGroup, (i2 >> 6) & 14);
                startRestartGroup.endReplaceGroup();
                str3 = str;
            } else {
                startRestartGroup.startReplaceGroup(-467197631);
                startRestartGroup.startReplaceGroup(400571413);
                if (z2) {
                    AdsBetcoinBadge(longValue, startRestartGroup, 0);
                }
                startRestartGroup.endReplaceGroup();
                if (z3) {
                    str3 = str;
                } else {
                    startRestartGroup.startReplaceGroup(400576126);
                    if (z2) {
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceGroup();
                    str3 = str;
                    AdsQuotaBadge(str3, startRestartGroup, (i2 >> 3) & 14);
                }
                startRestartGroup.endReplaceGroup();
            }
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
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopNavAdsBadgesColumn$lambda$20;
                    TopNavAdsBadgesColumn$lambda$20 = TopNavigationButtonsKt.TopNavAdsBadgesColumn$lambda$20(l, str3, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopNavAdsBadgesColumn$lambda$20;
                }
            });
        }
    }

    private static final void TopNavAdsPulsingIcon(final boolean z, final ColorFilter colorFilter, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1462712525);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(colorFilter) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1462712525, i3, -1, "org.betup.ui.common.compose.TopNavAdsPulsingIcon (TopNavigationButtons.kt:199)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1069208107);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_play, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.ad_reward_label, startRestartGroup, 6), ScaleKt.scale(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), TopNavAdsPulsingIcon$lambda$21(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("ads_attention", startRestartGroup, 6, 0), 0.8f, 1.08f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "ads_scale", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0))), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilter, startRestartGroup, ((i3 << 15) & 3670016) | 24576, 40);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1068454838);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_play, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.ad_reward_label, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilter, startRestartGroup, ((i3 << 15) & 3670016) | 24960, 40);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopNavAdsPulsingIcon$lambda$22;
                    TopNavAdsPulsingIcon$lambda$22 = TopNavigationButtonsKt.TopNavAdsPulsingIcon$lambda$22(z, colorFilter, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopNavAdsPulsingIcon$lambda$22;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TopNavigationButton(final TopNavigationItem topNavigationItem, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        boolean z3;
        boolean changedInstance;
        Object rememberedValue;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        long j;
        final boolean z4;
        final Function0<Unit> function04;
        String adsTimerText;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(276315277);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(topNavigationItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 == 0 ? false : z2;
                        if (i5 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda5
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
                            function03 = (Function0) rememberedValue2;
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(276315277, i3, -1, "org.betup.ui.common.compose.TopNavigationButton (TopNavigationButtons.kt:237)");
                        }
                        boolean z6 = topNavigationItem.getType() != TopNavigationItemType.ADS && z5;
                        boolean z7 = z6 && (topNavigationItem.getType() == TopNavigationItemType.DAILY || topNavigationItem.getType() == TopNavigationItemType.FLASH_BET || topNavigationItem.getType() == TopNavigationItemType.ADS || topNavigationItem.getType() == TopNavigationItemType.BONUS_OFFER || topNavigationItem.isActive());
                        boolean z8 = topNavigationItem.getType() != TopNavigationItemType.ADS && topNavigationItem.isActive();
                        z3 = (topNavigationItem.getType() == TopNavigationItemType.ADS || (adsTimerText = topNavigationItem.getAdsTimerText()) == null || StringsKt.isBlank(adsTimerText)) ? false : true;
                        ColorFilter m5209tintxETnrds$default = !topNavigationItem.isActive() ? null : ColorFilter.Companion.m5209tintxETnrds$default(ColorFilter.INSTANCE, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0, 2, null);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance = ((i3 & 7168) != 2048) | startRestartGroup.changedInstance(topNavigationItem);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TopNavigationButton$lambda$26$lambda$25;
                                    TopNavigationButton$lambda$26$lambda$25 = TopNavigationButtonsKt.TopNavigationButton$lambda$26$lambda$25(TopNavigationItem.this, function03);
                                    return TopNavigationButton$lambda$26$lambda$25;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        ColorFilter colorFilter = m5209tintxETnrds$default;
                        Function0<Unit> function05 = function03;
                        modifier3 = modifier4;
                        Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(fillMaxWidth$default, (Function0) rememberedValue, null, z7, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4090);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
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
                        if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
                            startRestartGroup.startReplaceGroup(-573305627);
                            TopNavAdsBadgesColumn(topNavigationItem.getAdsAmount(), topNavigationItem.getAdsQuotaLabel(), topNavigationItem.getAdsTimerText(), startRestartGroup, 0);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            TopNavAdsPulsingIcon(z8 && !z6, colorFilter, startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(-356111954);
                            if (z6) {
                                ProgressIndicatorKt.m3295CircularProgressIndicatorLxG7B9w(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), Dp.m7774constructorimpl(2), 0L, 0, startRestartGroup, 390, 24);
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-572576724);
                            ImageKt.Image(PainterResources_androidKt.painterResource(topNavigationItem.getIconRes(), startRestartGroup, 0), StringResources_androidKt.stringResource(topNavigationItem.getTitleRes(), startRestartGroup, 0), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilter, startRestartGroup, 24960, 40);
                            startRestartGroup.endReplaceGroup();
                        }
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                        String stringResource = StringResources_androidKt.stringResource(topNavigationItem.getTitleRes(), startRestartGroup, 0);
                        long sp = TextUnitKt.getSp(8);
                        int m7658getCentere0LSkKk = TextAlign.INSTANCE.m7658getCentere0LSkKk();
                        if (!z3) {
                            j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                        } else {
                            j = topNavigationItem.isActive() ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                        }
                        TextKt.m3621Text4IGK_g(stringResource, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(m7658getCentere0LSkKk), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 3072, 122354);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z5;
                        function04 = function05;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z2;
                        function04 = function02;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier5 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TopNavigationButton$lambda$29;
                                TopNavigationButton$lambda$29 = TopNavigationButtonsKt.TopNavigationButton$lambda$29(TopNavigationItem.this, modifier5, z4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TopNavigationButton$lambda$29;
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if ((i3 & 1171) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
                }
                if (z6) {
                }
                if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
                }
                if (topNavigationItem.getType() == TopNavigationItemType.ADS) {
                }
                if (!topNavigationItem.isActive()) {
                }
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = ((i3 & 7168) != 2048) | startRestartGroup.changedInstance(topNavigationItem);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TopNavigationButton$lambda$26$lambda$25;
                        TopNavigationButton$lambda$26$lambda$25 = TopNavigationButtonsKt.TopNavigationButton$lambda$26$lambda$25(TopNavigationItem.this, function03);
                        return TopNavigationButton$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                ColorFilter colorFilter2 = m5209tintxETnrds$default;
                Function0<Unit> function052 = function03;
                modifier3 = modifier4;
                Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(fillMaxWidth$default2, (Function0) rememberedValue, null, z7, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4090);
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                String stringResource2 = StringResources_androidKt.stringResource(topNavigationItem.getTitleRes(), startRestartGroup, 0);
                long sp2 = TextUnitKt.getSp(8);
                int m7658getCentere0LSkKk2 = TextAlign.INSTANCE.m7658getCentere0LSkKk();
                if (!z3) {
                }
                TextKt.m3621Text4IGK_g(stringResource2, (Modifier) null, j, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(m7658getCentere0LSkKk2), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 3072, 122354);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z5;
                function04 = function052;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
            }
            if (z6) {
            }
            if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
            }
            if (topNavigationItem.getType() == TopNavigationItemType.ADS) {
            }
            if (!topNavigationItem.isActive()) {
            }
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = ((i3 & 7168) != 2048) | startRestartGroup.changedInstance(topNavigationItem);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TopNavigationButton$lambda$26$lambda$25;
                    TopNavigationButton$lambda$26$lambda$25 = TopNavigationButtonsKt.TopNavigationButton$lambda$26$lambda$25(TopNavigationItem.this, function03);
                    return TopNavigationButton$lambda$26$lambda$25;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            ColorFilter colorFilter22 = m5209tintxETnrds$default;
            Function0<Unit> function0522 = function03;
            modifier3 = modifier4;
            Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(fillMaxWidth$default22, (Function0) rememberedValue, null, z7, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4090);
            Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
            String stringResource22 = StringResources_androidKt.stringResource(topNavigationItem.getTitleRes(), startRestartGroup, 0);
            long sp22 = TextUnitKt.getSp(8);
            int m7658getCentere0LSkKk22 = TextAlign.INSTANCE.m7658getCentere0LSkKk();
            if (!z3) {
            }
            TextKt.m3621Text4IGK_g(stringResource22, (Modifier) null, j, sp22, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(m7658getCentere0LSkKk22), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 3072, 122354);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z5;
            function04 = function0522;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
        }
        if (z6) {
        }
        if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
        }
        if (topNavigationItem.getType() == TopNavigationItemType.ADS) {
        }
        if (!topNavigationItem.isActive()) {
        }
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = ((i3 & 7168) != 2048) | startRestartGroup.changedInstance(topNavigationItem);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TopNavigationButton$lambda$26$lambda$25;
                TopNavigationButton$lambda$26$lambda$25 = TopNavigationButtonsKt.TopNavigationButton$lambda$26$lambda$25(TopNavigationItem.this, function03);
                return TopNavigationButton$lambda$26$lambda$25;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        ColorFilter colorFilter222 = m5209tintxETnrds$default;
        Function0<Unit> function05222 = function03;
        modifier3 = modifier4;
        Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(fillMaxWidth$default222, (Function0) rememberedValue, null, z7, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4090);
        Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        if (topNavigationItem.getType() != TopNavigationItemType.ADS) {
        }
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
        String stringResource222 = StringResources_androidKt.stringResource(topNavigationItem.getTitleRes(), startRestartGroup, 0);
        long sp222 = TextUnitKt.getSp(8);
        int m7658getCentere0LSkKk222 = TextAlign.INSTANCE.m7658getCentere0LSkKk();
        if (!z3) {
        }
        TextKt.m3621Text4IGK_g(stringResource222, (Modifier) null, j, sp222, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(m7658getCentere0LSkKk222), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 3072, 122354);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z5;
        function04 = function05222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopNavigationButton$lambda$26$lambda$25(TopNavigationItem topNavigationItem, Function0 function0) {
        if (topNavigationItem.getType() == TopNavigationItemType.ADS) {
            topNavigationItem.getOnClick().invoke();
        } else if (topNavigationItem.getType() == TopNavigationItemType.DAILY) {
            topNavigationItem.getOnClick().invoke();
        } else if (topNavigationItem.isActive() || topNavigationItem.getType() == TopNavigationItemType.BONUS_OFFER || topNavigationItem.getType() == TopNavigationItemType.FLASH_BET) {
            topNavigationItem.getOnClick().invoke();
        } else if (topNavigationItem.getType() == TopNavigationItemType.ADS && !topNavigationItem.isActive()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final void AdsQuotaBadge(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1136159473);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136159473, i2, -1, "org.betup.ui.common.compose.AdsQuotaBadge (TopNavigationButtons.kt:322)");
            }
            composer2 = startRestartGroup;
            TextKt.m3621Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(9), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, i2 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AdsQuotaBadge$lambda$30;
                    AdsQuotaBadge$lambda$30 = TopNavigationButtonsKt.AdsQuotaBadge$lambda$30(str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AdsQuotaBadge$lambda$30;
                }
            });
        }
    }

    private static final void AdsCooldownBadge(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1917000006);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1917000006, i2, -1, "org.betup.ui.common.compose.AdsCooldownBadge (TopNavigationButtons.kt:335)");
            }
            composer2 = startRestartGroup;
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_video_reward_available_in, new Object[]{str}, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(2), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(8), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 48, 3072, 56828);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AdsCooldownBadge$lambda$31;
                    AdsCooldownBadge$lambda$31 = TopNavigationButtonsKt.AdsCooldownBadge$lambda$31(str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AdsCooldownBadge$lambda$31;
                }
            });
        }
    }

    private static final void AdsBetcoinBadge(final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1220102876);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1220102876, i2, -1, "org.betup.ui.common.compose.AdsBetcoinBadge (TopNavigationButtons.kt:351)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long integer = ((Context) consume).getResources().getInteger(R.integer.home_video_reward_fallback_betcoins);
            if (j > 0) {
                integer = j;
            }
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(integer);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
            TextKt.m3621Text4IGK_g("+" + shopBetcoinsFormated, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(10), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer2, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), StringResources_androidKt.stringResource(R.string.betcoins, composer2, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(10)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.TopNavigationButtonsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AdsBetcoinBadge$lambda$33;
                    AdsBetcoinBadge$lambda$33 = TopNavigationButtonsKt.AdsBetcoinBadge$lambda$33(j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AdsBetcoinBadge$lambda$33;
                }
            });
        }
    }

    private static final float TopNavAdsPulsingIcon$lambda$21(State<Float> state) {
        return state.getValue().floatValue();
    }
}
