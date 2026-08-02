package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$dispatchEvent$1", f = "Transact.kt", i = {}, l = {com.visa.cbp.getCertUsage.setODAData}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Transact$dispatchEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ org.json.JSONObject $payload;
    final /* synthetic */ java.lang.String $type;
    int label;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$0(java.lang.String str) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        financial.atomic.muppet.Page page;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            completableDeferred = this.this$0.n;
            this.label = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        page = this.this$0.h;
        if (page == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            page = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n              document.body.dispatchEvent(\n                  new CustomEvent('");
        sb.append(financial.atomic.transact.Transact.Event.NATIVE_EVENT.getValue());
        sb.append("', {\n                      detail: { name: '");
        sb.append(this.$type);
        sb.append("', payload: ");
        sb.append(this.$payload);
        sb.append(" }\n                  })\n              )\n          ");
        page.evaluate(sb.toString(), new kotlin.jvm.functions.Function1() { // from class: financial.atomic.transact.Transact$dispatchEvent$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                kotlin.Unit invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = financial.atomic.transact.Transact$dispatchEvent$1.invokeSuspend$lambda$0((java.lang.String) obj2);
                return invokeSuspend$lambda$0;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.Transact$dispatchEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new financial.atomic.transact.Transact$dispatchEvent$1(this.this$0, this.$type, this.$payload, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$dispatchEvent$1(financial.atomic.transact.Transact transact, java.lang.String str, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$dispatchEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = transact;
        this.$type = str;
        this.$payload = jSONObject;
    }
}
