package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.json.JSONArray;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", i = {0}, l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 134}, m = "invokeSuspend", n = {"invocation"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class CommonWebViewBridge$handleInvocation$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ JSONArray $parameters;
    Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocation$7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, Continuation<? super CommonWebViewBridge$handleInvocation$7> continuation) {
        super(2, continuation);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonWebViewBridge$handleInvocation$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Invocation invocation;
        MutableSharedFlow mutableSharedFlow;
        Object handleInvocationResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            invocation = new Invocation(this.$location, JSONArrayExtensionsKt.toTypedArray(this.$parameters));
            mutableSharedFlow = this.this$0._onInvocation;
            this.L$0 = invocation;
            this.label = 1;
            if (mutableSharedFlow.emit(invocation, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            invocation = (Invocation) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        handleInvocationResult = this.this$0.handleInvocationResult(invocation, this.$callback, this);
        if (handleInvocationResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
