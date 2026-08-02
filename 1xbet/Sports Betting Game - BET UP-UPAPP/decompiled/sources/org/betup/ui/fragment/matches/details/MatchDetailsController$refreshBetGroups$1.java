package org.betup.ui.fragment.matches.details;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$refreshBetGroups$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$refreshBetGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MatchDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsController$refreshBetGroups$1(MatchDetailsController matchDetailsController, Continuation<? super MatchDetailsController$refreshBetGroups$1> continuation) {
        super(2, continuation);
        this.this$0 = matchDetailsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchDetailsController$refreshBetGroups$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchDetailsController$refreshBetGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        MutableStateFlow mutableStateFlow;
        BaseCachedSharedInteractor.OnFetchedListener onFetchedListener;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                i = this.this$0.id;
                Log.d("MatchDetailsController", "Refreshing bet groups for match id: " + i);
                this.this$0.getMatchBetGroupsInteractor().invalidate();
                this.this$0.getMatchDetailsInteractor().invalidate();
                mutableStateFlow = this.this$0._subMatches;
                Iterable iterable = (Iterable) mutableStateFlow.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boxing.boxInt(((BetGroupsTabs) it.next()).getId()));
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    MatchVarietiesInteractor matchBetGroupsInteractor = this.this$0.getMatchBetGroupsInteractor();
                    onFetchedListener = this.this$0.matchBetListener;
                    matchBetGroupsInteractor.load(onFetchedListener, arrayList2);
                    Boxing.boxInt(Log.d("MatchDetailsController", "Refreshing bet groups for variety IDs: " + arrayList2));
                } else {
                    Log.d("MatchDetailsController", "No variety IDs available, invoking full refresh");
                    this.this$0.invokeRefresh();
                }
            } catch (Exception e) {
                Boxing.boxInt(Log.e("MatchDetailsController", "Error refreshing bet groups: " + e.getMessage(), e));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
