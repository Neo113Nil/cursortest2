package org.betup.ui.common.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: CommonButtonMatchBet.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aÉ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"CommonButtonMatchBet", "", "modifier", "Landroidx/compose/ui/Modifier;", "isSelected", "", "text", "", "isSmall", "isInMatchBet", "betCoefficient", "isButtonEnabled", "onClick", "Lkotlin/Function0;", "brushUnselected", "Landroidx/compose/ui/graphics/Brush;", "blackText", "isInBattle", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "", "isInCompetition", "isLocked", "isAnimation", "isCompact", "darkenOnPress", "hapticOnClick", "Lorg/betup/ui/common/compose/HapticFeedbackType;", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;ZZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Brush;ZZLjava/lang/Integer;ZZZZZLorg/betup/ui/common/compose/HapticFeedbackType;Landroidx/compose/runtime/Composer;III)V", "PreviewCommonButtonMatchBet", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "currentFontSize", "useBottomLayout", "isPressed"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonButtonMatchBetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonMatchBet$lambda$26(Modifier modifier, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, Function0 function0, Brush brush, boolean z5, boolean z6, Integer num, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, HapticFeedbackType hapticFeedbackType, int i, int i2, int i3, Composer composer, int i4) {
        CommonButtonMatchBet(modifier, z, str, z2, z3, str2, z4, function0, brush, z5, z6, num, z7, z8, z9, z10, z11, hapticFeedbackType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCommonButtonMatchBet$lambda$42(int i, Composer composer, int i2) {
        PreviewCommonButtonMatchBet(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0687 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x15f0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x129c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x1614  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0380  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonButtonMatchBet(Modifier modifier, boolean z, final String text, boolean z2, boolean z3, String str, boolean z4, final Function0<Unit> onClick, Brush brush, boolean z5, boolean z6, Integer num, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, HapticFeedbackType hapticFeedbackType, Composer composer, final int i, final int i2, final int i3) {
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
        Modifier.Companion companion;
        Brush brush2;
        HapticFeedbackType hapticFeedbackType2;
        boolean z12;
        boolean z13;
        final boolean z14;
        Integer num2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Brush brush3;
        String str2;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        Object rememberedValue;
        Object rememberedValue2;
        final MutableState mutableState;
        Object rememberedValue3;
        MutableState mutableState2;
        Integer extractLeadingNumber;
        String str3;
        MutableState mutableState3;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        long sp;
        float m7774constructorimpl3;
        Object rememberedValue4;
        float f;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Alignment.Horizontal horizontal;
        Composer composer2;
        String str4;
        MutableState mutableState4;
        int i19;
        long j;
        long j2;
        boolean z24;
        final Modifier modifier2;
        final boolean z25;
        final Brush brush4;
        final boolean z26;
        final boolean z27;
        final Integer num3;
        final boolean z28;
        final boolean z29;
        final boolean z30;
        final boolean z31;
        final boolean z32;
        final HapticFeedbackType hapticFeedbackType3;
        final String str5;
        int i20;
        Modifier wrapContentWidth$default;
        String str6;
        final MutableState mutableState5;
        int i21;
        long j3;
        Object obj;
        Modifier m1520paddingqDBjuR0$default;
        String str7;
        long j4;
        long j5;
        long j6;
        String str8;
        int i22;
        long j7;
        long j8;
        long j9;
        long j10;
        float m7774constructorimpl4;
        String value;
        ScopeUpdateScope endRestartGroup;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1920438965);
        int i25 = i3 & 1;
        if (i25 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i26 = i3 & 2;
        if (i26 != 0) {
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
                        i4 |= startRestartGroup.changed(str) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        i24 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(onClick) ? 8388608 : 4194304 : 12582912;
                        if ((100663296 & i) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(brush)) {
                                i23 = 67108864;
                                i4 |= i23;
                            }
                            i23 = 33554432;
                            i4 |= i23;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(z5) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i2 | (startRestartGroup.changed(z6) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        i12 = i3 & 2048;
                        if (i12 != 0) {
                            i11 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i11 |= startRestartGroup.changed(num) ? 32 : 16;
                        }
                        int i27 = i11;
                        i13 = i3 & 4096;
                        if (i13 != 0) {
                            i27 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i27 |= startRestartGroup.changed(z7) ? 256 : 128;
                            i14 = i3 & 8192;
                            if (i14 == 0) {
                                i27 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i27 |= startRestartGroup.changed(z8) ? 2048 : 1024;
                                i15 = i3 & 16384;
                                if (i15 != 0) {
                                    i27 |= 24576;
                                } else if ((i2 & 24576) == 0) {
                                    i27 |= startRestartGroup.changed(z9) ? 16384 : 8192;
                                    i16 = i3 & 32768;
                                    if (i16 == 0) {
                                        i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i27 |= startRestartGroup.changed(z10) ? 131072 : 65536;
                                    }
                                    i17 = i3 & 65536;
                                    if (i17 == 0) {
                                        i27 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i27 |= startRestartGroup.changed(z11) ? 1048576 : 524288;
                                    }
                                    i18 = i3 & 131072;
                                    if (i18 == 0) {
                                        i27 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i27 |= startRestartGroup.changed(hapticFeedbackType == null ? -1 : hapticFeedbackType.ordinal()) ? 8388608 : 4194304;
                                    }
                                    if ((306783379 & i4) == 306783378 || (4793491 & i27) != 4793490 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            companion = i25 == 0 ? Modifier.INSTANCE : modifier;
                                            boolean z33 = i26 == 0 ? true : z;
                                            boolean z34 = i5 == 0 ? false : z2;
                                            boolean z35 = i6 == 0 ? false : z3;
                                            String str9 = i7 == 0 ? "" : str;
                                            boolean z36 = i8 == 0 ? true : z4;
                                            if ((i3 & 256) == 0) {
                                                brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
                                                i4 &= -234881025;
                                            } else {
                                                brush2 = brush;
                                            }
                                            boolean z37 = i9 == 0 ? false : z5;
                                            boolean z38 = i10 == 0 ? false : z6;
                                            Integer num4 = i12 == 0 ? null : num;
                                            boolean z39 = i13 == 0 ? false : z7;
                                            boolean z40 = i14 == 0 ? false : z8;
                                            boolean z41 = i15 == 0 ? true : z9;
                                            boolean z42 = i16 == 0 ? false : z10;
                                            boolean z43 = i17 == 0 ? false : z11;
                                            if (i18 == 0) {
                                                z12 = z37;
                                                z13 = z38;
                                                z14 = z33;
                                                num2 = num4;
                                                z15 = z39;
                                                z16 = z34;
                                                z17 = z40;
                                                z18 = z41;
                                                z19 = z35;
                                                brush3 = brush2;
                                                str2 = str9;
                                                z20 = z36;
                                                z21 = z42;
                                                z22 = z43;
                                                hapticFeedbackType2 = HapticFeedbackType.BetSelect;
                                            } else {
                                                hapticFeedbackType2 = hapticFeedbackType;
                                                z12 = z37;
                                                z13 = z38;
                                                z14 = z33;
                                                num2 = num4;
                                                z15 = z39;
                                                z16 = z34;
                                                z17 = z40;
                                                z18 = z41;
                                                z19 = z35;
                                                brush3 = brush2;
                                                str2 = str9;
                                                z20 = z36;
                                                z21 = z42;
                                                z22 = z43;
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & 256) != 0) {
                                                i4 &= -234881025;
                                            }
                                            companion = modifier;
                                            z14 = z;
                                            z16 = z2;
                                            z19 = z3;
                                            str2 = str;
                                            z20 = z4;
                                            brush3 = brush;
                                            z12 = z5;
                                            z13 = z6;
                                            num2 = num;
                                            z15 = z7;
                                            z17 = z8;
                                            z18 = z9;
                                            z21 = z10;
                                            z22 = z11;
                                            hapticFeedbackType2 = hapticFeedbackType;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1920438965, i4, i27, "org.betup.ui.common.compose.CommonButtonMatchBet (CommonButtonMatchBet.kt:73)");
                                        }
                                        startRestartGroup.startReplaceGroup(5004770);
                                        z23 = (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256;
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!z23 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = UiExtensionsKt.formatBetNumbers(text);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        String str10 = (String) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        mutableState = (MutableState) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        mutableState2 = (MutableState) rememberedValue3;
                                        startRestartGroup.endReplaceGroup();
                                        extractLeadingNumber = ((num2 != null && num2.intValue() == 64) || (num2 != null && num2.intValue() == 65)) ? UiExtensionsKt.extractLeadingNumber(str10) : null;
                                        if (extractLeadingNumber != null) {
                                            MatchResult find$default = Regex.find$default(new Regex("^(\\d+\\.?\\d*)"), str10, 0, 2, null);
                                            String substring = str10.substring((find$default == null || (value = find$default.getValue()) == null) ? 0 : value.length());
                                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                            str3 = StringsKt.trim((CharSequence) substring).toString();
                                        } else {
                                            str3 = str10;
                                        }
                                        Brush brush5 = z14 ? ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush() : brush3;
                                        if (!z21 && z16 && z17) {
                                            mutableState3 = mutableState2;
                                            m7774constructorimpl = Dp.m7774constructorimpl(4);
                                        } else {
                                            mutableState3 = mutableState2;
                                            if (!z21 && z16) {
                                                m7774constructorimpl = Dp.m7774constructorimpl(6);
                                            } else if (z15) {
                                                m7774constructorimpl = Dp.m7774constructorimpl(z16 ? 8 : 10);
                                            } else if (z13) {
                                                m7774constructorimpl = Dp.m7774constructorimpl(8);
                                            } else if (z16) {
                                                m7774constructorimpl = Dp.m7774constructorimpl(10);
                                            } else {
                                                m7774constructorimpl = Dp.m7774constructorimpl(12);
                                            }
                                        }
                                        if (!z21 && z19) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                                        } else if (z13) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                                        } else if (z19) {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl((str2 == null || str2.length() <= 0) ? 24 : 10);
                                        } else {
                                            m7774constructorimpl2 = Dp.m7774constructorimpl(16);
                                        }
                                        if (!z13 || z15) {
                                            sp = TextUnitKt.getSp(11);
                                        } else if (z16) {
                                            sp = TextUnitKt.getSp(12);
                                        } else {
                                            sp = TextUnitKt.getSp(14);
                                        }
                                        m7774constructorimpl3 = z16 ? Dp.m7774constructorimpl(6) : Dp.m7774constructorimpl(0);
                                        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                            case 0:
                                                break;
                                            case 1:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                                                break;
                                            case 2:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                                                break;
                                            case 3:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                                                break;
                                            case 4:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                                                break;
                                            case 5:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                                                break;
                                            case 6:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                                                break;
                                            case 7:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.35f);
                                                break;
                                            case 8:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.3f);
                                                break;
                                            case 9:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.25f);
                                                break;
                                            default:
                                                sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.2f);
                                                break;
                                        }
                                        long j11 = sp;
                                        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                            case 0:
                                                break;
                                            case 1:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.9f);
                                                break;
                                            case 2:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.8f);
                                                break;
                                            case 3:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.7f);
                                                break;
                                            case 4:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.6f);
                                                break;
                                            case 5:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.5f);
                                                break;
                                            case 6:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.4f);
                                                break;
                                            case 7:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.35f);
                                                break;
                                            case 8:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.3f);
                                                break;
                                            case 9:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.25f);
                                                break;
                                            default:
                                                m7774constructorimpl = Dp.m7774constructorimpl(m7774constructorimpl * 0.2f);
                                                break;
                                        }
                                        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                            case 0:
                                                break;
                                            case 1:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.9f);
                                                break;
                                            case 2:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.8f);
                                                break;
                                            case 3:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.7f);
                                                break;
                                            case 4:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.6f);
                                                break;
                                            case 5:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.5f);
                                                break;
                                            case 6:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.4f);
                                                break;
                                            case 7:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.35f);
                                                break;
                                            case 8:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.3f);
                                                break;
                                            case 9:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.25f);
                                                break;
                                            default:
                                                m7774constructorimpl2 = Dp.m7774constructorimpl(m7774constructorimpl2 * 0.2f);
                                                break;
                                        }
                                        RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        boolean z44 = z16;
                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue4;
                                        startRestartGroup.endReplaceGroup();
                                        String str11 = str2;
                                        final State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, startRestartGroup, 6);
                                        startRestartGroup.startReplaceGroup(1294258831);
                                        if (!z22 && z20 && !z17) {
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            f = m7774constructorimpl3;
                                            startRestartGroup.startReplaceGroup(5004770);
                                            boolean changed = startRestartGroup.changed(collectIsPressedAsState);
                                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue5 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        Unit CommonButtonMatchBet$lambda$10$lambda$9;
                                                        CommonButtonMatchBet$lambda$10$lambda$9 = CommonButtonMatchBetKt.CommonButtonMatchBet$lambda$10$lambda$9(State.this, (ContentDrawScope) obj2);
                                                        return CommonButtonMatchBet$lambda$10$lambda$9;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            companion2 = DrawModifierKt.drawWithContent(companion4, (Function1) rememberedValue5);
                                        } else {
                                            f = m7774constructorimpl3;
                                            companion2 = Modifier.INSTANCE;
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                                        Modifier background$default = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape), brush5, roundedCornerShape, 0.0f, 4, null);
                                        if (z17) {
                                            companion3 = BackgroundKt.m1024backgroundbw27NRU(Modifier.INSTANCE, Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShape);
                                        } else {
                                            companion3 = Modifier.INSTANCE;
                                        }
                                        final MutableState mutableState6 = mutableState3;
                                        float f2 = f;
                                        Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i27 >> 12) & 14) | ((i27 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
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
                                        startRestartGroup.startReplaceGroup(-1952661530);
                                        if (z17) {
                                            horizontal = null;
                                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.new_lock_icon, startRestartGroup, 6);
                                            Modifier.Companion companion5 = Modifier.INSTANCE;
                                            if (z21 && z17) {
                                                m7774constructorimpl4 = Dp.m7774constructorimpl(10);
                                            } else if (z21) {
                                                m7774constructorimpl4 = Dp.m7774constructorimpl(12);
                                            } else {
                                                m7774constructorimpl4 = Dp.m7774constructorimpl(14);
                                            }
                                            ImageKt.Image(painterResource, (String) null, SizeKt.m1563size3ABfNKs(companion5, m7774constructorimpl4), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            horizontal = null;
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        if (z19) {
                                            startRestartGroup.startReplaceGroup(-401938502);
                                            boolean z45 = str11 != null && str11.length() > 0;
                                            if (!CommonButtonMatchBet$lambda$5(mutableState6)) {
                                                startRestartGroup.startReplaceGroup(-402040120);
                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                Modifier fillMaxWidth$default = z45 ? SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, horizontal) : SizeKt.wrapContentWidth$default(companion6, horizontal, false, 3, horizontal);
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                Arrangement.HorizontalOrVertical spaceBetween = z45 ? arrangement.getSpaceBetween() : arrangement.getStart();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 48);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                                                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                startRestartGroup.startReplaceGroup(-1522120265);
                                                if (extractLeadingNumber != null) {
                                                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24));
                                                    float m7774constructorimpl5 = Dp.m7774constructorimpl(1);
                                                    if (!z14) {
                                                        j9 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                    } else if (z20) {
                                                        j9 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else {
                                                        j9 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                    }
                                                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BorderKt.m1036borderxT4_qwU(m1563size3ABfNKs, m7774constructorimpl5, j9, RoundedCornerShapeKt.getCircleShape()), Dp.m7774constructorimpl(4));
                                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
                                                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                                    String num5 = extractLeadingNumber.toString();
                                                    long sp2 = TextUnitKt.getSp(TextUnit.m7968getValueimpl(j11) * 0.75f);
                                                    FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                                                    FontWeight bold = FontWeight.INSTANCE.getBold();
                                                    if (z12) {
                                                        j10 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else if (!z14) {
                                                        j10 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                    } else if (z20) {
                                                        j10 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else {
                                                        j10 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                    }
                                                    composer2 = startRestartGroup;
                                                    str8 = str11;
                                                    TextKt.m2642Text4IGK_g(num5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j10, sp2, bold, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    i22 = 6;
                                                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer2, 6);
                                                } else {
                                                    str8 = str11;
                                                    composer2 = startRestartGroup;
                                                    i22 = 6;
                                                }
                                                composer2.endReplaceGroup();
                                                FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, i22);
                                                FontWeight medium = FontWeight.INSTANCE.getMedium();
                                                if (z12) {
                                                    j7 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                } else if (!z14) {
                                                    j7 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                } else if (z20) {
                                                    j7 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                } else {
                                                    j7 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                }
                                                TextStyle textStyle = new TextStyle(j7, j11, medium, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (z13 || z15) ? TextAlign.INSTANCE.m7658getCentere0LSkKk() : TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                if (z45) {
                                                    companion7 = RowScope.weight$default(rowScopeInstance, companion7, 1.0f, false, 2, null);
                                                }
                                                Modifier modifier3 = companion7;
                                                int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                                                composer2.startReplaceGroup(-1633490746);
                                                Object rememberedValue6 = composer2.rememberedValue();
                                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue6 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj2) {
                                                            Unit CommonButtonMatchBet$lambda$25$lambda$15$lambda$14$lambda$13;
                                                            CommonButtonMatchBet$lambda$25$lambda$15$lambda$14$lambda$13 = CommonButtonMatchBetKt.CommonButtonMatchBet$lambda$25$lambda$15$lambda$14$lambda$13(MutableState.this, mutableState6, (TextLayoutResult) obj2);
                                                            return CommonButtonMatchBet$lambda$25$lambda$15$lambda$14$lambda$13;
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                composer2.endReplaceGroup();
                                                TextKt.m2642Text4IGK_g(str3, modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue6, textStyle, composer2, 0, 199728, 22524);
                                                composer2.startReplaceGroup(-1521972111);
                                                str7 = str8;
                                                if (str7 != null && str7.length() > 0) {
                                                    String str12 = "| " + str7;
                                                    FontFamily sfProFontFamily3 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6);
                                                    FontWeight medium2 = FontWeight.INSTANCE.getMedium();
                                                    if (z12) {
                                                        j8 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else if (!z14) {
                                                        j8 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                    } else if (z20) {
                                                        j8 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else {
                                                        j8 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                    }
                                                    TextKt.m2642Text4IGK_g(str12, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j8, j11, medium2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily3, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7659getEnde0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer2, 48, 3120, 55292);
                                                }
                                                composer2.endReplaceGroup();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(-395413622);
                                                if (z45) {
                                                    wrapContentWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, horizontal);
                                                    i20 = 0;
                                                } else {
                                                    i20 = 0;
                                                    wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal, false, 3, horizontal);
                                                }
                                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i20);
                                                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default);
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
                                                Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                Modifier fillMaxWidth$default2 = z45 ? SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null) : SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
                                                Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
                                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center3, centerVertically2, startRestartGroup, 54);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                                                Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                startRestartGroup.startReplaceGroup(-1187205661);
                                                if (extractLeadingNumber != null) {
                                                    Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24));
                                                    float m7774constructorimpl6 = Dp.m7774constructorimpl(1);
                                                    if (!z14) {
                                                        j5 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                    } else if (z20) {
                                                        j5 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else {
                                                        j5 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                    }
                                                    Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BorderKt.m1036borderxT4_qwU(m1563size3ABfNKs2, m7774constructorimpl6, j5, RoundedCornerShapeKt.getCircleShape()), Dp.m7774constructorimpl(4));
                                                    Alignment center4 = Alignment.INSTANCE.getCenter();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
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
                                                    Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                    }
                                                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                                    String num6 = extractLeadingNumber.toString();
                                                    long sp3 = TextUnitKt.getSp(TextUnit.m7968getValueimpl(j11) * 0.75f);
                                                    FontFamily sfProFontFamily4 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                                                    FontWeight bold2 = FontWeight.INSTANCE.getBold();
                                                    if (!z14) {
                                                        j6 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                    } else if (z20) {
                                                        j6 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else {
                                                        j6 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                    }
                                                    TextStyle textStyle2 = new TextStyle(j6, sp3, bold2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily4, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
                                                    composer2 = startRestartGroup;
                                                    str6 = str11;
                                                    mutableState5 = mutableState;
                                                    TextKt.m2642Text4IGK_g(num6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    i21 = 6;
                                                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer2, 6);
                                                } else {
                                                    str6 = str11;
                                                    composer2 = startRestartGroup;
                                                    mutableState5 = mutableState;
                                                    i21 = 6;
                                                }
                                                composer2.endReplaceGroup();
                                                String formatBetNumbers = UiExtensionsKt.formatBetNumbers(str3);
                                                FontFamily sfProFontFamily5 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, i21);
                                                FontWeight medium3 = FontWeight.INSTANCE.getMedium();
                                                if (!z14) {
                                                    j3 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                } else if (z20) {
                                                    j3 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                } else {
                                                    j3 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                }
                                                TextStyle textStyle3 = new TextStyle(j3, j11, medium3, (FontStyle) null, (FontSynthesis) null, sfProFontFamily5, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                                                if (z45) {
                                                    obj = null;
                                                    m1520paddingqDBjuR0$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                } else {
                                                    obj = null;
                                                    m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(4), 7, null);
                                                }
                                                int m7709getClipgIe3tQ82 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                                                composer2.startReplaceGroup(5004770);
                                                Object rememberedValue7 = composer2.rememberedValue();
                                                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue7 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj2) {
                                                            Unit CommonButtonMatchBet$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17;
                                                            CommonButtonMatchBet$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17 = CommonButtonMatchBetKt.CommonButtonMatchBet$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17(MutableState.this, (TextLayoutResult) obj2);
                                                            return CommonButtonMatchBet$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17;
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue7);
                                                }
                                                composer2.endReplaceGroup();
                                                Object obj2 = obj;
                                                TextKt.m2642Text4IGK_g(formatBetNumbers, m1520paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue7, textStyle3, composer2, 0, 199728, 22524);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.startReplaceGroup(-1198865401);
                                                str7 = str6;
                                                if (str7 != null && str7.length() > 0) {
                                                    String str13 = "| " + str7;
                                                    FontFamily sfProFontFamily6 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6);
                                                    FontWeight medium4 = FontWeight.INSTANCE.getMedium();
                                                    if (z12) {
                                                        j4 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else if (!z14) {
                                                        j4 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                    } else if (z20) {
                                                        j4 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                    } else {
                                                        j4 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                    }
                                                    TextKt.m2642Text4IGK_g(str13, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj2), 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, j11, medium4, (FontStyle) null, (FontSynthesis) null, sfProFontFamily6, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer2, 48, 3120, 55292);
                                                }
                                                composer2.endReplaceGroup();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endReplaceGroup();
                                            }
                                            composer2.endReplaceGroup();
                                            str4 = str7;
                                        } else {
                                            composer2 = startRestartGroup;
                                            str4 = str11;
                                            composer2.startReplaceGroup(-388952478);
                                            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, horizontal);
                                            Arrangement.HorizontalOrVertical center5 = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(center5, centerVertically3, composer2, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default3);
                                            Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor8);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4610constructorimpl8 = Updater.m4610constructorimpl(composer2);
                                            Updater.m4617setimpl(m4610constructorimpl8, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                                m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                                m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                            composer2.startReplaceGroup(-1604181255);
                                            if (extractLeadingNumber != null) {
                                                Modifier m1516padding3ABfNKs3 = PaddingKt.m1516padding3ABfNKs(BorderKt.m1036borderxT4_qwU(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.getCircleShape()), Dp.m7774constructorimpl(4));
                                                Alignment center6 = Alignment.INSTANCE.getCenter();
                                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center6, false);
                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, m1516padding3ABfNKs3);
                                                Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor9);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer2);
                                                Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                    m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                    m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                                                String num7 = extractLeadingNumber.toString();
                                                long sp4 = TextUnitKt.getSp(TextUnit.m7968getValueimpl(j11) * 0.75f);
                                                FontFamily sfProFontFamily7 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6);
                                                FontWeight bold3 = FontWeight.INSTANCE.getBold();
                                                if (z12) {
                                                    j2 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                } else if (!z14) {
                                                    j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                                } else if (z20) {
                                                    j2 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                                } else {
                                                    j2 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                                }
                                                mutableState4 = mutableState;
                                                TextKt.m2642Text4IGK_g(num7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, sp4, bold3, (FontStyle) null, (FontSynthesis) null, sfProFontFamily7, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                i19 = 6;
                                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer2, 6);
                                            } else {
                                                mutableState4 = mutableState;
                                                i19 = 6;
                                            }
                                            composer2.endReplaceGroup();
                                            String formatBetNumbers2 = UiExtensionsKt.formatBetNumbers(str3);
                                            Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, f2, 0.0f, 2, null), 0.0f, 1, null);
                                            FontFamily sfProFontFamily8 = ComposeUtils.INSTANCE.sfProFontFamily(composer2, i19);
                                            FontWeight medium5 = FontWeight.INSTANCE.getMedium();
                                            if (z12) {
                                                j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                            } else if (!z14) {
                                                j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                                            } else if (z20) {
                                                j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                                            } else {
                                                j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                                            }
                                            TextStyle textStyle4 = new TextStyle(j, j11, medium5, (FontStyle) null, (FontSynthesis) null, sfProFontFamily8, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                                            int m7709getClipgIe3tQ83 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                                            composer2.startReplaceGroup(5004770);
                                            Object rememberedValue8 = composer2.rememberedValue();
                                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                final MutableState mutableState7 = mutableState4;
                                                rememberedValue8 = new Function1() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj3) {
                                                        Unit CommonButtonMatchBet$lambda$25$lambda$24$lambda$23$lambda$22;
                                                        CommonButtonMatchBet$lambda$25$lambda$24$lambda$23$lambda$22 = CommonButtonMatchBetKt.CommonButtonMatchBet$lambda$25$lambda$24$lambda$23$lambda$22(MutableState.this, (TextLayoutResult) obj3);
                                                        return CommonButtonMatchBet$lambda$25$lambda$24$lambda$23$lambda$22;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue8);
                                            }
                                            composer2.endReplaceGroup();
                                            TextKt.m2642Text4IGK_g(formatBetNumbers2, fillMaxWidth$default4, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ83, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue8, textStyle4, composer2, 0, 199728, 22524);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceGroup();
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z24 = z44;
                                        modifier2 = companion;
                                        z25 = z20;
                                        brush4 = brush3;
                                        z26 = z12;
                                        z27 = z13;
                                        num3 = num2;
                                        z28 = z15;
                                        z29 = z17;
                                        z30 = z18;
                                        z31 = z21;
                                        z32 = z22;
                                        hapticFeedbackType3 = hapticFeedbackType2;
                                        str5 = str4;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        z14 = z;
                                        z24 = z2;
                                        z19 = z3;
                                        str5 = str;
                                        z25 = z4;
                                        brush4 = brush;
                                        z26 = z5;
                                        z27 = z6;
                                        num3 = num;
                                        z28 = z7;
                                        z29 = z8;
                                        z30 = z9;
                                        z31 = z10;
                                        z32 = z11;
                                        hapticFeedbackType3 = hapticFeedbackType;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final boolean z46 = z24;
                                        final boolean z47 = z19;
                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Unit CommonButtonMatchBet$lambda$26;
                                                CommonButtonMatchBet$lambda$26 = CommonButtonMatchBetKt.CommonButtonMatchBet$lambda$26(Modifier.this, z14, text, z46, z47, str5, z25, onClick, brush4, z26, z27, num3, z28, z29, z30, z31, z32, hapticFeedbackType3, i, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                                                return CommonButtonMatchBet$lambda$26;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i16 = i3 & 32768;
                                if (i16 == 0) {
                                }
                                i17 = i3 & 65536;
                                if (i17 == 0) {
                                }
                                i18 = i3 & 131072;
                                if (i18 == 0) {
                                }
                                if ((306783379 & i4) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 256) == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceGroup(5004770);
                                if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z23) {
                                }
                                rememberedValue = UiExtensionsKt.formatBetNumbers(text);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                String str102 = (String) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState = (MutableState) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState2 = (MutableState) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                                if (num2 != null) {
                                    if (extractLeadingNumber != null) {
                                    }
                                    if (z14) {
                                    }
                                    if (!z21) {
                                    }
                                    mutableState3 = mutableState2;
                                    if (!z21) {
                                    }
                                    if (z15) {
                                    }
                                    if (!z21) {
                                    }
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    sp = TextUnitKt.getSp(11);
                                    if (z16) {
                                    }
                                    switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                    }
                                    long j112 = sp;
                                    switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                    }
                                    switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                    }
                                    RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    boolean z442 = z16;
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                    String str112 = str2;
                                    final State collectIsPressedAsState2 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2, startRestartGroup, 6);
                                    startRestartGroup.startReplaceGroup(1294258831);
                                    if (!z22) {
                                    }
                                    f = m7774constructorimpl3;
                                    companion2 = Modifier.INSTANCE;
                                    startRestartGroup.endReplaceGroup();
                                    RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
                                    Modifier background$default2 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape2), brush5, roundedCornerShape2, 0.0f, 4, null);
                                    if (z17) {
                                    }
                                    final MutableState mutableState62 = mutableState3;
                                    float f22 = f;
                                    Modifier clickAnimation2 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default2.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource2, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i27 >> 12) & 14) | ((i27 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap10 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2);
                                    Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash10);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-1952661530);
                                    if (z17) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    if (z19) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z24 = z442;
                                    modifier2 = companion;
                                    z25 = z20;
                                    brush4 = brush3;
                                    z26 = z12;
                                    z27 = z13;
                                    num3 = num2;
                                    z28 = z15;
                                    z29 = z17;
                                    z30 = z18;
                                    z31 = z21;
                                    z32 = z22;
                                    hapticFeedbackType3 = hapticFeedbackType2;
                                    str5 = str4;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                if (extractLeadingNumber != null) {
                                }
                                if (z14) {
                                }
                                if (!z21) {
                                }
                                mutableState3 = mutableState2;
                                if (!z21) {
                                }
                                if (z15) {
                                }
                                if (!z21) {
                                }
                                if (z13) {
                                }
                                if (z13) {
                                }
                                sp = TextUnitKt.getSp(11);
                                if (z16) {
                                }
                                switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                }
                                long j1122 = sp;
                                switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                }
                                switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                                }
                                RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                boolean z4422 = z16;
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                                String str1122 = str2;
                                final State collectIsPressedAsState22 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource22, startRestartGroup, 6);
                                startRestartGroup.startReplaceGroup(1294258831);
                                if (!z22) {
                                }
                                f = m7774constructorimpl3;
                                companion2 = Modifier.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                RoundedCornerShape roundedCornerShape22 = m1810RoundedCornerShape0680j_422;
                                Modifier background$default22 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape22), brush5, roundedCornerShape22, 0.0f, 4, null);
                                if (z17) {
                                }
                                final MutableState mutableState622 = mutableState3;
                                float f222 = f;
                                Modifier clickAnimation22 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default22.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource22, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i27 >> 12) & 14) | ((i27 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy62 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap102 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier102 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22);
                                Function0<ComposeUiNode> constructor102 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy62, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap102, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash102 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash102);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier102, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance62 = BoxScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceGroup(-1952661530);
                                if (z17) {
                                }
                                startRestartGroup.endReplaceGroup();
                                if (z19) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z24 = z4422;
                                modifier2 = companion;
                                z25 = z20;
                                brush4 = brush3;
                                z26 = z12;
                                z27 = z13;
                                num3 = num2;
                                z28 = z15;
                                z29 = z17;
                                z30 = z18;
                                z31 = z21;
                                z32 = z22;
                                hapticFeedbackType3 = hapticFeedbackType2;
                                str5 = str4;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i15 = i3 & 16384;
                            if (i15 != 0) {
                            }
                            i16 = i3 & 32768;
                            if (i16 == 0) {
                            }
                            i17 = i3 & 65536;
                            if (i17 == 0) {
                            }
                            i18 = i3 & 131072;
                            if (i18 == 0) {
                            }
                            if ((306783379 & i4) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z23) {
                            }
                            rememberedValue = UiExtensionsKt.formatBetNumbers(text);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            String str1022 = (String) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState2 = (MutableState) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            if (num2 != null) {
                            }
                            if (extractLeadingNumber != null) {
                            }
                            if (z14) {
                            }
                            if (!z21) {
                            }
                            mutableState3 = mutableState2;
                            if (!z21) {
                            }
                            if (z15) {
                            }
                            if (!z21) {
                            }
                            if (z13) {
                            }
                            if (z13) {
                            }
                            sp = TextUnitKt.getSp(11);
                            if (z16) {
                            }
                            switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                            }
                            long j11222 = sp;
                            switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                            }
                            switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                            }
                            RoundedCornerShape m1810RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            boolean z44222 = z16;
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            String str11222 = str2;
                            final State collectIsPressedAsState222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource222, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(1294258831);
                            if (!z22) {
                            }
                            f = m7774constructorimpl3;
                            companion2 = Modifier.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            RoundedCornerShape roundedCornerShape222 = m1810RoundedCornerShape0680j_4222;
                            Modifier background$default222 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape222), brush5, roundedCornerShape222, 0.0f, 4, null);
                            if (z17) {
                            }
                            final MutableState mutableState6222 = mutableState3;
                            float f2222 = f;
                            Modifier clickAnimation222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default222.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource222, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i27 >> 12) & 14) | ((i27 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy622 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1022 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier1022 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222);
                            Function0<ComposeUiNode> constructor1022 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy622, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap1022, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash1022 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash1022);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier1022, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance622 = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-1952661530);
                            if (z17) {
                            }
                            startRestartGroup.endReplaceGroup();
                            if (z19) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z24 = z44222;
                            modifier2 = companion;
                            z25 = z20;
                            brush4 = brush3;
                            z26 = z12;
                            z27 = z13;
                            num3 = num2;
                            z28 = z15;
                            z29 = z17;
                            z30 = z18;
                            z31 = z21;
                            z32 = z22;
                            hapticFeedbackType3 = hapticFeedbackType2;
                            str5 = str4;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i14 = i3 & 8192;
                        if (i14 == 0) {
                        }
                        i15 = i3 & 16384;
                        if (i15 != 0) {
                        }
                        i16 = i3 & 32768;
                        if (i16 == 0) {
                        }
                        i17 = i3 & 65536;
                        if (i17 == 0) {
                        }
                        i18 = i3 & 131072;
                        if (i18 == 0) {
                        }
                        if ((306783379 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(5004770);
                        if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z23) {
                        }
                        rememberedValue = UiExtensionsKt.formatBetNumbers(text);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        String str10222 = (String) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState2 = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        if (num2 != null) {
                        }
                        if (extractLeadingNumber != null) {
                        }
                        if (z14) {
                        }
                        if (!z21) {
                        }
                        mutableState3 = mutableState2;
                        if (!z21) {
                        }
                        if (z15) {
                        }
                        if (!z21) {
                        }
                        if (z13) {
                        }
                        if (z13) {
                        }
                        sp = TextUnitKt.getSp(11);
                        if (z16) {
                        }
                        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                        }
                        long j112222 = sp;
                        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                        }
                        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                        }
                        RoundedCornerShape m1810RoundedCornerShape0680j_42222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        boolean z442222 = z16;
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        String str112222 = str2;
                        final State collectIsPressedAsState2222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2222, startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(1294258831);
                        if (!z22) {
                        }
                        f = m7774constructorimpl3;
                        companion2 = Modifier.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        RoundedCornerShape roundedCornerShape2222 = m1810RoundedCornerShape0680j_42222;
                        Modifier background$default2222 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape2222), brush5, roundedCornerShape2222, 0.0f, 4, null);
                        if (z17) {
                        }
                        final MutableState mutableState62222 = mutableState3;
                        float f22222 = f;
                        Modifier clickAnimation2222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default2222.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource2222, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i27 >> 12) & 14) | ((i27 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy6222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap10222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier10222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222);
                        Function0<ComposeUiNode> constructor10222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy6222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap10222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash10222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier10222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance6222 = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1952661530);
                        if (z17) {
                        }
                        startRestartGroup.endReplaceGroup();
                        if (z19) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z24 = z442222;
                        modifier2 = companion;
                        z25 = z20;
                        brush4 = brush3;
                        z26 = z12;
                        z27 = z13;
                        num3 = num2;
                        z28 = z15;
                        z29 = z17;
                        z30 = z18;
                        z31 = z21;
                        z32 = z22;
                        hapticFeedbackType3 = hapticFeedbackType2;
                        str5 = str4;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i4 |= i24;
                    if ((100663296 & i) == 0) {
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    i12 = i3 & 2048;
                    if (i12 != 0) {
                    }
                    int i272 = i11;
                    i13 = i3 & 4096;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 8192;
                    if (i14 == 0) {
                    }
                    i15 = i3 & 16384;
                    if (i15 != 0) {
                    }
                    i16 = i3 & 32768;
                    if (i16 == 0) {
                    }
                    i17 = i3 & 65536;
                    if (i17 == 0) {
                    }
                    i18 = i3 & 131072;
                    if (i18 == 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z23) {
                    }
                    rememberedValue = UiExtensionsKt.formatBetNumbers(text);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    String str102222 = (String) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState2 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    if (num2 != null) {
                    }
                    if (extractLeadingNumber != null) {
                    }
                    if (z14) {
                    }
                    if (!z21) {
                    }
                    mutableState3 = mutableState2;
                    if (!z21) {
                    }
                    if (z15) {
                    }
                    if (!z21) {
                    }
                    if (z13) {
                    }
                    if (z13) {
                    }
                    sp = TextUnitKt.getSp(11);
                    if (z16) {
                    }
                    switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                    }
                    long j1122222 = sp;
                    switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                    }
                    switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                    }
                    RoundedCornerShape m1810RoundedCornerShape0680j_422222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    boolean z4422222 = z16;
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableInteractionSource mutableInteractionSource22222 = (MutableInteractionSource) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    String str1122222 = str2;
                    final State collectIsPressedAsState22222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource22222, startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(1294258831);
                    if (!z22) {
                    }
                    f = m7774constructorimpl3;
                    companion2 = Modifier.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    RoundedCornerShape roundedCornerShape22222 = m1810RoundedCornerShape0680j_422222;
                    Modifier background$default22222 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape22222), brush5, roundedCornerShape22222, 0.0f, 4, null);
                    if (z17) {
                    }
                    final MutableState mutableState622222 = mutableState3;
                    float f222222 = f;
                    Modifier clickAnimation22222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default22222.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource22222, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i272 >> 12) & 14) | ((i272 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy62222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap102222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier102222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22222);
                    Function0<ComposeUiNode> constructor102222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy62222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap102222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash102222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash102222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier102222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance62222 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1952661530);
                    if (z17) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (z19) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z24 = z4422222;
                    modifier2 = companion;
                    z25 = z20;
                    brush4 = brush3;
                    z26 = z12;
                    z27 = z13;
                    num3 = num2;
                    z28 = z15;
                    z29 = z17;
                    z30 = z18;
                    z31 = z21;
                    z32 = z22;
                    hapticFeedbackType3 = hapticFeedbackType2;
                    str5 = str4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                i4 |= i24;
                if ((100663296 & i) == 0) {
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                }
                int i2722 = i11;
                i13 = i3 & 4096;
                if (i13 != 0) {
                }
                i14 = i3 & 8192;
                if (i14 == 0) {
                }
                i15 = i3 & 16384;
                if (i15 != 0) {
                }
                i16 = i3 & 32768;
                if (i16 == 0) {
                }
                i17 = i3 & 65536;
                if (i17 == 0) {
                }
                i18 = i3 & 131072;
                if (i18 == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i25 == 0) {
                }
                if (i26 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z23) {
                }
                rememberedValue = UiExtensionsKt.formatBetNumbers(text);
                startRestartGroup.updateRememberedValue(rememberedValue);
                String str1022222 = (String) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                if (num2 != null) {
                }
                if (extractLeadingNumber != null) {
                }
                if (z14) {
                }
                if (!z21) {
                }
                mutableState3 = mutableState2;
                if (!z21) {
                }
                if (z15) {
                }
                if (!z21) {
                }
                if (z13) {
                }
                if (z13) {
                }
                sp = TextUnitKt.getSp(11);
                if (z16) {
                }
                switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                }
                long j11222222 = sp;
                switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                }
                switch (CommonButtonMatchBet$lambda$2(mutableState)) {
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_4222222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                boolean z44222222 = z16;
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                MutableInteractionSource mutableInteractionSource222222 = (MutableInteractionSource) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                String str11222222 = str2;
                final State collectIsPressedAsState222222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource222222, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(1294258831);
                if (!z22) {
                }
                f = m7774constructorimpl3;
                companion2 = Modifier.INSTANCE;
                startRestartGroup.endReplaceGroup();
                RoundedCornerShape roundedCornerShape222222 = m1810RoundedCornerShape0680j_4222222;
                Modifier background$default222222 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape222222), brush5, roundedCornerShape222222, 0.0f, 4, null);
                if (z17) {
                }
                final MutableState mutableState6222222 = mutableState3;
                float f2222222 = f;
                Modifier clickAnimation222222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default222222.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource222222, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i2722 >> 12) & 14) | ((i2722 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy622222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1022222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier1022222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation222222);
                Function0<ComposeUiNode> constructor1022222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy622222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap1022222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash1022222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash1022222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier1022222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance622222 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1952661530);
                if (z17) {
                }
                startRestartGroup.endReplaceGroup();
                if (z19) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z24 = z44222222;
                modifier2 = companion;
                z25 = z20;
                brush4 = brush3;
                z26 = z12;
                z27 = z13;
                num3 = num2;
                z28 = z15;
                z29 = z17;
                z30 = z18;
                z31 = z21;
                z32 = z22;
                hapticFeedbackType3 = hapticFeedbackType2;
                str5 = str4;
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
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i4 |= i24;
            if ((100663296 & i) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            int i27222 = i11;
            i13 = i3 & 4096;
            if (i13 != 0) {
            }
            i14 = i3 & 8192;
            if (i14 == 0) {
            }
            i15 = i3 & 16384;
            if (i15 != 0) {
            }
            i16 = i3 & 32768;
            if (i16 == 0) {
            }
            i17 = i3 & 65536;
            if (i17 == 0) {
            }
            i18 = i3 & 131072;
            if (i18 == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i25 == 0) {
            }
            if (i26 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z23) {
            }
            rememberedValue = UiExtensionsKt.formatBetNumbers(text);
            startRestartGroup.updateRememberedValue(rememberedValue);
            String str10222222 = (String) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            if (num2 != null) {
            }
            if (extractLeadingNumber != null) {
            }
            if (z14) {
            }
            if (!z21) {
            }
            mutableState3 = mutableState2;
            if (!z21) {
            }
            if (z15) {
            }
            if (!z21) {
            }
            if (z13) {
            }
            if (z13) {
            }
            sp = TextUnitKt.getSp(11);
            if (z16) {
            }
            switch (CommonButtonMatchBet$lambda$2(mutableState)) {
            }
            long j112222222 = sp;
            switch (CommonButtonMatchBet$lambda$2(mutableState)) {
            }
            switch (CommonButtonMatchBet$lambda$2(mutableState)) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_42222222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            boolean z442222222 = z16;
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            MutableInteractionSource mutableInteractionSource2222222 = (MutableInteractionSource) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            String str112222222 = str2;
            final State collectIsPressedAsState2222222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2222222, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1294258831);
            if (!z22) {
            }
            f = m7774constructorimpl3;
            companion2 = Modifier.INSTANCE;
            startRestartGroup.endReplaceGroup();
            RoundedCornerShape roundedCornerShape2222222 = m1810RoundedCornerShape0680j_42222222;
            Modifier background$default2222222 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape2222222), brush5, roundedCornerShape2222222, 0.0f, 4, null);
            if (z17) {
            }
            final MutableState mutableState62222222 = mutableState3;
            float f22222222 = f;
            Modifier clickAnimation2222222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default2222222.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource2222222, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i27222 >> 12) & 14) | ((i27222 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy6222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap10222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier10222222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation2222222);
            Function0<ComposeUiNode> constructor10222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy6222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap10222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash10222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier10222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6222222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1952661530);
            if (z17) {
            }
            startRestartGroup.endReplaceGroup();
            if (z19) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z24 = z442222222;
            modifier2 = companion;
            z25 = z20;
            brush4 = brush3;
            z26 = z12;
            z27 = z13;
            num3 = num2;
            z28 = z15;
            z29 = z17;
            z30 = z18;
            z31 = z21;
            z32 = z22;
            hapticFeedbackType3 = hapticFeedbackType2;
            str5 = str4;
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
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i4 |= i24;
        if ((100663296 & i) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        int i272222 = i11;
        i13 = i3 & 4096;
        if (i13 != 0) {
        }
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        i15 = i3 & 16384;
        if (i15 != 0) {
        }
        i16 = i3 & 32768;
        if (i16 == 0) {
        }
        i17 = i3 & 65536;
        if (i17 == 0) {
        }
        i18 = i3 & 131072;
        if (i18 == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i25 == 0) {
        }
        if (i26 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z23) {
        }
        rememberedValue = UiExtensionsKt.formatBetNumbers(text);
        startRestartGroup.updateRememberedValue(rememberedValue);
        String str102222222 = (String) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        if (num2 != null) {
        }
        if (extractLeadingNumber != null) {
        }
        if (z14) {
        }
        if (!z21) {
        }
        mutableState3 = mutableState2;
        if (!z21) {
        }
        if (z15) {
        }
        if (!z21) {
        }
        if (z13) {
        }
        if (z13) {
        }
        sp = TextUnitKt.getSp(11);
        if (z16) {
        }
        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
        }
        long j1122222222 = sp;
        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
        }
        switch (CommonButtonMatchBet$lambda$2(mutableState)) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_422222222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        boolean z4422222222 = z16;
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        MutableInteractionSource mutableInteractionSource22222222 = (MutableInteractionSource) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        String str1122222222 = str2;
        final State collectIsPressedAsState22222222 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource22222222, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(1294258831);
        if (!z22) {
        }
        f = m7774constructorimpl3;
        companion2 = Modifier.INSTANCE;
        startRestartGroup.endReplaceGroup();
        RoundedCornerShape roundedCornerShape22222222 = m1810RoundedCornerShape0680j_422222222;
        Modifier background$default22222222 = BackgroundKt.background$default(ClipKt.clip(companion, roundedCornerShape22222222), brush5, roundedCornerShape22222222, 0.0f, 4, null);
        if (z17) {
        }
        final MutableState mutableState622222222 = mutableState3;
        float f222222222 = f;
        Modifier clickAnimation22222222 = ClickAnimationModifierKt.clickAnimation(PaddingKt.m1517paddingVpY3zN4(background$default22222222.then(companion3).then(companion2), m7774constructorimpl2, m7774constructorimpl), onClick, null, z20, mutableInteractionSource22222222, null, 0, 0, 0.0f, 0.0f, z18, false, hapticFeedbackType2, startRestartGroup, ((i4 >> 18) & 112) | 24576 | ((i4 >> 9) & 7168), ((i272222 >> 12) & 14) | ((i272222 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1522);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy62222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap102222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier102222222 = ComposedModifierKt.materializeModifier(startRestartGroup, clickAnimation22222222);
        Function0<ComposeUiNode> constructor102222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy62222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap102222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash102222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash102222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier102222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance62222222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1952661530);
        if (z17) {
        }
        startRestartGroup.endReplaceGroup();
        if (z19) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z24 = z4422222222;
        modifier2 = companion;
        z25 = z20;
        brush4 = brush3;
        z26 = z12;
        z27 = z13;
        num3 = num2;
        z28 = z15;
        z29 = z17;
        z30 = z18;
        z31 = z21;
        z32 = z22;
        hapticFeedbackType3 = hapticFeedbackType2;
        str5 = str4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final int CommonButtonMatchBet$lambda$2(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void CommonButtonMatchBet$lambda$3(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean CommonButtonMatchBet$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CommonButtonMatchBet$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonMatchBet$lambda$10$lambda$9(State state, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (CommonButtonMatchBet$lambda$8(state)) {
            DrawScope.m5724drawRectnJ9OG0$default(drawWithContent, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonMatchBet$lambda$25$lambda$15$lambda$14$lambda$13(MutableState mutableState, MutableState mutableState2, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (((int) (textLayoutResult.getSize() >> 32)) >= 1.0f) {
            boolean z = textLayoutResult.getHasVisualOverflow() || textLayoutResult.getMultiParagraph().getWidth() > ((float) ((int) (textLayoutResult.getSize() >> 32))) + 0.5f || textLayoutResult.getLineCount() > 1;
            if (z && CommonButtonMatchBet$lambda$2(mutableState) < 10) {
                CommonButtonMatchBet$lambda$3(mutableState, CommonButtonMatchBet$lambda$2(mutableState) + 1);
            } else if (z && CommonButtonMatchBet$lambda$2(mutableState) >= 10) {
                CommonButtonMatchBet$lambda$6(mutableState2, true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonMatchBet$lambda$25$lambda$20$lambda$19$lambda$18$lambda$17(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (((int) (textLayoutResult.getSize() >> 32)) >= 1.0f && ((textLayoutResult.getHasVisualOverflow() || textLayoutResult.getMultiParagraph().getWidth() > ((int) (textLayoutResult.getSize() >> 32)) + 0.5f || textLayoutResult.getLineCount() > 1) && CommonButtonMatchBet$lambda$2(mutableState) < 10)) {
            CommonButtonMatchBet$lambda$3(mutableState, CommonButtonMatchBet$lambda$2(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonButtonMatchBet$lambda$25$lambda$24$lambda$23$lambda$22(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (((int) (textLayoutResult.getSize() >> 32)) >= 1.0f && ((textLayoutResult.getHasVisualOverflow() || textLayoutResult.getMultiParagraph().getWidth() > ((int) (textLayoutResult.getSize() >> 32)) + 0.5f || textLayoutResult.getLineCount() > 1) && CommonButtonMatchBet$lambda$2(mutableState) < 10)) {
            CommonButtonMatchBet$lambda$3(mutableState, CommonButtonMatchBet$lambda$2(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    private static final void PreviewCommonButtonMatchBet(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1524203799);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1524203799, i, -1, "org.betup.ui.common.compose.PreviewCommonButtonMatchBet (CommonButtonMatchBet.kt:555)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16));
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda8
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
            CommonButtonMatchBet(null, true, "1X2", false, false, null, true, (Function0) rememberedValue, null, false, false, null, false, false, false, false, false, null, startRestartGroup, 14156208, 0, 261945);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda9
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
            CommonButtonMatchBet(null, false, "Double chance", false, false, null, true, (Function0) rememberedValue2, null, false, false, null, false, false, false, false, false, null, startRestartGroup, 14156208, 0, 261945);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonMatchBet(null, true, "Over 2.5 goals", false, true, "2.15", false, (Function0) rememberedValue3, null, false, false, null, false, false, false, false, false, null, startRestartGroup, 12804528, 0, 261961);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonMatchBet(null, false, "Handicap 1 (-1.5)", true, true, "1.85", false, (Function0) rememberedValue4, null, false, false, null, false, false, false, false, false, null, startRestartGroup, 12807600, 0, 261953);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonMatchBet(null, true, "1", false, true, "3.20", true, (Function0) rememberedValue5, null, false, false, 64, false, false, false, false, false, null, startRestartGroup, 14377392, 48, 259849);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonMatchBet(null, false, "Locked bet", false, false, null, false, (Function0) rememberedValue6, null, false, false, null, false, true, false, false, false, null, startRestartGroup, 12583344, 3072, 253817);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda2
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
            CommonButtonMatchBet(null, true, "Disabled (validating)", false, true, "2.10", false, (Function0) rememberedValue7, null, false, false, null, false, false, false, false, false, null, composer2, 14377392, 0, 261897);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.CommonButtonMatchBetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewCommonButtonMatchBet$lambda$42;
                    PreviewCommonButtonMatchBet$lambda$42 = CommonButtonMatchBetKt.PreviewCommonButtonMatchBet$lambda$42(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewCommonButtonMatchBet$lambda$42;
                }
            });
        }
    }

    private static final boolean CommonButtonMatchBet$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
