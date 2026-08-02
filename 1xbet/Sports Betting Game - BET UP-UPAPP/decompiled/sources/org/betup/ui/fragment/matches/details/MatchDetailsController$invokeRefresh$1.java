package org.betup.ui.fragment.matches.details;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$invokeRefresh$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$invokeRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MatchDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsController$invokeRefresh$1(MatchDetailsController matchDetailsController, Continuation<? super MatchDetailsController$invokeRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = matchDetailsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchDetailsController$invokeRefresh$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchDetailsController$invokeRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        int i;
        int i2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableStateFlow3 = this.this$0._isLoading;
                mutableStateFlow3.setValue(Boxing.boxBoolean(true));
                try {
                    MatchShortInfoInteractor matchesDetailsRequestInteractor = this.this$0.getMatchesDetailsRequestInteractor();
                    i2 = this.this$0.id;
                    matchesDetailsRequestInteractor.invalidate(Boxing.boxInt(i2));
                    this.this$0.getMatchBetGroupsInteractor().invalidate();
                    this.this$0.getMatchDetailsInteractor().invalidate();
                } catch (Exception e) {
                    Log.w("MatchDetailsController", "Unable to invalidate caches: " + e.getMessage());
                }
                MatchShortInfoInteractor matchesDetailsRequestInteractor2 = this.this$0.getMatchesDetailsRequestInteractor();
                MatchDetailsController matchDetailsController = this.this$0;
                MatchDetailsController matchDetailsController2 = matchDetailsController;
                i = matchDetailsController.id;
                matchesDetailsRequestInteractor2.load(matchDetailsController2, Boxing.boxInt(i));
                this.this$0.refreshMatchComments();
            } catch (Exception e2) {
                Log.e("MatchDetailsController", "Error refreshing match details: " + e2.getMessage(), e2);
                mutableStateFlow = this.this$0._isLoading;
                mutableStateFlow.setValue(Boxing.boxBoolean(false));
                mutableStateFlow2 = this.this$0._error;
                mutableStateFlow2.setValue("Error loading match details");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
