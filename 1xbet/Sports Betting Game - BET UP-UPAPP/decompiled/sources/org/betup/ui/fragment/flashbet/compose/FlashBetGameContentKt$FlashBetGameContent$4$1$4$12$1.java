package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.games.flashbet.model.FlashBetGameEventDto;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.FlashBetEventKind;
import org.betup.ui.fragment.flashbet.FlashBetEventKindKt;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1", f = "FlashBetGameContent.kt", i = {}, l = {FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<FlashBetEventFlash> $activeEventFlash$delegate;
    final /* synthetic */ Context $appContext;
    final /* synthetic */ int $displayedMinute;
    final /* synthetic */ MutableIntState $eventFlashSeq$delegate;
    final /* synthetic */ MutableState<Boolean> $halfTimeWhistlePlayed$delegate;
    final /* synthetic */ Set<String> $playedEventKeys;
    final /* synthetic */ FlashBetGameSessionDto $s;
    final /* synthetic */ MutableState<Boolean> $showReveal$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1(Set<String> set, FlashBetGameSessionDto flashBetGameSessionDto, Context context, MutableState<Boolean> mutableState, MutableState<FlashBetEventFlash> mutableState2, int i, MutableState<Boolean> mutableState3, MutableIntState mutableIntState, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1> continuation) {
        super(2, continuation);
        this.$playedEventKeys = set;
        this.$s = flashBetGameSessionDto;
        this.$appContext = context;
        this.$showReveal$delegate = mutableState;
        this.$activeEventFlash$delegate = mutableState2;
        this.$displayedMinute = i;
        this.$halfTimeWhistlePlayed$delegate = mutableState3;
        this.$eventFlashSeq$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1(this.$playedEventKeys, this.$s, this.$appContext, this.$showReveal$delegate, this.$activeEventFlash$delegate, this.$displayedMinute, this.$halfTimeWhistlePlayed$delegate, this.$eventFlashSeq$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38;
        Iterator it;
        FlashBetEventFlashKind eventFlashKind;
        int FlashBetGameContent$lambda$10;
        int FlashBetGameContent$lambda$102;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(this.$showReveal$delegate);
            if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38) {
                this.$playedEventKeys.clear();
                this.$activeEventFlash$delegate.setValue(null);
                return Unit.INSTANCE;
            }
            List<FlashBetGameEventDto> events = this.$s.getEvents();
            if (events == null) {
                events = CollectionsKt.emptyList();
            }
            int i2 = this.$displayedMinute;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : events) {
                FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) obj2;
                if (flashBetGameEventDto.getMinute() == i2 && !StringsKt.isBlank(flashBetGameEventDto.getDescription())) {
                    arrayList.add(obj2);
                }
            }
            it = arrayList.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            FlashBetGameEventDto flashBetGameEventDto2 = (FlashBetGameEventDto) it.next();
            if (this.$playedEventKeys.add(flashBetGameEventDto2.getMinute() + "_" + flashBetGameEventDto2.getDescription() + "_" + flashBetGameEventDto2.getSource())) {
                FlashBetEventKind resolveFlashBetEventKind = FlashBetEventKindKt.resolveFlashBetEventKind(flashBetGameEventDto2.getEventType(), flashBetGameEventDto2.getDescription());
                if (FlashBetEventKindKt.shouldPlayEventSound(resolveFlashBetEventKind)) {
                    FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNull(context);
                    flashBetUiSoundEffect.playMatchEvent(context, resolveFlashBetEventKind);
                }
                if (resolveFlashBetEventKind == FlashBetEventKind.HALF_TIME) {
                    FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$78(this.$halfTimeWhistlePlayed$delegate, true);
                }
                if (FlashBetEventKindKt.shouldShowEventFlash(resolveFlashBetEventKind) && (eventFlashKind = FlashBetCardFlashOverlayKt.toEventFlashKind(resolveFlashBetEventKind)) != null) {
                    FlashBetGameContent$lambda$10 = FlashBetGameContentKt.FlashBetGameContent$lambda$10(this.$eventFlashSeq$delegate);
                    this.$eventFlashSeq$delegate.setIntValue(FlashBetGameContent$lambda$10 + 1);
                    MutableState<FlashBetEventFlash> mutableState = this.$activeEventFlash$delegate;
                    String parseEventFlashLabel = FlashBetCardFlashOverlayKt.parseEventFlashLabel(eventFlashKind, flashBetGameEventDto2.getDescription());
                    FlashBetGameContent$lambda$102 = FlashBetGameContentKt.FlashBetGameContent$lambda$10(this.$eventFlashSeq$delegate);
                    mutableState.setValue(new FlashBetEventFlash(eventFlashKind, parseEventFlashLabel, FlashBetGameContent$lambda$102, null, 8, null));
                    this.L$0 = it;
                    this.label = 1;
                    if (DelayKt.delay(2200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
