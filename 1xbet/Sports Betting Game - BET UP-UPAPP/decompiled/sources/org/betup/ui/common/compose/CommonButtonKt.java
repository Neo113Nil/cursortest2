package org.betup.ui.common.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: CommonButton.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001añ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b \u0010!\u001a\u0093\u0001\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0002\u0010#¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"CommonButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "isSelected", "", "text", "", "isSmall", "isCompact", "isButtonEnabled", "onClick", "Lkotlin/Function0;", "isInCompetition", "isInVideoRewardsClaim", "isAnimation", "isLoading", "isInLogin", "customBackground", "Landroidx/compose/ui/graphics/Brush;", "customTextColor", "Landroidx/compose/ui/graphics/Color;", "darkenOnPress", "accentOutline", "compactVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "fontSizeOverride", "Landroidx/compose/ui/unit/TextUnit;", "horizontalPaddingOverride", "horizontalTextPaddingOverride", "hapticOnClick", "Lorg/betup/ui/common/compose/HapticFeedbackType;", "CommonButton-UPEs2M4", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;ZZZLkotlin/jvm/functions/Function0;ZZZZZLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Color;ZZLandroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/TextUnit;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lorg/betup/ui/common/compose/HapticFeedbackType;Landroidx/compose/runtime/Composer;IIII)V", "CommonButtonPlace", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;ZZZLkotlin/jvm/functions/Function0;ZZZZZLorg/betup/ui/common/compose/HapticFeedbackType;Landroidx/compose/runtime/Composer;III)V", "app_release", "currentFontSize", "", "isPressed"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonPlace$lambda$23(Modifier modifier, boolean z, String str, boolean z2, boolean z3, boolean z4, Function0 function0, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, HapticFeedbackType hapticFeedbackType, int i, int i2, int i3, Composer composer, int i4) {
        CommonButtonPlace(modifier, z, str, z2, z3, z4, function0, z5, z6, z7, z8, z9, hapticFeedbackType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButton_UPEs2M4$lambda$10(Modifier modifier, boolean z, String str, boolean z2, boolean z3, boolean z4, Function0 function0, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Brush brush, Color color, boolean z10, boolean z11, Dp dp, TextUnit textUnit, Dp dp2, Dp dp3, HapticFeedbackType hapticFeedbackType, int i, int i2, int i3, int i4, Composer composer, int i5) {
        m12915CommonButtonUPEs2M4(modifier, z, str, z2, z3, z4, function0, z5, z6, z7, z8, z9, brush, color, z10, z11, dp, textUnit, dp2, dp3, hapticFeedbackType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0562 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0308  */
    /* renamed from: CommonButton-UPEs2M4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12915CommonButtonUPEs2M4(Modifier modifier, boolean z, final String text, boolean z2, boolean z3, boolean z4, final Function0<Unit> onClick, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Brush brush, Color color, boolean z10, boolean z11, Dp dp, TextUnit textUnit, Dp dp2, Dp dp3, HapticFeedbackType hapticFeedbackType, Composer composer, final int i, final int i2, final int i3, final int i4) {
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
        Dp dp4;
        int i23;
        int i24;
        int i25;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Color color2;
        boolean z18;
        boolean z19;
        TextUnit textUnit2;
        Dp dp5;
        Dp dp6;
        Object rememberedValue;
        Brush brush2;
        float m7774constructorimpl;
        long sp;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        int CommonButton_UPEs2M4$lambda$1;
        long j;
        long j2;
        Object rememberedValue2;
        Modifier.Companion companion;
        Brush brush3;
        Modifier.Companion companion2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        FontWeight medium;
        Object rememberedValue3;
        Composer composer2;
        final Modifier modifier2;
        final boolean z20;
        final boolean z21;
        final boolean z22;
        final boolean z23;
        final boolean z24;
        final boolean z25;
        final boolean z26;
        final boolean z27;
        final boolean z28;
        final Brush brush4;
        final Color color3;
        final boolean z29;
        final boolean z30;
        final Dp dp7;
        final TextUnit textUnit3;
        final Dp dp8;
        final Dp dp9;
        final HapticFeedbackType hapticFeedbackType2;
        float m7774constructorimpl4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1970952763);
        int i26 = i4 & 1;
        if (i26 != 0) {
            i5 = i | 6;
        } else if ((i & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        int i27 = i4 & 2;
        if (i27 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i4 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= startRestartGroup.changed(text) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                i5 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i & 24576) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i5 |= startRestartGroup.changedInstance(onClick) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(z5) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i5 |= startRestartGroup.changed(z6) ? 67108864 : 33554432;
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i5 |= startRestartGroup.changed(z7) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                        i13 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i13 = i2 | (startRestartGroup.changed(z8) ? 4 : 2);
                    } else {
                        i13 = i2;
                    }
                    i14 = i4 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i13 |= startRestartGroup.changed(z9) ? 32 : 16;
                    }
                    int i28 = i13;
                    i15 = i4 & 4096;
                    if (i15 == 0) {
                        i28 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i28 |= startRestartGroup.changed(brush) ? 256 : 128;
                        i16 = i4 & 8192;
                        if (i16 != 0) {
                            i28 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i28 |= startRestartGroup.changed(color) ? 2048 : 1024;
                            i17 = i4 & 16384;
                            if (i17 == 0) {
                                i28 |= 24576;
                                i18 = i17;
                            } else {
                                i18 = i17;
                                if ((i2 & 24576) == 0) {
                                    i28 |= startRestartGroup.changed(z10) ? 16384 : 8192;
                                    i19 = i4 & 32768;
                                    if (i19 != 0) {
                                        i28 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i28 |= startRestartGroup.changed(z11) ? 131072 : 65536;
                                    }
                                    i20 = i4 & 65536;
                                    if (i20 != 0) {
                                        i28 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i28 |= startRestartGroup.changed(dp) ? 1048576 : 524288;
                                    }
                                    i21 = i4 & 131072;
                                    if (i21 != 0) {
                                        i28 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i28 |= startRestartGroup.changed(textUnit) ? 8388608 : 4194304;
                                    }
                                    i22 = i4 & 262144;
                                    if (i22 != 0) {
                                        i28 |= 100663296;
                                        dp4 = dp2;
                                    } else {
                                        dp4 = dp2;
                                        if ((i2 & 100663296) == 0) {
                                            i28 |= startRestartGroup.changed(dp4) ? 67108864 : 33554432;
                                        }
                                    }
                                    i23 = i4 & 524288;
                                    if (i23 != 0) {
                                        i28 |= 805306368;
                                    } else if ((i2 & 805306368) == 0) {
                                        i28 |= startRestartGroup.changed(dp3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    }
                                    i24 = i4 & 1048576;
                                    if (i24 != 0) {
                                        i25 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        i25 = i3 | (startRestartGroup.changed(hapticFeedbackType == null ? -1 : hapticFeedbackType.ordinal()) ? 4 : 2);
                                    } else {
                                        i25 = i3;
                                    }
                                    if ((306783379 & i5) == 306783378 || (306783379 & i28) != 306783378 || (i25 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                        Modifier modifier3 = i26 != 0 ? Modifier.INSTANCE : modifier;
                                        z12 = i27 != 0 ? true : z;
                                        boolean z31 = i6 != 0 ? false : z2;
                                        z13 = i7 != 0 ? false : z3;
                                        z14 = i8 != 0 ? true : z4;
                                        boolean z32 = i9 != 0 ? false : z5;
                                        z15 = i10 != 0 ? false : z6;
                                        boolean z33 = i11 != 0 ? true : z7;
                                        z16 = i12 != 0 ? false : z8;
                                        z17 = i14 != 0 ? false : z9;
                                        Brush brush5 = i15 != 0 ? null : brush;
                                        color2 = i16 != 0 ? null : color;
                                        z18 = i18 != 0 ? false : z10;
                                        z19 = i19 != 0 ? false : z11;
                                        Dp dp10 = i20 != 0 ? null : dp;
                                        textUnit2 = i21 != 0 ? null : textUnit;
                                        dp5 = i22 != 0 ? null : dp4;
                                        dp6 = i23 != 0 ? null : dp3;
                                        HapticFeedbackType hapticFeedbackType3 = i24 != 0 ? null : hapticFeedbackType;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1970952763, i5, i28, "org.betup.ui.common.compose.CommonButton (CommonButton.kt:77)");
                                        }
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        final MutableState mutableState = (MutableState) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        if (!z14) {
                                            brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
                                        } else if (brush5 != null) {
                                            brush2 = brush5;
                                        } else if (z12) {
                                            brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                                        } else {
                                            brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
                                        }
                                        RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                                        if (!z13 && dp10 != null) {
                                            m7774constructorimpl = dp10.m7788unboximpl();
                                        } else if (z13) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(6);
                                        } else if (z31) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(10);
                                        } else {
                                            m7774constructorimpl = Dp.m7774constructorimpl(12);
                                        }
                                        if (textUnit2 != null) {
                                            sp = textUnit2.getPackedValue();
                                        } else if (z13) {
                                            sp = TextUnitKt.getSp(10);
                                        } else if (z31) {
                                            sp = TextUnitKt.getSp(12);
                                        } else {
                                            sp = TextUnitKt.getSp(14);
                                        }
                                        if (dp6 != null) {
                                            m7774constructorimpl2 = dp6.m7788unboximpl();
                                        } else if (z13) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(3);
                                        } else if (z31) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                                        } else {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(0);
                                        }
                                        if (dp5 != null) {
                                            m7774constructorimpl3 = dp5.m7788unboximpl();
                                        } else if (z32) {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(32);
                                        } else if (z13) {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(8);
                                        } else {
                                            m7774constructorimpl3 = Dp.m7774constructorimpl(16);
                                        }
                                        float f = m7774constructorimpl3;
                                        CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState);
                                        if (CommonButton_UPEs2M4$lambda$1 != 0) {
                                            if (CommonButton_UPEs2M4$lambda$1 == 1) {
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                                            } else if (CommonButton_UPEs2M4$lambda$1 == 2) {
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                                            } else if (CommonButton_UPEs2M4$lambda$1 == 3) {
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                                            } else if (CommonButton_UPEs2M4$lambda$1 == 4) {
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                                            } else if (CommonButton_UPEs2M4$lambda$1 == 5) {
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                                            } else {
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                                            }
                                        }
                                        long j3 = sp;
                                        if (color2 == null && z14) {
                                            j = color2.m5178unboximpl();
                                        } else if (!z19 && z14) {
                                            j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                                        } else if (!z12 && z14) {
                                            j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                        } else if (z12) {
                                            j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                        } else {
                                            j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                                        }
                                        if (!z14) {
                                            j2 = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                                        } else if (color2 != null) {
                                            j2 = color2.m5178unboximpl();
                                        } else if (z12) {
                                            j2 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                        } else {
                                            j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                        }
                                        long j4 = j2;
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        final State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, startRestartGroup, 6);
                                        startRestartGroup.startReplaceGroup(-4919094);
                                        if (!z18 && z14 && !z16) {
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            startRestartGroup.startReplaceGroup(5004770);
                                            boolean changed = startRestartGroup.changed(collectIsPressedAsState);
                                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue4 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit CommonButton_UPEs2M4$lambda$6$lambda$5;
                                                        CommonButton_UPEs2M4$lambda$6$lambda$5 = CommonButtonKt.CommonButton_UPEs2M4$lambda$6$lambda$5(State.this, (ContentDrawScope) obj);
                                                        return CommonButton_UPEs2M4$lambda$6$lambda$5;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            companion = DrawModifierKt.drawWithContent(companion3, (Function1) rememberedValue4);
                                        } else {
                                            companion = Modifier.INSTANCE;
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        if (!z19 && z14) {
                                            brush3 = brush2;
                                            companion2 = BorderKt.m1036borderxT4_qwU(Modifier.INSTANCE, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), m1810RoundedCornerShape0680j_4);
                                        } else {
                                            brush3 = brush2;
                                            companion2 = Modifier.INSTANCE;
                                        }
                                        RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                                        Modifier then = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape), brush3, roundedCornerShape, 0.0f, 4, null).then(companion);
                                        if (z17) {
                                            m7774constructorimpl = Dp.m7774constructorimpl(16);
                                        }
                                        Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then, f, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                                        startRestartGroup.startReplaceGroup(-1455341493);
                                        if (z16) {
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            if (z13) {
                                                m7774constructorimpl4 = Dp.m7774constructorimpl(14);
                                            } else if (z31) {
                                                m7774constructorimpl4 = Dp.m7774constructorimpl(16);
                                            } else {
                                                m7774constructorimpl4 = Dp.m7774constructorimpl(20);
                                            }
                                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(boxScopeInstance.align(SizeKt.m1563size3ABfNKs(companion4, m7774constructorimpl4), Alignment.INSTANCE.getCenter()), j4, (z31 || z13) ? Dp.m7774constructorimpl(2) : Dp.m7774constructorimpl(3), 0L, 0, startRestartGroup, 0, 24);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Modifier align = boxScopeInstance.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
                                        FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                                        if (z15) {
                                            medium = new FontWeight(300);
                                        } else {
                                            medium = FontWeight.INSTANCE.getMedium();
                                        }
                                        TextStyle textStyle = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j3, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                                        int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit CommonButton_UPEs2M4$lambda$9$lambda$8$lambda$7;
                                                    CommonButton_UPEs2M4$lambda$9$lambda$8$lambda$7 = CommonButtonKt.CommonButton_UPEs2M4$lambda$9$lambda$8$lambda$7(MutableState.this, (TextLayoutResult) obj);
                                                    return CommonButton_UPEs2M4$lambda$9$lambda$8$lambda$7;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        composer2 = startRestartGroup;
                                        Modifier modifier4 = modifier3;
                                        TextKt.m2642Text4IGK_g(text, align, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle, composer2, (i5 >> 6) & 14, 199728, 22524);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier2 = modifier4;
                                        z20 = z12;
                                        z21 = z31;
                                        z22 = z13;
                                        z23 = z14;
                                        z24 = z32;
                                        z25 = z15;
                                        z26 = z33;
                                        z27 = z16;
                                        z28 = z17;
                                        brush4 = brush5;
                                        color3 = color2;
                                        z29 = z18;
                                        z30 = z19;
                                        dp7 = dp10;
                                        textUnit3 = textUnit2;
                                        dp8 = dp5;
                                        dp9 = dp6;
                                        hapticFeedbackType2 = hapticFeedbackType3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        z20 = z;
                                        z21 = z2;
                                        z22 = z3;
                                        z23 = z4;
                                        z24 = z5;
                                        z25 = z6;
                                        z26 = z7;
                                        z27 = z8;
                                        brush4 = brush;
                                        color3 = color;
                                        z30 = z11;
                                        dp7 = dp;
                                        textUnit3 = textUnit;
                                        dp9 = dp3;
                                        hapticFeedbackType2 = hapticFeedbackType;
                                        composer2 = startRestartGroup;
                                        dp8 = dp4;
                                        z28 = z9;
                                        z29 = z10;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.CommonButtonKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit CommonButton_UPEs2M4$lambda$10;
                                                CommonButton_UPEs2M4$lambda$10 = CommonButtonKt.CommonButton_UPEs2M4$lambda$10(Modifier.this, z20, text, z21, z22, z23, onClick, z24, z25, z26, z27, z28, brush4, color3, z29, z30, dp7, textUnit3, dp8, dp9, hapticFeedbackType2, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                return CommonButton_UPEs2M4$lambda$10;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i19 = i4 & 32768;
                            if (i19 != 0) {
                            }
                            i20 = i4 & 65536;
                            if (i20 != 0) {
                            }
                            i21 = i4 & 131072;
                            if (i21 != 0) {
                            }
                            i22 = i4 & 262144;
                            if (i22 != 0) {
                            }
                            i23 = i4 & 524288;
                            if (i23 != 0) {
                            }
                            i24 = i4 & 1048576;
                            if (i24 != 0) {
                            }
                            if ((306783379 & i5) == 306783378) {
                            }
                            if (i26 != 0) {
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
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState mutableState2 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            if (!z14) {
                            }
                            RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                            if (!z13) {
                            }
                            if (z13) {
                            }
                            if (textUnit2 != null) {
                            }
                            if (dp6 != null) {
                            }
                            if (dp5 != null) {
                            }
                            float f2 = m7774constructorimpl3;
                            CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState2);
                            if (CommonButton_UPEs2M4$lambda$1 != 0) {
                            }
                            long j32 = sp;
                            if (color2 == null) {
                            }
                            if (!z19) {
                            }
                            if (!z12) {
                            }
                            if (z12) {
                            }
                            if (!z14) {
                            }
                            long j42 = j2;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            final State collectIsPressedAsState2 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(-4919094);
                            if (!z18) {
                            }
                            companion = Modifier.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            if (!z19) {
                            }
                            brush3 = brush2;
                            companion2 = Modifier.INSTANCE;
                            RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
                            Modifier then2 = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape2), brush3, roundedCornerShape2, 0.0f, 4, null).then(companion);
                            if (z17) {
                            }
                            Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then2, f2, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource2, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
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
                            startRestartGroup.startReplaceGroup(-1455341493);
                            if (z16) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier align2 = boxScopeInstance2.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
                            FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                            if (z15) {
                            }
                            TextStyle textStyle2 = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j32, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                            int m7709getClipgIe3tQ82 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                            startRestartGroup.startReplaceGroup(5004770);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                            Modifier modifier42 = modifier3;
                            TextKt.m2642Text4IGK_g(text, align2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle2, composer2, (i5 >> 6) & 14, 199728, 22524);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                            z20 = z12;
                            z21 = z31;
                            z22 = z13;
                            z23 = z14;
                            z24 = z32;
                            z25 = z15;
                            z26 = z33;
                            z27 = z16;
                            z28 = z17;
                            brush4 = brush5;
                            color3 = color2;
                            z29 = z18;
                            z30 = z19;
                            dp7 = dp10;
                            textUnit3 = textUnit2;
                            dp8 = dp5;
                            dp9 = dp6;
                            hapticFeedbackType2 = hapticFeedbackType3;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i17 = i4 & 16384;
                        if (i17 == 0) {
                        }
                        i19 = i4 & 32768;
                        if (i19 != 0) {
                        }
                        i20 = i4 & 65536;
                        if (i20 != 0) {
                        }
                        i21 = i4 & 131072;
                        if (i21 != 0) {
                        }
                        i22 = i4 & 262144;
                        if (i22 != 0) {
                        }
                        i23 = i4 & 524288;
                        if (i23 != 0) {
                        }
                        i24 = i4 & 1048576;
                        if (i24 != 0) {
                        }
                        if ((306783379 & i5) == 306783378) {
                        }
                        if (i26 != 0) {
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
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState22 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        if (!z14) {
                        }
                        RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                        if (!z13) {
                        }
                        if (z13) {
                        }
                        if (textUnit2 != null) {
                        }
                        if (dp6 != null) {
                        }
                        if (dp5 != null) {
                        }
                        float f22 = m7774constructorimpl3;
                        CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState22);
                        if (CommonButton_UPEs2M4$lambda$1 != 0) {
                        }
                        long j322 = sp;
                        if (color2 == null) {
                        }
                        if (!z19) {
                        }
                        if (!z12) {
                        }
                        if (z12) {
                        }
                        if (!z14) {
                        }
                        long j422 = j2;
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        final State collectIsPressedAsState22 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource22, startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(-4919094);
                        if (!z18) {
                        }
                        companion = Modifier.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        if (!z19) {
                        }
                        brush3 = brush2;
                        companion2 = Modifier.INSTANCE;
                        RoundedCornerShape roundedCornerShape22 = m1810RoundedCornerShape0680j_422;
                        Modifier then22 = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape22), brush3, roundedCornerShape22, 0.0f, 4, null).then(companion);
                        if (z17) {
                        }
                        Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then22, f22, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource22, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1455341493);
                        if (z16) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier align22 = boxScopeInstance22.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
                        FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                        if (z15) {
                        }
                        TextStyle textStyle22 = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j322, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily22, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                        int m7709getClipgIe3tQ822 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                        startRestartGroup.startReplaceGroup(5004770);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        Modifier modifier422 = modifier3;
                        TextKt.m2642Text4IGK_g(text, align22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ822, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle22, composer2, (i5 >> 6) & 14, 199728, 22524);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier422;
                        z20 = z12;
                        z21 = z31;
                        z22 = z13;
                        z23 = z14;
                        z24 = z32;
                        z25 = z15;
                        z26 = z33;
                        z27 = z16;
                        z28 = z17;
                        brush4 = brush5;
                        color3 = color2;
                        z29 = z18;
                        z30 = z19;
                        dp7 = dp10;
                        textUnit3 = textUnit2;
                        dp8 = dp5;
                        dp9 = dp6;
                        hapticFeedbackType2 = hapticFeedbackType3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i4 & 8192;
                    if (i16 != 0) {
                    }
                    i17 = i4 & 16384;
                    if (i17 == 0) {
                    }
                    i19 = i4 & 32768;
                    if (i19 != 0) {
                    }
                    i20 = i4 & 65536;
                    if (i20 != 0) {
                    }
                    i21 = i4 & 131072;
                    if (i21 != 0) {
                    }
                    i22 = i4 & 262144;
                    if (i22 != 0) {
                    }
                    i23 = i4 & 524288;
                    if (i23 != 0) {
                    }
                    i24 = i4 & 1048576;
                    if (i24 != 0) {
                    }
                    if ((306783379 & i5) == 306783378) {
                    }
                    if (i26 != 0) {
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
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState222 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    if (!z14) {
                    }
                    RoundedCornerShape m1810RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                    if (!z13) {
                    }
                    if (z13) {
                    }
                    if (textUnit2 != null) {
                    }
                    if (dp6 != null) {
                    }
                    if (dp5 != null) {
                    }
                    float f222 = m7774constructorimpl3;
                    CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState222);
                    if (CommonButton_UPEs2M4$lambda$1 != 0) {
                    }
                    long j3222 = sp;
                    if (color2 == null) {
                    }
                    if (!z19) {
                    }
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    if (!z14) {
                    }
                    long j4222 = j2;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    final State collectIsPressedAsState222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource222, startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(-4919094);
                    if (!z18) {
                    }
                    companion = Modifier.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    if (!z19) {
                    }
                    brush3 = brush2;
                    companion2 = Modifier.INSTANCE;
                    RoundedCornerShape roundedCornerShape222 = m1810RoundedCornerShape0680j_4222;
                    Modifier then222 = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape222), brush3, roundedCornerShape222, 0.0f, 4, null).then(companion);
                    if (z17) {
                    }
                    Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then222, f222, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource222, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1455341493);
                    if (z16) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier align222 = boxScopeInstance222.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
                    FontFamily sfProFontFamily222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                    if (z15) {
                    }
                    TextStyle textStyle222 = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j3222, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                    int m7709getClipgIe3tQ8222 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    Modifier modifier4222 = modifier3;
                    TextKt.m2642Text4IGK_g(text, align222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8222, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle222, composer2, (i5 >> 6) & 14, 199728, 22524);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier4222;
                    z20 = z12;
                    z21 = z31;
                    z22 = z13;
                    z23 = z14;
                    z24 = z32;
                    z25 = z15;
                    z26 = z33;
                    z27 = z16;
                    z28 = z17;
                    brush4 = brush5;
                    color3 = color2;
                    z29 = z18;
                    z30 = z19;
                    dp7 = dp10;
                    textUnit3 = textUnit2;
                    dp8 = dp5;
                    dp9 = dp6;
                    hapticFeedbackType2 = hapticFeedbackType3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
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
                int i282 = i13;
                i15 = i4 & 4096;
                if (i15 == 0) {
                }
                i16 = i4 & 8192;
                if (i16 != 0) {
                }
                i17 = i4 & 16384;
                if (i17 == 0) {
                }
                i19 = i4 & 32768;
                if (i19 != 0) {
                }
                i20 = i4 & 65536;
                if (i20 != 0) {
                }
                i21 = i4 & 131072;
                if (i21 != 0) {
                }
                i22 = i4 & 262144;
                if (i22 != 0) {
                }
                i23 = i4 & 524288;
                if (i23 != 0) {
                }
                i24 = i4 & 1048576;
                if (i24 != 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                if (i26 != 0) {
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
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState2222 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                if (!z14) {
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_42222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                if (!z13) {
                }
                if (z13) {
                }
                if (textUnit2 != null) {
                }
                if (dp6 != null) {
                }
                if (dp5 != null) {
                }
                float f2222 = m7774constructorimpl3;
                CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState2222);
                if (CommonButton_UPEs2M4$lambda$1 != 0) {
                }
                long j32222 = sp;
                if (color2 == null) {
                }
                if (!z19) {
                }
                if (!z12) {
                }
                if (z12) {
                }
                if (!z14) {
                }
                long j42222 = j2;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                final State collectIsPressedAsState2222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2222, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(-4919094);
                if (!z18) {
                }
                companion = Modifier.INSTANCE;
                startRestartGroup.endReplaceGroup();
                if (!z19) {
                }
                brush3 = brush2;
                companion2 = Modifier.INSTANCE;
                RoundedCornerShape roundedCornerShape2222 = m1810RoundedCornerShape0680j_42222;
                Modifier then2222 = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape2222), brush3, roundedCornerShape2222, 0.0f, 4, null).then(companion);
                if (z17) {
                }
                Modifier clickAnimation2222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then2222, f2222, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource2222, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1455341493);
                if (z16) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier align2222 = boxScopeInstance2222.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
                FontFamily sfProFontFamily2222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                if (z15) {
                }
                TextStyle textStyle2222 = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j32222, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                int m7709getClipgIe3tQ82222 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                Modifier modifier42222 = modifier3;
                TextKt.m2642Text4IGK_g(text, align2222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82222, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle2222, composer2, (i5 >> 6) & 14, 199728, 22524);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42222;
                z20 = z12;
                z21 = z31;
                z22 = z13;
                z23 = z14;
                z24 = z32;
                z25 = z15;
                z26 = z33;
                z27 = z16;
                z28 = z17;
                brush4 = brush5;
                color3 = color2;
                z29 = z18;
                z30 = z19;
                dp7 = dp10;
                textUnit3 = textUnit2;
                dp8 = dp5;
                dp9 = dp6;
                hapticFeedbackType2 = hapticFeedbackType3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
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
            int i2822 = i13;
            i15 = i4 & 4096;
            if (i15 == 0) {
            }
            i16 = i4 & 8192;
            if (i16 != 0) {
            }
            i17 = i4 & 16384;
            if (i17 == 0) {
            }
            i19 = i4 & 32768;
            if (i19 != 0) {
            }
            i20 = i4 & 65536;
            if (i20 != 0) {
            }
            i21 = i4 & 131072;
            if (i21 != 0) {
            }
            i22 = i4 & 262144;
            if (i22 != 0) {
            }
            i23 = i4 & 524288;
            if (i23 != 0) {
            }
            i24 = i4 & 1048576;
            if (i24 != 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            if (i26 != 0) {
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
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if (i24 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState22222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (!z14) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_422222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            if (!z13) {
            }
            if (z13) {
            }
            if (textUnit2 != null) {
            }
            if (dp6 != null) {
            }
            if (dp5 != null) {
            }
            float f22222 = m7774constructorimpl3;
            CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState22222);
            if (CommonButton_UPEs2M4$lambda$1 != 0) {
            }
            long j322222 = sp;
            if (color2 == null) {
            }
            if (!z19) {
            }
            if (!z12) {
            }
            if (z12) {
            }
            if (!z14) {
            }
            long j422222 = j2;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableInteractionSource mutableInteractionSource22222 = (MutableInteractionSource) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            final State collectIsPressedAsState22222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource22222, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(-4919094);
            if (!z18) {
            }
            companion = Modifier.INSTANCE;
            startRestartGroup.endReplaceGroup();
            if (!z19) {
            }
            brush3 = brush2;
            companion2 = Modifier.INSTANCE;
            RoundedCornerShape roundedCornerShape22222 = m1810RoundedCornerShape0680j_422222;
            Modifier then22222 = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape22222), brush3, roundedCornerShape22222, 0.0f, 4, null).then(companion);
            if (z17) {
            }
            Modifier clickAnimation22222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then22222, f22222, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource22222, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1455341493);
            if (z16) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier align22222 = boxScopeInstance22222.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
            FontFamily sfProFontFamily22222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            if (z15) {
            }
            TextStyle textStyle22222 = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j322222, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily22222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
            int m7709getClipgIe3tQ822222 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            Modifier modifier422222 = modifier3;
            TextKt.m2642Text4IGK_g(text, align22222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ822222, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle22222, composer2, (i5 >> 6) & 14, 199728, 22524);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier422222;
            z20 = z12;
            z21 = z31;
            z22 = z13;
            z23 = z14;
            z24 = z32;
            z25 = z15;
            z26 = z33;
            z27 = z16;
            z28 = z17;
            brush4 = brush5;
            color3 = color2;
            z29 = z18;
            z30 = z19;
            dp7 = dp10;
            textUnit3 = textUnit2;
            dp8 = dp5;
            dp9 = dp6;
            hapticFeedbackType2 = hapticFeedbackType3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i4 & 4) == 0) {
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
        if ((i4 & 64) == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
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
        int i28222 = i13;
        i15 = i4 & 4096;
        if (i15 == 0) {
        }
        i16 = i4 & 8192;
        if (i16 != 0) {
        }
        i17 = i4 & 16384;
        if (i17 == 0) {
        }
        i19 = i4 & 32768;
        if (i19 != 0) {
        }
        i20 = i4 & 65536;
        if (i20 != 0) {
        }
        i21 = i4 & 131072;
        if (i21 != 0) {
        }
        i22 = i4 & 262144;
        if (i22 != 0) {
        }
        i23 = i4 & 524288;
        if (i23 != 0) {
        }
        i24 = i4 & 1048576;
        if (i24 != 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        if (i26 != 0) {
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
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState222222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        if (!z14) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_4222222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        if (!z13) {
        }
        if (z13) {
        }
        if (textUnit2 != null) {
        }
        if (dp6 != null) {
        }
        if (dp5 != null) {
        }
        float f222222 = m7774constructorimpl3;
        CommonButton_UPEs2M4$lambda$1 = CommonButton_UPEs2M4$lambda$1(mutableState222222);
        if (CommonButton_UPEs2M4$lambda$1 != 0) {
        }
        long j3222222 = sp;
        if (color2 == null) {
        }
        if (!z19) {
        }
        if (!z12) {
        }
        if (z12) {
        }
        if (!z14) {
        }
        long j4222222 = j2;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource222222 = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        final State collectIsPressedAsState222222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource222222, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-4919094);
        if (!z18) {
        }
        companion = Modifier.INSTANCE;
        startRestartGroup.endReplaceGroup();
        if (!z19) {
        }
        brush3 = brush2;
        companion2 = Modifier.INSTANCE;
        RoundedCornerShape roundedCornerShape222222 = m1810RoundedCornerShape0680j_4222222;
        Modifier then222222 = BackgroundKt.background$default(ClipKt.clip(modifier3.then(companion2), roundedCornerShape222222), brush3, roundedCornerShape222222, 0.0f, 4, null).then(companion);
        if (z17) {
        }
        Modifier clickAnimation222222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(then222222, f222222, m7774constructorimpl), onClick, null, (z14 || z16) ? false : true, mutableInteractionSource222222, null, 0, 0, 0.0f, 0.0f, z33, false, hapticFeedbackType3, startRestartGroup, ((i5 >> 15) & 112) | 24576, ((i5 >> 27) & 14) | ((i25 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1455341493);
        if (z16) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier align222222 = boxScopeInstance222222.align(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, m7774constructorimpl2, 0.0f, 2, null), Alignment.INSTANCE.getCenter());
        FontFamily sfProFontFamily222222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        if (z15) {
        }
        TextStyle textStyle222222 = new TextStyle(Color.m5167copywmQWz5c$default(j, z16 ? 0.0f : Color.m5170getAlphaimpl(j), 0.0f, 0.0f, 0.0f, 14, null), j3222222, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily222222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
        int m7709getClipgIe3tQ8222222 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        Modifier modifier4222222 = modifier3;
        TextKt.m2642Text4IGK_g(text, align222222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8222222, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle222222, composer2, (i5 >> 6) & 14, 199728, 22524);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4222222;
        z20 = z12;
        z21 = z31;
        z22 = z13;
        z23 = z14;
        z24 = z32;
        z25 = z15;
        z26 = z33;
        z27 = z16;
        z28 = z17;
        brush4 = brush5;
        color3 = color2;
        z29 = z18;
        z30 = z19;
        dp7 = dp10;
        textUnit3 = textUnit2;
        dp8 = dp5;
        dp9 = dp6;
        hapticFeedbackType2 = hapticFeedbackType3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final int CommonButton_UPEs2M4$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void CommonButton_UPEs2M4$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButton_UPEs2M4$lambda$6$lambda$5(State state, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (CommonButton_UPEs2M4$lambda$4(state)) {
            DrawScope.m5724drawRectnJ9OG0$default(drawWithContent, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButton_UPEs2M4$lambda$9$lambda$8$lambda$7(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        float width = textLayoutResult.getMultiParagraph().getWidth();
        int size = (int) (textLayoutResult.getSize() >> 32);
        boolean z = textLayoutResult.getLineCount() > 1;
        if ((width > size || z) && CommonButton_UPEs2M4$lambda$1(mutableState) < 6) {
            CommonButton_UPEs2M4$lambda$2(mutableState, CommonButton_UPEs2M4$lambda$1(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonButtonPlace(Modifier modifier, boolean z, final String text, boolean z2, boolean z3, boolean z4, final Function0<Unit> onClick, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, HapticFeedbackType hapticFeedbackType, Composer composer, final int i, final int i2, final int i3) {
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object rememberedValue;
        Brush brush;
        float m7774constructorimpl;
        long sp;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        int CommonButtonPlace$lambda$12;
        long j;
        long j2;
        Object rememberedValue2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        float f;
        int i16;
        int i17;
        FontWeight medium;
        Object rememberedValue3;
        Composer composer2;
        final Modifier modifier2;
        final boolean z17;
        final boolean z18;
        final boolean z19;
        final boolean z20;
        final boolean z21;
        final boolean z22;
        final boolean z23;
        final boolean z24;
        final boolean z25;
        final HapticFeedbackType hapticFeedbackType2;
        float m7774constructorimpl4;
        ScopeUpdateScope endRestartGroup;
        int i18;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-937764042);
        int i19 = i3 & 1;
        if (i19 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i4 |= startRestartGroup.changed(text) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        i18 = (i & 1572864) == 0 ? startRestartGroup.changedInstance(onClick) ? 1048576 : 524288 : 1572864;
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(z5) ? 8388608 : 4194304;
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(z6) ? 67108864 : 33554432;
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(z7) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i2 | (startRestartGroup.changed(z8) ? 4 : 2);
                        } else {
                            i12 = i2;
                        }
                        i13 = i3 & 2048;
                        if (i13 != 0) {
                            i12 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i12 |= startRestartGroup.changed(z9) ? 32 : 16;
                        }
                        i14 = i12;
                        i15 = i3 & 4096;
                        if (i15 != 0) {
                            i14 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i14 |= startRestartGroup.changed(hapticFeedbackType == null ? -1 : hapticFeedbackType.ordinal()) ? 256 : 128;
                        }
                        if ((306783379 & i4) == 306783378 || (i14 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                            Modifier modifier3 = i19 != 0 ? Modifier.INSTANCE : modifier;
                            z10 = i20 != 0 ? true : z;
                            boolean z26 = i5 != 0 ? false : z2;
                            z11 = i6 != 0 ? false : z3;
                            z12 = i7 != 0 ? true : z4;
                            z13 = i8 != 0 ? false : z5;
                            z14 = i9 != 0 ? false : z6;
                            z15 = i10 != 0 ? true : z7;
                            z16 = i11 != 0 ? false : z8;
                            boolean z27 = i13 != 0 ? false : z9;
                            HapticFeedbackType hapticFeedbackType3 = i15 != 0 ? HapticFeedbackType.Confirm : hapticFeedbackType;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-937764042, i4, i14, "org.betup.ui.common.compose.CommonButtonPlace (CommonButton.kt:248)");
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final MutableState mutableState = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            if (!z12) {
                                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
                            } else if (z10) {
                                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                            } else {
                                brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
                            }
                            if (z11) {
                                m7774constructorimpl = Dp.m7774constructorimpl(6);
                            } else if (z26) {
                                m7774constructorimpl = Dp.m7774constructorimpl(10);
                            } else {
                                m7774constructorimpl = Dp.m7774constructorimpl(12);
                            }
                            if (z11) {
                                sp = TextUnitKt.getSp(10);
                            } else if (z26) {
                                sp = TextUnitKt.getSp(12);
                            } else {
                                sp = TextUnitKt.getSp(14);
                            }
                            if (z11) {
                                m7774constructorimpl2 = Dp.m7774constructorimpl(3);
                            } else if (z26) {
                                m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                            } else {
                                m7774constructorimpl2 = Dp.m7774constructorimpl(0);
                            }
                            if (z13) {
                                m7774constructorimpl3 = Dp.m7774constructorimpl(32);
                            } else if (z11) {
                                m7774constructorimpl3 = Dp.m7774constructorimpl(8);
                            } else {
                                m7774constructorimpl3 = Dp.m7774constructorimpl(16);
                            }
                            CommonButtonPlace$lambda$12 = CommonButtonPlace$lambda$12(mutableState);
                            if (CommonButtonPlace$lambda$12 != 0) {
                                if (CommonButtonPlace$lambda$12 == 1) {
                                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                                } else if (CommonButtonPlace$lambda$12 == 2) {
                                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                                } else if (CommonButtonPlace$lambda$12 == 3) {
                                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                                } else if (CommonButtonPlace$lambda$12 == 4) {
                                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                                } else if (CommonButtonPlace$lambda$12 == 5) {
                                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                                } else {
                                    sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                                }
                            }
                            long j3 = sp;
                            if (!z10) {
                                j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                            } else if (z12) {
                                j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                            } else {
                                j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                            }
                            long j4 = j;
                            if (!z12) {
                                j2 = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                            } else if (z10) {
                                j2 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                            } else {
                                j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                            }
                            long j5 = j2;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, startRestartGroup, 6);
                            RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                            boolean z28 = (z12 || z16) ? false : true;
                            startRestartGroup.startReplaceGroup(751974757);
                            if (!z15 && z28 && CommonButtonPlace$lambda$15(collectIsPressedAsState)) {
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit CommonButtonPlace$lambda$17$lambda$16;
                                            CommonButtonPlace$lambda$17$lambda$16 = CommonButtonKt.CommonButtonPlace$lambda$17$lambda$16((ContentDrawScope) obj);
                                            return CommonButtonPlace$lambda$17$lambda$16;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceGroup();
                                companion = DrawModifierKt.drawWithContent(companion2, (Function1) rememberedValue4);
                            } else {
                                companion = Modifier.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            float f2 = 20;
                            float f3 = 14;
                            float f4 = m7774constructorimpl;
                            float f5 = m7774constructorimpl2;
                            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, Dp.m7774constructorimpl(f3), 0.0f, Dp.m7774constructorimpl(f2), 5, null), null, false, 3, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default);
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
                            RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                            Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(BackgroundKt.background$default(ClipKt.clip(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), roundedCornerShape), brush, roundedCornerShape, 0.0f, 4, null).then(companion), onClick, null, z28, mutableInteractionSource, null, 0, 0, 0.0f, 0.0f, z15, false, hapticFeedbackType3, startRestartGroup, ((i4 >> 15) & 112) | 24576, ((i4 >> 27) & 14) | (i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation);
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
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Alignment.Horizontal horizontal = null;
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), m7774constructorimpl3, z27 ? Dp.m7774constructorimpl(16) : f4);
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-517056543);
                            if (z16) {
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                if (z11) {
                                    m7774constructorimpl4 = Dp.m7774constructorimpl(f3);
                                } else if (z26) {
                                    m7774constructorimpl4 = Dp.m7774constructorimpl(16);
                                } else {
                                    m7774constructorimpl4 = Dp.m7774constructorimpl(f2);
                                }
                                Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(companion3, m7774constructorimpl4);
                                i16 = i4;
                                f = f5;
                                i17 = 3;
                                horizontal = null;
                                ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(m1563size3ABfNKs, j5, (z26 || z11) ? Dp.m7774constructorimpl(2) : Dp.m7774constructorimpl(3), 0L, 0, startRestartGroup, 0, 24);
                            } else {
                                f = f5;
                                i16 = i4;
                                i17 = 3;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal, false, i17, horizontal), f, 0.0f, 2, horizontal);
                            FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                            if (z14) {
                                medium = new FontWeight(300);
                            } else {
                                medium = FontWeight.INSTANCE.getMedium();
                            }
                            TextStyle textStyle = new TextStyle(Color.m5167copywmQWz5c$default(j4, z16 ? 0.0f : Color.m5170getAlphaimpl(j4), 0.0f, 0.0f, 0.0f, 14, null), j3, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                            int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                            startRestartGroup.startReplaceGroup(5004770);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CommonButtonPlace$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18;
                                        CommonButtonPlace$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18 = CommonButtonKt.CommonButtonPlace$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(MutableState.this, (TextLayoutResult) obj);
                                        return CommonButtonPlace$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                            TextKt.m2642Text4IGK_g(text, m1518paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle, composer2, (i16 >> 6) & 14, 199728, 22524);
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
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            z17 = z10;
                            z18 = z26;
                            z19 = z11;
                            z20 = z12;
                            z21 = z13;
                            z22 = z14;
                            z23 = z15;
                            z24 = z16;
                            z25 = z27;
                            hapticFeedbackType2 = hapticFeedbackType3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z18 = z2;
                            z19 = z3;
                            z20 = z4;
                            z21 = z5;
                            z22 = z6;
                            z23 = z7;
                            z24 = z8;
                            z25 = z9;
                            hapticFeedbackType2 = hapticFeedbackType;
                            composer2 = startRestartGroup;
                            z17 = z;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.CommonButtonKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit CommonButtonPlace$lambda$23;
                                    CommonButtonPlace$lambda$23 = CommonButtonKt.CommonButtonPlace$lambda$23(Modifier.this, z17, text, z18, z19, z20, onClick, z21, z22, z23, z24, z25, hapticFeedbackType2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return CommonButtonPlace$lambda$23;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= i18;
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    i13 = i3 & 2048;
                    if (i13 != 0) {
                    }
                    i14 = i12;
                    i15 = i3 & 4096;
                    if (i15 != 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                    }
                    if (i19 != 0) {
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
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState2 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    if (!z12) {
                    }
                    if (z11) {
                    }
                    if (z11) {
                    }
                    if (z11) {
                    }
                    if (z13) {
                    }
                    CommonButtonPlace$lambda$12 = CommonButtonPlace$lambda$12(mutableState2);
                    if (CommonButtonPlace$lambda$12 != 0) {
                    }
                    long j32 = sp;
                    if (!z10) {
                    }
                    long j42 = j;
                    if (!z12) {
                    }
                    long j52 = j2;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    State<Boolean> collectIsPressedAsState2 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2, startRestartGroup, 6);
                    RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                    if (z12) {
                    }
                    startRestartGroup.startReplaceGroup(751974757);
                    if (!z15) {
                    }
                    companion = Modifier.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    float f22 = 20;
                    float f32 = 14;
                    float f42 = m7774constructorimpl;
                    float f52 = m7774constructorimpl2;
                    Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, Dp.m7774constructorimpl(f32), 0.0f, Dp.m7774constructorimpl(f22), 5, null), null, false, 3, null);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
                    Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(BackgroundKt.background$default(ClipKt.clip(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), roundedCornerShape2), brush, roundedCornerShape2, 0.0f, 4, null).then(companion), onClick, null, z28, mutableInteractionSource2, null, 0, 0, 0.0f, 0.0f, z15, false, hapticFeedbackType3, startRestartGroup, ((i4 >> 15) & 112) | 24576, ((i4 >> 27) & 14) | (i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal horizontal2 = null;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), m7774constructorimpl3, z27 ? Dp.m7774constructorimpl(16) : f42);
                    Alignment center22 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-517056543);
                    if (z16) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal2, false, i17, horizontal2), f, 0.0f, 2, horizontal2);
                    FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                    if (z14) {
                    }
                    TextStyle textStyle2 = new TextStyle(Color.m5167copywmQWz5c$default(j42, z16 ? 0.0f : Color.m5170getAlphaimpl(j42), 0.0f, 0.0f, 0.0f, 14, null), j32, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                    int m7709getClipgIe3tQ82 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    TextKt.m2642Text4IGK_g(text, m1518paddingVpY3zN4$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle2, composer2, (i16 >> 6) & 14, 199728, 22524);
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
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    z17 = z10;
                    z18 = z26;
                    z19 = z11;
                    z20 = z12;
                    z21 = z13;
                    z22 = z14;
                    z23 = z15;
                    z24 = z16;
                    z25 = z27;
                    hapticFeedbackType2 = hapticFeedbackType3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                i4 |= i18;
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                }
                i14 = i12;
                i15 = i3 & 4096;
                if (i15 != 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                if (i19 != 0) {
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
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState22 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                if (!z12) {
                }
                if (z11) {
                }
                if (z11) {
                }
                if (z11) {
                }
                if (z13) {
                }
                CommonButtonPlace$lambda$12 = CommonButtonPlace$lambda$12(mutableState22);
                if (CommonButtonPlace$lambda$12 != 0) {
                }
                long j322 = sp;
                if (!z10) {
                }
                long j422 = j;
                if (!z12) {
                }
                long j522 = j2;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                State<Boolean> collectIsPressedAsState22 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource22, startRestartGroup, 6);
                RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                if (z12) {
                }
                startRestartGroup.startReplaceGroup(751974757);
                if (!z15) {
                }
                companion = Modifier.INSTANCE;
                startRestartGroup.endReplaceGroup();
                float f222 = 20;
                float f322 = 14;
                float f422 = m7774constructorimpl;
                float f522 = m7774constructorimpl2;
                Modifier wrapContentWidth$default22 = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, Dp.m7774constructorimpl(f322), 0.0f, Dp.m7774constructorimpl(f222), 5, null), null, false, 3, null);
                Alignment center32 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(center32, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default22);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                RoundedCornerShape roundedCornerShape22 = m1810RoundedCornerShape0680j_422;
                Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(BackgroundKt.background$default(ClipKt.clip(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), roundedCornerShape22), brush, roundedCornerShape22, 0.0f, 4, null).then(companion), onClick, null, z28, mutableInteractionSource22, null, 0, 0, 0.0f, 0.0f, z15, false, hapticFeedbackType3, startRestartGroup, ((i4 >> 15) & 112) | 24576, ((i4 >> 27) & 14) | (i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal horizontal22 = null;
                Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), m7774constructorimpl3, z27 ? Dp.m7774constructorimpl(16) : f422);
                Alignment center222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-517056543);
                if (z16) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal22, false, i17, horizontal22), f, 0.0f, 2, horizontal22);
                FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                if (z14) {
                }
                TextStyle textStyle22 = new TextStyle(Color.m5167copywmQWz5c$default(j422, z16 ? 0.0f : Color.m5170getAlphaimpl(j422), 0.0f, 0.0f, 0.0f, 14, null), j322, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily22, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                int m7709getClipgIe3tQ822 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                TextKt.m2642Text4IGK_g(text, m1518paddingVpY3zN4$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ822, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle22, composer2, (i16 >> 6) & 14, 199728, 22524);
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
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                z17 = z10;
                z18 = z26;
                z19 = z11;
                z20 = z12;
                z21 = z13;
                z22 = z14;
                z23 = z15;
                z24 = z16;
                z25 = z27;
                hapticFeedbackType2 = hapticFeedbackType3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            i4 |= i18;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            i14 = i12;
            i15 = i3 & 4096;
            if (i15 != 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            if (i19 != 0) {
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
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (!z12) {
            }
            if (z11) {
            }
            if (z11) {
            }
            if (z11) {
            }
            if (z13) {
            }
            CommonButtonPlace$lambda$12 = CommonButtonPlace$lambda$12(mutableState222);
            if (CommonButtonPlace$lambda$12 != 0) {
            }
            long j3222 = sp;
            if (!z10) {
            }
            long j4222 = j;
            if (!z12) {
            }
            long j5222 = j2;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            State<Boolean> collectIsPressedAsState222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource222, startRestartGroup, 6);
            RoundedCornerShape m1810RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            if (z12) {
            }
            startRestartGroup.startReplaceGroup(751974757);
            if (!z15) {
            }
            companion = Modifier.INSTANCE;
            startRestartGroup.endReplaceGroup();
            float f2222 = 20;
            float f3222 = 14;
            float f4222 = m7774constructorimpl;
            float f5222 = m7774constructorimpl2;
            Modifier wrapContentWidth$default222 = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, Dp.m7774constructorimpl(f3222), 0.0f, Dp.m7774constructorimpl(f2222), 5, null), null, false, 3, null);
            Alignment center322 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(center322, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default222);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
            RoundedCornerShape roundedCornerShape222 = m1810RoundedCornerShape0680j_4222;
            Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(BackgroundKt.background$default(ClipKt.clip(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), roundedCornerShape222), brush, roundedCornerShape222, 0.0f, 4, null).then(companion), onClick, null, z28, mutableInteractionSource222, null, 0, 0, 0.0f, 0.0f, z15, false, hapticFeedbackType3, startRestartGroup, ((i4 >> 15) & 112) | 24576, ((i4 >> 27) & 14) | (i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal horizontal222 = null;
            Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), m7774constructorimpl3, z27 ? Dp.m7774constructorimpl(16) : f4222);
            Alignment center2222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-517056543);
            if (z16) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal222, false, i17, horizontal222), f, 0.0f, 2, horizontal222);
            FontFamily sfProFontFamily222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            if (z14) {
            }
            TextStyle textStyle222 = new TextStyle(Color.m5167copywmQWz5c$default(j4222, z16 ? 0.0f : Color.m5170getAlphaimpl(j4222), 0.0f, 0.0f, 0.0f, 14, null), j3222, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
            int m7709getClipgIe3tQ8222 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(text, m1518paddingVpY3zN4$default222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8222, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle222, composer2, (i16 >> 6) & 14, 199728, 22524);
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
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
            z17 = z10;
            z18 = z26;
            z19 = z11;
            z20 = z12;
            z21 = z13;
            z22 = z14;
            z23 = z15;
            z24 = z16;
            z25 = z27;
            hapticFeedbackType2 = hapticFeedbackType3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
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
        if ((i3 & 64) != 0) {
        }
        i4 |= i18;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        i14 = i12;
        i15 = i3 & 4096;
        if (i15 != 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        if (i19 != 0) {
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
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        if (!z12) {
        }
        if (z11) {
        }
        if (z11) {
        }
        if (z11) {
        }
        if (z13) {
        }
        CommonButtonPlace$lambda$12 = CommonButtonPlace$lambda$12(mutableState2222);
        if (CommonButtonPlace$lambda$12 != 0) {
        }
        long j32222 = sp;
        if (!z10) {
        }
        long j42222 = j;
        if (!z12) {
        }
        long j52222 = j2;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        State<Boolean> collectIsPressedAsState2222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2222, startRestartGroup, 6);
        RoundedCornerShape m1810RoundedCornerShape0680j_42222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        if (z12) {
        }
        startRestartGroup.startReplaceGroup(751974757);
        if (!z15) {
        }
        companion = Modifier.INSTANCE;
        startRestartGroup.endReplaceGroup();
        float f22222 = 20;
        float f32222 = 14;
        float f42222 = m7774constructorimpl;
        float f52222 = m7774constructorimpl2;
        Modifier wrapContentWidth$default2222 = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, Dp.m7774constructorimpl(f32222), 0.0f, Dp.m7774constructorimpl(f22222), 5, null), null, false, 3, null);
        Alignment center3222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy4222 = BoxKt.maybeCachedBoxMeasurePolicy(center3222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default2222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance4222 = BoxScopeInstance.INSTANCE;
        RoundedCornerShape roundedCornerShape2222 = m1810RoundedCornerShape0680j_42222;
        Modifier clickAnimation2222 = ClickAnimationModifierKt.clickAnimation(BackgroundKt.background$default(ClipKt.clip(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), roundedCornerShape2222), brush, roundedCornerShape2222, 0.0f, 4, null).then(companion), onClick, null, z28, mutableInteractionSource2222, null, 0, 0, 0.0f, 0.0f, z15, false, hapticFeedbackType3, startRestartGroup, ((i4 >> 15) & 112) | 24576, ((i4 >> 27) & 14) | (i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Alignment.Horizontal horizontal2222 = null;
        Modifier m1517paddingVpY3zN42222 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), m7774constructorimpl3, z27 ? Dp.m7774constructorimpl(16) : f42222);
        Alignment center22222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-517056543);
        if (z16) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1518paddingVpY3zN4$default2222 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal2222, false, i17, horizontal2222), f, 0.0f, 2, horizontal2222);
        FontFamily sfProFontFamily2222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        if (z14) {
        }
        TextStyle textStyle2222 = new TextStyle(Color.m5167copywmQWz5c$default(j42222, z16 ? 0.0f : Color.m5170getAlphaimpl(j42222), 0.0f, 0.0f, 0.0f, 14, null), j32222, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
        int m7709getClipgIe3tQ82222 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        TextKt.m2642Text4IGK_g(text, m1518paddingVpY3zN4$default2222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82222, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue3, textStyle2222, composer2, (i16 >> 6) & 14, 199728, 22524);
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
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        z17 = z10;
        z18 = z26;
        z19 = z11;
        z20 = z12;
        z21 = z13;
        z22 = z14;
        z23 = z15;
        z24 = z16;
        z25 = z27;
        hapticFeedbackType2 = hapticFeedbackType3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final int CommonButtonPlace$lambda$12(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void CommonButtonPlace$lambda$13(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonPlace$lambda$17$lambda$16(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m5724drawRectnJ9OG0$default(drawWithContent, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonPlace$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        float width = textLayoutResult.getMultiParagraph().getWidth();
        int size = (int) (textLayoutResult.getSize() >> 32);
        boolean z = textLayoutResult.getLineCount() > 1;
        if ((width > size || z) && CommonButtonPlace$lambda$12(mutableState) < 6) {
            CommonButtonPlace$lambda$13(mutableState, CommonButtonPlace$lambda$12(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    private static final boolean CommonButton_UPEs2M4$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonButtonPlace$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
