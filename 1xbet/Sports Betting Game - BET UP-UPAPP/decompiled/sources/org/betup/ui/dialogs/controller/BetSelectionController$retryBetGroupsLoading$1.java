package org.betup.ui.dialogs.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.BetSelectionController$retryBetGroupsLoading$1", f = "BetSelectionController.kt", i = {}, l = {889}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetSelectionController$retryBetGroupsLoading$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BetSelectionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetSelectionController$retryBetGroupsLoading$1(BetSelectionController betSelectionController, Continuation<? super BetSelectionController$retryBetGroupsLoading$1> continuation) {
        super(2, continuation);
        this.this$0 = betSelectionController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetSelectionController$retryBetGroupsLoading$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetSelectionController$retryBetGroupsLoading$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._retryCount;
            this.label = 1;
            if (DelayKt.delay(((Number) mutableStateFlow.getValue()).longValue() * 1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow2 = this.this$0._subMatches;
        Object value = mutableStateFlow2.getValue();
        ArrayList arrayList = null;
        if (((List) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boxing.boxLong(((BetGroupsTabs) it.next()).getId()));
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            this.this$0.loadBetGroups(arrayList);
        }
        return Unit.INSTANCE;
    }
}
