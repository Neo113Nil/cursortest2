package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.sentry.cache.EnvelopeCache;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.games.flashbet.model.FlashBetGameEventDto;
import org.betup.games.flashbet.model.FlashBetGameMatchDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameMatchTeamDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameQuestionDto;
import org.betup.games.flashbet.model.FlashBetGameScoreUpdateDto;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.games.flashbet.model.FlashBetGameUserAnswerDto;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.HapticFeedbackEffectKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.fragment.flashbet.FlashBetEventFormattingKt;
import org.betup.ui.fragment.flashbet.FlashBetEventKind;
import org.betup.ui.fragment.flashbet.FlashBetEventKindKt;
import org.betup.ui.fragment.flashbet.FlashBetGameAudio;
import org.betup.ui.fragment.flashbet.FlashBetMatchCrowdSoundEffect;
import org.betup.ui.fragment.flashbet.FlashBetMatchMomentumKt;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\u0002\u001ao\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a-\u0010\u001b\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#\u001aq\u0010$\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020 2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010/\u001a\u000200H\u0003¢\u0006\u0002\u00101¨\u00062²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020&X\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0004\u0018\u000106X\u008a\u0084\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0004\u0018\u000109X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020 X\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u0004\u0018\u00010-X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020&X\u008a\u008e\u0002²\u0006\f\u0010E\u001a\u0004\u0018\u000106X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020&X\u008a\u008e\u0002"}, d2 = {"flashBetDeferToNextLayoutFrame", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FlashBetGameContent", "sessionId", "", "categoryName", "categoryLogoUrl", "categoryPhotoUrl", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "controller", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetGameController;", "onBackClick", "Lkotlin/Function0;", "onPlayAgainClick", "onTimeExpired", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/fragment/flashbet/controller/FlashBetGameController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FlashBetGameResultsListContent", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "(Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FlashBetPastQuestionRow", "question", "answerText", "coefficient", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroidx/compose/runtime/Composer;I)V", "FlashBetLiveEventsTicker", "events", "", "Lorg/betup/games/flashbet/model/FlashBetGameEventDto;", "displayedMinute", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FlashBetGameTopCard", "teamsRevealed", "", "timerText", "periodLabel", "scoreAtMinute", "Lorg/betup/games/flashbet/model/FlashBetGameScoreUpdateDto;", "goalCelebrationKey", "scoringSide", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetGoalSide;", "possessionHomePercent", "possessionMomentum", "", "(Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lorg/betup/games/flashbet/model/FlashBetGameScoreUpdateDto;ILorg/betup/ui/fragment/flashbet/compose/FlashBetGoalSide;Ljava/lang/Integer;FLandroidx/compose/runtime/Composer;II)V", "app_release", "loading", "submitLoading", "selectedAnswerId", "", "error", "activeEventFlash", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlash;", "eventFlashSeq", "matchFinishingElapsedMs", "showReveal", "showSimulation", "lastAnswersCount", "playingElapsedMs", "previousHomeScore", "previousAwayScore", "halfTimeWhistlePlayed", "minute75WhistlePlayed", "fullTimeWhistlePlayed", "lockInAnswerId", "timeExpiredByCountdown", "sessionExpiredNavigatePosted"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetGameContentKt {

    /* compiled from: FlashBetGameContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$119(String str, String str2, String str3, String str4, String str5, FlashBetGameController flashBetGameController, Function0 function0, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        FlashBetGameContent(str, str2, str3, str4, str5, flashBetGameController, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameResultsListContent$lambda$125(FlashBetGameSessionDto flashBetGameSessionDto, String str, Function0 function0, int i, Composer composer, int i2) {
        FlashBetGameResultsListContent(flashBetGameSessionDto, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameTopCard$lambda$148(FlashBetGameSessionDto flashBetGameSessionDto, String str, boolean z, String str2, String str3, FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto, int i, FlashBetGoalSide flashBetGoalSide, Integer num, float f, int i2, int i3, Composer composer, int i4) {
        FlashBetGameTopCard(flashBetGameSessionDto, str, z, str2, str3, flashBetGameScoreUpdateDto, i, flashBetGoalSide, num, f, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetLiveEventsTicker$lambda$130(List list, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        FlashBetLiveEventsTicker(list, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetLiveEventsTicker$lambda$138(List list, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        FlashBetLiveEventsTicker(list, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetPastQuestionRow$lambda$127(String str, String str2, Double d, int i, Composer composer, int i2) {
        FlashBetPastQuestionRow(str, str2, d, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object flashBetDeferToNextLayoutFrame(Continuation<? super Unit> continuation) {
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit flashBetDeferToNextLayoutFrame$lambda$0;
                flashBetDeferToNextLayoutFrame$lambda$0 = FlashBetGameContentKt.flashBetDeferToNextLayoutFrame$lambda$0(((Long) obj).longValue());
                return flashBetDeferToNextLayoutFrame$lambda$0;
            }
        }, continuation);
        return withFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withFrameNanos : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit flashBetDeferToNextLayoutFrame$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0571, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x08ad, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0915, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0bf0, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0d50, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0e32, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0f71, code lost:
    
        if (r0 != null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0f95, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0fbf, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x111b, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1189, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x11ec, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x12a3, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1343, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x1399, code lost:
    
        if (r8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x1476, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x187f, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02dc, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x1e0e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x1e1b  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037c  */
    /* JADX WARN: Type inference failed for: r0v217, types: [org.betup.ui.views.ComposeUtils] */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r1v163, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v232 */
    /* JADX WARN: Type inference failed for: r29v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r57v0 */
    /* JADX WARN: Type inference failed for: r57v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r57v4 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.runtime.Composer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetGameContent(final String sessionId, final String categoryName, final String categoryLogoUrl, final String categoryPhotoUrl, final String sportId, final FlashBetGameController controller, final Function0<Unit> onBackClick, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function0<Unit> function03;
        int i6;
        Function0<Unit> function04;
        State collectAsState;
        State collectAsState2;
        boolean changed;
        Object mutableStateOf$default;
        MutableState mutableState;
        boolean changed2;
        int i7;
        Object mutableIntStateOf;
        boolean changed3;
        FlashBetGameContentKt$FlashBetGameContent$1$1 rememberedValue;
        boolean changed4;
        FlashBetGameContentKt$FlashBetGameContent$2$1 rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changedInstance2;
        Object obj;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        boolean changed5;
        Object obj2;
        String str;
        int i8;
        int i9;
        boolean z;
        FlashBetGameSessionDto flashBetGameSessionDto;
        String str2;
        Integer num;
        BoxScopeInstance boxScopeInstance;
        Function0 function05;
        Boolean bool;
        int i10;
        String str3;
        Context context;
        State state;
        ?? r57;
        FlashBetGameSessionDto flashBetGameSessionDto2;
        Function0<Unit> function06;
        int i11;
        Function0 function07;
        int i12;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object mutableStateOf$default2;
        Object obj3;
        Object obj4;
        int i13;
        int i14;
        Object obj5;
        Function0<Unit> function08;
        boolean z2;
        int coerceAtMost;
        String stringResource;
        String str4;
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto;
        Object obj6;
        Object obj7;
        Object obj8;
        Integer num2;
        float f;
        Object obj9;
        Object obj10;
        MutableState mutableState2;
        boolean z3;
        MutableState mutableState3;
        int i15;
        int i16;
        Object obj11;
        Object obj12;
        Object obj13;
        State state2;
        int i17;
        Object obj14;
        Object obj15;
        boolean z4;
        char c;
        Object obj16;
        Object obj17;
        char c2;
        Pair pair;
        Object obj18;
        float f2;
        int i18;
        Composer composer2;
        float f3;
        State state3;
        String stringResource2;
        int i19;
        float f4;
        int i20;
        String str5;
        float f5;
        String str6;
        int i21;
        int i22;
        Composer composer3;
        int i23;
        String str7;
        Object obj19;
        Object obj20;
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto2;
        final Function0<Unit> function09;
        final Function0<Unit> function010;
        String stringResource3;
        Object obj21;
        Object obj22;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        ScopeUpdateScope endRestartGroup;
        int i24;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(categoryLogoUrl, "categoryLogoUrl");
        Intrinsics.checkNotNullParameter(categoryPhotoUrl, "categoryPhotoUrl");
        Intrinsics.checkNotNullParameter(sportId, "sportId");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        ?? startRestartGroup = composer.startRestartGroup(-2006663895);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sessionId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(categoryName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(categoryLogoUrl) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(categoryPhotoUrl) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(sportId) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i) == 0) {
                i4 = startRestartGroup.changedInstance(controller) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                i24 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(onBackClick) ? 1048576 : 524288 : 1572864;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    function03 = function0;
                    i3 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                        function04 = function02;
                    } else {
                        function04 = function02;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function04) ? 67108864 : 33554432;
                        }
                    }
                    if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        Function0<Unit> function013 = i5 == 0 ? null : function03;
                        Function0<Unit> function014 = i6 == 0 ? null : function04;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2006663895, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetGameContent (FlashBetGameContent.kt:101)");
                        }
                        collectAsState = SnapshotStateKt.collectAsState(controller.getSession(), null, startRestartGroup, 0, 1);
                        collectAsState2 = SnapshotStateKt.collectAsState(controller.getLoading(), null, startRestartGroup, 0, 1);
                        State collectAsState3 = SnapshotStateKt.collectAsState(controller.getSubmitLoading(), null, startRestartGroup, 0, 1);
                        State collectAsState4 = SnapshotStateKt.collectAsState(controller.getSelectedAnswerId(), null, startRestartGroup, 0, 1);
                        State collectAsState5 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
                        FlashBetGameSessionDto FlashBetGameContent$lambda$1 = FlashBetGameContent$lambda$1(collectAsState);
                        String id = FlashBetGameContent$lambda$1 == null ? FlashBetGameContent$lambda$1.getId() : null;
                        startRestartGroup.startReplaceGroup(5004770);
                        changed = startRestartGroup.changed(id);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                        } else {
                            mutableStateOf$default = rememberedValue4;
                        }
                        mutableState = (MutableState) mutableStateOf$default;
                        startRestartGroup.endReplaceGroup();
                        FlashBetGameSessionDto FlashBetGameContent$lambda$12 = FlashBetGameContent$lambda$1(collectAsState);
                        String id2 = FlashBetGameContent$lambda$12 == null ? FlashBetGameContent$lambda$12.getId() : null;
                        startRestartGroup.startReplaceGroup(5004770);
                        changed2 = startRestartGroup.changed(id2);
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            i7 = 0;
                            mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
                            startRestartGroup.updateRememberedValue(mutableIntStateOf);
                        } else {
                            mutableIntStateOf = rememberedValue5;
                            i7 = 0;
                        }
                        MutableIntState mutableIntState = (MutableIntState) mutableIntStateOf;
                        startRestartGroup.endReplaceGroup();
                        Function1<HapticFeedbackType, Unit> rememberHapticFeedback = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, i7);
                        FlashBetEventFlash FlashBetGameContent$lambda$7 = FlashBetGameContent$lambda$7(mutableState);
                        Integer valueOf = FlashBetGameContent$lambda$7 == null ? Integer.valueOf(FlashBetGameContent$lambda$7.getKey()) : null;
                        startRestartGroup.startReplaceGroup(5004770);
                        changed3 = startRestartGroup.changed(mutableState);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new FlashBetGameContentKt$FlashBetGameContent$1$1(mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, (Composer) startRestartGroup, 0);
                        FlashBetGameSessionDto FlashBetGameContent$lambda$13 = FlashBetGameContent$lambda$1(collectAsState);
                        String result = FlashBetGameContent$lambda$13 == null ? FlashBetGameContent$lambda$13.getResult() : null;
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed4 = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(rememberHapticFeedback);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new FlashBetGameContentKt$FlashBetGameContent$2$1(collectAsState, rememberHapticFeedback, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(result, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, (Composer) startRestartGroup, 0);
                        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLifecycleOwner);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj23) {
                                    DisposableEffectResult FlashBetGameContent$lambda$17$lambda$16;
                                    FlashBetGameContent$lambda$17$lambda$16 = FlashBetGameContentKt.FlashBetGameContent$lambda$17$lambda$16(LifecycleOwner.this, (DisposableEffectScope) obj23);
                                    return FlashBetGameContent$lambda$17$lambda$16;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, (Composer) startRestartGroup, 0);
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context applicationContext = ((Context) consume2).getApplicationContext();
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance2 = startRestartGroup.changedInstance(applicationContext);
                        Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                            obj = rememberedValue6;
                        }
                        Function0 function015 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit FlashBetGameContent$lambda$19$lambda$18;
                                FlashBetGameContent$lambda$19$lambda$18 = FlashBetGameContentKt.FlashBetGameContent$lambda$19$lambda$18(applicationContext);
                                return FlashBetGameContent$lambda$19$lambda$18;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function015);
                        obj = function015;
                        final Function0 function016 = (Function0) obj;
                        startRestartGroup.endReplaceGroup();
                        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        Function0<Unit> function017 = function013;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        float f6 = 4;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState, false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f6));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                        float f7 = 24;
                        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7));
                        startRestartGroup.startReplaceGroup(-1633490746);
                        int i25 = 3670016 & i3;
                        changed5 = startRestartGroup.changed(function016) | (i25 != 1048576);
                        Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changed5) {
                            obj2 = rememberedValue7;
                        }
                        Function0 function018 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                                FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20(Function0.this, onBackClick);
                                return FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function018);
                        obj2 = function018;
                        startRestartGroup.endReplaceGroup();
                        int i26 = i3;
                        ImageKt.Image(painterResource, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs, (Function0) obj2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, (Composer) startRestartGroup, 48, 120);
                        str = categoryLogoUrl;
                        if (str.length() == 0) {
                            str = categoryPhotoUrl;
                        }
                        MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, startRestartGroup, (i26 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 121);
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7)), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float f8 = 6;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f8)), startRestartGroup, 6);
                        if (!FlashBetGameContent$lambda$2(collectAsState2)) {
                            startRestartGroup.startReplaceGroup(-500361081);
                            Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(200));
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1549height3ABfNKs);
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
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            i21 = 0;
                            composer3 = startRestartGroup;
                            boxScopeInstance = boxScopeInstance2;
                            mutableState2 = mutableState;
                            function08 = function017;
                        } else if (FlashBetGameContent$lambda$1(collectAsState) == null) {
                            startRestartGroup.startReplaceGroup(-499988213);
                            String FlashBetGameContent$lambda$5 = FlashBetGameContent$lambda$5(collectAsState5);
                            if (Intrinsics.areEqual(FlashBetGameContent$lambda$5, "expired")) {
                                startRestartGroup.startReplaceGroup(-985959017);
                                String stringResource4 = StringResources_androidKt.stringResource(R.string.flash_bet_session_expired, startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                                stringResource3 = stringResource4;
                            } else if (Intrinsics.areEqual(FlashBetGameContent$lambda$5, "invalid_session")) {
                                startRestartGroup.startReplaceGroup(-985956221);
                                stringResource3 = StringResources_androidKt.stringResource(R.string.error, startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-985954461);
                                stringResource3 = StringResources_androidKt.stringResource(R.string.error, startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                            }
                            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f7), 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
                            TextKt.m2642Text4IGK_g(stringResource3, (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) startRestartGroup, 3072, 0, 130546);
                            String stringResource5 = StringResources_androidKt.stringResource(R.string.retry, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            boolean changed6 = startRestartGroup.changed(function016) | startRestartGroup.changedInstance(controller) | ((i26 & 14) == 4);
                            Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (!changed6) {
                                obj21 = rememberedValue8;
                            }
                            Function0 function019 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$26$lambda$25;
                                    FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$26$lambda$25 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$26$lambda$25(Function0.this, controller, sessionId);
                                    return FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$26$lambda$25;
                                }
                            };
                            startRestartGroup.updateRememberedValue(function019);
                            obj21 = function019;
                            startRestartGroup.endReplaceGroup();
                            CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, stringResource5, false, false, false, (Function0) obj21, false, false, false, false, false, null, null, true, false, null, null, null, null, null, startRestartGroup, 48, 24576, 0, 2080697);
                            String stringResource6 = StringResources_androidKt.stringResource(R.string.back, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changed7 = startRestartGroup.changed(function016) | (i25 == 1048576);
                            Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (!changed7) {
                                obj22 = rememberedValue9;
                            }
                            Function0 function020 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$28$lambda$27;
                                    FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$28$lambda$27 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$28$lambda$27(Function0.this, onBackClick);
                                    return FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$28$lambda$27;
                                }
                            };
                            startRestartGroup.updateRememberedValue(function020);
                            obj22 = function020;
                            startRestartGroup.endReplaceGroup();
                            CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource6, false, false, false, (Function0) obj22, false, false, false, false, false, null, null, true, false, null, null, null, null, null, startRestartGroup, 48, 24576, 0, 2080697);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                            composer3 = startRestartGroup;
                            boxScopeInstance = boxScopeInstance2;
                            mutableState2 = mutableState;
                            function08 = function017;
                            i21 = 0;
                        } else {
                            startRestartGroup.startReplaceGroup(-497655494);
                            FlashBetGameSessionDto FlashBetGameContent$lambda$14 = FlashBetGameContent$lambda$1(collectAsState);
                            if (FlashBetGameContent$lambda$14 == null) {
                                composer3 = startRestartGroup;
                                boxScopeInstance = boxScopeInstance2;
                                mutableState2 = mutableState;
                                function08 = function017;
                                i21 = 0;
                            } else {
                                List<FlashBetGameUserAnswerDto> userAnswers = FlashBetGameContent$lambda$14.getUserAnswers();
                                int size = userAnswers != null ? userAnswers.size() : 0;
                                boolean z5 = size >= 3 && FlashBetGameContent$lambda$14.getPendingQuestion() == null;
                                int lastQuestionMinute = FlashBetGameContent$lambda$14.getLastQuestionMinute();
                                int coerceAtLeast = RangesKt.coerceAtLeast(FlashBetGameContent$lambda$14.getMatchTimerSpeedMultiplier(), 1);
                                int endingPhaseMatchMinutes = FlashBetGameContent$lambda$14.getEndingPhaseMatchMinutes();
                                int coerceAtLeast2 = RangesKt.coerceAtLeast((endingPhaseMatchMinutes / coerceAtLeast) * 1000, 1000);
                                String id3 = FlashBetGameContent$lambda$14.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed8 = startRestartGroup.changed(id3);
                                Object rememberedValue10 = startRestartGroup.rememberedValue();
                                if (changed8 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue10 = SnapshotIntStateKt.mutableIntStateOf(0);
                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                }
                                MutableIntState mutableIntState2 = (MutableIntState) rememberedValue10;
                                startRestartGroup.endReplaceGroup();
                                Boolean valueOf2 = Boolean.valueOf(z5);
                                String result2 = FlashBetGameContent$lambda$14.getResult();
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed9 = startRestartGroup.changed(z5) | startRestartGroup.changed(mutableIntState2) | startRestartGroup.changed(coerceAtLeast2) | startRestartGroup.changed(mutableState);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1 rememberedValue11 = startRestartGroup.rememberedValue();
                                if (changed9 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue11 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1(z5, coerceAtLeast2, mutableIntState2, mutableState, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf2, result2, (Function2) rememberedValue11, startRestartGroup, 0);
                                Boolean valueOf3 = Boolean.valueOf(z5);
                                Integer valueOf4 = Integer.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(mutableIntState2));
                                startRestartGroup.startReplaceGroup(-1224400529);
                                int i27 = i26 & 14;
                                boolean changed10 = startRestartGroup.changed(z5) | startRestartGroup.changed(mutableIntState2) | startRestartGroup.changed(coerceAtLeast2) | startRestartGroup.changedInstance(FlashBetGameContent$lambda$14) | startRestartGroup.changedInstance(controller) | (i27 == 4);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1 rememberedValue12 = startRestartGroup.rememberedValue();
                                if (changed10 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    i8 = i27;
                                    i9 = 0;
                                    z = z5;
                                    flashBetGameSessionDto = FlashBetGameContent$lambda$14;
                                    str2 = "C89@4556L9:Column.kt#2w3rfo";
                                    num = valueOf4;
                                    boxScopeInstance = boxScopeInstance2;
                                    function05 = function016;
                                    bool = valueOf3;
                                    i10 = coerceAtLeast2;
                                    str3 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                                    context = applicationContext;
                                    state = collectAsState4;
                                    r57 = 1;
                                    rememberedValue12 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1(z5, coerceAtLeast2, flashBetGameSessionDto, controller, sessionId, mutableIntState2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                } else {
                                    str2 = "C89@4556L9:Column.kt#2w3rfo";
                                    function05 = function016;
                                    flashBetGameSessionDto = FlashBetGameContent$lambda$14;
                                    z = z5;
                                    num = valueOf4;
                                    bool = valueOf3;
                                    i10 = coerceAtLeast2;
                                    i8 = i27;
                                    str3 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                                    context = applicationContext;
                                    boxScopeInstance = boxScopeInstance2;
                                    state = collectAsState4;
                                    i9 = 0;
                                    r57 = 1;
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(bool, num, (Function2) rememberedValue12, startRestartGroup, i9);
                                if (flashBetGameSessionDto.getResult() != null) {
                                    i12 = i10;
                                    if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(mutableIntState2) >= i12) {
                                        startRestartGroup.startReplaceGroup(320587471);
                                        startRestartGroup.startReplaceGroup(-1746271574);
                                        final Function0 function021 = function05;
                                        int i28 = (startRestartGroup.changed(function021) ? 1 : 0) | ((i26 & 29360128) == 8388608 ? r57 == true ? 1 : 0 : i9);
                                        int i29 = r57;
                                        if (i25 != 1048576) {
                                            i29 = i9;
                                        }
                                        int i30 = i28 | i29;
                                        Object rememberedValue13 = startRestartGroup.rememberedValue();
                                        if (i30 != 0 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            function09 = onBackClick;
                                            function010 = function017;
                                            rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda8
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$36$lambda$35;
                                                    FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$36$lambda$35 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$36$lambda$35(Function0.this, function010, function09);
                                                    return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$36$lambda$35;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue13);
                                        } else {
                                            function09 = onBackClick;
                                            function010 = function017;
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        FlashBetGameResultsListContent(flashBetGameSessionDto, sportId, (Function0) rememberedValue13, startRestartGroup, (i26 >> 9) & 112);
                                        startRestartGroup.endReplaceGroup();
                                        function08 = function010;
                                        mutableState2 = mutableState;
                                        composer3 = startRestartGroup;
                                        i21 = i9;
                                        Unit unit3 = Unit.INSTANCE;
                                        Unit unit4 = Unit.INSTANCE;
                                    } else {
                                        flashBetGameSessionDto2 = flashBetGameSessionDto;
                                        function06 = function017;
                                        i11 = i25;
                                        function07 = function05;
                                    }
                                } else {
                                    flashBetGameSessionDto2 = flashBetGameSessionDto;
                                    function06 = function017;
                                    i11 = i25;
                                    function07 = function05;
                                    i12 = i10;
                                }
                                startRestartGroup.startReplaceGroup(321694388);
                                String id4 = flashBetGameSessionDto2.getId();
                                int i31 = i11;
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed11 = startRestartGroup.changed(id4);
                                Object rememberedValue14 = startRestartGroup.rememberedValue();
                                if (changed11 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    snapshotMutationPolicy = null;
                                    mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((boolean) r57), null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                                } else {
                                    mutableStateOf$default2 = rememberedValue14;
                                    snapshotMutationPolicy = null;
                                }
                                final MutableState mutableState4 = (MutableState) mutableStateOf$default2;
                                startRestartGroup.endReplaceGroup();
                                String id5 = flashBetGameSessionDto2.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed12 = startRestartGroup.changed(id5);
                                Object rememberedValue15 = startRestartGroup.rememberedValue();
                                if (!changed12) {
                                    obj3 = rememberedValue15;
                                }
                                MutableState mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default3);
                                obj3 = mutableStateOf$default3;
                                MutableState mutableState5 = (MutableState) obj3;
                                startRestartGroup.endReplaceGroup();
                                String id6 = flashBetGameSessionDto2.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed13 = startRestartGroup.changed(id6);
                                Object rememberedValue16 = startRestartGroup.rememberedValue();
                                if (changed13 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                    MutableState mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(size), null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default4);
                                    rememberedValue16 = mutableStateOf$default4;
                                }
                                MutableState mutableState6 = (MutableState) rememberedValue16;
                                startRestartGroup.endReplaceGroup();
                                String id7 = flashBetGameSessionDto2.getId();
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue17 = startRestartGroup.rememberedValue();
                                Function0<Unit> function022 = function06;
                                if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue17 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj23) {
                                            DisposableEffectResult FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$48$lambda$47;
                                            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$48$lambda$47 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$48$lambda$47((DisposableEffectScope) obj23);
                                            return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$48$lambda$47;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue17);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(id7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, (Composer) startRestartGroup, 48);
                                String id8 = flashBetGameSessionDto2.getId();
                                Boolean valueOf5 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4));
                                final Function0 function023 = function07;
                                startRestartGroup.startReplaceGroup(-1633490746);
                                final Context context2 = context;
                                boolean changed14 = startRestartGroup.changed(mutableState4) | startRestartGroup.changedInstance(context2);
                                Object rememberedValue18 = startRestartGroup.rememberedValue();
                                if (changed14 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue18 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj23) {
                                            DisposableEffectResult FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51;
                                            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51(context2, mutableState4, (DisposableEffectScope) obj23);
                                            return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue18);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(id8, valueOf5, (Function1) rememberedValue18, startRestartGroup, 0);
                                String id9 = flashBetGameSessionDto2.getId();
                                startRestartGroup.startReplaceGroup(-1746271574);
                                boolean changedInstance3 = startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(flashBetGameSessionDto2) | startRestartGroup.changed(mutableState4);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$6$1 rememberedValue19 = startRestartGroup.rememberedValue();
                                if (changedInstance3 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue19 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$6$1(context2, flashBetGameSessionDto2, mutableState4, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue19);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(id9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue19, (Composer) startRestartGroup, 0);
                                Integer valueOf6 = Integer.valueOf(size);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed15 = startRestartGroup.changed(size) | startRestartGroup.changed(mutableState6) | startRestartGroup.changed(mutableState5) | startRestartGroup.changedInstance(flashBetGameSessionDto2) | startRestartGroup.changed(mutableState4) | startRestartGroup.changedInstance(context2);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1 rememberedValue20 = startRestartGroup.rememberedValue();
                                if (changed15 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue20 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1(size, flashBetGameSessionDto2, context2, mutableState6, mutableState5, mutableState4, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue20);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue20, (Composer) startRestartGroup, 0);
                                int totalMatchRealSeconds = flashBetGameSessionDto2.getTotalMatchRealSeconds();
                                String id10 = flashBetGameSessionDto2.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed16 = startRestartGroup.changed(id10);
                                Object rememberedValue21 = startRestartGroup.rememberedValue();
                                if (!changed16) {
                                    obj4 = rememberedValue21;
                                }
                                MutableIntState mutableIntStateOf2 = SnapshotIntStateKt.mutableIntStateOf(0);
                                startRestartGroup.updateRememberedValue(mutableIntStateOf2);
                                obj4 = mutableIntStateOf2;
                                MutableIntState mutableIntState3 = (MutableIntState) obj4;
                                startRestartGroup.endReplaceGroup();
                                Integer nextQuestionMinute = flashBetGameSessionDto2.getNextQuestionMinute();
                                if (nextQuestionMinute != null) {
                                    i14 = nextQuestionMinute.intValue();
                                    i13 = r57 == true ? 1 : 0;
                                } else if (size != 0) {
                                    i13 = r57 == true ? 1 : 0;
                                    i14 = size != i13 ? size != 2 ? 90 : 75 : 45;
                                } else {
                                    i13 = r57 == true ? 1 : 0;
                                    i14 = 0;
                                }
                                int coerceIn = RangesKt.coerceIn((int) ((FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$56(mutableIntState3) / 1000.0f) * coerceAtLeast), 0, 90);
                                int i32 = coerceIn >= i14 ? i13 : 0;
                                boolean z6 = (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4) || i32 == 0 || flashBetGameSessionDto2.getPendingQuestion() == null) ? 0 : i13;
                                String id11 = flashBetGameSessionDto2.getId();
                                Boolean valueOf7 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4));
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changed17 = startRestartGroup.changed(mutableState4) | startRestartGroup.changed(mutableIntState3);
                                ?? r29 = i32;
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$8$1 rememberedValue22 = startRestartGroup.rememberedValue();
                                if (changed17 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue22 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$8$1(mutableState4, mutableIntState3, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue22);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(id11, valueOf7, (Function2) rememberedValue22, startRestartGroup, 0);
                                String id12 = flashBetGameSessionDto2.getId();
                                Boolean valueOf8 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4));
                                Boolean valueOf9 = Boolean.valueOf(z6);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed18 = startRestartGroup.changed(mutableState4) | startRestartGroup.changed(z6) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableIntState3) | startRestartGroup.changed(totalMatchRealSeconds);
                                FlashBetGameSessionDto flashBetGameSessionDto3 = flashBetGameSessionDto2;
                                Object rememberedValue23 = startRestartGroup.rememberedValue();
                                if (!changed18) {
                                    obj5 = rememberedValue23;
                                }
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1 flashBetGameContentKt$FlashBetGameContent$4$1$4$9$1 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1(z6, totalMatchRealSeconds, mutableState4, mutableState, mutableIntState3, null);
                                startRestartGroup.updateRememberedValue(flashBetGameContentKt$FlashBetGameContent$4$1$4$9$1);
                                obj5 = flashBetGameContentKt$FlashBetGameContent$4$1$4$9$1;
                                startRestartGroup.endReplaceGroup();
                                function08 = function022;
                                boolean z7 = z6;
                                int i33 = size;
                                EffectsKt.LaunchedEffect(id12, valueOf8, valueOf9, (Function2) obj5, startRestartGroup, 0);
                                if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4)) {
                                    z2 = z;
                                    coerceAtMost = 0;
                                } else {
                                    z2 = z;
                                    coerceAtMost = z2 ? RangesKt.coerceAtMost(lastQuestionMinute + RangesKt.coerceAtMost((FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(mutableIntState2) * endingPhaseMatchMinutes) / i12, endingPhaseMatchMinutes), 90) : coerceIn;
                                }
                                String str8 = coerceAtMost + "'";
                                boolean z8 = coerceAtMost == 45;
                                if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4)) {
                                    startRestartGroup.startReplaceGroup(325148903);
                                    startRestartGroup.endReplaceGroup();
                                    str4 = null;
                                } else {
                                    if (coerceAtMost >= 90) {
                                        startRestartGroup.startReplaceGroup(-266604215);
                                        stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_period_full_time, startRestartGroup, 6);
                                        startRestartGroup.endReplaceGroup();
                                    } else if (z8 && !z7) {
                                        startRestartGroup.startReplaceGroup(-266600785);
                                        stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_period_half_time_short, startRestartGroup, 6);
                                        startRestartGroup.endReplaceGroup();
                                    } else if (coerceAtMost < 45) {
                                        startRestartGroup.startReplaceGroup(-266597398);
                                        stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_period_first_half, startRestartGroup, 6);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-266594677);
                                        stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_period_second_half, startRestartGroup, 6);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    str4 = stringResource;
                                }
                                List<FlashBetGameScoreUpdateDto> scores = flashBetGameSessionDto3.getScores();
                                if (scores != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj23 : scores) {
                                        if (((FlashBetGameScoreUpdateDto) obj23).getMinute() <= coerceAtMost) {
                                            arrayList.add(obj23);
                                        }
                                    }
                                    Iterator it = arrayList.iterator();
                                    if (it.hasNext()) {
                                        ?? next = it.next();
                                        if (it.hasNext()) {
                                            int minute = ((FlashBetGameScoreUpdateDto) next).getMinute();
                                            do {
                                                Object next2 = it.next();
                                                int minute2 = ((FlashBetGameScoreUpdateDto) next2).getMinute();
                                                next = next;
                                                if (minute < minute2) {
                                                    next = next2;
                                                    minute = minute2;
                                                }
                                            } while (it.hasNext());
                                        }
                                        flashBetGameScoreUpdateDto2 = next;
                                    } else {
                                        flashBetGameScoreUpdateDto2 = null;
                                    }
                                    flashBetGameScoreUpdateDto = flashBetGameScoreUpdateDto2;
                                }
                                flashBetGameScoreUpdateDto = new FlashBetGameScoreUpdateDto(0, 0, 0);
                                FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto3 = flashBetGameScoreUpdateDto;
                                String id13 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed19 = startRestartGroup.changed(id13);
                                Object rememberedValue24 = startRestartGroup.rememberedValue();
                                if (!changed19) {
                                    obj6 = rememberedValue24;
                                }
                                MutableIntState mutableIntStateOf3 = SnapshotIntStateKt.mutableIntStateOf(0);
                                startRestartGroup.updateRememberedValue(mutableIntStateOf3);
                                obj6 = mutableIntStateOf3;
                                MutableIntState mutableIntState4 = (MutableIntState) obj6;
                                startRestartGroup.endReplaceGroup();
                                String id14 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed20 = startRestartGroup.changed(id14);
                                Object rememberedValue25 = startRestartGroup.rememberedValue();
                                if (!changed20) {
                                    obj7 = rememberedValue25;
                                }
                                MutableIntState mutableIntStateOf4 = SnapshotIntStateKt.mutableIntStateOf(0);
                                startRestartGroup.updateRememberedValue(mutableIntStateOf4);
                                obj7 = mutableIntStateOf4;
                                MutableIntState mutableIntState5 = (MutableIntState) obj7;
                                startRestartGroup.endReplaceGroup();
                                String id15 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed21 = startRestartGroup.changed(id15);
                                Object rememberedValue26 = startRestartGroup.rememberedValue();
                                if (changed21 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue26 = SnapshotIntStateKt.mutableIntStateOf(0);
                                    startRestartGroup.updateRememberedValue(rememberedValue26);
                                }
                                MutableIntState mutableIntState6 = (MutableIntState) rememberedValue26;
                                startRestartGroup.endReplaceGroup();
                                String id16 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed22 = startRestartGroup.changed(id16);
                                Object rememberedValue27 = startRestartGroup.rememberedValue();
                                if (changed22 || rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue27 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue27);
                                }
                                MutableState mutableState7 = (MutableState) rememberedValue27;
                                startRestartGroup.endReplaceGroup();
                                boolean z9 = z2;
                                Object[] objArr = {Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4)), Integer.valueOf(flashBetGameScoreUpdateDto3.getScoreHome()), Integer.valueOf(flashBetGameScoreUpdateDto3.getScoreAway()), flashBetGameSessionDto3.getId(), Integer.valueOf(coerceAtMost)};
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed23 = startRestartGroup.changed(mutableState4) | startRestartGroup.changed(mutableIntState4) | startRestartGroup.changed(flashBetGameScoreUpdateDto3) | startRestartGroup.changed(mutableIntState5) | startRestartGroup.changedInstance(flashBetGameSessionDto3) | startRestartGroup.changed(coerceAtMost) | startRestartGroup.changedInstance(context2) | startRestartGroup.changed(mutableState7) | startRestartGroup.changed(mutableIntState) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableIntState6);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1 rememberedValue28 = startRestartGroup.rememberedValue();
                                if (changed23 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue28 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1(flashBetGameScoreUpdateDto3, flashBetGameSessionDto3, coerceAtMost, context2, mutableState4, mutableIntState4, mutableIntState5, mutableState7, mutableIntState, mutableState, mutableIntState6, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue28);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue28, (Composer) startRestartGroup, 0);
                                Integer valueOf10 = Integer.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69(mutableIntState6));
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changed24 = startRestartGroup.changed(mutableIntState6) | startRestartGroup.changed(mutableState7);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1 rememberedValue29 = startRestartGroup.rememberedValue();
                                if (changed24 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue29 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1(mutableIntState6, mutableState7, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue29);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue29, (Composer) startRestartGroup, 0);
                                String id17 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed25 = startRestartGroup.changed(id17);
                                Object rememberedValue30 = startRestartGroup.rememberedValue();
                                if (!changed25) {
                                    obj8 = rememberedValue30;
                                }
                                MutableState mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default5);
                                obj8 = mutableStateOf$default5;
                                MutableState mutableState8 = (MutableState) obj8;
                                startRestartGroup.endReplaceGroup();
                                if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4)) {
                                    num2 = null;
                                } else {
                                    List<FlashBetGameEventDto> events = flashBetGameSessionDto3.getEvents();
                                    if (events == null) {
                                        events = CollectionsKt.emptyList();
                                    }
                                    num2 = Integer.valueOf(FlashBetMatchMomentumKt.computeSimulatedPossessionHomePercent(events, coerceAtMost, flashBetGameSessionDto3.getPossessionHomePercent(), flashBetGameSessionDto3.getPossessionAwayPercent()));
                                }
                                if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4)) {
                                    f = 0.0f;
                                } else {
                                    List<FlashBetGameEventDto> events2 = flashBetGameSessionDto3.getEvents();
                                    if (events2 == null) {
                                        events2 = CollectionsKt.emptyList();
                                    }
                                    f = FlashBetMatchMomentumKt.computeFlashBetLiveEventMomentum(events2, coerceAtMost);
                                }
                                String id18 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed26 = startRestartGroup.changed(id18);
                                Object rememberedValue31 = startRestartGroup.rememberedValue();
                                if (!changed26) {
                                    obj9 = rememberedValue31;
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                startRestartGroup.updateRememberedValue(linkedHashSet);
                                obj9 = linkedHashSet;
                                Set set = (Set) obj9;
                                startRestartGroup.endReplaceGroup();
                                Boolean valueOf11 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4));
                                Integer valueOf12 = Integer.valueOf(coerceAtMost);
                                List<FlashBetGameEventDto> events3 = flashBetGameSessionDto3.getEvents();
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed27 = startRestartGroup.changed(mutableState4) | startRestartGroup.changedInstance(set) | startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(flashBetGameSessionDto3) | startRestartGroup.changed(coerceAtMost) | startRestartGroup.changedInstance(context2) | startRestartGroup.changed(mutableState8) | startRestartGroup.changed(mutableIntState);
                                Object rememberedValue32 = startRestartGroup.rememberedValue();
                                if (!changed27) {
                                    obj10 = rememberedValue32;
                                }
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1 flashBetGameContentKt$FlashBetGameContent$4$1$4$12$1 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1(set, flashBetGameSessionDto3, context2, mutableState4, mutableState, coerceAtMost, mutableState8, mutableIntState, null);
                                startRestartGroup.updateRememberedValue(flashBetGameContentKt$FlashBetGameContent$4$1$4$12$1);
                                obj10 = flashBetGameContentKt$FlashBetGameContent$4$1$4$12$1;
                                startRestartGroup.endReplaceGroup();
                                mutableState2 = mutableState;
                                EffectsKt.LaunchedEffect(valueOf11, valueOf12, events3, (Function2) obj10, startRestartGroup, 0);
                                Boolean valueOf13 = Boolean.valueOf(z8);
                                Boolean valueOf14 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState4));
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed28 = startRestartGroup.changed(mutableState4) | startRestartGroup.changed(z8) | startRestartGroup.changed(mutableState8) | startRestartGroup.changedInstance(context2);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$13$1 rememberedValue33 = startRestartGroup.rememberedValue();
                                if (changed28 || rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                    z3 = z8;
                                    mutableState3 = mutableState4;
                                    i15 = 5004770;
                                    i16 = i31;
                                    rememberedValue33 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$13$1(z8, context2, mutableState4, mutableState8, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue33);
                                } else {
                                    z3 = z8;
                                    mutableState3 = mutableState4;
                                    i15 = 5004770;
                                    i16 = i31;
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf13, valueOf14, (Function2) rememberedValue33, startRestartGroup, 0);
                                String id19 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(i15);
                                boolean changed29 = startRestartGroup.changed(id19);
                                Object rememberedValue34 = startRestartGroup.rememberedValue();
                                if (!changed29) {
                                    obj11 = rememberedValue34;
                                }
                                MutableState mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default6);
                                obj11 = mutableStateOf$default6;
                                MutableState mutableState9 = (MutableState) obj11;
                                startRestartGroup.endReplaceGroup();
                                Object[] objArr2 = {Integer.valueOf(coerceAtMost), Boolean.valueOf(z7), Integer.valueOf(i33), Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState3))};
                                startRestartGroup.startReplaceGroup(-1224400529);
                                MutableState mutableState10 = mutableState3;
                                boolean changed30 = startRestartGroup.changed(mutableState10) | startRestartGroup.changed(coerceAtMost) | startRestartGroup.changed(z7) | startRestartGroup.changed(i33) | startRestartGroup.changed(mutableState9) | startRestartGroup.changedInstance(context2);
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$14$1 rememberedValue35 = startRestartGroup.rememberedValue();
                                if (changed30 || rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue35 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$14$1(coerceAtMost, z7, i33, context2, mutableState10, mutableState9, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue35);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue35, (Composer) startRestartGroup, 0);
                                String id20 = flashBetGameSessionDto3.getId();
                                startRestartGroup.startReplaceGroup(i15);
                                boolean changed31 = startRestartGroup.changed(id20);
                                Object rememberedValue36 = startRestartGroup.rememberedValue();
                                if (!changed31) {
                                    obj12 = rememberedValue36;
                                }
                                MutableState mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default7);
                                obj12 = mutableStateOf$default7;
                                MutableState mutableState11 = (MutableState) obj12;
                                startRestartGroup.endReplaceGroup();
                                Integer valueOf15 = Integer.valueOf(coerceAtMost);
                                Boolean valueOf16 = Boolean.valueOf(z9);
                                Boolean valueOf17 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState10));
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed32 = startRestartGroup.changed(mutableState10) | startRestartGroup.changed(z9) | startRestartGroup.changed(coerceAtMost) | startRestartGroup.changed(mutableState11) | startRestartGroup.changedInstance(context2);
                                Object rememberedValue37 = startRestartGroup.rememberedValue();
                                if (!changed32) {
                                    obj13 = rememberedValue37;
                                }
                                FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1 flashBetGameContentKt$FlashBetGameContent$4$1$4$15$1 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1(z9, coerceAtMost, context2, mutableState10, mutableState11, null);
                                startRestartGroup.updateRememberedValue(flashBetGameContentKt$FlashBetGameContent$4$1$4$15$1);
                                obj13 = flashBetGameContentKt$FlashBetGameContent$4$1$4$15$1;
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf15, valueOf16, valueOf17, (Function2) obj13, startRestartGroup, 0);
                                int coerceAtLeast3 = RangesKt.coerceAtLeast(flashBetGameSessionDto3.getClientQuestionCountdownSeconds(), 5);
                                Pair pair2 = TuplesKt.to(Integer.valueOf(i33), Boolean.valueOf((boolean) r29));
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed33 = startRestartGroup.changed(pair2);
                                Object rememberedValue38 = startRestartGroup.rememberedValue();
                                if (changed33 || rememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                    MutableState mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default8);
                                    rememberedValue38 = mutableStateOf$default8;
                                }
                                MutableState mutableState12 = (MutableState) rememberedValue38;
                                startRestartGroup.endReplaceGroup();
                                Long FlashBetGameContent$lambda$4 = FlashBetGameContent$lambda$4(state);
                                Boolean valueOf18 = Boolean.valueOf(z7);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                State state4 = state;
                                boolean changed34 = startRestartGroup.changed(z7) | startRestartGroup.changed(state4) | startRestartGroup.changed(mutableState12) | startRestartGroup.changedInstance(context2);
                                Object rememberedValue39 = startRestartGroup.rememberedValue();
                                if (changed34 || rememberedValue39 == Composer.INSTANCE.getEmpty()) {
                                    state2 = state4;
                                    i17 = i33;
                                    FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1 flashBetGameContentKt$FlashBetGameContent$4$1$4$16$1 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1(z7, context2, state4, mutableState12, null);
                                    startRestartGroup.updateRememberedValue(flashBetGameContentKt$FlashBetGameContent$4$1$4$16$1);
                                    obj14 = flashBetGameContentKt$FlashBetGameContent$4$1$4$16$1;
                                } else {
                                    state2 = state4;
                                    i17 = i33;
                                    obj14 = rememberedValue39;
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(FlashBetGameContent$lambda$4, valueOf18, pair2, (Function2) obj14, startRestartGroup, 0);
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed35 = startRestartGroup.changed(pair2);
                                Object rememberedValue40 = startRestartGroup.rememberedValue();
                                if (!changed35) {
                                    obj15 = rememberedValue40;
                                }
                                MutableState mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default9);
                                obj15 = mutableStateOf$default9;
                                final MutableState mutableState13 = (MutableState) obj15;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean changed36 = startRestartGroup.changed(pair2);
                                Object rememberedValue41 = startRestartGroup.rememberedValue();
                                if (changed36 || rememberedValue41 == Composer.INSTANCE.getEmpty()) {
                                    z4 = false;
                                    c = 2;
                                    MutableState mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default10);
                                    obj16 = mutableStateOf$default10;
                                } else {
                                    c = 2;
                                    z4 = false;
                                    obj16 = rememberedValue41;
                                }
                                MutableState mutableState14 = (MutableState) obj16;
                                startRestartGroup.endReplaceGroup();
                                Boolean valueOf19 = Boolean.valueOf(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(mutableState13));
                                FlashBetGameQuestionDto pendingQuestion = flashBetGameSessionDto3.getPendingQuestion();
                                startRestartGroup.startReplaceGroup(-1224400529);
                                boolean changed37 = startRestartGroup.changed(mutableState13) | startRestartGroup.changedInstance(flashBetGameSessionDto3) | startRestartGroup.changed(mutableState14) | ((i26 & 234881024) == 67108864 ? true : z4);
                                Object rememberedValue42 = startRestartGroup.rememberedValue();
                                if (changed37 || rememberedValue42 == Composer.INSTANCE.getEmpty()) {
                                    obj17 = null;
                                    c2 = c;
                                    pair = pair2;
                                    FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1 flashBetGameContentKt$FlashBetGameContent$4$1$4$17$1 = new FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1(flashBetGameSessionDto3, function014, mutableState13, mutableState14, null);
                                    startRestartGroup.updateRememberedValue(flashBetGameContentKt$FlashBetGameContent$4$1$4$17$1);
                                    obj18 = flashBetGameContentKt$FlashBetGameContent$4$1$4$17$1;
                                } else {
                                    c2 = c;
                                    pair = pair2;
                                    obj17 = null;
                                    obj18 = rememberedValue42;
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf19, pendingQuestion, pair, (Function2) obj18, startRestartGroup, 0);
                                int i34 = i16;
                                int i35 = i17;
                                int i36 = coerceAtMost;
                                Object obj24 = obj17;
                                int i37 = i8;
                                FlashBetGameTopCard(flashBetGameSessionDto3, sportId, !FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState10), str8, str4, flashBetGameScoreUpdateDto3, FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69(mutableIntState6), FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$72(mutableState7), num2, f, startRestartGroup, (i26 >> 9) & 112, 0);
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), startRestartGroup, 6);
                                boolean z10 = i35 >= 1;
                                float f9 = 2;
                                float f10 = 8;
                                Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj24), Dp.m7774constructorimpl(f9), 0.0f, 2, obj24), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f10))), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f10))), Dp.m7774constructorimpl(f10), Dp.m7774constructorimpl(f8));
                                String str9 = str3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, str9);
                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
                                Updater.m4617setimpl(m4610constructorimpl6, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                }
                                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                String str10 = str2;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, str10);
                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f9)), startRestartGroup, 6);
                                List<FlashBetGameUserAnswerDto> userAnswers2 = flashBetGameSessionDto3.getUserAnswers();
                                startRestartGroup.startReplaceGroup(-1935025723);
                                if (userAnswers2 != null) {
                                    for (FlashBetGameUserAnswerDto flashBetGameUserAnswerDto : userAnswers2) {
                                        FlashBetPastQuestionRow(flashBetGameUserAnswerDto.getQuestion(), flashBetGameUserAnswerDto.getAnswer(), flashBetGameUserAnswerDto.getCoefficient(), startRestartGroup, 0);
                                    }
                                    Unit unit5 = Unit.INSTANCE;
                                }
                                startRestartGroup.endReplaceGroup();
                                if (z7 && flashBetGameSessionDto3.getPendingQuestion() != null) {
                                    startRestartGroup.startReplaceGroup(144241756);
                                    FlashBetGameQuestionDto pendingQuestion2 = flashBetGameSessionDto3.getPendingQuestion();
                                    Intrinsics.checkNotNull(pendingQuestion2);
                                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                                    Updater.m4617setimpl(m4610constructorimpl7, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    f3 = f9;
                                    TextKt.m2642Text4IGK_g(pendingQuestion2.getQuestion(), PaddingKt.m1520paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7774constructorimpl(f10), 0.0f, 11, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, (Composer) startRestartGroup, 199680, 0, 130960);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    final State state5 = state2;
                                    boolean changed38 = startRestartGroup.changed(state5) | startRestartGroup.changedInstance(controller) | (i37 == 4) | startRestartGroup.changed(mutableState13);
                                    Object rememberedValue43 = startRestartGroup.rememberedValue();
                                    if (changed38 || rememberedValue43 == Composer.INSTANCE.getEmpty()) {
                                        Function0 function024 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103;
                                                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103(FlashBetGameController.this, sessionId, state5, mutableState13);
                                                return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(function024);
                                        obj19 = function024;
                                    } else {
                                        obj19 = rememberedValue43;
                                    }
                                    Function0 function025 = (Function0) obj19;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(5004770);
                                    boolean changedInstance4 = startRestartGroup.changedInstance(context2);
                                    Object rememberedValue44 = startRestartGroup.rememberedValue();
                                    if (!changedInstance4) {
                                        obj20 = rememberedValue44;
                                    }
                                    Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj25) {
                                            Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$106$lambda$105;
                                            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$106$lambda$105 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$106$lambda$105(context2, ((Integer) obj25).intValue());
                                            return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$106$lambda$105;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(function1);
                                    obj20 = function1;
                                    startRestartGroup.endReplaceGroup();
                                    i37 = i37;
                                    FlashBetQuestionCountdownRingKt.m13724FlashBetQuestionCountdownRing0vH8DBg(coerceAtLeast3, pair, z7, function025, (Function1) obj20, null, 0.0f, 0, startRestartGroup, 0, 224);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), startRestartGroup, 6);
                                    f2 = f10;
                                    state3 = state5;
                                    i18 = i34;
                                    composer2 = startRestartGroup;
                                    FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Arrangement.INSTANCE.m1398spacedByD5KLDUw(Dp.m7774constructorimpl(f6), Alignment.INSTANCE.getCenterHorizontally()), Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f6)), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1419514948, true, new FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3(pendingQuestion2, controller, state5, collectAsState3, mutableState13), composer2, 54), composer2, 1573302, 56);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), composer2, 6);
                                    composer2.endReplaceGroup();
                                    i20 = 1;
                                    str5 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                    f4 = 0.0f;
                                    i19 = 0;
                                } else {
                                    f2 = f10;
                                    i18 = i34;
                                    composer2 = startRestartGroup;
                                    f3 = f9;
                                    state3 = state2;
                                    composer2.startReplaceGroup(147705882);
                                    if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState10)) {
                                        composer2.startReplaceGroup(-1934896978);
                                        stringResource2 = StringResources_androidKt.stringResource(R.string.flash_bet_revealing_teams, composer2, 6);
                                        composer2.endReplaceGroup();
                                    } else if (z3 && !z7) {
                                        composer2.startReplaceGroup(-1934893336);
                                        stringResource2 = StringResources_androidKt.stringResource(R.string.flash_bet_half_time, composer2, 6);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1934890608);
                                        stringResource2 = StringResources_androidKt.stringResource(R.string.flash_bet_match_in_progress, composer2, 6);
                                        composer2.endReplaceGroup();
                                    }
                                    Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f2), 1, null);
                                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str9);
                                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, m1518paddingVpY3zN4$default2);
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
                                    Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str10);
                                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                    TextKt.m2642Text4IGK_g(stringResource2, (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130962);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f6)), composer2, 6);
                                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_ready_for_next_question, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130962);
                                    List<FlashBetGameEventDto> events4 = flashBetGameSessionDto3.getEvents();
                                    if (events4 == null) {
                                        events4 = CollectionsKt.emptyList();
                                    }
                                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f6), Dp.m7774constructorimpl(f8), Dp.m7774constructorimpl(f6), 0.0f, 8, null);
                                    i19 = 0;
                                    f4 = 0.0f;
                                    i20 = 1;
                                    str5 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                    FlashBetLiveEventsTicker(events4, i36, m1520paddingqDBjuR0$default, composer2, 0, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceGroup();
                                }
                                composer2.startReplaceGroup(-1934830478);
                                if (z7) {
                                    composer2.startReplaceGroup(-1934828183);
                                    if (z10) {
                                        i23 = 6;
                                        str7 = null;
                                    } else {
                                        i23 = 6;
                                        str7 = StringResources_androidKt.stringResource(R.string.flash_bet_skip_required_hint, composer2, 6);
                                    }
                                    composer2.endReplaceGroup();
                                    if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(mutableState13)) {
                                        composer2.startReplaceGroup(-1934821170);
                                        str7 = StringResources_androidKt.stringResource(R.string.flash_bet_session_expired, composer2, i23);
                                        composer2.endReplaceGroup();
                                    } else if (str7 != null) {
                                        composer2.startReplaceGroup(-1934817788);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-1934816050);
                                        str7 = StringResources_androidKt.stringResource(R.string.flash_bet_choose_bet_hint, composer2, i23);
                                        composer2.endReplaceGroup();
                                    }
                                    i21 = i19;
                                    i22 = i20;
                                    str6 = str5;
                                    f5 = f4;
                                    TextKt.m2642Text4IGK_g(str7, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f6), 7, null), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                                } else {
                                    f5 = f4;
                                    str6 = str5;
                                    i21 = i19;
                                    i22 = i20;
                                }
                                composer2.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (z7) {
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, 6);
                                    Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f5, i22, null), 0.0f, Dp.m7774constructorimpl(f3), 0.0f, 0.0f, 13, null);
                                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
                                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str6);
                                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i21);
                                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default2);
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
                                    Updater.m4617setimpl(m4610constructorimpl9, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                        m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                        m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    Modifier weight$default = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    String stringResource7 = StringResources_androidKt.stringResource(R.string.flash_bet_skip, composer2, 6);
                                    ?? r15 = (FlashBetGameContent$lambda$3(collectAsState3) || FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(mutableState13) || !z10) ? i21 : i22;
                                    composer2.startReplaceGroup(-1633490746);
                                    int i38 = (composer2.changed(function023) ? 1 : 0) | (i18 == 1048576 ? i22 : i21);
                                    Object rememberedValue45 = composer2.rememberedValue();
                                    if (i38 != 0 || rememberedValue45 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue45 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$111$lambda$110;
                                                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$111$lambda$110 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$111$lambda$110(Function0.this, onBackClick);
                                                return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$111$lambda$110;
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue45);
                                    }
                                    composer2.endReplaceGroup();
                                    CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default, false, stringResource7, true, false, r15, (Function0) rememberedValue45, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer2, 3120, 24576, 0, 2080656);
                                    Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    String stringResource8 = StringResources_androidKt.stringResource(R.string.flash_bet_next, composer2, 6);
                                    ?? r152 = (FlashBetGameContent$lambda$4(state3) == null || FlashBetGameContent$lambda$3(collectAsState3) || FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(mutableState13)) ? i21 : i22;
                                    boolean FlashBetGameContent$lambda$3 = FlashBetGameContent$lambda$3(collectAsState3);
                                    HapticFeedbackType hapticFeedbackType = HapticFeedbackType.Confirm;
                                    composer2.startReplaceGroup(-1746271574);
                                    composer3 = composer2;
                                    int i39 = (composer2.changed(function023) ? 1 : 0) | (composer3.changedInstance(controller) ? 1 : 0);
                                    if (i37 != 4) {
                                        i22 = i21;
                                    }
                                    int i40 = i39 | i22;
                                    Object rememberedValue46 = composer3.rememberedValue();
                                    if (i40 != 0 || rememberedValue46 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue46 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113;
                                                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113(Function0.this, controller, sessionId);
                                                return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113;
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue46);
                                    }
                                    composer3.endReplaceGroup();
                                    CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default2, true, stringResource8, true, false, r152, (Function0) rememberedValue46, false, false, false, FlashBetGameContent$lambda$3, false, null, null, true, false, null, null, null, null, hapticFeedbackType, composer3, 3120, 24576, 6, 1031056);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                } else {
                                    composer3 = composer2;
                                }
                                composer3.endReplaceGroup();
                                Unit unit32 = Unit.INSTANCE;
                                Unit unit42 = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay(FlashBetGameContent$lambda$7(mutableState2), ZIndexModifierKt.zIndex(boxScopeInstance.matchParentSize(Modifier.INSTANCE), 40.0f), composer3, i21, i21);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function011 = function014;
                        function012 = function08;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer3 = startRestartGroup;
                        function012 = function03;
                        function011 = function04;
                    }
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj25, Object obj26) {
                                Unit FlashBetGameContent$lambda$119;
                                FlashBetGameContent$lambda$119 = FlashBetGameContentKt.FlashBetGameContent$lambda$119(sessionId, categoryName, categoryLogoUrl, categoryPhotoUrl, sportId, controller, onBackClick, function012, function011, i, i2, (Composer) obj25, ((Integer) obj26).intValue());
                                return FlashBetGameContent$lambda$119;
                            }
                        });
                        return;
                    }
                    return;
                }
                function03 = function0;
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                collectAsState = SnapshotStateKt.collectAsState(controller.getSession(), null, startRestartGroup, 0, 1);
                collectAsState2 = SnapshotStateKt.collectAsState(controller.getLoading(), null, startRestartGroup, 0, 1);
                State collectAsState32 = SnapshotStateKt.collectAsState(controller.getSubmitLoading(), null, startRestartGroup, 0, 1);
                State collectAsState42 = SnapshotStateKt.collectAsState(controller.getSelectedAnswerId(), null, startRestartGroup, 0, 1);
                State collectAsState52 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
                FlashBetGameSessionDto FlashBetGameContent$lambda$15 = FlashBetGameContent$lambda$1(collectAsState);
                if (FlashBetGameContent$lambda$15 == null) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(id);
                Object rememberedValue47 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                mutableState = (MutableState) mutableStateOf$default;
                startRestartGroup.endReplaceGroup();
                FlashBetGameSessionDto FlashBetGameContent$lambda$122 = FlashBetGameContent$lambda$1(collectAsState);
                if (FlashBetGameContent$lambda$122 == null) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                changed2 = startRestartGroup.changed(id2);
                Object rememberedValue52 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                i7 = 0;
                mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(mutableIntStateOf);
                MutableIntState mutableIntState7 = (MutableIntState) mutableIntStateOf;
                startRestartGroup.endReplaceGroup();
                Function1<HapticFeedbackType, Unit> rememberHapticFeedback2 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, i7);
                FlashBetEventFlash FlashBetGameContent$lambda$72 = FlashBetGameContent$lambda$7(mutableState);
                if (FlashBetGameContent$lambda$72 == null) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                changed3 = startRestartGroup.changed(mutableState);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue = new FlashBetGameContentKt$FlashBetGameContent$1$1(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, (Composer) startRestartGroup, 0);
                FlashBetGameSessionDto FlashBetGameContent$lambda$132 = FlashBetGameContent$lambda$1(collectAsState);
                if (FlashBetGameContent$lambda$132 == null) {
                }
                startRestartGroup.startReplaceGroup(-1633490746);
                changed4 = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(rememberHapticFeedback2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue2 = new FlashBetGameContentKt$FlashBetGameContent$2$1(collectAsState, rememberHapticFeedback2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(result, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, (Composer) startRestartGroup, 0);
                ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localLifecycleOwner2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) consume3;
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance = startRestartGroup.changedInstance(lifecycleOwner2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj232) {
                        DisposableEffectResult FlashBetGameContent$lambda$17$lambda$16;
                        FlashBetGameContent$lambda$17$lambda$16 = FlashBetGameContentKt.FlashBetGameContent$lambda$17$lambda$16(LifecycleOwner.this, (DisposableEffectScope) obj232);
                        return FlashBetGameContent$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(lifecycleOwner2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, (Composer) startRestartGroup, 0);
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context applicationContext2 = ((Context) consume22).getApplicationContext();
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance2 = startRestartGroup.changedInstance(applicationContext2);
                Object rememberedValue62 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                Function0 function0152 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FlashBetGameContent$lambda$19$lambda$18;
                        FlashBetGameContent$lambda$19$lambda$18 = FlashBetGameContentKt.FlashBetGameContent$lambda$19$lambda$18(applicationContext2);
                        return FlashBetGameContent$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(function0152);
                obj = function0152;
                final Function0 function0162 = (Function0) obj;
                startRestartGroup.endReplaceGroup();
                ScrollState rememberScrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                Function0<Unit> function0172 = function013;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash10);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                float f62 = 4;
                Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState2, false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f62));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN43);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically3, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                float f72 = 24;
                Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72));
                startRestartGroup.startReplaceGroup(-1633490746);
                int i252 = 3670016 & i3;
                changed5 = startRestartGroup.changed(function0162) | (i252 != 1048576);
                Object rememberedValue72 = startRestartGroup.rememberedValue();
                if (!changed5) {
                }
                Function0 function0182 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                        FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20(Function0.this, onBackClick);
                        return FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(function0182);
                obj2 = function0182;
                startRestartGroup.endReplaceGroup();
                int i262 = i3;
                ImageKt.Image(painterResource2, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs2, (Function0) obj2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, (Composer) startRestartGroup, 48, 120);
                str = categoryLogoUrl;
                if (str.length() == 0) {
                }
                MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, startRestartGroup, (i262 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 121);
                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72)), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f82 = 6;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f82)), startRestartGroup, 6);
                if (!FlashBetGameContent$lambda$2(collectAsState2)) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay(FlashBetGameContent$lambda$7(mutableState2), ZIndexModifierKt.zIndex(boxScopeInstance.matchParentSize(Modifier.INSTANCE), 40.0f), composer3, i21, i21);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                }
                function011 = function014;
                function012 = function08;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i3 |= i24;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            function03 = function0;
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            collectAsState = SnapshotStateKt.collectAsState(controller.getSession(), null, startRestartGroup, 0, 1);
            collectAsState2 = SnapshotStateKt.collectAsState(controller.getLoading(), null, startRestartGroup, 0, 1);
            State collectAsState322 = SnapshotStateKt.collectAsState(controller.getSubmitLoading(), null, startRestartGroup, 0, 1);
            State collectAsState422 = SnapshotStateKt.collectAsState(controller.getSelectedAnswerId(), null, startRestartGroup, 0, 1);
            State collectAsState522 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
            FlashBetGameSessionDto FlashBetGameContent$lambda$152 = FlashBetGameContent$lambda$1(collectAsState);
            if (FlashBetGameContent$lambda$152 == null) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(id);
            Object rememberedValue472 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default);
            mutableState = (MutableState) mutableStateOf$default;
            startRestartGroup.endReplaceGroup();
            FlashBetGameSessionDto FlashBetGameContent$lambda$1222 = FlashBetGameContent$lambda$1(collectAsState);
            if (FlashBetGameContent$lambda$1222 == null) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changed2 = startRestartGroup.changed(id2);
            Object rememberedValue522 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            i7 = 0;
            mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
            startRestartGroup.updateRememberedValue(mutableIntStateOf);
            MutableIntState mutableIntState72 = (MutableIntState) mutableIntStateOf;
            startRestartGroup.endReplaceGroup();
            Function1<HapticFeedbackType, Unit> rememberHapticFeedback22 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, i7);
            FlashBetEventFlash FlashBetGameContent$lambda$722 = FlashBetGameContent$lambda$7(mutableState);
            if (FlashBetGameContent$lambda$722 == null) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changed3 = startRestartGroup.changed(mutableState);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue = new FlashBetGameContentKt$FlashBetGameContent$1$1(mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, (Composer) startRestartGroup, 0);
            FlashBetGameSessionDto FlashBetGameContent$lambda$1322 = FlashBetGameContent$lambda$1(collectAsState);
            if (FlashBetGameContent$lambda$1322 == null) {
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            changed4 = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(rememberHapticFeedback22);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue2 = new FlashBetGameContentKt$FlashBetGameContent$2$1(collectAsState, rememberHapticFeedback22, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(result, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, (Composer) startRestartGroup, 0);
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner22 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localLifecycleOwner22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LifecycleOwner lifecycleOwner22 = (LifecycleOwner) consume32;
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(lifecycleOwner22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj232) {
                    DisposableEffectResult FlashBetGameContent$lambda$17$lambda$16;
                    FlashBetGameContent$lambda$17$lambda$16 = FlashBetGameContentKt.FlashBetGameContent$lambda$17$lambda$16(LifecycleOwner.this, (DisposableEffectScope) obj232);
                    return FlashBetGameContent$lambda$17$lambda$16;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycleOwner22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, (Composer) startRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localContext22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context applicationContext22 = ((Context) consume222).getApplicationContext();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance2 = startRestartGroup.changedInstance(applicationContext22);
            Object rememberedValue622 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            Function0 function01522 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FlashBetGameContent$lambda$19$lambda$18;
                    FlashBetGameContent$lambda$19$lambda$18 = FlashBetGameContentKt.FlashBetGameContent$lambda$19$lambda$18(applicationContext22);
                    return FlashBetGameContent$lambda$19$lambda$18;
                }
            };
            startRestartGroup.updateRememberedValue(function01522);
            obj = function01522;
            final Function0 function01622 = (Function0) obj;
            startRestartGroup.endReplaceGroup();
            ScrollState rememberScrollState22 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Function0<Unit> function01722 = function013;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap102 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier102 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            Function0<ComposeUiNode> constructor102 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap102, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash102 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash102);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier102, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            float f622 = 4;
            Modifier m1517paddingVpY3zN432 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState22, false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f622));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy52 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN432);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance52 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween32 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(spaceBetween32, centerVertically32, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default32);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
            Painter painterResource22 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
            float f722 = 24;
            Modifier m1563size3ABfNKs22 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f722));
            startRestartGroup.startReplaceGroup(-1633490746);
            int i2522 = 3670016 & i3;
            changed5 = startRestartGroup.changed(function01622) | (i2522 != 1048576);
            Object rememberedValue722 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            Function0 function01822 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                    FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20(Function0.this, onBackClick);
                    return FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                }
            };
            startRestartGroup.updateRememberedValue(function01822);
            obj2 = function01822;
            startRestartGroup.endReplaceGroup();
            int i2622 = i3;
            ImageKt.Image(painterResource22, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs22, (Function0) obj2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, (Composer) startRestartGroup, 48, 120);
            str = categoryLogoUrl;
            if (str.length() == 0) {
            }
            MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, startRestartGroup, (i2622 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 121);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f722)), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f822 = 6;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f822)), startRestartGroup, 6);
            if (!FlashBetGameContent$lambda$2(collectAsState2)) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay(FlashBetGameContent$lambda$7(mutableState2), ZIndexModifierKt.zIndex(boxScopeInstance.matchParentSize(Modifier.INSTANCE), 40.0f), composer3, i21, i21);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            function011 = function014;
            function012 = function08;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i3 |= i4;
        if ((i2 & 64) != 0) {
        }
        i3 |= i24;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        function03 = function0;
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        collectAsState = SnapshotStateKt.collectAsState(controller.getSession(), null, startRestartGroup, 0, 1);
        collectAsState2 = SnapshotStateKt.collectAsState(controller.getLoading(), null, startRestartGroup, 0, 1);
        State collectAsState3222 = SnapshotStateKt.collectAsState(controller.getSubmitLoading(), null, startRestartGroup, 0, 1);
        State collectAsState4222 = SnapshotStateKt.collectAsState(controller.getSelectedAnswerId(), null, startRestartGroup, 0, 1);
        State collectAsState5222 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
        FlashBetGameSessionDto FlashBetGameContent$lambda$1522 = FlashBetGameContent$lambda$1(collectAsState);
        if (FlashBetGameContent$lambda$1522 == null) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(id);
        Object rememberedValue4722 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default);
        mutableState = (MutableState) mutableStateOf$default;
        startRestartGroup.endReplaceGroup();
        FlashBetGameSessionDto FlashBetGameContent$lambda$12222 = FlashBetGameContent$lambda$1(collectAsState);
        if (FlashBetGameContent$lambda$12222 == null) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed2 = startRestartGroup.changed(id2);
        Object rememberedValue5222 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        i7 = 0;
        mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
        startRestartGroup.updateRememberedValue(mutableIntStateOf);
        MutableIntState mutableIntState722 = (MutableIntState) mutableIntStateOf;
        startRestartGroup.endReplaceGroup();
        Function1<HapticFeedbackType, Unit> rememberHapticFeedback222 = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, i7);
        FlashBetEventFlash FlashBetGameContent$lambda$7222 = FlashBetGameContent$lambda$7(mutableState);
        if (FlashBetGameContent$lambda$7222 == null) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changed3 = startRestartGroup.changed(mutableState);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue = new FlashBetGameContentKt$FlashBetGameContent$1$1(mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, (Composer) startRestartGroup, 0);
        FlashBetGameSessionDto FlashBetGameContent$lambda$13222 = FlashBetGameContent$lambda$1(collectAsState);
        if (FlashBetGameContent$lambda$13222 == null) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        changed4 = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(rememberHapticFeedback222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue2 = new FlashBetGameContentKt$FlashBetGameContent$2$1(collectAsState, rememberHapticFeedback222, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(result, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, (Composer) startRestartGroup, 0);
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner222 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localLifecycleOwner222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LifecycleOwner lifecycleOwner222 = (LifecycleOwner) consume322;
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(lifecycleOwner222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj232) {
                DisposableEffectResult FlashBetGameContent$lambda$17$lambda$16;
                FlashBetGameContent$lambda$17$lambda$16 = FlashBetGameContentKt.FlashBetGameContent$lambda$17$lambda$16(LifecycleOwner.this, (DisposableEffectScope) obj232);
                return FlashBetGameContent$lambda$17$lambda$16;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(lifecycleOwner222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, (Composer) startRestartGroup, 0);
        ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localContext222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context applicationContext222 = ((Context) consume2222).getApplicationContext();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(applicationContext222);
        Object rememberedValue6222 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        Function0 function015222 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit FlashBetGameContent$lambda$19$lambda$18;
                FlashBetGameContent$lambda$19$lambda$18 = FlashBetGameContentKt.FlashBetGameContent$lambda$19$lambda$18(applicationContext222);
                return FlashBetGameContent$lambda$19$lambda$18;
            }
        };
        startRestartGroup.updateRememberedValue(function015222);
        obj = function015222;
        final Function0 function016222 = (Function0) obj;
        startRestartGroup.endReplaceGroup();
        ScrollState rememberScrollState222 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Function0<Unit> function017222 = function013;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap1022 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier1022 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
        Function0<ComposeUiNode> constructor1022 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap1022, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash1022 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash1022);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier1022, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        float f6222 = 4;
        Modifier m1517paddingVpY3zN4322 = PaddingKt.m1517paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState222, false, null, false, 14, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f6222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy522 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4322);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance522 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween322 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy422 = RowKt.rowMeasurePolicy(spaceBetween322, centerVertically322, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default322);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
        Painter painterResource222 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
        float f7222 = 24;
        Modifier m1563size3ABfNKs222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7222));
        startRestartGroup.startReplaceGroup(-1633490746);
        int i25222 = 3670016 & i3;
        changed5 = startRestartGroup.changed(function016222) | (i25222 != 1048576);
        Object rememberedValue7222 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        Function0 function018222 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
                FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20(Function0.this, onBackClick);
                return FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20;
            }
        };
        startRestartGroup.updateRememberedValue(function018222);
        obj2 = function018222;
        startRestartGroup.endReplaceGroup();
        int i26222 = i3;
        ImageKt.Image(painterResource222, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs222, (Function0) obj2, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, (Composer) startRestartGroup, 48, 120);
        str = categoryLogoUrl;
        if (str.length() == 0) {
        }
        MatchLeagueItemKt.MatchLeagueItem(null, str, categoryName, false, false, false, null, startRestartGroup, (i26222 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH, 121);
        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7222)), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f8222 = 6;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f8222)), startRestartGroup, 6);
        if (!FlashBetGameContent$lambda$2(collectAsState2)) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        FlashBetCardFlashOverlayKt.FlashBetEventFlashOverlay(FlashBetGameContent$lambda$7(mutableState2), ZIndexModifierKt.zIndex(boxScopeInstance.matchParentSize(Modifier.INSTANCE), 40.0f), composer3, i21, i21);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        function011 = function014;
        function012 = function08;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlashBetEventFlash FlashBetGameContent$lambda$7(MutableState<FlashBetEventFlash> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$10(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult FlashBetGameContent$lambda$17$lambda$16(final LifecycleOwner lifecycleOwner, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda17
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                FlashBetGameContentKt.FlashBetGameContent$lambda$17$lambda$16$lambda$14(lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$lambda$17$lambda$16$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$17$lambda$16$lambda$14(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            FlashBetGameAudio.INSTANCE.onPause();
        } else {
            if (i != 2) {
                return;
            }
            FlashBetGameAudio.INSTANCE.onResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$19$lambda$18(Context context) {
        FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
        Intrinsics.checkNotNull(context);
        flashBetUiSoundEffect.playClick(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$23$lambda$21$lambda$20(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$26$lambda$25(Function0 function0, FlashBetGameController flashBetGameController, String str) {
        function0.invoke();
        flashBetGameController.clearError();
        FlashBetGameController.loadSession$default(flashBetGameController, str, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$29$lambda$28$lambda$27(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$36$lambda$35(Function0 function0, Function0 function02, Function0 function03) {
        function0.invoke();
        if (function02 == null) {
            function02 = function03;
        }
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$39(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$42(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$44(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$45(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51(Context context, MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(mutableState)) {
            FlashBetMatchCrowdSoundEffect flashBetMatchCrowdSoundEffect = FlashBetMatchCrowdSoundEffect.INSTANCE;
            Intrinsics.checkNotNull(context);
            flashBetMatchCrowdSoundEffect.start(context);
            return new DisposableEffectResult() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    FlashBetMatchCrowdSoundEffect.INSTANCE.stop();
                }
            };
        }
        return new DisposableEffectResult() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$52$lambda$51$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$56(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$63(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$66(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final FlashBetGoalSide FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$72(MutableState<FlashBetGoalSide> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$77(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$78(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$83(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$84(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$87(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$88(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$91(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$96(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$98(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$99(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$106$lambda$105(Context context, int i) {
        FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
        Intrinsics.checkNotNull(context);
        flashBetUiSoundEffect.playQuestionTick(context, i <= 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103(FlashBetGameController flashBetGameController, String str, State state, MutableState mutableState) {
        if (FlashBetGameContent$lambda$4(state) != null) {
            flashBetGameController.submitAnswer(str, new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103$lambda$102;
                    FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103$lambda$102 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103$lambda$102((FlashBetGameSessionDto) obj);
                    return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103$lambda$102;
                }
            });
        } else {
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$96(mutableState, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$109$lambda$107$lambda$104$lambda$103$lambda$102(FlashBetGameSessionDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$111$lambda$110(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113(Function0 function0, FlashBetGameController flashBetGameController, String str) {
        function0.invoke();
        flashBetGameController.submitAnswer(str, new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112;
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112((FlashBetGameSessionDto) obj);
                return FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113$lambda$112(FlashBetGameSessionDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final void FlashBetGameResultsListContent(final FlashBetGameSessionDto flashBetGameSessionDto, final String str, Function0<Unit> function0, Composer composer, final int i) {
        String stringResource;
        Composer composer2;
        String str2;
        Object obj;
        float f;
        int i2;
        int i3;
        final Function0<Unit> function02;
        Composer startRestartGroup = composer.startRestartGroup(297656118);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(flashBetGameSessionDto) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i4;
        if ((i5 & Opcodes.I2S) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(297656118, i5, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetGameResultsListContent (FlashBetGameContent.kt:712)");
            }
            String result = flashBetGameSessionDto.getResult();
            if (Intrinsics.areEqual(result, "Won")) {
                startRestartGroup.startReplaceGroup(-1715272509);
                stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_result_won, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(result, "Lost")) {
                startRestartGroup.startReplaceGroup(-1715270460);
                stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_result_lost, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1715268441);
                stringResource = StringResources_androidKt.stringResource(R.string.flash_bet_result_expired, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            }
            String str3 = stringResource;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            List<FlashBetGameScoreUpdateDto> scores = flashBetGameSessionDto.getScores();
            FlashBetGameTopCard(flashBetGameSessionDto, str, true, "90'", null, scores != null ? (FlashBetGameScoreUpdateDto) CollectionsKt.lastOrNull((List) scores) : null, 0, null, null, 0.0f, startRestartGroup, (i5 & 14) | 3456 | (i5 & 112), 976);
            float f2 = 6;
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, 6);
            String matchStartDate = flashBetGameSessionDto.getMatchStartDate();
            if (matchStartDate == null) {
                FlashBetGameMatchDetailsDto matchDetails = flashBetGameSessionDto.getMatchDetails();
                matchStartDate = matchDetails != null ? matchDetails.getStartDate() : null;
            }
            composer2.startReplaceGroup(5004770);
            boolean changed = composer2.changed(matchStartDate);
            Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                String str4 = matchStartDate;
                if (str4 == null || StringsKt.isBlank(str4)) {
                    str2 = null;
                } else {
                    String formattedDateWithYear = UiExtensionsKt.getFormattedDateWithYear(matchStartDate);
                    if (!StringsKt.isBlank(formattedDateWithYear)) {
                        matchStartDate = formattedDateWithYear;
                    }
                    str2 = matchStartDate;
                }
                composer2.updateRememberedValue(str2);
                rememberedValue = str2;
            }
            String str5 = (String) rememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1426086664);
            if (str5 != null) {
                obj = null;
                f = 0.0f;
                i2 = 1;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_game_took_place_on, new Object[]{str5}, composer2, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 130448);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), composer2, 6);
            } else {
                obj = null;
                f = 0.0f;
                i2 = 1;
            }
            composer2.endReplaceGroup();
            TextKt.m2642Text4IGK_g(str3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, obj), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), composer2, 6);
            List<FlashBetGameUserAnswerDto> userAnswers = flashBetGameSessionDto.getUserAnswers();
            composer2.startReplaceGroup(1426114266);
            int i6 = 8;
            if (userAnswers == null) {
                i3 = 8;
            } else {
                for (FlashBetGameUserAnswerDto flashBetGameUserAnswerDto : userAnswers) {
                    int i7 = i6;
                    FlashBetDetailsDialogKt.FlashBetDetailsBetItem(flashBetGameUserAnswerDto.getQuestion(), flashBetGameUserAnswerDto.getAnswer(), flashBetGameUserAnswerDto.getCoefficient(), flashBetGameUserAnswerDto.isCorrect(), true, composer2, 24576);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i7)), composer2, 6);
                    i6 = i7;
                }
                i3 = i6;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            float f3 = i3;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_buy_in, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getMedium(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130962);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer2, 6);
            TextKt.m2642Text4IGK_g(String.valueOf(flashBetGameSessionDto.getBetAmount()), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBold(), ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130962);
            int i8 = i2;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer2, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), composer2, 6);
            composer2.startReplaceGroup(1426157809);
            if (flashBetGameSessionDto.getReturnAmount() > 0) {
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_return_amount, new Object[]{Long.valueOf(flashBetGameSessionDto.getReturnAmount())}, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer2, 6);
            }
            composer2.endReplaceGroup();
            function02 = function0;
            CommonButtonKt.m12915CommonButtonUPEs2M4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i8, null), true, StringResources_androidKt.stringResource(R.string.flash_bet_play_again, composer2, 6), true, false, false, function0, false, false, false, false, false, null, null, true, false, null, null, null, null, null, composer2, (3670016 & (i5 << 12)) | 3126, 24576, 0, 2080688);
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
            function02 = function0;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit FlashBetGameResultsListContent$lambda$125;
                    FlashBetGameResultsListContent$lambda$125 = FlashBetGameContentKt.FlashBetGameResultsListContent$lambda$125(FlashBetGameSessionDto.this, str, function02, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return FlashBetGameResultsListContent$lambda$125;
                }
            });
        }
    }

    private static final void FlashBetPastQuestionRow(final String str, final String str2, final Double d, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2047570705);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2047570705, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetPastQuestionRow (FlashBetGameContent.kt:817)");
            }
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
            TextKt.m2642Text4IGK_g(str, (Modifier) null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getMedium(), ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 199680, 0, 130962);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(2)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i3 >> 3)) | 199680, 0, 131026);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlashBetPastQuestionRow$lambda$127;
                    FlashBetPastQuestionRow$lambda$127 = FlashBetGameContentKt.FlashBetPastQuestionRow$lambda$127(str, str2, d, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlashBetPastQuestionRow$lambda$127;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FlashBetLiveEventsTicker(final List<FlashBetGameEventDto> list, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final List sortedWith;
        Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1692986755);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1692986755, i4, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetLiveEventsTicker (FlashBetGameContent.kt:845)");
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) obj;
                    if (flashBetGameEventDto.getMinute() <= i && !StringsKt.isBlank(flashBetGameEventDto.getDescription()) && !FlashBetEventFormattingKt.shouldHideFlashBetEventFromTicker(flashBetGameEventDto)) {
                        arrayList.add(obj);
                    }
                }
                sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetLiveEventsTicker$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((FlashBetGameEventDto) t2).getMinute()), Integer.valueOf(((FlashBetGameEventDto) t).getMinute()));
                    }
                });
                if (!sortedWith.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier5 = modifier4;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit FlashBetLiveEventsTicker$lambda$130;
                                FlashBetLiveEventsTicker$lambda$130 = FlashBetGameContentKt.FlashBetLiveEventsTicker$lambda$130(list, i, modifier5, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                return FlashBetLiveEventsTicker$lambda$130;
                            }
                        });
                        return;
                    }
                    return;
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                modifier3 = modifier4;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_live, startRestartGroup, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 12782592, 0, 130898);
                float f = 4;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
                Modifier m1551heightInVpY3zN4$default = SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(160), 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                startRestartGroup.startReplaceGroup(5004770);
                boolean changedInstance = startRestartGroup.changedInstance(sortedWith);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135;
                            FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135 = FlashBetGameContentKt.FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135(sortedWith, (LazyListScope) obj2);
                            return FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(m1551heightInVpY3zN4$default, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24582, 494);
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
                modifier3 = modifier2;
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                final Modifier modifier6 = modifier3;
                endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit FlashBetLiveEventsTicker$lambda$138;
                        FlashBetLiveEventsTicker$lambda$138 = FlashBetGameContentKt.FlashBetLiveEventsTicker$lambda$138(list, i, modifier6, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                        return FlashBetLiveEventsTicker$lambda$138;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r0.hasNext()) {
        }
        sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetLiveEventsTicker$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((FlashBetGameEventDto) t2).getMinute()), Integer.valueOf(((FlashBetGameEventDto) t).getMinute()));
            }
        });
        if (!sortedWith.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135(final List list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$lambda$131;
                FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$lambda$131 = FlashBetGameContentKt.FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$lambda$131(((Integer) obj).intValue(), (FlashBetGameEventDto) obj2);
                return FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$lambda$131;
            }
        };
        LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                long m5167copywmQWz5c$default;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) list.get(i);
                composer.startReplaceGroup(1804429924);
                boolean equals = StringsKt.equals(flashBetGameEventDto.getSource(), "home", true);
                FlashBetEventKind resolveFlashBetEventKind = FlashBetEventKindKt.resolveFlashBetEventKind(flashBetGameEventDto.getEventType(), flashBetGameEventDto.getDescription());
                boolean isMajorTickerEvent = FlashBetEventKindKt.isMajorTickerEvent(resolveFlashBetEventKind);
                final float coerceAtLeast = RangesKt.coerceAtLeast(1.0f - (i * 0.12f), 0.35f);
                long tickerDotColor = FlashBetEventKindKt.tickerDotColor(resolveFlashBetEventKind, equals);
                String formatFlashBetEventTickerText = FlashBetEventFormattingKt.formatFlashBetEventTickerText(flashBetGameEventDto);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(5004770);
                boolean changed = composer.changed(coerceAtLeast);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetLiveEventsTicker$2$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayer) {
                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.setAlpha(coerceAtLeast);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(fillMaxWidth$default, (Function1) rememberedValue), 0.0f, Dp.m7774constructorimpl(2), 1, null);
                Alignment.Vertical top = Alignment.INSTANCE.getTop();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_event_minute, new Object[]{Integer.valueOf(flashBetGameEventDto.getMinute())}, composer, 6), SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199728, 0, 131024);
                float f = 5;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(8), 0.0f, 9, null);
                if (!isMajorTickerEvent) {
                    f = 4;
                }
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1563size3ABfNKs(m1520paddingqDBjuR0$default, Dp.m7774constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50)), tickerDotColor, null, 2, null), composer, 0);
                if (isMajorTickerEvent) {
                    m5167copywmQWz5c$default = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                } else {
                    m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j = m5167copywmQWz5c$default;
                long sp = TextUnitKt.getSp(isMajorTickerEvent ? 14 : 13);
                FontWeight.Companion companion = FontWeight.INSTANCE;
                TextKt.m2642Text4IGK_g(formatFlashBetEventTickerText, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), j, sp, (FontStyle) null, isMajorTickerEvent ? companion.getSemiBold() : companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131024);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FlashBetLiveEventsTicker$lambda$137$lambda$136$lambda$135$lambda$131(int i, FlashBetGameEventDto event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return FlashBetEventFormattingKt.flashBetEventTickerKey(i, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FlashBetGameTopCard(final FlashBetGameSessionDto flashBetGameSessionDto, final String str, final boolean z, final String str2, String str3, FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto, int i, FlashBetGoalSide flashBetGoalSide, Integer num, float f, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        String str4;
        int i6;
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto2;
        int i7;
        int i8;
        int i9;
        int i10;
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto3;
        FlashBetGameMatchTeamDetailsDto teamDetails;
        boolean z2;
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto4;
        float f2;
        float f3;
        int currentCompositeKeyHash;
        Integer num2;
        FlashBetGoalSide flashBetGoalSide2;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        int i11;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        float f4;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        int currentCompositeKeyHash6;
        Composer m4610constructorimpl6;
        int i12;
        int currentCompositeKeyHash7;
        Composer m4610constructorimpl7;
        final FlashBetGoalSide flashBetGoalSide3;
        final String str5;
        final int i13;
        final FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto5;
        final float f5;
        final Integer num3;
        String awayTeam;
        String homeTeamLogoUrl;
        String homeTeam;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1291404808);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(flashBetGameSessionDto) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i5 = i3 & 16;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    str4 = str3;
                    i4 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                    i6 = i3 & 32;
                    if (i6 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i2) == 0) {
                        flashBetGameScoreUpdateDto2 = flashBetGameScoreUpdateDto;
                        i4 |= startRestartGroup.changed(flashBetGameScoreUpdateDto2) ? 131072 : 65536;
                        i7 = i3 & 64;
                        if (i7 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                        }
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(flashBetGoalSide == null ? -1 : flashBetGoalSide.ordinal()) ? 8388608 : 4194304;
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(num) ? 67108864 : 33554432;
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(f) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        if ((i4 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                            if (i5 != 0) {
                                str4 = null;
                            }
                            flashBetGameScoreUpdateDto3 = i6 != 0 ? null : flashBetGameScoreUpdateDto2;
                            int i14 = i7 != 0 ? 0 : i;
                            FlashBetGoalSide flashBetGoalSide4 = i8 != 0 ? null : flashBetGoalSide;
                            Integer num4 = i9 != 0 ? null : num;
                            float f6 = i10 != 0 ? 0.0f : f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1291404808, i4, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetGameTopCard (FlashBetGameContent.kt:930)");
                            }
                            long j = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                            teamDetails = flashBetGameSessionDto.getTeamDetails();
                            z2 = (z || teamDetails == null) ? false : true;
                            Integer intOrNull = StringsKt.toIntOrNull(str);
                            int intValue = intOrNull != null ? intOrNull.intValue() : 0;
                            String str6 = (teamDetails != null || (homeTeam = teamDetails.getHomeTeam()) == null) ? "" : homeTeam;
                            String str7 = (teamDetails != null || (homeTeamLogoUrl = teamDetails.getHomeTeamLogoUrl()) == null) ? "" : homeTeamLogoUrl;
                            String str8 = (teamDetails != null || (awayTeam = teamDetails.getAwayTeam()) == null) ? "" : awayTeam;
                            if (teamDetails != null || (r5 = teamDetails.getAwayTeamLogoUrl()) == null) {
                                String str9 = "";
                            }
                            if (flashBetGameScoreUpdateDto3 == null) {
                                List<FlashBetGameScoreUpdateDto> scores = flashBetGameSessionDto.getScores();
                                FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto6 = scores != null ? (FlashBetGameScoreUpdateDto) CollectionsKt.lastOrNull((List) scores) : null;
                                flashBetGameScoreUpdateDto4 = flashBetGameScoreUpdateDto6 == null ? new FlashBetGameScoreUpdateDto(0, 0, 0) : flashBetGameScoreUpdateDto6;
                            } else {
                                flashBetGameScoreUpdateDto4 = flashBetGameScoreUpdateDto3;
                            }
                            String str10 = str9;
                            f2 = 4;
                            float f7 = f2 * 0.8f;
                            float f8 = 8;
                            FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto7 = flashBetGameScoreUpdateDto3;
                            float f9 = 1;
                            Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f7), 7, null), j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), Dp.m7774constructorimpl(f9), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8)));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            f3 = f6;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            num2 = num4;
                            flashBetGoalSide2 = flashBetGoalSide4;
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
                            float f10 = f8 * 0.8f;
                            float f11 = 12;
                            Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f11), Dp.m7774constructorimpl(f10), Dp.m7774constructorimpl(f11), 0.0f, 8, null), j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), Dp.m7774constructorimpl(f9), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8)));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            i11 = i4;
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
                            ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(intValue), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f9)), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                            Modifier m1038borderziNgDLE3 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), Dp.m7774constructorimpl(f9), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8)));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE3);
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
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f11), Dp.m7774constructorimpl(f10));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            f4 = 6;
                            float f12 = f4 * 0.8f;
                            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f11), 0.0f, 2, null), j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), Dp.m7774constructorimpl(f9), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8))), Dp.m7774constructorimpl(f11), Dp.m7774constructorimpl(f12));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
                            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                            m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(1725962418);
                            if (str4 == null) {
                                i12 = 1;
                            } else {
                                i12 = 1;
                                TextKt.m2642Text4IGK_g(str4, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m7774constructorimpl(f12), 0.0f, 11, null), Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11 * 0.8f), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 0, 131024);
                                Unit unit = Unit.INSTANCE;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clock, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14 * 0.8f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7)), startRestartGroup, 6);
                            TextKt.m2642Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(f11 * 0.8f), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i11 >> 9) & 14) | 199680, 0, 131026);
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
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                            m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                            }
                            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            TeamsRowKt.m13615TeamsRowUiefj4(null, z2 ? str6 : "", z2 ? str8 : "", z2 ? str7 : "", z2 ? str10 : "", String.valueOf(flashBetGameScoreUpdateDto4.getScoreHome()), String.valueOf(flashBetGameScoreUpdateDto4.getScoreAway()), null, null, null, null, true, z2, false, true, flashBetGoalSide2 == FlashBetGoalSide.HOME ? i12 : 0, flashBetGoalSide2 == FlashBetGoalSide.AWAY ? i12 : 0, i14, null, null, 0.0f, 0.0f, false, startRestartGroup, 0, ((i11 << 3) & 29360128) | 24624, 0, 8136577);
                            startRestartGroup.startReplaceGroup(1588539759);
                            if (flashBetGoalSide2 != null) {
                                FlashBetGoalCelebrationKt.FlashBetGoalCelebrationOverlay(i14, flashBetGoalSide2, boxScopeInstance3.matchParentSize(Modifier.INSTANCE), startRestartGroup, (i11 >> 18) & 14, 0);
                                Unit unit3 = Unit.INSTANCE;
                                Unit unit4 = Unit.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(-35558728);
                            if (z2 && num2 != null) {
                                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                                int intValue2 = num2.intValue();
                                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null);
                                int i15 = i11 >> 24;
                                FlashBetMomentumBarKt.FlashBetMomentumBar(intValue2, f3, m1518paddingVpY3zN4$default, startRestartGroup, (i15 & 112) | (i15 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            }
                            startRestartGroup.endReplaceGroup();
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
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            flashBetGoalSide3 = flashBetGoalSide2;
                            str5 = str4;
                            i13 = i14;
                            flashBetGameScoreUpdateDto5 = flashBetGameScoreUpdateDto7;
                            f5 = f3;
                            num3 = num2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i13 = i;
                            flashBetGoalSide3 = flashBetGoalSide;
                            num3 = num;
                            str5 = str4;
                            flashBetGameScoreUpdateDto5 = flashBetGameScoreUpdateDto2;
                            f5 = f;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit FlashBetGameTopCard$lambda$148;
                                    FlashBetGameTopCard$lambda$148 = FlashBetGameContentKt.FlashBetGameTopCard$lambda$148(FlashBetGameSessionDto.this, str, z, str2, str5, flashBetGameScoreUpdateDto5, i13, flashBetGoalSide3, num3, f5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return FlashBetGameTopCard$lambda$148;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    flashBetGameScoreUpdateDto2 = flashBetGameScoreUpdateDto;
                    i7 = i3 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
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
                    long j2 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                    teamDetails = flashBetGameSessionDto.getTeamDetails();
                    if (z) {
                    }
                    Integer intOrNull2 = StringsKt.toIntOrNull(str);
                    if (intOrNull2 != null) {
                    }
                    if (teamDetails != null) {
                    }
                    if (teamDetails != null) {
                    }
                    if (teamDetails != null) {
                    }
                    if (teamDetails != null) {
                    }
                    String str92 = "";
                    if (flashBetGameScoreUpdateDto3 == null) {
                    }
                    String str102 = str92;
                    f2 = 4;
                    float f72 = f2 * 0.8f;
                    float f82 = 8;
                    FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto72 = flashBetGameScoreUpdateDto3;
                    float f92 = 1;
                    Modifier m1038borderziNgDLE4 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f72), 7, null), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82))), Dp.m7774constructorimpl(f92), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82)));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    f3 = f6;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE4);
                    Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                    num2 = num4;
                    flashBetGoalSide2 = flashBetGoalSide4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash8);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    float f102 = f82 * 0.8f;
                    float f112 = 12;
                    Modifier m1038borderziNgDLE22 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f112), Dp.m7774constructorimpl(f102), Dp.m7774constructorimpl(f112), 0.0f, 8, null), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82))), Dp.m7774constructorimpl(f92), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82)));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    i11 = i4;
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
                    ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(intValue), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f92)), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                    Modifier m1038borderziNgDLE32 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82))), Dp.m7774constructorimpl(f92), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82)));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE32);
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
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    Modifier m1517paddingVpY3zN43 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f112), Dp.m7774constructorimpl(f102));
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN43);
                    Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting()) {
                    }
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    f4 = 6;
                    float f122 = f4 * 0.8f;
                    Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f112), 0.0f, 2, null), j2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82))), Dp.m7774constructorimpl(f92), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82))), Dp.m7774constructorimpl(f112), Dp.m7774constructorimpl(f122));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
                    Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl5.getInserting()) {
                    }
                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                    Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl6.getInserting()) {
                    }
                    m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62);
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(1725962418);
                    if (str4 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clock, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14 * 0.8f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72)), startRestartGroup, 6);
                    TextKt.m2642Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(f112 * 0.8f), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i11 >> 9) & 14) | 199680, 0, 131026);
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
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl7.getInserting()) {
                    }
                    m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash72);
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                    TeamsRowKt.m13615TeamsRowUiefj4(null, z2 ? str6 : "", z2 ? str8 : "", z2 ? str7 : "", z2 ? str102 : "", String.valueOf(flashBetGameScoreUpdateDto4.getScoreHome()), String.valueOf(flashBetGameScoreUpdateDto4.getScoreAway()), null, null, null, null, true, z2, false, true, flashBetGoalSide2 == FlashBetGoalSide.HOME ? i12 : 0, flashBetGoalSide2 == FlashBetGoalSide.AWAY ? i12 : 0, i14, null, null, 0.0f, 0.0f, false, startRestartGroup, 0, ((i11 << 3) & 29360128) | 24624, 0, 8136577);
                    startRestartGroup.startReplaceGroup(1588539759);
                    if (flashBetGoalSide2 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(-35558728);
                    if (z2) {
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                        int intValue22 = num2.intValue();
                        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null), Dp.m7774constructorimpl(f2), 0.0f, 2, null);
                        int i152 = i11 >> 24;
                        FlashBetMomentumBarKt.FlashBetMomentumBar(intValue22, f3, m1518paddingVpY3zN4$default2, startRestartGroup, (i152 & 112) | (i152 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    }
                    startRestartGroup.endReplaceGroup();
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    flashBetGoalSide3 = flashBetGoalSide2;
                    str5 = str4;
                    i13 = i14;
                    flashBetGameScoreUpdateDto5 = flashBetGameScoreUpdateDto72;
                    f5 = f3;
                    num3 = num2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str4 = str3;
                i6 = i3 & 32;
                if (i6 == 0) {
                }
                flashBetGameScoreUpdateDto2 = flashBetGameScoreUpdateDto;
                i7 = i3 & 64;
                if (i7 != 0) {
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
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
                long j22 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                teamDetails = flashBetGameSessionDto.getTeamDetails();
                if (z) {
                }
                Integer intOrNull22 = StringsKt.toIntOrNull(str);
                if (intOrNull22 != null) {
                }
                if (teamDetails != null) {
                }
                if (teamDetails != null) {
                }
                if (teamDetails != null) {
                }
                if (teamDetails != null) {
                }
                String str922 = "";
                if (flashBetGameScoreUpdateDto3 == null) {
                }
                String str1022 = str922;
                f2 = 4;
                float f722 = f2 * 0.8f;
                float f822 = 8;
                FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto722 = flashBetGameScoreUpdateDto3;
                float f922 = 1;
                Modifier m1038borderziNgDLE42 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f722), 7, null), j22, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822))), Dp.m7774constructorimpl(f922), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy52 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                f3 = f6;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap82 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE42);
                Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
                num2 = num4;
                flashBetGoalSide2 = flashBetGoalSide4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash82);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                float f1022 = f822 * 0.8f;
                float f1122 = 12;
                Modifier m1038borderziNgDLE222 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f1122), Dp.m7774constructorimpl(f1022), Dp.m7774constructorimpl(f1122), 0.0f, 8, null), j22, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822))), Dp.m7774constructorimpl(f922), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                i11 = i4;
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
                ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(intValue), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f922)), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
                Modifier m1038borderziNgDLE322 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822))), Dp.m7774constructorimpl(f922), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE322);
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
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Modifier m1517paddingVpY3zN432 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f1122), Dp.m7774constructorimpl(f1022));
                Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN432);
                Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                f4 = 6;
                float f1222 = f4 * 0.8f;
                Modifier m1517paddingVpY3zN4222 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f1122), 0.0f, 2, null), j22, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822))), Dp.m7774constructorimpl(f922), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f822))), Dp.m7774constructorimpl(f1122), Dp.m7774constructorimpl(f1222));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4222);
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting()) {
                }
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion22 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl6.getInserting()) {
                }
                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash622);
                Updater.m4617setimpl(m4610constructorimpl6, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(1725962418);
                if (str4 == null) {
                }
                startRestartGroup.endReplaceGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clock, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14 * 0.8f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f722)), startRestartGroup, 6);
                TextKt.m2642Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(f1122 * 0.8f), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i11 >> 9) & 14) | 199680, 0, 131026);
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
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap722 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier722 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                Function0<ComposeUiNode> constructor722 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl7.getInserting()) {
                }
                m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash722);
                Updater.m4617setimpl(m4610constructorimpl7, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                TeamsRowKt.m13615TeamsRowUiefj4(null, z2 ? str6 : "", z2 ? str8 : "", z2 ? str7 : "", z2 ? str1022 : "", String.valueOf(flashBetGameScoreUpdateDto4.getScoreHome()), String.valueOf(flashBetGameScoreUpdateDto4.getScoreAway()), null, null, null, null, true, z2, false, true, flashBetGoalSide2 == FlashBetGoalSide.HOME ? i12 : 0, flashBetGoalSide2 == FlashBetGoalSide.AWAY ? i12 : 0, i14, null, null, 0.0f, 0.0f, false, startRestartGroup, 0, ((i11 << 3) & 29360128) | 24624, 0, 8136577);
                startRestartGroup.startReplaceGroup(1588539759);
                if (flashBetGoalSide2 != null) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-35558728);
                if (z2) {
                }
                startRestartGroup.endReplaceGroup();
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
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                flashBetGoalSide3 = flashBetGoalSide2;
                str5 = str4;
                i13 = i14;
                flashBetGameScoreUpdateDto5 = flashBetGameScoreUpdateDto722;
                f5 = f3;
                num3 = num2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            str4 = str3;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            flashBetGameScoreUpdateDto2 = flashBetGameScoreUpdateDto;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
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
            long j222 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
            teamDetails = flashBetGameSessionDto.getTeamDetails();
            if (z) {
            }
            Integer intOrNull222 = StringsKt.toIntOrNull(str);
            if (intOrNull222 != null) {
            }
            if (teamDetails != null) {
            }
            if (teamDetails != null) {
            }
            if (teamDetails != null) {
            }
            if (teamDetails != null) {
            }
            String str9222 = "";
            if (flashBetGameScoreUpdateDto3 == null) {
            }
            String str10222 = str9222;
            f2 = 4;
            float f7222 = f2 * 0.8f;
            float f8222 = 8;
            FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto7222 = flashBetGameScoreUpdateDto3;
            float f9222 = 1;
            Modifier m1038borderziNgDLE422 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f7222), 7, null), j222, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222))), Dp.m7774constructorimpl(f9222), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy522 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            f3 = f6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap822 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier822 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE422);
            Function0<ComposeUiNode> constructor822 = ComposeUiNode.INSTANCE.getConstructor();
            num2 = num4;
            flashBetGoalSide2 = flashBetGoalSide4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap822, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash822 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash822);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier822, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
            float f10222 = f8222 * 0.8f;
            float f11222 = 12;
            Modifier m1038borderziNgDLE2222 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f11222), Dp.m7774constructorimpl(f10222), Dp.m7774constructorimpl(f11222), 0.0f, 8, null), j222, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222))), Dp.m7774constructorimpl(f9222), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            i11 = i4;
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
            ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(intValue), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f9222)), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
            Modifier m1038borderziNgDLE3222 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222))), Dp.m7774constructorimpl(f9222), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE3222);
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
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Modifier m1517paddingVpY3zN4322 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f11222), Dp.m7774constructorimpl(f10222));
            Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4322);
            Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
            f4 = 6;
            float f12222 = f4 * 0.8f;
            Modifier m1517paddingVpY3zN42222 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f11222), 0.0f, 2, null), j222, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222))), Dp.m7774constructorimpl(f9222), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f8222))), Dp.m7774constructorimpl(f11222), Dp.m7774constructorimpl(f12222));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42222);
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5222);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion222 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
            Function0<ComposeUiNode> constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl6.getInserting()) {
            }
            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6222);
            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(1725962418);
            if (str4 == null) {
            }
            startRestartGroup.endReplaceGroup();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clock, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14 * 0.8f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f7222)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(f11222 * 0.8f), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i11 >> 9) & 14) | 199680, 0, 131026);
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
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy4222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
            Function0<ComposeUiNode> constructor7222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl7.getInserting()) {
            }
            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7222);
            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
            TeamsRowKt.m13615TeamsRowUiefj4(null, z2 ? str6 : "", z2 ? str8 : "", z2 ? str7 : "", z2 ? str10222 : "", String.valueOf(flashBetGameScoreUpdateDto4.getScoreHome()), String.valueOf(flashBetGameScoreUpdateDto4.getScoreAway()), null, null, null, null, true, z2, false, true, flashBetGoalSide2 == FlashBetGoalSide.HOME ? i12 : 0, flashBetGoalSide2 == FlashBetGoalSide.AWAY ? i12 : 0, i14, null, null, 0.0f, 0.0f, false, startRestartGroup, 0, ((i11 << 3) & 29360128) | 24624, 0, 8136577);
            startRestartGroup.startReplaceGroup(1588539759);
            if (flashBetGoalSide2 != null) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-35558728);
            if (z2) {
            }
            startRestartGroup.endReplaceGroup();
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            flashBetGoalSide3 = flashBetGoalSide2;
            str5 = str4;
            i13 = i14;
            flashBetGameScoreUpdateDto5 = flashBetGameScoreUpdateDto7222;
            f5 = f3;
            num3 = num2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        str4 = str3;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        flashBetGameScoreUpdateDto2 = flashBetGameScoreUpdateDto;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
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
        long j2222 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
        teamDetails = flashBetGameSessionDto.getTeamDetails();
        if (z) {
        }
        Integer intOrNull2222 = StringsKt.toIntOrNull(str);
        if (intOrNull2222 != null) {
        }
        if (teamDetails != null) {
        }
        if (teamDetails != null) {
        }
        if (teamDetails != null) {
        }
        if (teamDetails != null) {
        }
        String str92222 = "";
        if (flashBetGameScoreUpdateDto3 == null) {
        }
        String str102222 = str92222;
        f2 = 4;
        float f72222 = f2 * 0.8f;
        float f82222 = 8;
        FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto72222 = flashBetGameScoreUpdateDto3;
        float f92222 = 1;
        Modifier m1038borderziNgDLE4222 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f72222), 7, null), j2222, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222))), Dp.m7774constructorimpl(f92222), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy5222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        f3 = f6;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier8222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE4222);
        Function0<ComposeUiNode> constructor8222 = ComposeUiNode.INSTANCE.getConstructor();
        num2 = num4;
        flashBetGoalSide2 = flashBetGoalSide4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy5222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap8222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash8222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier8222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance4222 = BoxScopeInstance.INSTANCE;
        float f102222 = f82222 * 0.8f;
        float f112222 = 12;
        Modifier m1038borderziNgDLE22222 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f112222), Dp.m7774constructorimpl(f102222), Dp.m7774constructorimpl(f112222), 0.0f, 8, null), j2222, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222))), Dp.m7774constructorimpl(f92222), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        i11 = i4;
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
        ImageKt.Image(PainterResources_androidKt.painterResource(UiExtensionsKt.getBackgroundImageResource(intValue), startRestartGroup, 0), (String) null, PaddingKt.m1516padding3ABfNKs(BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), Dp.m7774constructorimpl(f92222)), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, 104);
        Modifier m1038borderziNgDLE32222 = BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222))), Dp.m7774constructorimpl(f92222), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1038borderziNgDLE32222);
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
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Modifier m1517paddingVpY3zN43222 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f112222), Dp.m7774constructorimpl(f102222));
        Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN43222);
        Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
        f4 = 6;
        float f122222 = f4 * 0.8f;
        Modifier m1517paddingVpY3zN422222 = PaddingKt.m1517paddingVpY3zN4(BorderKt.m1038borderziNgDLE(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f112222), 0.0f, 2, null), j2222, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222))), Dp.m7774constructorimpl(f92222), ComposeUtils.AppBrushPalette.BorderGoldTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f82222))), Dp.m7774constructorimpl(f112222), Dp.m7774constructorimpl(f122222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422222);
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52222);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap62222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier62222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
        Function0<ComposeUiNode> constructor62222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl6, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl6.getInserting()) {
        }
        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62222);
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1725962418);
        if (str4 == null) {
        }
        startRestartGroup.endReplaceGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clock, startRestartGroup, 6), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(14 * 0.8f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f72222)), startRestartGroup, 6);
        TextKt.m2642Text4IGK_g(str2, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(f112222 * 0.8f), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i11 >> 9) & 14) | 199680, 0, 131026);
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
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i12, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy42222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap72222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier72222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
        Function0<ComposeUiNode> constructor72222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy42222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap72222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl7.getInserting()) {
        }
        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash72222);
        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier72222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
        TeamsRowKt.m13615TeamsRowUiefj4(null, z2 ? str6 : "", z2 ? str8 : "", z2 ? str7 : "", z2 ? str102222 : "", String.valueOf(flashBetGameScoreUpdateDto4.getScoreHome()), String.valueOf(flashBetGameScoreUpdateDto4.getScoreAway()), null, null, null, null, true, z2, false, true, flashBetGoalSide2 == FlashBetGoalSide.HOME ? i12 : 0, flashBetGoalSide2 == FlashBetGoalSide.AWAY ? i12 : 0, i14, null, null, 0.0f, 0.0f, false, startRestartGroup, 0, ((i11 << 3) & 29360128) | 24624, 0, 8136577);
        startRestartGroup.startReplaceGroup(1588539759);
        if (flashBetGoalSide2 != null) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-35558728);
        if (z2) {
        }
        startRestartGroup.endReplaceGroup();
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        flashBetGoalSide3 = flashBetGoalSide2;
        str5 = str4;
        i13 = i14;
        flashBetGameScoreUpdateDto5 = flashBetGameScoreUpdateDto72222;
        f5 = f3;
        num3 = num2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlashBetGameSessionDto FlashBetGameContent$lambda$1(State<FlashBetGameSessionDto> state) {
        return state.getValue();
    }

    private static final boolean FlashBetGameContent$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetGameContent$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long FlashBetGameContent$lambda$4(State<Long> state) {
        return state.getValue();
    }

    private static final String FlashBetGameContent$lambda$5(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$48$lambda$47(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$48$lambda$47$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                FlashBetGameAudio.INSTANCE.onSessionEnd();
            }
        };
    }
}
