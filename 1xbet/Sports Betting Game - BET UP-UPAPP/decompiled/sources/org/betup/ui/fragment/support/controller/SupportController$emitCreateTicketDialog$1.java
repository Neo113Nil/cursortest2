package org.betup.ui.fragment.support.controller;

import com.unity3d.mediation.LevelPlayAdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.betup.model.remote.entity.support.SupportCategoryDto;
import org.betup.ui.fragment.support.compose.SupportEvent;

/* compiled from: SupportController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.support.controller.SupportController$emitCreateTicketDialog$1", f = "SupportController.kt", i = {}, l = {LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SupportController$emitCreateTicketDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SupportCategoryDto> $categories;
    int label;
    final /* synthetic */ SupportController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SupportController$emitCreateTicketDialog$1(SupportController supportController, List<? extends SupportCategoryDto> list, Continuation<? super SupportController$emitCreateTicketDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = supportController;
        this.$categories = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportController$emitCreateTicketDialog$1(this.this$0, this.$categories, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportController$emitCreateTicketDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._events;
            List<SupportCategoryDto> list = this.$categories;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                String str = "";
                if (!it.hasNext()) {
                    break;
                }
                String id = ((SupportCategoryDto) it.next()).getId();
                if (id != null) {
                    str = id;
                }
                arrayList.add(str);
            }
            ArrayList arrayList2 = arrayList;
            List<SupportCategoryDto> list2 = this.$categories;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                String name = ((SupportCategoryDto) it2.next()).getName();
                if (name == null) {
                    name = "";
                }
                arrayList3.add(name);
            }
            this.label = 1;
            if (mutableSharedFlow.emit(new SupportEvent.OpenCreateTicketDialog(arrayList2, arrayList3), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
