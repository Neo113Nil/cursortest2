package org.betup.ui.dialogs.controller;

import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.leagues.NewLeagueItem;
import org.betup.model.remote.entity.leagues.NewLeaguesResponse;

/* compiled from: CreateBattleDialogController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.CreateBattleDialogController$loadLeaguesPage$1$1", f = "CreateBattleDialogController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CreateBattleDialogController$loadLeaguesPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<NewLeaguesResponse, Integer> $response;
    int label;
    final /* synthetic */ CreateBattleDialogController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateBattleDialogController$loadLeaguesPage$1$1(FetchedResponseMessage<NewLeaguesResponse, Integer> fetchedResponseMessage, CreateBattleDialogController createBattleDialogController, Continuation<? super CreateBattleDialogController$loadLeaguesPage$1$1> continuation) {
        super(2, continuation);
        this.$response = fetchedResponseMessage;
        this.this$0 = createBattleDialogController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateBattleDialogController$loadLeaguesPage$1$1(this.$response, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateBattleDialogController$loadLeaguesPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r4 == null) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List emptyList;
        int currentOffset;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        List<NewLeagueItem> items;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!Intrinsics.areEqual(this.$response.getStat().name(), "SUCCESS")) {
            this.this$0.handleError("Failed to load leagues: " + this.$response.getStat().name());
        } else {
            NewLeaguesResponse model = this.$response.getModel();
            if (model != null && (items = model.getItems()) != null) {
                List<NewLeagueItem> list = items;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NewLeagueItem) it.next()).getLeague());
                }
                emptyList = CollectionsKt.filterNotNull(arrayList);
            }
            emptyList = CollectionsKt.emptyList();
            currentOffset = this.this$0.getCurrentOffset();
            if (currentOffset == 0) {
                mutableStateFlow4 = this.this$0._leagues;
                mutableStateFlow4.setValue(emptyList);
            } else {
                mutableStateFlow = this.this$0._leagues;
                mutableStateFlow2 = this.this$0._leagues;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow2.getValue(), (Iterable) emptyList));
            }
            mutableStateFlow3 = this.this$0.get_hasMore();
            mutableStateFlow3.setValue(Boxing.boxBoolean(emptyList.size() >= 50));
            this.this$0.handleSuccess();
        }
        return Unit.INSTANCE;
    }
}
