package org.betup.ui.fragment.bets.betlist.details;

import android.graphics.Bitmap;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.FacebookRequestErrorClassification;
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
import org.betup.R;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.TicketSharePixelCapture;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1", f = "BetListDetailsScreen.kt", i = {}, l = {FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $act;
    final /* synthetic */ Function0<Unit> $afterSharePosted;
    final /* synthetic */ long $betIdToShare;
    final /* synthetic */ MutableState<Boolean> $forShareCapture$delegate;
    final /* synthetic */ boolean $isSingleLegTicket;
    final /* synthetic */ Function2<Long, Function1<? super String, Unit>, Unit> $requestBetShareInstallLink;
    final /* synthetic */ MutableState<BetShareChooserState> $shareChooserState$delegate;
    final /* synthetic */ int $shareExpandBottomPx;
    final /* synthetic */ int $shareExpandBottomPxSingleLeg;
    final /* synthetic */ int $shareExpandSidesPx;
    final /* synthetic */ int $shareExpandTopPx;
    final /* synthetic */ Function0<Window> $sharePixelCopyWindow;
    final /* synthetic */ BetTicketShareLayoutAnchor $ticketShareCoordsHolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1(BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, FragmentActivity fragmentActivity, Function0<? extends Window> function0, int i, int i2, boolean z, int i3, int i4, Function0<Unit> function02, MutableState<Boolean> mutableState, Function2<? super Long, ? super Function1<? super String, Unit>, Unit> function2, long j, MutableState<BetShareChooserState> mutableState2, Continuation<? super BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1> continuation) {
        super(2, continuation);
        this.$ticketShareCoordsHolder = betTicketShareLayoutAnchor;
        this.$act = fragmentActivity;
        this.$sharePixelCopyWindow = function0;
        this.$shareExpandSidesPx = i;
        this.$shareExpandTopPx = i2;
        this.$isSingleLegTicket = z;
        this.$shareExpandBottomPxSingleLeg = i3;
        this.$shareExpandBottomPx = i4;
        this.$afterSharePosted = function02;
        this.$forShareCapture$delegate = mutableState;
        this.$requestBetShareInstallLink = function2;
        this.$betIdToShare = j;
        this.$shareChooserState$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1(this.$ticketShareCoordsHolder, this.$act, this.$sharePixelCopyWindow, this.$shareExpandSidesPx, this.$shareExpandTopPx, this.$isSingleLegTicket, this.$shareExpandBottomPxSingleLeg, this.$shareExpandBottomPx, this.$afterSharePosted, this.$forShareCapture$delegate, this.$requestBetShareInstallLink, this.$betIdToShare, this.$shareChooserState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(160L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        LayoutCoordinates coordinates = this.$ticketShareCoordsHolder.getCoordinates();
        if (coordinates == null || !coordinates.isAttached()) {
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$20(this.$forShareCapture$delegate, false);
            this.$afterSharePosted.invoke();
            SnackbarHelper.showShort(this.$act, R.string.share_bet_capture_failed);
        } else {
            TicketSharePixelCapture ticketSharePixelCapture = TicketSharePixelCapture.INSTANCE;
            FragmentActivity fragmentActivity = this.$act;
            Function0<Window> function0 = this.$sharePixelCopyWindow;
            Window invoke = function0 != null ? function0.invoke() : null;
            int i3 = this.$shareExpandSidesPx;
            int i4 = this.$shareExpandTopPx;
            final boolean z = this.$isSingleLegTicket;
            if (z) {
                i = this.$shareExpandBottomPxSingleLeg;
            } else {
                i = this.$shareExpandBottomPx;
            }
            int i5 = i;
            final Function0<Unit> function02 = this.$afterSharePosted;
            final FragmentActivity fragmentActivity2 = this.$act;
            final MutableState<Boolean> mutableState = this.$forShareCapture$delegate;
            final Function2<Long, Function1<? super String, Unit>, Unit> function2 = this.$requestBetShareInstallLink;
            final long j = this.$betIdToShare;
            final MutableState<BetShareChooserState> mutableState2 = this.$shareChooserState$delegate;
            ticketSharePixelCapture.captureToBitmap(fragmentActivity, coordinates, invoke, i3, i4, i3, i5, new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BetListDetailsScreenKt$BetListDetailsScreen$16$3$1$2$1$1$shareTicketOffscreenAndFallback$1$1.invokeSuspend$lambda$0(Function0.this, fragmentActivity2, mutableState, function2, j, z, mutableState2, (Bitmap) obj2);
                    return invokeSuspend$lambda$0;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function0 function0, FragmentActivity fragmentActivity, MutableState mutableState, Function2 function2, long j, boolean z, MutableState mutableState2, Bitmap bitmap) {
        BetListDetailsScreenKt.BetListDetailsScreen$lambda$20(mutableState, false);
        if (bitmap != null) {
            BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$79$lambda$78$lambda$74$lambda$73$finishLoadingAndOpenChooser(function0, fragmentActivity, function2, j, z, mutableState2, CollectionsKt.listOf(bitmap));
        } else {
            function0.invoke();
            SnackbarHelper.showShort(fragmentActivity, R.string.share_bet_capture_failed);
        }
        return Unit.INSTANCE;
    }
}
