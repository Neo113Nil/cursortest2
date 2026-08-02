package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.X2;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.common.compose.AutoResizeSiblingsTextKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TeamsRow.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\u0091\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0016H\u0007¢\u0006\u0004\b$\u0010%\u001a+\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,\u001a)\u0010-\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00100\u001a\r\u00101\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00102\u001a\r\u00103\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00102\u001a-\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u00106\u001a\u00020!H\u0007¢\u0006\u0004\b7\u00108\u001a#\u00109\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0004\b;\u0010<\u001a\r\u0010=\u001a\u00020\u0007H\u0007¢\u0006\u0002\u00102\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"SCORE_HIGHLIGHT_PULSE_COUNT", "", "SCORE_HIGHLIGHT_SCALE_PEAK", "", "SCORE_HIGHLIGHT_SCALE_UP_MS", "SCORE_HIGHLIGHT_SCALE_DOWN_MS", "TeamsRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "firstTeamName", "", "secondTeamName", "firstTeamImage", "secondTeamImage", "scoreFirstTeam", "scoreSecondTeam", "periodScoresDisplay", "matchDate", "machTime", "matchEventDate", "goldScoreLive", "", "isScoreAvailable", "isSingleTeam", "inCompetition", "highlightFirstScore", "highlightSecondScore", "scoreHighlightAnimationKey", "onFirstTeamClick", "Lkotlin/Function0;", "onSecondTeamClick", "teamImageSize", "Landroidx/compose/ui/unit/Dp;", "rowPadding", "dense", "TeamsRow-Uie-fj4", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;FFZLandroidx/compose/runtime/Composer;IIII)V", "ScoreBox", "score", "boxSize", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", "ScoreBox-4gGThfQ", "(Ljava/lang/String;FJLandroidx/compose/runtime/Composer;II)V", "ScoreBoxGold", "highlighted", "highlightAnimationKey", "(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;II)V", "DividerDotGold", "(Landroidx/compose/runtime/Composer;I)V", "DividerDot", "MatchTimeText", "time", "verticalPadding", "MatchTimeText-pS8O2Ho", "(Ljava/lang/String;JFLandroidx/compose/runtime/Composer;II)V", "MatchDateText", "date", "MatchDateText-KmRG4DE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "PreviewTeamsRow", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TeamsRowKt {
    private static final int SCORE_HIGHLIGHT_PULSE_COUNT = 3;
    private static final int SCORE_HIGHLIGHT_SCALE_DOWN_MS = 180;
    private static final float SCORE_HIGHLIGHT_SCALE_PEAK = 1.32f;
    private static final int SCORE_HIGHLIGHT_SCALE_UP_MS = 140;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DividerDot$lambda$21(int i, Composer composer, int i2) {
        DividerDot(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DividerDotGold$lambda$20(int i, Composer composer, int i2) {
        DividerDotGold(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDateText_KmRG4DE$lambda$23(String str, long j, int i, int i2, Composer composer, int i3) {
        m13612MatchDateTextKmRG4DE(str, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchTimeText_pS8O2Ho$lambda$22(String str, long j, float f, int i, int i2, Composer composer, int i3) {
        m13613MatchTimeTextpS8O2Ho(str, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTeamsRow$lambda$24(int i, Composer composer, int i2) {
        PreviewTeamsRow(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScoreBoxGold$lambda$19(String str, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        ScoreBoxGold(str, z, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScoreBox_4gGThfQ$lambda$15(String str, float f, long j, int i, int i2, Composer composer, int i3) {
        m13614ScoreBox4gGThfQ(str, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamsRow_Uie_fj4$lambda$13(Modifier modifier, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Function0 function0, Function0 function02, float f, float f2, boolean z7, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        m13615TeamsRowUiefj4(modifier, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, z2, z3, z4, z5, z6, i, function0, function02, f, f2, z7, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x1293  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x127e  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x12c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0337  */
    /* renamed from: TeamsRow-Uie-fj4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13615TeamsRowUiefj4(Modifier modifier, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Function0<Unit> function0, Function0<Unit> function02, float f, float f2, boolean z7, Composer composer, final int i2, final int i3, final int i4, final int i5) {
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
        final Function0<Unit> function03;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        String str11;
        String str12;
        boolean z8;
        boolean z9;
        float f3;
        String str13;
        float m7774constructorimpl;
        String str14;
        float m7774constructorimpl2;
        float f4;
        float f5;
        float m7774constructorimpl3;
        Modifier modifier2;
        String str15;
        String str16;
        final String str17;
        boolean z10;
        String str18;
        Function0<Unit> function04;
        final Function0<Unit> function05;
        final float f6;
        final Function0<Unit> function06;
        final String str19;
        final String str20;
        final String str21;
        final String str22;
        final boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        final int i32;
        final String str23;
        final boolean z15;
        final float f7;
        final String str24;
        final boolean z16;
        final String str25;
        final Modifier modifier3;
        final String str26;
        final boolean z17;
        final Function0<Unit> function07;
        final String str27;
        final String str28;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        String str29;
        String str30;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(792267369);
        int i33 = i5 & 1;
        if (i33 != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i6 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i34 = i5 & 2;
        if (i34 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= startRestartGroup.changed(str) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i6 |= startRestartGroup.changed(str2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i6 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(str5) ? 131072 : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(str6) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(str7) ? 8388608 : 4194304;
                        }
                        i13 = i5 & 256;
                        if (i13 != 0) {
                            i6 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i6 |= startRestartGroup.changed(str8) ? 67108864 : 33554432;
                        }
                        i14 = i5 & 512;
                        if (i14 != 0) {
                            i6 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i6 |= startRestartGroup.changed(str9) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        i15 = i5 & 1024;
                        if (i15 != 0) {
                            i16 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i16 = i3 | (startRestartGroup.changed(str10) ? 4 : 2);
                        } else {
                            i16 = i3;
                        }
                        i17 = i5 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i16 |= startRestartGroup.changed(z) ? 32 : 16;
                        }
                        int i35 = i16;
                        i18 = i5 & 4096;
                        if (i18 != 0) {
                            i35 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i35 |= startRestartGroup.changed(z2) ? 256 : 128;
                            i19 = i5 & 8192;
                            if (i19 == 0) {
                                i35 |= 3072;
                                i20 = i19;
                            } else {
                                i20 = i19;
                                if ((i3 & 3072) == 0) {
                                    i35 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                    i21 = i5 & 16384;
                                    if (i21 != 0) {
                                        i35 |= 24576;
                                        i22 = i21;
                                    } else {
                                        i22 = i21;
                                        if ((i3 & 24576) == 0) {
                                            i35 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                                            i23 = i5 & 32768;
                                            if (i23 == 0) {
                                                i35 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i35 |= startRestartGroup.changed(z5) ? 131072 : 65536;
                                            }
                                            i24 = i5 & 65536;
                                            if (i24 == 0) {
                                                i35 |= 1572864;
                                            } else if ((i3 & 1572864) == 0) {
                                                i35 |= startRestartGroup.changed(z6) ? 1048576 : 524288;
                                            }
                                            i25 = i5 & 131072;
                                            if (i25 == 0) {
                                                i35 |= 12582912;
                                            } else if ((i3 & 12582912) == 0) {
                                                i35 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                                            }
                                            i26 = i5 & 262144;
                                            if (i26 == 0) {
                                                i35 |= 100663296;
                                                function03 = function0;
                                            } else {
                                                function03 = function0;
                                                if ((i3 & 100663296) == 0) {
                                                    i35 |= startRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                                                }
                                            }
                                            i27 = i5 & 524288;
                                            if (i27 == 0) {
                                                i35 |= 805306368;
                                            } else if ((i3 & 805306368) == 0) {
                                                i35 |= startRestartGroup.changedInstance(function02) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                            }
                                            i28 = i5 & 1048576;
                                            if (i28 == 0) {
                                                i29 = i4 | 6;
                                            } else if ((i4 & 6) == 0) {
                                                i29 = i4 | (startRestartGroup.changed(f) ? 4 : 2);
                                            } else {
                                                i29 = i4;
                                            }
                                            i30 = i5 & 2097152;
                                            if (i30 == 0) {
                                                i29 |= 48;
                                            } else if ((i4 & 48) == 0) {
                                                i29 |= startRestartGroup.changed(f2) ? 32 : 16;
                                            }
                                            int i36 = i29;
                                            i31 = i5 & 4194304;
                                            if (i31 == 0) {
                                                i36 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                            } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                                i36 |= startRestartGroup.changed(z7) ? 256 : 128;
                                                if ((i6 & 306783379) == 306783378 || (306783379 & i35) != 306783378 || (i36 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
                                                    Modifier.Companion companion3 = i33 != 0 ? Modifier.INSTANCE : modifier;
                                                    String str31 = i34 != 0 ? "" : str;
                                                    String str32 = i7 != 0 ? "" : str2;
                                                    String str33 = i8 != 0 ? "" : str3;
                                                    if (i9 != 0) {
                                                        str12 = "";
                                                        str11 = str12;
                                                    } else {
                                                        str11 = str4;
                                                        str12 = "";
                                                    }
                                                    String str34 = i10 != 0 ? null : str5;
                                                    String str35 = i11 != 0 ? null : str6;
                                                    String str36 = i12 != 0 ? null : str7;
                                                    String str37 = i13 != 0 ? str12 : str8;
                                                    String str38 = i14 != 0 ? str12 : str9;
                                                    String str39 = i15 != 0 ? null : str10;
                                                    boolean z18 = i17 != 0 ? false : z;
                                                    boolean z19 = i18 != 0 ? false : z2;
                                                    z8 = i20 != 0 ? false : z3;
                                                    boolean z20 = i22 != 0 ? false : z4;
                                                    boolean z21 = i23 != 0 ? false : z5;
                                                    boolean z22 = i24 != 0 ? false : z6;
                                                    int i37 = i25 != 0 ? 0 : i;
                                                    if (i26 != 0) {
                                                        function03 = null;
                                                    }
                                                    Function0<Unit> function08 = i27 != 0 ? null : function02;
                                                    String str40 = str11;
                                                    float m7774constructorimpl4 = i28 != 0 ? Dp.m7774constructorimpl(48) : f;
                                                    float m7774constructorimpl5 = i30 != 0 ? Dp.m7774constructorimpl(16) : f2;
                                                    z9 = i31 != 0 ? false : z7;
                                                    float f8 = m7774constructorimpl5;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        f3 = m7774constructorimpl4;
                                                        ComposerKt.traceEventStart(792267369, i6, i35, "org.betup.ui.fragment.bets.sheet.compose.items.TeamsRow (TeamsRow.kt:78)");
                                                    } else {
                                                        f3 = m7774constructorimpl4;
                                                    }
                                                    float m7774constructorimpl6 = z9 ? Dp.m7774constructorimpl(3) : Dp.m7774constructorimpl(6);
                                                    final long sp = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                                                    if (z9) {
                                                        str13 = str39;
                                                        m7774constructorimpl = Dp.m7774constructorimpl(2);
                                                    } else {
                                                        str13 = str39;
                                                        m7774constructorimpl = Dp.m7774constructorimpl(4);
                                                    }
                                                    float m7774constructorimpl7 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                                                    boolean z23 = z18;
                                                    if (z9) {
                                                        str14 = str37;
                                                        m7774constructorimpl2 = Dp.m7774constructorimpl(6);
                                                    } else {
                                                        str14 = str37;
                                                        m7774constructorimpl2 = Dp.m7774constructorimpl(8);
                                                    }
                                                    long sp2 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                                                    long sp3 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                                                    long sp4 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                                                    float m7774constructorimpl8 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                                                    long sp5 = TextUnitKt.getSp(z9 ? 9 : 12);
                                                    if (z9) {
                                                        f4 = m7774constructorimpl2;
                                                        f5 = m7774constructorimpl8;
                                                        m7774constructorimpl3 = Dp.m7774constructorimpl(2);
                                                    } else {
                                                        f4 = m7774constructorimpl2;
                                                        f5 = m7774constructorimpl8;
                                                        m7774constructorimpl3 = Dp.m7774constructorimpl(4);
                                                    }
                                                    long sp6 = TextUnitKt.getSp(z9 ? 9 : 12);
                                                    if (z8) {
                                                        modifier2 = companion3;
                                                        str15 = str36;
                                                        str16 = str38;
                                                        str17 = str32;
                                                        z10 = z19;
                                                        str18 = str33;
                                                        function04 = function03;
                                                        function05 = function08;
                                                    } else {
                                                        String str41 = str36;
                                                        String str42 = str36;
                                                        boolean z24 = str41 == null || StringsKt.isBlank(str41);
                                                        float f9 = m7774constructorimpl3;
                                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        modifier2 = companion3;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        str16 = str38;
                                                        z10 = z19;
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
                                                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z20 ? Dp.m7774constructorimpl(6) : f8);
                                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        final float f10 = m7774constructorimpl;
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
                                                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                        startRestartGroup.startReplaceGroup(1058326281);
                                                        if (function03 != null) {
                                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            boolean z25 = (234881024 & i35) == 67108864;
                                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                                            if (z25 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda6
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$1$lambda$0;
                                                                        TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$1$lambda$0 = TeamsRowKt.TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$1$lambda$0(Function0.this);
                                                                        return TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$1$lambda$0;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            companion = ClickableKt.m1059clickableXHw0xAI$default(companion4, false, null, null, (Function0) rememberedValue, 7, null);
                                                        } else {
                                                            companion = Modifier.INSTANCE;
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Modifier then = weight$default.then(companion);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        function04 = function03;
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
                                                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, m7774constructorimpl6);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
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
                                                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(str33, StringResources_androidKt.stringResource(R.string.cd_first_team, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, z20 ? Dp.m7774constructorimpl(32) : f3), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, null, 0.0f, null, 0, false, startRestartGroup, (i6 >> 9) & 14, 0, 32736);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        final String str43 = str31;
                                                        final String str44 = str32;
                                                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1509314296, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$TeamsRow$1$1$2$2
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i38) {
                                                                int i39;
                                                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                                                if ((i38 & 6) == 0) {
                                                                    i39 = i38 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                                                                } else {
                                                                    i39 = i38;
                                                                }
                                                                if ((i39 & 19) == 18 && composer2.getSkipping()) {
                                                                    composer2.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1509314296, i39, -1, "org.betup.ui.fragment.bets.sheet.compose.items.TeamsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeamsRow.kt:128)");
                                                                }
                                                                List listOf = CollectionsKt.listOf((Object[]) new String[]{str43, str44});
                                                                long j = sp;
                                                                long sp7 = TextUnitKt.getSp(3);
                                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                                Object consume = composer2.consume(localDensity);
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                TextKt.m2642Text4IGK_g(str43, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f10, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), AutoResizeSiblingsTextKt.m12898CalculateAutoResizeFontSizeForWidtha8pgNYE(listOf, j, sp7, ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()), true, 0, null, composer2, 24960, 96), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer2, 0, X2.b.f, 51196);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, startRestartGroup, 54), startRestartGroup, 3078, 6);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        boolean z26 = (!z10 || (str30 = str16) == null || StringsKt.isBlank(str30)) ? false : true;
                                                        boolean z27 = z10 && ((str29 = str16) == null || StringsKt.isBlank(str29));
                                                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                                        str17 = str32;
                                                        str18 = str33;
                                                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl7, 1, null), f4, 0.0f, 2, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
                                                        Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                        if (!z10) {
                                                            startRestartGroup.startReplaceGroup(-1737219898);
                                                            m13613MatchTimeTextpS8O2Ho(str16, sp6, f9, startRestartGroup, (i6 >> 27) & 14, 0);
                                                            m13612MatchDateTextKmRG4DE(str14, TextUnitKt.getSp(z9 ? 8 : 10), startRestartGroup, (i6 >> 24) & 14, 0);
                                                            startRestartGroup.endReplaceGroup();
                                                            str15 = str42;
                                                        } else {
                                                            if (z26) {
                                                                startRestartGroup.startReplaceGroup(-1736741537);
                                                                float f11 = 2;
                                                                TextKt.m2642Text4IGK_g(UiExtensionsKt.normalizeMatchTime(str16), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f11), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), sp2, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                                                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                                                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion5);
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
                                                                if (z23) {
                                                                    startRestartGroup.startReplaceGroup(-867253468);
                                                                    int i38 = i35 >> 15;
                                                                    ScoreBoxGold(str34 == null ? "-" : str34, z21, i37, startRestartGroup, ((i35 >> 12) & 112) | (i38 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                                                                    float f12 = 4;
                                                                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f12)), startRestartGroup, 6);
                                                                    DividerDotGold(startRestartGroup, 0);
                                                                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f12)), startRestartGroup, 6);
                                                                    ScoreBoxGold(str35 != null ? str35 : "-", z22, i37, startRestartGroup, i38 & 1008, 0);
                                                                    startRestartGroup.endReplaceGroup();
                                                                } else {
                                                                    startRestartGroup.startReplaceGroup(-866452769);
                                                                    m13614ScoreBox4gGThfQ(str34 == null ? "-" : str34, f5, sp5, startRestartGroup, 0, 0);
                                                                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z9 ? 3 : 4)), startRestartGroup, 0);
                                                                    DividerDot(startRestartGroup, 0);
                                                                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z9 ? 3 : 4)), startRestartGroup, 0);
                                                                    m13614ScoreBox4gGThfQ(str35 != null ? str35 : "-", f5, sp5, startRestartGroup, 0, 0);
                                                                    startRestartGroup.endReplaceGroup();
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                startRestartGroup.endNode();
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                startRestartGroup.startReplaceGroup(-471602216);
                                                                if (z24 || str42 == null) {
                                                                    str15 = str42;
                                                                } else {
                                                                    str15 = str42;
                                                                    TextKt.m2642Text4IGK_g("(" + str15 + ")", PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.95f), 0.0f, Dp.m7774constructorimpl(f11), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), true, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), sp3, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, X2.b.f, 50684);
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                m13613MatchTimeTextpS8O2Ho(str14, sp6, f9, startRestartGroup, (i6 >> 24) & 14, 0);
                                                                startRestartGroup.endReplaceGroup();
                                                            } else {
                                                                str15 = str42;
                                                                if (z27) {
                                                                    startRestartGroup.startReplaceGroup(-1733328468);
                                                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                                                                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
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
                                                                    Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                                    }
                                                                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                                                    if (z23) {
                                                                        startRestartGroup.startReplaceGroup(-1297599741);
                                                                        int i39 = i35 >> 15;
                                                                        ScoreBoxGold(str34 == null ? "-" : str34, z21, i37, startRestartGroup, ((i35 >> 12) & 112) | (i39 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                                                                        float f13 = 4;
                                                                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f13)), startRestartGroup, 6);
                                                                        DividerDotGold(startRestartGroup, 0);
                                                                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f13)), startRestartGroup, 6);
                                                                        ScoreBoxGold(str35 != null ? str35 : "-", z22, i37, startRestartGroup, i39 & 1008, 0);
                                                                        startRestartGroup.endReplaceGroup();
                                                                    } else {
                                                                        startRestartGroup.startReplaceGroup(-1296799042);
                                                                        m13614ScoreBox4gGThfQ(str34 == null ? "-" : str34, f5, sp5, startRestartGroup, 0, 0);
                                                                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z9 ? 3 : 4)), startRestartGroup, 0);
                                                                        DividerDot(startRestartGroup, 0);
                                                                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(z9 ? 3 : 4)), startRestartGroup, 0);
                                                                        m13614ScoreBox4gGThfQ(str35 != null ? str35 : "-", f5, sp5, startRestartGroup, 0, 0);
                                                                        startRestartGroup.endReplaceGroup();
                                                                    }
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    startRestartGroup.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    startRestartGroup.startReplaceGroup(-471511208);
                                                                    if (!z24 && str15 != null) {
                                                                        TextKt.m2642Text4IGK_g("(" + str15 + ")", PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.95f), 0.0f, Dp.m7774constructorimpl(2), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), true, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), sp3, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, X2.b.f, 50684);
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    TextKt.m2642Text4IGK_g(UiExtensionsKt.normalizeMatchTime(str14), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, f10, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), sp4, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                                                                    m13612MatchDateTextKmRG4DE(str13, TextUnitKt.getSp(z9 ? 8 : 10), startRestartGroup, i35 & 14, 0);
                                                                    startRestartGroup.endReplaceGroup();
                                                                } else {
                                                                    startRestartGroup.startReplaceGroup(-1730297877);
                                                                    startRestartGroup.endReplaceGroup();
                                                                }
                                                            }
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                                                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                        startRestartGroup.startReplaceGroup(1058652619);
                                                        function05 = function08;
                                                        if (function05 != null) {
                                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            boolean z28 = (1879048192 & i35) == 536870912;
                                                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                            if (z28 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda7
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$8$lambda$7;
                                                                        TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$8$lambda$7 = TeamsRowKt.TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$8$lambda$7(Function0.this);
                                                                        return TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$8$lambda$7;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            companion2 = ClickableKt.m1059clickableXHw0xAI$default(companion7, false, null, null, (Function0) rememberedValue2, 7, null);
                                                        } else {
                                                            companion2 = Modifier.INSTANCE;
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Modifier then2 = weight$default2.then(companion2);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, startRestartGroup, 48);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                                                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor8);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                                            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                                            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                        Modifier m1516padding3ABfNKs3 = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, m7774constructorimpl6);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs3);
                                                        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor9);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        Composer m4610constructorimpl9 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                            m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                            m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                                        SingletonAsyncImageKt.m8175AsyncImagex1rPTaM(str40, StringResources_androidKt.stringResource(R.string.cd_second_team, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, z20 ? Dp.m7774constructorimpl(32) : f3), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), PainterResources_androidKt.painterResource(R.drawable.default_push, startRestartGroup, 6), null, null, null, null, null, null, 0.0f, null, 0, false, startRestartGroup, (i6 >> 12) & 14, 0, 32736);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        final String str45 = str31;
                                                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-114441856, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$TeamsRow$1$1$5$2
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i40) {
                                                                int i41;
                                                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                                                if ((i40 & 6) == 0) {
                                                                    i41 = i40 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                                                                } else {
                                                                    i41 = i40;
                                                                }
                                                                if ((i41 & 19) == 18 && composer2.getSkipping()) {
                                                                    composer2.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-114441856, i41, -1, "org.betup.ui.fragment.bets.sheet.compose.items.TeamsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeamsRow.kt:313)");
                                                                }
                                                                List listOf = CollectionsKt.listOf((Object[]) new String[]{str45, str17});
                                                                long j = sp;
                                                                long sp7 = TextUnitKt.getSp(6);
                                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                                Object consume = composer2.consume(localDensity);
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                TextKt.m2642Text4IGK_g(str17, PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f10, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), AutoResizeSiblingsTextKt.m12898CalculateAutoResizeFontSizeForWidtha8pgNYE(listOf, j, sp7, ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()), true, 0, null, composer2, 24960, 96), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer2, 0, X2.b.f, 51196);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, startRestartGroup, 54), startRestartGroup, 3078, 6);
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
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    f6 = f8;
                                                    function06 = function05;
                                                    str19 = str31;
                                                    str20 = str15;
                                                    str21 = str34;
                                                    str22 = str35;
                                                    z11 = z8;
                                                    z12 = z20;
                                                    z13 = z21;
                                                    z14 = z22;
                                                    i32 = i37;
                                                    str23 = str40;
                                                    z15 = z9;
                                                    f7 = f3;
                                                    str24 = str13;
                                                    z16 = z23;
                                                    str25 = str14;
                                                    modifier3 = modifier2;
                                                    str26 = str16;
                                                    z17 = z10;
                                                    function07 = function04;
                                                    str27 = str18;
                                                    str28 = str17;
                                                } else {
                                                    startRestartGroup.skipToGroupEnd();
                                                    modifier3 = modifier;
                                                    str19 = str;
                                                    str28 = str2;
                                                    str27 = str3;
                                                    str23 = str4;
                                                    str21 = str5;
                                                    str22 = str6;
                                                    str20 = str7;
                                                    str25 = str8;
                                                    str26 = str9;
                                                    str24 = str10;
                                                    z16 = z;
                                                    z17 = z2;
                                                    z11 = z3;
                                                    z13 = z5;
                                                    z14 = z6;
                                                    i32 = i;
                                                    function06 = function02;
                                                    f7 = f;
                                                    f6 = f2;
                                                    z15 = z7;
                                                    function07 = function03;
                                                    z12 = z4;
                                                }
                                                endRestartGroup = startRestartGroup.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    final boolean z29 = z12;
                                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda8
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit TeamsRow_Uie_fj4$lambda$13;
                                                            TeamsRow_Uie_fj4$lambda$13 = TeamsRowKt.TeamsRow_Uie_fj4$lambda$13(Modifier.this, str19, str28, str27, str23, str21, str22, str20, str25, str26, str24, z16, z17, z11, z29, z13, z14, i32, function07, function06, f7, f6, z15, i2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                                            return TeamsRow_Uie_fj4$lambda$13;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            if ((i6 & 306783379) == 306783378) {
                                            }
                                            if (i33 != 0) {
                                            }
                                            if (i34 != 0) {
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
                                            if (i14 != 0) {
                                            }
                                            if (i15 != 0) {
                                            }
                                            if (i17 != 0) {
                                            }
                                            if (i18 != 0) {
                                            }
                                            if (i20 != 0) {
                                            }
                                            if (i22 != 0) {
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
                                            String str402 = str11;
                                            if (i28 != 0) {
                                            }
                                            if (i30 != 0) {
                                            }
                                            if (i31 != 0) {
                                            }
                                            float f82 = m7774constructorimpl5;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            if (z9) {
                                            }
                                            final long sp7 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                                            if (z9) {
                                            }
                                            float m7774constructorimpl72 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                                            boolean z232 = z18;
                                            if (z9) {
                                            }
                                            long sp22 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                                            long sp32 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                                            long sp42 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                                            float m7774constructorimpl82 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                                            long sp52 = TextUnitKt.getSp(z9 ? 9 : 12);
                                            if (z9) {
                                            }
                                            long sp62 = TextUnitKt.getSp(z9 ? 9 : 12);
                                            if (z8) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            f6 = f82;
                                            function06 = function05;
                                            str19 = str31;
                                            str20 = str15;
                                            str21 = str34;
                                            str22 = str35;
                                            z11 = z8;
                                            z12 = z20;
                                            z13 = z21;
                                            z14 = z22;
                                            i32 = i37;
                                            str23 = str402;
                                            z15 = z9;
                                            f7 = f3;
                                            str24 = str13;
                                            z16 = z232;
                                            str25 = str14;
                                            modifier3 = modifier2;
                                            str26 = str16;
                                            z17 = z10;
                                            function07 = function04;
                                            str27 = str18;
                                            str28 = str17;
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup != null) {
                                            }
                                        }
                                    }
                                    i23 = i5 & 32768;
                                    if (i23 == 0) {
                                    }
                                    i24 = i5 & 65536;
                                    if (i24 == 0) {
                                    }
                                    i25 = i5 & 131072;
                                    if (i25 == 0) {
                                    }
                                    i26 = i5 & 262144;
                                    if (i26 == 0) {
                                    }
                                    i27 = i5 & 524288;
                                    if (i27 == 0) {
                                    }
                                    i28 = i5 & 1048576;
                                    if (i28 == 0) {
                                    }
                                    i30 = i5 & 2097152;
                                    if (i30 == 0) {
                                    }
                                    int i362 = i29;
                                    i31 = i5 & 4194304;
                                    if (i31 == 0) {
                                    }
                                    if ((i6 & 306783379) == 306783378) {
                                    }
                                    if (i33 != 0) {
                                    }
                                    if (i34 != 0) {
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
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i17 != 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (i22 != 0) {
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
                                    String str4022 = str11;
                                    if (i28 != 0) {
                                    }
                                    if (i30 != 0) {
                                    }
                                    if (i31 != 0) {
                                    }
                                    float f822 = m7774constructorimpl5;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (z9) {
                                    }
                                    final long sp72 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                                    if (z9) {
                                    }
                                    float m7774constructorimpl722 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                                    boolean z2322 = z18;
                                    if (z9) {
                                    }
                                    long sp222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                                    long sp322 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                                    long sp422 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                                    float m7774constructorimpl822 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                                    long sp522 = TextUnitKt.getSp(z9 ? 9 : 12);
                                    if (z9) {
                                    }
                                    long sp622 = TextUnitKt.getSp(z9 ? 9 : 12);
                                    if (z8) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f6 = f822;
                                    function06 = function05;
                                    str19 = str31;
                                    str20 = str15;
                                    str21 = str34;
                                    str22 = str35;
                                    z11 = z8;
                                    z12 = z20;
                                    z13 = z21;
                                    z14 = z22;
                                    i32 = i37;
                                    str23 = str4022;
                                    z15 = z9;
                                    f7 = f3;
                                    str24 = str13;
                                    z16 = z2322;
                                    str25 = str14;
                                    modifier3 = modifier2;
                                    str26 = str16;
                                    z17 = z10;
                                    function07 = function04;
                                    str27 = str18;
                                    str28 = str17;
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                            }
                            i21 = i5 & 16384;
                            if (i21 != 0) {
                            }
                            i23 = i5 & 32768;
                            if (i23 == 0) {
                            }
                            i24 = i5 & 65536;
                            if (i24 == 0) {
                            }
                            i25 = i5 & 131072;
                            if (i25 == 0) {
                            }
                            i26 = i5 & 262144;
                            if (i26 == 0) {
                            }
                            i27 = i5 & 524288;
                            if (i27 == 0) {
                            }
                            i28 = i5 & 1048576;
                            if (i28 == 0) {
                            }
                            i30 = i5 & 2097152;
                            if (i30 == 0) {
                            }
                            int i3622 = i29;
                            i31 = i5 & 4194304;
                            if (i31 == 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            if (i33 != 0) {
                            }
                            if (i34 != 0) {
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
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i22 != 0) {
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
                            String str40222 = str11;
                            if (i28 != 0) {
                            }
                            if (i30 != 0) {
                            }
                            if (i31 != 0) {
                            }
                            float f8222 = m7774constructorimpl5;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (z9) {
                            }
                            final long sp722 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                            if (z9) {
                            }
                            float m7774constructorimpl7222 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                            boolean z23222 = z18;
                            if (z9) {
                            }
                            long sp2222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                            long sp3222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                            long sp4222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                            float m7774constructorimpl8222 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                            long sp5222 = TextUnitKt.getSp(z9 ? 9 : 12);
                            if (z9) {
                            }
                            long sp6222 = TextUnitKt.getSp(z9 ? 9 : 12);
                            if (z8) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f6 = f8222;
                            function06 = function05;
                            str19 = str31;
                            str20 = str15;
                            str21 = str34;
                            str22 = str35;
                            z11 = z8;
                            z12 = z20;
                            z13 = z21;
                            z14 = z22;
                            i32 = i37;
                            str23 = str40222;
                            z15 = z9;
                            f7 = f3;
                            str24 = str13;
                            z16 = z23222;
                            str25 = str14;
                            modifier3 = modifier2;
                            str26 = str16;
                            z17 = z10;
                            function07 = function04;
                            str27 = str18;
                            str28 = str17;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i19 = i5 & 8192;
                        if (i19 == 0) {
                        }
                        i21 = i5 & 16384;
                        if (i21 != 0) {
                        }
                        i23 = i5 & 32768;
                        if (i23 == 0) {
                        }
                        i24 = i5 & 65536;
                        if (i24 == 0) {
                        }
                        i25 = i5 & 131072;
                        if (i25 == 0) {
                        }
                        i26 = i5 & 262144;
                        if (i26 == 0) {
                        }
                        i27 = i5 & 524288;
                        if (i27 == 0) {
                        }
                        i28 = i5 & 1048576;
                        if (i28 == 0) {
                        }
                        i30 = i5 & 2097152;
                        if (i30 == 0) {
                        }
                        int i36222 = i29;
                        i31 = i5 & 4194304;
                        if (i31 == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        if (i33 != 0) {
                        }
                        if (i34 != 0) {
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
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i22 != 0) {
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
                        String str402222 = str11;
                        if (i28 != 0) {
                        }
                        if (i30 != 0) {
                        }
                        if (i31 != 0) {
                        }
                        float f82222 = m7774constructorimpl5;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (z9) {
                        }
                        final long sp7222 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                        if (z9) {
                        }
                        float m7774constructorimpl72222 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                        boolean z232222 = z18;
                        if (z9) {
                        }
                        long sp22222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                        long sp32222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                        long sp42222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                        float m7774constructorimpl82222 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                        long sp52222 = TextUnitKt.getSp(z9 ? 9 : 12);
                        if (z9) {
                        }
                        long sp62222 = TextUnitKt.getSp(z9 ? 9 : 12);
                        if (z8) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f6 = f82222;
                        function06 = function05;
                        str19 = str31;
                        str20 = str15;
                        str21 = str34;
                        str22 = str35;
                        z11 = z8;
                        z12 = z20;
                        z13 = z21;
                        z14 = z22;
                        i32 = i37;
                        str23 = str402222;
                        z15 = z9;
                        f7 = f3;
                        str24 = str13;
                        z16 = z232222;
                        str25 = str14;
                        modifier3 = modifier2;
                        str26 = str16;
                        z17 = z10;
                        function07 = function04;
                        str27 = str18;
                        str28 = str17;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i5 & 2048;
                    if (i17 != 0) {
                    }
                    int i352 = i16;
                    i18 = i5 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 8192;
                    if (i19 == 0) {
                    }
                    i21 = i5 & 16384;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 32768;
                    if (i23 == 0) {
                    }
                    i24 = i5 & 65536;
                    if (i24 == 0) {
                    }
                    i25 = i5 & 131072;
                    if (i25 == 0) {
                    }
                    i26 = i5 & 262144;
                    if (i26 == 0) {
                    }
                    i27 = i5 & 524288;
                    if (i27 == 0) {
                    }
                    i28 = i5 & 1048576;
                    if (i28 == 0) {
                    }
                    i30 = i5 & 2097152;
                    if (i30 == 0) {
                    }
                    int i362222 = i29;
                    i31 = i5 & 4194304;
                    if (i31 == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    if (i33 != 0) {
                    }
                    if (i34 != 0) {
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
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 != 0) {
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
                    String str4022222 = str11;
                    if (i28 != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    float f822222 = m7774constructorimpl5;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (z9) {
                    }
                    final long sp72222 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                    if (z9) {
                    }
                    float m7774constructorimpl722222 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                    boolean z2322222 = z18;
                    if (z9) {
                    }
                    long sp222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                    long sp322222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                    long sp422222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                    float m7774constructorimpl822222 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                    long sp522222 = TextUnitKt.getSp(z9 ? 9 : 12);
                    if (z9) {
                    }
                    long sp622222 = TextUnitKt.getSp(z9 ? 9 : 12);
                    if (z8) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f6 = f822222;
                    function06 = function05;
                    str19 = str31;
                    str20 = str15;
                    str21 = str34;
                    str22 = str35;
                    z11 = z8;
                    z12 = z20;
                    z13 = z21;
                    z14 = z22;
                    i32 = i37;
                    str23 = str4022222;
                    z15 = z9;
                    f7 = f3;
                    str24 = str13;
                    z16 = z2322222;
                    str25 = str14;
                    modifier3 = modifier2;
                    str26 = str16;
                    z17 = z10;
                    function07 = function04;
                    str27 = str18;
                    str28 = str17;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                }
                i14 = i5 & 512;
                if (i14 != 0) {
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                }
                int i3522 = i16;
                i18 = i5 & 4096;
                if (i18 != 0) {
                }
                i19 = i5 & 8192;
                if (i19 == 0) {
                }
                i21 = i5 & 16384;
                if (i21 != 0) {
                }
                i23 = i5 & 32768;
                if (i23 == 0) {
                }
                i24 = i5 & 65536;
                if (i24 == 0) {
                }
                i25 = i5 & 131072;
                if (i25 == 0) {
                }
                i26 = i5 & 262144;
                if (i26 == 0) {
                }
                i27 = i5 & 524288;
                if (i27 == 0) {
                }
                i28 = i5 & 1048576;
                if (i28 == 0) {
                }
                i30 = i5 & 2097152;
                if (i30 == 0) {
                }
                int i3622222 = i29;
                i31 = i5 & 4194304;
                if (i31 == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                if (i33 != 0) {
                }
                if (i34 != 0) {
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
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 != 0) {
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
                String str40222222 = str11;
                if (i28 != 0) {
                }
                if (i30 != 0) {
                }
                if (i31 != 0) {
                }
                float f8222222 = m7774constructorimpl5;
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z9) {
                }
                final long sp722222 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
                if (z9) {
                }
                float m7774constructorimpl7222222 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
                boolean z23222222 = z18;
                if (z9) {
                }
                long sp2222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
                long sp3222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
                long sp4222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                float m7774constructorimpl8222222 = Dp.m7774constructorimpl(z9 ? 17 : 24);
                long sp5222222 = TextUnitKt.getSp(z9 ? 9 : 12);
                if (z9) {
                }
                long sp6222222 = TextUnitKt.getSp(z9 ? 9 : 12);
                if (z8) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                f6 = f8222222;
                function06 = function05;
                str19 = str31;
                str20 = str15;
                str21 = str34;
                str22 = str35;
                z11 = z8;
                z12 = z20;
                z13 = z21;
                z14 = z22;
                i32 = i37;
                str23 = str40222222;
                z15 = z9;
                f7 = f3;
                str24 = str13;
                z16 = z23222222;
                str25 = str14;
                modifier3 = modifier2;
                str26 = str16;
                z17 = z10;
                function07 = function04;
                str27 = str18;
                str28 = str17;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            int i35222 = i16;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            i19 = i5 & 8192;
            if (i19 == 0) {
            }
            i21 = i5 & 16384;
            if (i21 != 0) {
            }
            i23 = i5 & 32768;
            if (i23 == 0) {
            }
            i24 = i5 & 65536;
            if (i24 == 0) {
            }
            i25 = i5 & 131072;
            if (i25 == 0) {
            }
            i26 = i5 & 262144;
            if (i26 == 0) {
            }
            i27 = i5 & 524288;
            if (i27 == 0) {
            }
            i28 = i5 & 1048576;
            if (i28 == 0) {
            }
            i30 = i5 & 2097152;
            if (i30 == 0) {
            }
            int i36222222 = i29;
            i31 = i5 & 4194304;
            if (i31 == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            if (i33 != 0) {
            }
            if (i34 != 0) {
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
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 != 0) {
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
            String str402222222 = str11;
            if (i28 != 0) {
            }
            if (i30 != 0) {
            }
            if (i31 != 0) {
            }
            float f82222222 = m7774constructorimpl5;
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z9) {
            }
            final long sp7222222 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
            if (z9) {
            }
            float m7774constructorimpl72222222 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
            boolean z232222222 = z18;
            if (z9) {
            }
            long sp22222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
            long sp32222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
            long sp42222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
            float m7774constructorimpl82222222 = Dp.m7774constructorimpl(z9 ? 17 : 24);
            long sp52222222 = TextUnitKt.getSp(z9 ? 9 : 12);
            if (z9) {
            }
            long sp62222222 = TextUnitKt.getSp(z9 ? 9 : 12);
            if (z8) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            f6 = f82222222;
            function06 = function05;
            str19 = str31;
            str20 = str15;
            str21 = str34;
            str22 = str35;
            z11 = z8;
            z12 = z20;
            z13 = z21;
            z14 = z22;
            i32 = i37;
            str23 = str402222222;
            z15 = z9;
            f7 = f3;
            str24 = str13;
            z16 = z232222222;
            str25 = str14;
            modifier3 = modifier2;
            str26 = str16;
            z17 = z10;
            function07 = function04;
            str27 = str18;
            str28 = str17;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        int i352222 = i16;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        i19 = i5 & 8192;
        if (i19 == 0) {
        }
        i21 = i5 & 16384;
        if (i21 != 0) {
        }
        i23 = i5 & 32768;
        if (i23 == 0) {
        }
        i24 = i5 & 65536;
        if (i24 == 0) {
        }
        i25 = i5 & 131072;
        if (i25 == 0) {
        }
        i26 = i5 & 262144;
        if (i26 == 0) {
        }
        i27 = i5 & 524288;
        if (i27 == 0) {
        }
        i28 = i5 & 1048576;
        if (i28 == 0) {
        }
        i30 = i5 & 2097152;
        if (i30 == 0) {
        }
        int i362222222 = i29;
        i31 = i5 & 4194304;
        if (i31 == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        if (i33 != 0) {
        }
        if (i34 != 0) {
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
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 != 0) {
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
        String str4022222222 = str11;
        if (i28 != 0) {
        }
        if (i30 != 0) {
        }
        if (i31 != 0) {
        }
        float f822222222 = m7774constructorimpl5;
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z9) {
        }
        final long sp72222222 = z9 ? TextUnitKt.getSp(10) : TextUnitKt.getSp(12);
        if (z9) {
        }
        float m7774constructorimpl722222222 = Dp.m7774constructorimpl(z9 ? 77 : z20 ? 90 : 110);
        boolean z2322222222 = z18;
        if (z9) {
        }
        long sp222222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(10);
        long sp322222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(13);
        long sp422222222 = z9 ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
        float m7774constructorimpl822222222 = Dp.m7774constructorimpl(z9 ? 17 : 24);
        long sp522222222 = TextUnitKt.getSp(z9 ? 9 : 12);
        if (z9) {
        }
        long sp622222222 = TextUnitKt.getSp(z9 ? 9 : 12);
        if (z8) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        f6 = f822222222;
        function06 = function05;
        str19 = str31;
        str20 = str15;
        str21 = str34;
        str22 = str35;
        z11 = z8;
        z12 = z20;
        z13 = z21;
        z14 = z22;
        i32 = i37;
        str23 = str4022222222;
        z15 = z9;
        f7 = f3;
        str24 = str13;
        z16 = z2322222222;
        str25 = str14;
        modifier3 = modifier2;
        str26 = str16;
        z17 = z10;
        function07 = function04;
        str27 = str18;
        str28 = str17;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamsRow_Uie_fj4$lambda$12$lambda$11$lambda$8$lambda$7(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004d  */
    /* renamed from: ScoreBox-4gGThfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13614ScoreBox4gGThfQ(final String str, float f, long j, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        long j2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1048315682);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    float m7774constructorimpl = i5 != 0 ? Dp.m7774constructorimpl(24) : f2;
                    long sp = i4 != 0 ? TextUnitKt.getSp(12) : j2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1048315682, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.ScoreBox (TeamsRow.kt:356)");
                    }
                    Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), m7774constructorimpl), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
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
                    float f3 = m7774constructorimpl;
                    TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), sp, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = f3;
                    j3 = sp;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j3 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final float f4 = f2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ScoreBox_4gGThfQ$lambda$15;
                            ScoreBox_4gGThfQ$lambda$15 = TeamsRowKt.ScoreBox_4gGThfQ$lambda$15(str, f4, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ScoreBox_4gGThfQ$lambda$15;
                        }
                    });
                    return;
                }
                return;
            }
            j2 = j;
            if ((i3 & Opcodes.I2S) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), m7774constructorimpl), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU2);
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
            float f32 = m7774constructorimpl;
            TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), sp, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = f32;
            j3 = sp;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j2 = j;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1024backgroundbw27NRU22 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), m7774constructorimpl), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU22);
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
        float f322 = m7774constructorimpl;
        TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), sp, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f322;
        j3 = sp;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ScoreBoxGold(final String str, boolean z, int i, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        Object rememberedValue;
        boolean changedInstance;
        TeamsRowKt$ScoreBoxGold$1$1 rememberedValue2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final int i8;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-278341532);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z2 = z;
            i4 |= startRestartGroup.changed(z2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    z3 = i9 != 0 ? false : z2;
                    i7 = i5 != 0 ? 0 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-278341532, i4, -1, "org.betup.ui.fragment.bets.sheet.compose.items.ScoreBoxGold (TeamsRow.kt:384)");
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Animatable animatable = (Animatable) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    Boolean valueOf = Boolean.valueOf(z3);
                    Integer valueOf2 = Integer.valueOf(i7);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changedInstance = ((i4 & 112) == 32) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(animatable);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new TeamsRowKt$ScoreBoxGold$1$1(z3, i7, animatable, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, startRestartGroup, (i4 >> 3) & 126);
                    Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(ScaleKt.scale(Modifier.INSTANCE, ((Number) animatable.getValue()).floatValue()), Dp.m7774constructorimpl(32)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
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
                    boolean z4 = z3;
                    i8 = i7;
                    TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i4 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    i8 = i6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z5 = z2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ScoreBoxGold$lambda$19;
                            ScoreBoxGold$lambda$19 = TeamsRowKt.ScoreBoxGold$lambda$19(str, z5, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return ScoreBoxGold$lambda$19;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i4 & Opcodes.I2S) == 146) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            Animatable animatable2 = (Animatable) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Boolean valueOf3 = Boolean.valueOf(z3);
            Integer valueOf22 = Integer.valueOf(i7);
            startRestartGroup.startReplaceGroup(-1746271574);
            changedInstance = ((i4 & 112) == 32) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(animatable2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new TeamsRowKt$ScoreBoxGold$1$1(z3, i7, animatable2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf3, valueOf22, (Function2) rememberedValue2, startRestartGroup, (i4 >> 3) & 126);
            Modifier m1024backgroundbw27NRU2 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(ScaleKt.scale(Modifier.INSTANCE, ((Number) animatable2.getValue()).floatValue()), Dp.m7774constructorimpl(32)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU2);
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
            boolean z42 = z3;
            i8 = i7;
            TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i4 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z2 = z42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        Animatable animatable22 = (Animatable) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Boolean valueOf32 = Boolean.valueOf(z3);
        Integer valueOf222 = Integer.valueOf(i7);
        startRestartGroup.startReplaceGroup(-1746271574);
        changedInstance = ((i4 & 112) == 32) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(animatable22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new TeamsRowKt$ScoreBoxGold$1$1(z3, i7, animatable22, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32, valueOf222, (Function2) rememberedValue2, startRestartGroup, (i4 >> 3) & 126);
        Modifier m1024backgroundbw27NRU22 = BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(ScaleKt.scale(Modifier.INSTANCE, ((Number) animatable22.getValue()).floatValue()), Dp.m7774constructorimpl(32)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4)));
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU22);
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
        boolean z422 = z3;
        i8 = i7;
        TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, i4 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void DividerDotGold(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1651469013);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651469013, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.DividerDotGold (TeamsRow.kt:419)");
            }
            float f = 4;
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), Dp.m7774constructorimpl(2)), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DividerDotGold$lambda$20;
                    DividerDotGold$lambda$20 = TeamsRowKt.DividerDotGold$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DividerDotGold$lambda$20;
                }
            });
        }
    }

    private static final void DividerDot(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1074462635);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1074462635, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.DividerDot (TeamsRow.kt:433)");
            }
            float f = 4;
            BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), Dp.m7774constructorimpl(2)), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f))), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DividerDot$lambda$21;
                    DividerDot$lambda$21 = TeamsRowKt.DividerDot$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DividerDot$lambda$21;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* renamed from: MatchTimeText-pS8O2Ho, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13613MatchTimeTextpS8O2Ho(final String str, long j, float f, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        float f2;
        long sp;
        String normalizeMatchTime;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(884237394);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    sp = i5 != 0 ? TextUnitKt.getSp(12) : j2;
                    float m7774constructorimpl = i4 != 0 ? Dp.m7774constructorimpl(4) : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(884237394, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.MatchTimeText (TeamsRow.kt:450)");
                    }
                    normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(str);
                    if (normalizeMatchTime.length() > 0) {
                        TextKt.m2642Text4IGK_g(normalizeMatchTime, PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, m7774constructorimpl, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), sp, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, 65532);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = m7774constructorimpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    sp = j2;
                    f3 = f2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final long j3 = sp;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MatchTimeText_pS8O2Ho$lambda$22;
                            MatchTimeText_pS8O2Ho$lambda$22 = TeamsRowKt.MatchTimeText_pS8O2Ho$lambda$22(str, j3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return MatchTimeText_pS8O2Ho$lambda$22;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((i3 & Opcodes.I2S) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(str);
            if (normalizeMatchTime.length() > 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            f3 = m7774constructorimpl;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(str);
        if (normalizeMatchTime.length() > 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        f3 = m7774constructorimpl;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* renamed from: MatchDateText-KmRG4DE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13612MatchDateTextKmRG4DE(final String str, long j, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        String normalizeMatchTime;
        Composer composer2;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1017833247);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                long sp = i4 == 0 ? TextUnitKt.getSp(12) : j2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1017833247, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.MatchDateText (TeamsRow.kt:470)");
                }
                normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(str);
                if (normalizeMatchTime.length() <= 0) {
                    composer2 = startRestartGroup;
                    TextKt.m2642Text4IGK_g(normalizeMatchTime, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), sp, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
                } else {
                    composer2 = startRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = sp;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                j3 = j2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MatchDateText_KmRG4DE$lambda$23;
                        MatchDateText_KmRG4DE$lambda$23 = TeamsRowKt.MatchDateText_KmRG4DE$lambda$23(str, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MatchDateText_KmRG4DE$lambda$23;
                    }
                });
                return;
            }
            return;
        }
        j2 = j;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(str);
        if (normalizeMatchTime.length() <= 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = sp;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PreviewTeamsRow(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1128478411);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1128478411, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.PreviewTeamsRow (TeamsRow.kt:489)");
            }
            m13615TeamsRowUiefj4(null, "kjgkjkjkjhkljhkljhljklkmhkgg", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 0, null, null, 0.0f, 0.0f, false, startRestartGroup, 48, 0, 0, 8388605);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewTeamsRow$lambda$24;
                    PreviewTeamsRow$lambda$24 = TeamsRowKt.PreviewTeamsRow$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewTeamsRow$lambda$24;
                }
            });
        }
    }
}
