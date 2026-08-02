package org.betup.ui.dialogs.controller;

import java.util.Collection;
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
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.NewMatchesResponseModel;

/* compiled from: CreateBattleDialogController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.controller.CreateBattleDialogController$loadMatchesPage$1$1", f = "CreateBattleDialogController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CreateBattleDialogController$loadMatchesPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<NewMatchesResponseModel, Integer> $response;
    int label;
    final /* synthetic */ CreateBattleDialogController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateBattleDialogController$loadMatchesPage$1$1(FetchedResponseMessage<NewMatchesResponseModel, Integer> fetchedResponseMessage, CreateBattleDialogController createBattleDialogController, Continuation<? super CreateBattleDialogController$loadMatchesPage$1$1> continuation) {
        super(2, continuation);
        this.$response = fetchedResponseMessage;
        this.this$0 = createBattleDialogController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateBattleDialogController$loadMatchesPage$1$1(this.$response, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateBattleDialogController$loadMatchesPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<NewMatchItemModel> emptyList;
        int currentOffset;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!Intrinsics.areEqual(this.$response.getStat().name(), "SUCCESS")) {
            this.this$0.handleError("Failed to load matches: " + this.$response.getStat().name());
        } else {
            NewMatchesResponseModel model = this.$response.getModel();
            if (model == null || (emptyList = model.getItems()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            currentOffset = this.this$0.getCurrentOffset();
            if (currentOffset == 0) {
                mutableStateFlow4 = this.this$0._matches;
                mutableStateFlow4.setValue(emptyList);
            } else {
                mutableStateFlow = this.this$0._matches;
                mutableStateFlow2 = this.this$0._matches;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow2.getValue(), (Iterable) emptyList));
            }
            mutableStateFlow3 = this.this$0.get_hasMore();
            mutableStateFlow3.setValue(Boxing.boxBoolean(emptyList.size() >= 50));
            this.this$0.handleSuccess();
        }
        return Unit.INSTANCE;
    }
}
