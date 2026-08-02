package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.games.flashbet.model.FlashBetGameEventDto;
import org.betup.games.flashbet.model.FlashBetGameMatchTeamDetailsDto;
import org.betup.games.flashbet.model.FlashBetGameScoreUpdateDto;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.FlashBetEventFormattingKt;
import org.betup.ui.fragment.flashbet.FlashBetEventKindKt;
import org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1", f = "FlashBetGameContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<FlashBetEventFlash> $activeEventFlash$delegate;
    final /* synthetic */ Context $appContext;
    final /* synthetic */ int $displayedMinute;
    final /* synthetic */ MutableIntState $eventFlashSeq$delegate;
    final /* synthetic */ MutableIntState $goalCelebrationKey$delegate;
    final /* synthetic */ MutableIntState $previousAwayScore$delegate;
    final /* synthetic */ MutableIntState $previousHomeScore$delegate;
    final /* synthetic */ FlashBetGameSessionDto $s;
    final /* synthetic */ FlashBetGameScoreUpdateDto $scoreAtMinute;
    final /* synthetic */ MutableState<FlashBetGoalSide> $scoringSide$delegate;
    final /* synthetic */ MutableState<Boolean> $showReveal$delegate;
    int label;

    /* compiled from: FlashBetGameContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashBetGoalSide.values().length];
            try {
                iArr[FlashBetGoalSide.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetGoalSide.AWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1(FlashBetGameScoreUpdateDto flashBetGameScoreUpdateDto, FlashBetGameSessionDto flashBetGameSessionDto, int i, Context context, MutableState<Boolean> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState<FlashBetGoalSide> mutableState2, MutableIntState mutableIntState3, MutableState<FlashBetEventFlash> mutableState3, MutableIntState mutableIntState4, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1> continuation) {
        super(2, continuation);
        this.$scoreAtMinute = flashBetGameScoreUpdateDto;
        this.$s = flashBetGameSessionDto;
        this.$displayedMinute = i;
        this.$appContext = context;
        this.$showReveal$delegate = mutableState;
        this.$previousHomeScore$delegate = mutableIntState;
        this.$previousAwayScore$delegate = mutableIntState2;
        this.$scoringSide$delegate = mutableState2;
        this.$eventFlashSeq$delegate = mutableIntState3;
        this.$activeEventFlash$delegate = mutableState3;
        this.$goalCelebrationKey$delegate = mutableIntState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1(this.$scoreAtMinute, this.$s, this.$displayedMinute, this.$appContext, this.$showReveal$delegate, this.$previousHomeScore$delegate, this.$previousAwayScore$delegate, this.$scoringSide$delegate, this.$eventFlashSeq$delegate, this.$activeEventFlash$delegate, this.$goalCelebrationKey$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38;
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$63;
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$66;
        FlashBetGoalSide flashBetGoalSide;
        int FlashBetGameContent$lambda$10;
        int FlashBetGameContent$lambda$102;
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69;
        String description;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(this.$showReveal$delegate);
            if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38) {
                int scoreHome = this.$scoreAtMinute.getScoreHome();
                int scoreAway = this.$scoreAtMinute.getScoreAway();
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$63 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$63(this.$previousHomeScore$delegate);
                boolean z = false;
                boolean z2 = scoreHome > FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$63;
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$66 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$66(this.$previousAwayScore$delegate);
                boolean z3 = scoreAway > FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$66;
                if (z2 || z3) {
                    if (z2) {
                        flashBetGoalSide = FlashBetGoalSide.HOME;
                    } else {
                        flashBetGoalSide = FlashBetGoalSide.AWAY;
                    }
                    List<FlashBetGameEventDto> events = this.$s.getEvents();
                    if (events == null) {
                        events = CollectionsKt.emptyList();
                    }
                    FlashBetGameEventDto findGoalEventForScoreChange = FlashBetEventFormattingKt.findGoalEventForScoreChange(events, this.$displayedMinute, flashBetGoalSide);
                    if (findGoalEventForScoreChange != null && FlashBetEventKindKt.isPenaltyGoalEvent(findGoalEventForScoreChange.getEventType(), findGoalEventForScoreChange.getDescription())) {
                        z = true;
                    }
                    if (z) {
                        FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
                        Context context = this.$appContext;
                        Intrinsics.checkNotNull(context);
                        flashBetUiSoundEffect.playPenalty(context);
                    }
                    FlashBetGoalSoundEffect flashBetGoalSoundEffect = FlashBetGoalSoundEffect.INSTANCE;
                    Context context2 = this.$appContext;
                    Intrinsics.checkNotNull(context2);
                    flashBetGoalSoundEffect.play(context2, z);
                    this.$scoringSide$delegate.setValue(flashBetGoalSide);
                    String str = null;
                    String parseGoalDescriptionLabel = (findGoalEventForScoreChange == null || (description = findGoalEventForScoreChange.getDescription()) == null) ? null : FlashBetEventFormattingKt.parseGoalDescriptionLabel(description);
                    if (parseGoalDescriptionLabel == null) {
                        parseGoalDescriptionLabel = "";
                    }
                    int i = WhenMappings.$EnumSwitchMapping$0[flashBetGoalSide.ordinal()];
                    if (i == 1) {
                        FlashBetGameMatchTeamDetailsDto teamDetails = this.$s.getTeamDetails();
                        if (teamDetails != null) {
                            str = teamDetails.getHomeTeamLogoUrl();
                        }
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FlashBetGameMatchTeamDetailsDto teamDetails2 = this.$s.getTeamDetails();
                        if (teamDetails2 != null) {
                            str = teamDetails2.getAwayTeamLogoUrl();
                        }
                    }
                    FlashBetGameContent$lambda$10 = FlashBetGameContentKt.FlashBetGameContent$lambda$10(this.$eventFlashSeq$delegate);
                    this.$eventFlashSeq$delegate.setIntValue(FlashBetGameContent$lambda$10 + 1);
                    MutableState<FlashBetEventFlash> mutableState = this.$activeEventFlash$delegate;
                    FlashBetEventFlashKind flashBetEventFlashKind = FlashBetEventFlashKind.GOAL;
                    FlashBetGameContent$lambda$102 = FlashBetGameContentKt.FlashBetGameContent$lambda$10(this.$eventFlashSeq$delegate);
                    mutableState.setValue(new FlashBetEventFlash(flashBetEventFlashKind, parseGoalDescriptionLabel, FlashBetGameContent$lambda$102, str));
                    FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69(this.$goalCelebrationKey$delegate);
                    this.$goalCelebrationKey$delegate.setIntValue(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69 + 1);
                }
                this.$previousHomeScore$delegate.setIntValue(scoreHome);
                this.$previousAwayScore$delegate.setIntValue(scoreAway);
                return Unit.INSTANCE;
            }
            this.$previousHomeScore$delegate.setIntValue(this.$scoreAtMinute.getScoreHome());
            this.$previousAwayScore$delegate.setIntValue(this.$scoreAtMinute.getScoreAway());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
