package org.betup.ui.fragment.matches.details;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$onGetBetInfo$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$onGetBetInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ MatchDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsController$onGetBetInfo$1(MatchDetailsController matchDetailsController, int i, Continuation<? super MatchDetailsController$onGetBetInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = matchDetailsController;
        this.$id = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchDetailsController$onGetBetInfo$1(this.this$0, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchDetailsController$onGetBetInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        BaseCachedSharedInteractor.OnFetchedListener onFetchedListener;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                mutableStateFlow2 = this.this$0._isLoading;
                mutableStateFlow2.setValue(Boxing.boxBoolean(true));
                MatchVarietiesInteractor matchBetGroupsInteractor = this.this$0.getMatchBetGroupsInteractor();
                onFetchedListener = this.this$0.matchBetListener;
                matchBetGroupsInteractor.load(onFetchedListener, CollectionsKt.listOf(Boxing.boxInt(this.$id)));
            } catch (Exception e) {
                Log.e("MatchDetailsController", "Error loading bet groups: " + e.getMessage(), e);
                mutableStateFlow = this.this$0._error;
                mutableStateFlow.setValue("Error loading bet groups");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
