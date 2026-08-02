package org.betup.ui.fragment.bets.betlist.details;

import android.graphics.Bitmap;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.utils.TicketSharePixelCapture;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1", f = "BetListDetailsScreen.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $act;
    final /* synthetic */ Function0<Unit> $afterSharePosted;
    final /* synthetic */ long $betIdToShare;
    final /* synthetic */ MutableState<Boolean> $forShareCapture$delegate;
    final /* synthetic */ boolean $isSingleLegTicket;
    final /* synthetic */ BetsListModel $itemToShare;
    final /* synthetic */ State<OddType> $oddTye$delegate;
    final /* synthetic */ Function2<Long, Function1<? super String, Unit>, Unit> $requestBetShareInstallLink;
    final /* synthetic */ MutableState<BetShareChooserState> $shareChooserState$delegate;
    final /* synthetic */ int $shareExpandBottomPx;
    final /* synthetic */ int $shareExpandBottomPxSingleLeg;
    final /* synthetic */ int $shareExpandSidesPx;
    final /* synthetic */ int $shareExpandTopPx;
    final /* synthetic */ Function0<Window> $sharePixelCopyWindow;
    final /* synthetic */ CoroutineScope $shareScope;
    final /* synthetic */ BetTicketShareLayoutAnchor $ticketShareCoordsHolder;
    final /* synthetic */ int $widthPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1(BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, FragmentActivity fragmentActivity, Function0<? extends Window> function0, int i, int i2, int i3, MutableState<Boolean> mutableState, Function0<Unit> function02, Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function2, long j, boolean z, MutableState<BetShareChooserState> mutableState2, BetsListModel betsListModel, int i4, State<? extends OddType> state, CoroutineScope coroutineScope, int i5, Continuation<? super BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$ticketShareCoordsHolder = betTicketShareLayoutAnchor;
        this.$act = fragmentActivity;
        this.$sharePixelCopyWindow = function0;
        this.$shareExpandSidesPx = i;
        this.$shareExpandTopPx = i2;
        this.$shareExpandBottomPxSingleLeg = i3;
        this.$forShareCapture$delegate = mutableState;
        this.$afterSharePosted = function02;
        this.$requestBetShareInstallLink = function2;
        this.$betIdToShare = j;
        this.$isSingleLegTicket = z;
        this.$shareChooserState$delegate = mutableState2;
        this.$itemToShare = betsListModel;
        this.$widthPx = i4;
        this.$oddTye$delegate = state;
        this.$shareScope = coroutineScope;
        this.$shareExpandBottomPx = i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1(this.$ticketShareCoordsHolder, this.$act, this.$sharePixelCopyWindow, this.$shareExpandSidesPx, this.$shareExpandTopPx, this.$shareExpandBottomPxSingleLeg, this.$forShareCapture$delegate, this.$afterSharePosted, this.$requestBetShareInstallLink, this.$betIdToShare, this.$isSingleLegTicket, this.$shareChooserState$delegate, this.$itemToShare, this.$widthPx, this.$oddTye$delegate, this.$shareScope, this.$shareExpandBottomPx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$20(this.$forShareCapture$delegate, true);
            this.label = 1;
            if (DelayKt.delay(96L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        LayoutCoordinates coordinates = this.$ticketShareCoordsHolder.getCoordinates();
        if (coordinates == null || !coordinates.isAttached()) {
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$20(this.$forShareCapture$delegate, false);
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback(this.$act, this.$itemToShare, this.$widthPx, this.$oddTye$delegate, this.$shareScope, this.$afterSharePosted, this.$requestBetShareInstallLink, this.$betIdToShare, this.$isSingleLegTicket, this.$shareChooserState$delegate, this.$forShareCapture$delegate, this.$ticketShareCoordsHolder, this.$sharePixelCopyWindow, this.$shareExpandSidesPx, this.$shareExpandTopPx, this.$shareExpandBottomPxSingleLeg, this.$shareExpandBottomPx);
        } else {
            TicketSharePixelCapture ticketSharePixelCapture = TicketSharePixelCapture.INSTANCE;
            FragmentActivity fragmentActivity = this.$act;
            Function0<Window> function0 = this.$sharePixelCopyWindow;
            Window invoke = function0 != null ? function0.invoke() : null;
            final int i2 = this.$shareExpandSidesPx;
            final int i3 = this.$shareExpandTopPx;
            final int i4 = this.$shareExpandBottomPxSingleLeg;
            final MutableState<Boolean> mutableState = this.$forShareCapture$delegate;
            final Function0<Unit> function02 = this.$afterSharePosted;
            final FragmentActivity fragmentActivity2 = this.$act;
            final Function2<Long, Function1<? super String, Unit>, Unit> function2 = this.$requestBetShareInstallLink;
            final long j = this.$betIdToShare;
            final boolean z = this.$isSingleLegTicket;
            final MutableState<BetShareChooserState> mutableState2 = this.$shareChooserState$delegate;
            final BetsListModel betsListModel = this.$itemToShare;
            final int i5 = this.$widthPx;
            final State<OddType> state = this.$oddTye$delegate;
            final CoroutineScope coroutineScope = this.$shareScope;
            final BetTicketShareLayoutAnchor betTicketShareLayoutAnchor = this.$ticketShareCoordsHolder;
            final Function0<Window> function03 = this.$sharePixelCopyWindow;
            final int i6 = this.$shareExpandBottomPx;
            ticketSharePixelCapture.captureToBitmap(fragmentActivity, coordinates, invoke, i2, i3, i2, i4, new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$1.invokeSuspend$lambda$0(MutableState.this, function02, fragmentActivity2, function2, j, z, mutableState2, betsListModel, i5, state, coroutineScope, betTicketShareLayoutAnchor, function03, i2, i3, i4, i6, (Bitmap) obj2);
                    return invokeSuspend$lambda$0;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, Function0 function0, FragmentActivity fragmentActivity, Function2 function2, long j, boolean z, MutableState mutableState2, BetsListModel betsListModel, int i, State state, CoroutineScope coroutineScope, BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, Function0 function02, int i2, int i3, int i4, int i5, Bitmap bitmap) {
        BetListDetailsScreenKt.BetListDetailsScreen$lambda$20(mutableState, false);
        if (bitmap != null) {
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser(function0, fragmentActivity, function2, j, z, mutableState2, CollectionsKt.listOf(bitmap));
        } else {
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$shareTicketOffscreenAndFallback(fragmentActivity, betsListModel, i, state, coroutineScope, function0, function2, j, z, mutableState2, mutableState, betTicketShareLayoutAnchor, function02, i2, i3, i4, i5);
        }
        return Unit.INSTANCE;
    }
}
