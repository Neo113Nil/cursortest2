package org.betup.ui.tour.compose;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
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
import androidx.profileinstaller.ProfileVerifier;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.common.compose.VideoBackgroundKt;
import org.betup.ui.fragment.bets.sheet.compose.items.BetInfoRowKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: TourDemoMatchSimulationScreen.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001aW\u0010\u0011\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"&\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"&\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\bX\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002"}, d2 = {"SIMULATION_DURATION_MS", "", "SCORE_UPDATE_INTERVAL_MS", "POST_MATCH_DELAY_MS", "WIN_1_VARIANTS", "", "Lkotlin/Pair;", "", "", "WIN_2_VARIANTS", "DRAW_VARIANTS", "goalEventsForBet", "selectedBet", "", "progressToMinute", "progress", "", "TourDemoMatchSimulationScreen", "", "oddType", "Lorg/betup/model/local/entity/OddType;", "demoStakeBetcoins", "coefficientWin1", "", "coefficientDraw", "coefficientWin2", "onSimulationComplete", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lorg/betup/model/local/entity/OddType;JDDDLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "score1", "score2", "isMatchEnded", "confettiComposition", "Lcom/airbnb/lottie/LottieComposition;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourDemoMatchSimulationScreenKt {
    private static final long POST_MATCH_DELAY_MS = 3000;
    private static final long SCORE_UPDATE_INTERVAL_MS = 200;
    private static final long SIMULATION_DURATION_MS = 20000;
    private static final List<List<Pair<Integer, Boolean>>> WIN_1_VARIANTS = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.listOf((Object[]) new Pair[]{new Pair(18, true), new Pair(41, true), new Pair(83, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(12, true), new Pair(67, true), new Pair(82, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(8, true), new Pair(34, true), new Pair(78, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(23, true), new Pair(71, true)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(5, true), new Pair(29, true), new Pair(56, false), new Pair(89, true)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(44, true), new Pair(63, true), new Pair(79, false), new Pair(90, true)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(16, true), new Pair(51, true), new Pair(73, false), new Pair(85, false), new Pair(88, true)})});
    private static final List<List<Pair<Integer, Boolean>>> WIN_2_VARIANTS = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.listOf((Object[]) new Pair[]{new Pair(26, false), new Pair(52, true), new Pair(74, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(19, false), new Pair(63, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(33, false), new Pair(58, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(11, false), new Pair(33, true), new Pair(58, false), new Pair(72, true), new Pair(86, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(7, false), new Pair(38, true), new Pair(61, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(42, false), new Pair(55, true), new Pair(77, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(14, false), new Pair(31, false), new Pair(68, true), new Pair(90, false)})});
    private static final List<List<Pair<Integer, Boolean>>> DRAW_VARIANTS = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.listOf((Object[]) new Pair[]{new Pair(22, true), new Pair(38, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(33, true), new Pair(71, false)}), CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(22, true), new Pair(38, false), new Pair(64, false), new Pair(87, true)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(15, true), new Pair(31, false), new Pair(52, true), new Pair(88, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(9, false), new Pair(27, true), new Pair(59, false), new Pair(76, true)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(18, true), new Pair(41, false), new Pair(67, true), new Pair(84, false)}), CollectionsKt.listOf((Object[]) new Pair[]{new Pair(12, true), new Pair(36, false), new Pair(54, true), new Pair(82, false)})});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourDemoMatchSimulationScreen$lambda$14(String str, OddType oddType, long j, double d, double d2, double d3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourDemoMatchSimulationScreen(str, oddType, j, d, d2, d3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final List<Pair<Integer, Boolean>> goalEventsForBet(String str) {
        List<List<Pair<Integer, Boolean>>> listOf;
        if (str != null) {
            switch (str.hashCode()) {
                case 3091780:
                    if (str.equals("draw")) {
                        listOf = DRAW_VARIANTS;
                        break;
                    }
                    break;
                case 113135758:
                    if (str.equals("win_1")) {
                        listOf = WIN_1_VARIANTS;
                        break;
                    }
                    break;
                case 113135759:
                    if (str.equals("win_2")) {
                        listOf = WIN_2_VARIANTS;
                        break;
                    }
                    break;
            }
            return (List) CollectionsKt.random(listOf, Random.INSTANCE);
        }
        listOf = CollectionsKt.listOf(CollectionsKt.listOf((Object[]) new Pair[]{new Pair(33, true), new Pair(71, false)}));
        return (List) CollectionsKt.random(listOf, Random.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressToMinute(float f) {
        if (f < 0.45f) {
            return RangesKt.coerceIn((int) ((f / 0.45f) * 45.0f), 0, 45);
        }
        if (f < 0.5f) {
            return 45;
        }
        return RangesKt.coerceIn((int) (45 + (((f - 0.5f) / 0.5f) * 45.0f)), 45, 90);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourDemoMatchSimulationScreen(final String str, final OddType oddType, final long j, final double d, final double d2, final double d3, final Function0<Unit> onSimulationComplete, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        double d4;
        int i4;
        Modifier modifier2;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        MutableState mutableState;
        Object rememberedValue4;
        boolean z;
        Object rememberedValue5;
        float floatValue;
        double d5;
        Pair pair;
        Unit unit;
        boolean changedInstance;
        TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1 rememberedValue6;
        Animatable animatable;
        Context context;
        Modifier modifier3;
        Composer composer2;
        Unit unit2;
        float f;
        int i5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer3;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(onSimulationComplete, "onSimulationComplete");
        Composer startRestartGroup = composer.startRestartGroup(-1861885912);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(oddType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(d) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            d4 = d2;
            i3 |= startRestartGroup.changed(d4) ? 16384 : 8192;
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changed(d3) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(onSimulationComplete) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    modifier2 = modifier5;
                } else {
                    modifier2 = modifier5;
                    ComposerKt.traceEventStart(-1861885912, i3, -1, "org.betup.ui.tour.compose.TourDemoMatchSimulationScreen (TourDemoMatchSimulationScreen.kt:134)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context2 = (Context) consume;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                Animatable animatable2 = (Animatable) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.confety)), null, null, null, null, null, startRestartGroup, 6, 62);
                startRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = goalEventsForBet(str);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                List list = (List) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                floatValue = ((Number) animatable2.getValue()).floatValue();
                final long coerceAtLeast = RangesKt.coerceAtLeast(j, 0L);
                if (str != null) {
                    switch (str.hashCode()) {
                        case 3091780:
                            if (str.equals("draw")) {
                                d5 = d4;
                                break;
                            }
                            break;
                        case 113135758:
                            str.equals("win_1");
                            break;
                        case 113135759:
                            if (str.equals("win_2")) {
                                d5 = d3;
                                break;
                            }
                            break;
                    }
                    if (floatValue < 0.45f) {
                        pair = TuplesKt.to(RangesKt.coerceIn((int) ((floatValue / 0.45f) * 45.0f), 0, 45) + "'", context2.getString(R.string.tour_demo_first_half));
                    } else if (floatValue < 0.5f) {
                        pair = TuplesKt.to("45'", context2.getString(R.string.tour_demo_half_time));
                    } else {
                        pair = TuplesKt.to(RangesKt.coerceIn((int) (45 + (((floatValue - 0.5f) / 0.5f) * 45.0f)), 45, 90) + "'", context2.getString(R.string.tour_demo_second_half));
                    }
                    final String str2 = (String) pair.component1();
                    final String str3 = (String) pair.component2();
                    unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance = startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(list) | ((i3 & 3670016) == 1048576);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        animatable = animatable2;
                        context = context2;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        unit2 = unit;
                        f = 0.0f;
                        i5 = 1;
                        rememberedValue6 = new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1(list, onSimulationComplete, animatable, mutableIntState, mutableIntState2, mutableState, null);
                        composer2.updateRememberedValue(rememberedValue6);
                    } else {
                        modifier3 = modifier2;
                        animatable = animatable2;
                        context = context2;
                        composer2 = startRestartGroup;
                        unit2 = unit;
                        f = 0.0f;
                        i5 = 1;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, composer2, 6);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, f, i5, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                    m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-916275492);
                    if (TourDemoMatchSimulationScreen$lambda$7(mutableState)) {
                        LottieAnimationKt.LottieAnimation(TourDemoMatchSimulationScreen$lambda$10(rememberLottieComposition), boxScopeInstance.align(OffsetKt.m1476offsetVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f, i5, null), f, Dp.m7774constructorimpl(-250), i5, null), Alignment.INSTANCE.getCenter()), false, false, null, 0.0f, 2, false, false, false, null, false, false, null, null, null, false, null, null, composer2, 1572864, 0, 524220);
                    }
                    composer2.endReplaceGroup();
                    final String str4 = "https://betup.org/uploads_api/league/53.png";
                    final String str5 = "https://betup.org/uploads_api/league/31.png";
                    final double d6 = d5;
                    Composer composer4 = composer2;
                    final Context context3 = context;
                    Modifier modifier6 = modifier3;
                    composer3 = composer4;
                    final Animatable animatable3 = animatable;
                    TicketDarkKt.TicketDark(boxScopeInstance.align(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getCenter()), ComposableSingletons$TourDemoMatchSimulationScreenKt.INSTANCE.m14343getLambda$375947342$app_release(), ComposableLambdaKt.rememberComposableLambda(525120593, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                         */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x045b  */
                        /* JADX WARN: Removed duplicated region for block: B:46:0x0467  */
                        /* JADX WARN: Removed duplicated region for block: B:53:0x0598  */
                        /* JADX WARN: Removed duplicated region for block: B:56:0x05a4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x06e4  */
                        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:67:0x05a8  */
                        /* JADX WARN: Removed duplicated region for block: B:69:0x046b  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer5, int i6) {
                            int TourDemoMatchSimulationScreen$lambda$1;
                            int TourDemoMatchSimulationScreen$lambda$4;
                            String stringResource;
                            int currentCompositeKeyHash2;
                            Composer m4610constructorimpl2;
                            int currentCompositeKeyHash3;
                            Composer m4610constructorimpl3;
                            if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(525120593, i6, -1, "org.betup.ui.tour.compose.TourDemoMatchSimulationScreen.<anonymous>.<anonymous> (TourDemoMatchSimulationScreen.kt:214)");
                            }
                            float f2 = 16;
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(14));
                            String str6 = str;
                            double d7 = d6;
                            OddType oddType2 = oddType;
                            String str7 = str4;
                            String str8 = str5;
                            String str9 = str3;
                            String str10 = str2;
                            Context context4 = context3;
                            MutableIntState mutableIntState3 = mutableIntState;
                            MutableIntState mutableIntState4 = mutableIntState2;
                            Animatable<Float, AnimationVector1D> animatable4 = animatable3;
                            long j2 = coerceAtLeast;
                            ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer5, m1517paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor2);
                            } else {
                                composer5.useNode();
                            }
                            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer5);
                            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            float f3 = 1;
                            float f4 = 4;
                            Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(ClipKt.clipToBounds(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(Opcodes.F2L))), Dp.m7774constructorimpl(f3), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
                            ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, m1038borderziNgDLE);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor3);
                            } else {
                                composer5.useNode();
                            }
                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer5);
                            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composer5.startReplaceGroup(1849434622);
                            Object rememberedValue7 = composer5.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = Uri.parse("android.resource://" + context4.getPackageName() + "/2131886104");
                                composer5.updateRememberedValue(rememberedValue7);
                            }
                            composer5.endReplaceGroup();
                            VideoBackgroundKt.VideoBackground((Uri) rememberedValue7, UiExtensionsKt.getBackgroundImageResource(22), ContentScale.INSTANCE.getCrop(), PaddingKt.m1516padding3ABfNKs(boxScopeInstance2.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f3)), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance2.matchParentSize(Modifier.INSTANCE), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer5, 0);
                            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(6), Dp.m7774constructorimpl(12));
                            String stringResource2 = StringResources_androidKt.stringResource(R.string.tour_demo_team_germany, composer5, 6);
                            String stringResource3 = StringResources_androidKt.stringResource(R.string.tour_demo_team_brazil, composer5, 6);
                            TourDemoMatchSimulationScreen$lambda$1 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$1(mutableIntState3);
                            String valueOf = String.valueOf(TourDemoMatchSimulationScreen$lambda$1);
                            TourDemoMatchSimulationScreen$lambda$4 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$4(mutableIntState4);
                            TeamsRowKt.m13615TeamsRowUiefj4(m1517paddingVpY3zN42, stringResource2, stringResource3, str7, str8, valueOf, String.valueOf(TourDemoMatchSimulationScreen$lambda$4), null, str9, str10, null, false, true, false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer5, 27648, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8383616);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            BoxWithConstraintsKt.BoxWithConstraints(OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(28)), 0.0f, Dp.m7774constructorimpl(-11), 1, null), Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(164449541, true, new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2(animatable4), composer5, 54), composer5, 3126, 4);
                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f4), 7, null);
                            String stringResource4 = StringResources_androidKt.stringResource(R.string.tour_demo_regular_time, composer5, 6);
                            if (str6 != null) {
                                switch (str6.hashCode()) {
                                    case 3091780:
                                        if (str6.equals("draw")) {
                                            composer5.startReplaceGroup(1237072024);
                                            stringResource = StringResources_androidKt.stringResource(R.string.draw, composer5, 6);
                                            composer5.endReplaceGroup();
                                            break;
                                        }
                                        break;
                                    case 113135758:
                                        if (str6.equals("win_1")) {
                                            composer5.startReplaceGroup(1237069945);
                                            stringResource = StringResources_androidKt.stringResource(R.string.win_1, composer5, 6);
                                            composer5.endReplaceGroup();
                                            break;
                                        }
                                        break;
                                    case 113135759:
                                        if (str6.equals("win_2")) {
                                            composer5.startReplaceGroup(1237074105);
                                            stringResource = StringResources_androidKt.stringResource(R.string.win_2, composer5, 6);
                                            composer5.endReplaceGroup();
                                            break;
                                        }
                                        break;
                                }
                                BetInfoRowKt.m13598BetInfoRowTVReaoo(m1520paddingqDBjuR0$default, stringResource4, stringResource, d7, oddType2, 0L, true, null, null, false, false, 0L, composer5, 1572870, 0, 4000);
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer5, 54);
                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer5.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.useNode();
                                } else {
                                    composer5.createNode(constructor4);
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(composer5);
                                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash4);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet_amount_ranking, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer5, 48);
                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer5, companion);
                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer5.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.useNode();
                                } else {
                                    composer5.createNode(constructor5);
                                }
                                m4610constructorimpl3 = Updater.m4610constructorimpl(composer5);
                                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash5);
                                }
                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                String dialogBetcoinsFormated = FormatHelper.getDialogBetcoinsFormated(j2);
                                Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated, "getDialogBetcoinsFormated(...)");
                                TextKt.m2642Text4IGK_g(dialogBetcoinsFormated, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer5, 6);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer5, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer5, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            composer5.startReplaceGroup(1237076121);
                            stringResource = StringResources_androidKt.stringResource(R.string.win_1, composer5, 6);
                            composer5.endReplaceGroup();
                            BetInfoRowKt.m13598BetInfoRowTVReaoo(m1520paddingqDBjuR0$default, stringResource4, stringResource, d7, oddType2, 0L, true, null, null, false, false, 0L, composer5, 1572870, 0, 4000);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer5, 54);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(composer5);
                            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash42);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet_amount_ranking, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer5, 48);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap52 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer5, companion2);
                            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(composer5);
                            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting()) {
                            }
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash52);
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            String dialogBetcoinsFormated2 = FormatHelper.getDialogBetcoinsFormated(j2);
                            Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated2, "getDialogBetcoinsFormated(...)");
                            TextKt.m2642Text4IGK_g(dialogBetcoinsFormated2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer5, 6);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer5, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer5, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }, composer3, 54), ComposableSingletons$TourDemoMatchSimulationScreenKt.INSTANCE.getLambda$1426188528$app_release(), false, true, null, false, composer3, 224688, 192);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                }
                d5 = d;
                if (floatValue < 0.45f) {
                }
                final String str22 = (String) pair.component1();
                final String str32 = (String) pair.component2();
                unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(list) | ((i3 & 3670016) == 1048576);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                animatable = animatable2;
                context = context2;
                modifier3 = modifier2;
                composer2 = startRestartGroup;
                unit2 = unit;
                f = 0.0f;
                i5 = 1;
                rememberedValue6 = new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1(list, onSimulationComplete, animatable, mutableIntState, mutableIntState2, mutableState, null);
                composer2.updateRememberedValue(rememberedValue6);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, composer2, 6);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, f, i5, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-916275492);
                if (TourDemoMatchSimulationScreen$lambda$7(mutableState)) {
                }
                composer2.endReplaceGroup();
                final String str42 = "https://betup.org/uploads_api/league/53.png";
                final String str52 = "https://betup.org/uploads_api/league/31.png";
                final double d62 = d5;
                Composer composer42 = composer2;
                final Context context32 = context;
                Modifier modifier62 = modifier3;
                composer3 = composer42;
                final Animatable<Float, AnimationVector1D> animatable32 = animatable;
                TicketDarkKt.TicketDark(boxScopeInstance2.align(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getCenter()), ComposableSingletons$TourDemoMatchSimulationScreenKt.INSTANCE.m14343getLambda$375947342$app_release(), ComposableLambdaKt.rememberComposableLambda(525120593, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                     */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x045b  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0467  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0598  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x05a4  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x06e4  */
                    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x05a8  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x046b  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer5, int i6) {
                        int TourDemoMatchSimulationScreen$lambda$1;
                        int TourDemoMatchSimulationScreen$lambda$4;
                        String stringResource;
                        int currentCompositeKeyHash2;
                        Composer m4610constructorimpl2;
                        int currentCompositeKeyHash3;
                        Composer m4610constructorimpl3;
                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(525120593, i6, -1, "org.betup.ui.tour.compose.TourDemoMatchSimulationScreen.<anonymous>.<anonymous> (TourDemoMatchSimulationScreen.kt:214)");
                        }
                        float f2 = 16;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(14));
                        String str6 = str;
                        double d7 = d62;
                        OddType oddType2 = oddType;
                        String str7 = str42;
                        String str8 = str52;
                        String str9 = str32;
                        String str10 = str22;
                        Context context4 = context32;
                        MutableIntState mutableIntState3 = mutableIntState;
                        MutableIntState mutableIntState4 = mutableIntState2;
                        Animatable<Float, AnimationVector1D> animatable4 = animatable32;
                        long j2 = coerceAtLeast;
                        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer5, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor22);
                        } else {
                            composer5.useNode();
                        }
                        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer5);
                        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash22);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        float f3 = 1;
                        float f4 = 4;
                        Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(ClipKt.clipToBounds(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(Opcodes.F2L))), Dp.m7774constructorimpl(f3), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
                        ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, m1038borderziNgDLE);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor3);
                        } else {
                            composer5.useNode();
                        }
                        Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer5);
                        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        composer5.startReplaceGroup(1849434622);
                        Object rememberedValue7 = composer5.rememberedValue();
                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = Uri.parse("android.resource://" + context4.getPackageName() + "/2131886104");
                            composer5.updateRememberedValue(rememberedValue7);
                        }
                        composer5.endReplaceGroup();
                        VideoBackgroundKt.VideoBackground((Uri) rememberedValue7, UiExtensionsKt.getBackgroundImageResource(22), ContentScale.INSTANCE.getCrop(), PaddingKt.m1516padding3ABfNKs(boxScopeInstance22.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f3)), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance22.matchParentSize(Modifier.INSTANCE), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer5, 0);
                        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(6), Dp.m7774constructorimpl(12));
                        String stringResource2 = StringResources_androidKt.stringResource(R.string.tour_demo_team_germany, composer5, 6);
                        String stringResource3 = StringResources_androidKt.stringResource(R.string.tour_demo_team_brazil, composer5, 6);
                        TourDemoMatchSimulationScreen$lambda$1 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$1(mutableIntState3);
                        String valueOf = String.valueOf(TourDemoMatchSimulationScreen$lambda$1);
                        TourDemoMatchSimulationScreen$lambda$4 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$4(mutableIntState4);
                        TeamsRowKt.m13615TeamsRowUiefj4(m1517paddingVpY3zN42, stringResource2, stringResource3, str7, str8, valueOf, String.valueOf(TourDemoMatchSimulationScreen$lambda$4), null, str9, str10, null, false, true, false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer5, 27648, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8383616);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        BoxWithConstraintsKt.BoxWithConstraints(OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(28)), 0.0f, Dp.m7774constructorimpl(-11), 1, null), Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(164449541, true, new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2(animatable4), composer5, 54), composer5, 3126, 4);
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f4), 7, null);
                        String stringResource4 = StringResources_androidKt.stringResource(R.string.tour_demo_regular_time, composer5, 6);
                        if (str6 != null) {
                            switch (str6.hashCode()) {
                                case 3091780:
                                    if (str6.equals("draw")) {
                                        composer5.startReplaceGroup(1237072024);
                                        stringResource = StringResources_androidKt.stringResource(R.string.draw, composer5, 6);
                                        composer5.endReplaceGroup();
                                        break;
                                    }
                                    break;
                                case 113135758:
                                    if (str6.equals("win_1")) {
                                        composer5.startReplaceGroup(1237069945);
                                        stringResource = StringResources_androidKt.stringResource(R.string.win_1, composer5, 6);
                                        composer5.endReplaceGroup();
                                        break;
                                    }
                                    break;
                                case 113135759:
                                    if (str6.equals("win_2")) {
                                        composer5.startReplaceGroup(1237074105);
                                        stringResource = StringResources_androidKt.stringResource(R.string.win_2, composer5, 6);
                                        composer5.endReplaceGroup();
                                        break;
                                    }
                                    break;
                            }
                            BetInfoRowKt.m13598BetInfoRowTVReaoo(m1520paddingqDBjuR0$default, stringResource4, stringResource, d7, oddType2, 0L, true, null, null, false, false, 0L, composer5, 1572870, 0, 4000);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer5, 54);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.useNode();
                            } else {
                                composer5.createNode(constructor42);
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(composer5);
                            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash42);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet_amount_ranking, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, composer5, 48);
                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap52 = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer5, companion2);
                            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer5.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.useNode();
                            } else {
                                composer5.createNode(constructor52);
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(composer5);
                            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash52);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            String dialogBetcoinsFormated2 = FormatHelper.getDialogBetcoinsFormated(j2);
                            Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated2, "getDialogBetcoinsFormated(...)");
                            TextKt.m2642Text4IGK_g(dialogBetcoinsFormated2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer5, 6);
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer5, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer5, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        composer5.startReplaceGroup(1237076121);
                        stringResource = StringResources_androidKt.stringResource(R.string.win_1, composer5, 6);
                        composer5.endReplaceGroup();
                        BetInfoRowKt.m13598BetInfoRowTVReaoo(m1520paddingqDBjuR0$default, stringResource4, stringResource, d7, oddType2, 0L, true, null, null, false, false, 0L, composer5, 1572870, 0, 4000);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically32, composer5, 54);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap422 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default22);
                        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(composer5);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash422);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet_amount_ranking, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, composer5, 48);
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap522 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(composer5, companion22);
                        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer5.getApplier() instanceof Applier)) {
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(composer5);
                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting()) {
                        }
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash522);
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                        String dialogBetcoinsFormated22 = FormatHelper.getDialogBetcoinsFormated(j2);
                        Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated22, "getDialogBetcoinsFormated(...)");
                        TextKt.m2642Text4IGK_g(dialogBetcoinsFormated22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer5, 6);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer5, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer5, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }, composer3, 54), ComposableSingletons$TourDemoMatchSimulationScreenKt.INSTANCE.getLambda$1426188528$app_release(), false, true, null, false, composer3, 224688, 192);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier62;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier;
                composer3 = startRestartGroup;
            }
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TourDemoMatchSimulationScreen$lambda$14;
                        TourDemoMatchSimulationScreen$lambda$14 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$14(str, oddType, j, d, d2, d3, onSimulationComplete, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TourDemoMatchSimulationScreen$lambda$14;
                    }
                });
                return;
            }
            return;
        }
        d4 = d2;
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context22 = (Context) consume2;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableIntState mutableIntState3 = (MutableIntState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableIntState mutableIntState22 = (MutableIntState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        Animatable animatable22 = (Animatable) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        LottieCompositionResult rememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.confety)), null, null, null, null, null, startRestartGroup, 6, 62);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 14) != 4) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue5 = goalEventsForBet(str);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        List list2 = (List) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        floatValue = ((Number) animatable22.getValue()).floatValue();
        final long coerceAtLeast2 = RangesKt.coerceAtLeast(j, 0L);
        if (str != null) {
        }
        d5 = d;
        if (floatValue < 0.45f) {
        }
        final String str222 = (String) pair.component1();
        final String str322 = (String) pair.component2();
        unit = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = startRestartGroup.changedInstance(animatable22) | startRestartGroup.changedInstance(list2) | ((i3 & 3670016) == 1048576);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        animatable = animatable22;
        context = context22;
        modifier3 = modifier2;
        composer2 = startRestartGroup;
        unit2 = unit;
        f = 0.0f;
        i5 = 1;
        rememberedValue6 = new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$1$1(list2, onSimulationComplete, animatable, mutableIntState3, mutableIntState22, mutableState, null);
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, composer2, 6);
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, f, i5, null);
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        composer2.startReplaceGroup(-916275492);
        if (TourDemoMatchSimulationScreen$lambda$7(mutableState)) {
        }
        composer2.endReplaceGroup();
        final String str422 = "https://betup.org/uploads_api/league/53.png";
        final String str522 = "https://betup.org/uploads_api/league/31.png";
        final double d622 = d5;
        Composer composer422 = composer2;
        final Context context322 = context;
        Modifier modifier622 = modifier3;
        composer3 = composer422;
        final Animatable<Float, AnimationVector1D> animatable322 = animatable;
        TicketDarkKt.TicketDark(boxScopeInstance22.align(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), Alignment.INSTANCE.getCenter()), ComposableSingletons$TourDemoMatchSimulationScreenKt.INSTANCE.m14343getLambda$375947342$app_release(), ComposableLambdaKt.rememberComposableLambda(525120593, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                invoke(composer5, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            /* JADX WARN: Removed duplicated region for block: B:43:0x045b  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0467  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0598  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x05a4  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x06e4  */
            /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x05a8  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x046b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(Composer composer5, int i6) {
                int TourDemoMatchSimulationScreen$lambda$1;
                int TourDemoMatchSimulationScreen$lambda$4;
                String stringResource;
                int currentCompositeKeyHash2;
                Composer m4610constructorimpl2;
                int currentCompositeKeyHash3;
                Composer m4610constructorimpl3;
                if ((i6 & 3) == 2 && composer5.getSkipping()) {
                    composer5.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(525120593, i6, -1, "org.betup.ui.tour.compose.TourDemoMatchSimulationScreen.<anonymous>.<anonymous> (TourDemoMatchSimulationScreen.kt:214)");
                }
                float f2 = 16;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(14));
                String str6 = str;
                double d7 = d622;
                OddType oddType2 = oddType;
                String str7 = str422;
                String str8 = str522;
                String str9 = str322;
                String str10 = str222;
                Context context4 = context322;
                MutableIntState mutableIntState32 = mutableIntState3;
                MutableIntState mutableIntState4 = mutableIntState22;
                Animatable<Float, AnimationVector1D> animatable4 = animatable322;
                long j2 = coerceAtLeast2;
                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap222 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer5, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor222);
                } else {
                    composer5.useNode();
                }
                Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash222);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f3 = 1;
                float f4 = 4;
                Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(ClipKt.clipToBounds(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(Opcodes.F2L))), Dp.m7774constructorimpl(f3), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
                ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, m1038borderziNgDLE);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor3);
                } else {
                    composer5.useNode();
                }
                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                composer5.startReplaceGroup(1849434622);
                Object rememberedValue7 = composer5.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = Uri.parse("android.resource://" + context4.getPackageName() + "/2131886104");
                    composer5.updateRememberedValue(rememberedValue7);
                }
                composer5.endReplaceGroup();
                VideoBackgroundKt.VideoBackground((Uri) rememberedValue7, UiExtensionsKt.getBackgroundImageResource(22), ContentScale.INSTANCE.getCrop(), PaddingKt.m1516padding3ABfNKs(boxScopeInstance222.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f3)), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(boxScopeInstance222.matchParentSize(Modifier.INSTANCE), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer5, 0);
                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(6), Dp.m7774constructorimpl(12));
                String stringResource2 = StringResources_androidKt.stringResource(R.string.tour_demo_team_germany, composer5, 6);
                String stringResource3 = StringResources_androidKt.stringResource(R.string.tour_demo_team_brazil, composer5, 6);
                TourDemoMatchSimulationScreen$lambda$1 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$1(mutableIntState32);
                String valueOf = String.valueOf(TourDemoMatchSimulationScreen$lambda$1);
                TourDemoMatchSimulationScreen$lambda$4 = TourDemoMatchSimulationScreenKt.TourDemoMatchSimulationScreen$lambda$4(mutableIntState4);
                TeamsRowKt.m13615TeamsRowUiefj4(m1517paddingVpY3zN42, stringResource2, stringResource3, str7, str8, valueOf, String.valueOf(TourDemoMatchSimulationScreen$lambda$4), null, str9, str10, null, false, true, false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer5, 27648, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8383616);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                BoxWithConstraintsKt.BoxWithConstraints(OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(28)), 0.0f, Dp.m7774constructorimpl(-11), 1, null), Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(164449541, true, new TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2(animatable4), composer5, 54), composer5, 3126, 4);
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f4), 7, null);
                String stringResource4 = StringResources_androidKt.stringResource(R.string.tour_demo_regular_time, composer5, 6);
                if (str6 != null) {
                    switch (str6.hashCode()) {
                        case 3091780:
                            if (str6.equals("draw")) {
                                composer5.startReplaceGroup(1237072024);
                                stringResource = StringResources_androidKt.stringResource(R.string.draw, composer5, 6);
                                composer5.endReplaceGroup();
                                break;
                            }
                            break;
                        case 113135758:
                            if (str6.equals("win_1")) {
                                composer5.startReplaceGroup(1237069945);
                                stringResource = StringResources_androidKt.stringResource(R.string.win_1, composer5, 6);
                                composer5.endReplaceGroup();
                                break;
                            }
                            break;
                        case 113135759:
                            if (str6.equals("win_2")) {
                                composer5.startReplaceGroup(1237074105);
                                stringResource = StringResources_androidKt.stringResource(R.string.win_2, composer5, 6);
                                composer5.endReplaceGroup();
                                break;
                            }
                            break;
                    }
                    BetInfoRowKt.m13598BetInfoRowTVReaoo(m1520paddingqDBjuR0$default, stringResource4, stringResource, d7, oddType2, 0L, true, null, null, false, false, 0L, composer5, 1572870, 0, 4000);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically32, composer5, 54);
                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default22);
                    Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer5.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.useNode();
                    } else {
                        composer5.createNode(constructor422);
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(composer5);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash422);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet_amount_ranking, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, composer5, 48);
                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap522 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(composer5, companion22);
                    Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer5.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.useNode();
                    } else {
                        composer5.createNode(constructor522);
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(composer5);
                    Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash522);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                    String dialogBetcoinsFormated22 = FormatHelper.getDialogBetcoinsFormated(j2);
                    Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated22, "getDialogBetcoinsFormated(...)");
                    TextKt.m2642Text4IGK_g(dialogBetcoinsFormated22, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer5, 6);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer5, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer5, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer5.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer5.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer5.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
                composer5.startReplaceGroup(1237076121);
                stringResource = StringResources_androidKt.stringResource(R.string.win_1, composer5, 6);
                composer5.endReplaceGroup();
                BetInfoRowKt.m13598BetInfoRowTVReaoo(m1520paddingqDBjuR0$default, stringResource4, stringResource, d7, oddType2, 0L, true, null, null, false, false, 0L, composer5, 1572870, 0, 4000);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer5, 6);
                Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(spaceBetween222, centerVertically322, composer5, 54);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default222);
                Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash4222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.bet_amount_ranking, composer5, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion222 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, composer5, 48);
                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap5222 = composer5.getCurrentCompositionLocalMap();
                Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(composer5, companion222);
                Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer5.getApplier() instanceof Applier)) {
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer5);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash5222);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                String dialogBetcoinsFormated222 = FormatHelper.getDialogBetcoinsFormated(j2);
                Intrinsics.checkNotNullExpressionValue(dialogBetcoinsFormated222, "getDialogBetcoinsFormated(...)");
                TextKt.m2642Text4IGK_g(dialogBetcoinsFormated222, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer5, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer5, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer5, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer5, 6), StringResources_androidKt.stringResource(R.string.cd_betcoin, composer5, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }, composer3, 54), ComposableSingletons$TourDemoMatchSimulationScreenKt.INSTANCE.getLambda$1426188528$app_release(), false, true, null, false, composer3, 224688, 192);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier622;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TourDemoMatchSimulationScreen$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TourDemoMatchSimulationScreen$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final boolean TourDemoMatchSimulationScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TourDemoMatchSimulationScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final LottieComposition TourDemoMatchSimulationScreen$lambda$10(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}
