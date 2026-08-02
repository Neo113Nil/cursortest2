package org.betup.ui.fragment.support.controller;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.betup.ui.fragment.support.compose.MyDataState;

/* compiled from: SupportController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.support.controller.SupportController$myDataListener$1$1", f = "SupportController.kt", i = {0}, l = {918}, m = "invokeSuspend", n = {"shouldContinue"}, s = {"I$0"})
/* loaded from: classes4.dex */
final class SupportController$myDataListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ SupportController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportController$myDataListener$1$1(SupportController supportController, Continuation<? super SupportController$myDataListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = supportController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportController$myDataListener$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportController$myDataListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            i = 1;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        ResultKt.throwOnFailure(obj);
        mutableStateFlow2 = this.this$0._myDataState;
        if (!((MyDataState) mutableStateFlow2.getValue()).getHasActiveRequest()) {
            i = 0;
        }
        if (i != 0) {
            mutableStateFlow = this.this$0._myDataState;
            if (((MyDataState) mutableStateFlow.getValue()).getHasActiveRequest()) {
                this.I$0 = i;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow2 = this.this$0._myDataState;
                if (!((MyDataState) mutableStateFlow2.getValue()).getHasActiveRequest()) {
                }
                if (i != 0) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
