package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lfinancial/atomic/muppet/Emitter$Event;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$setupTransactView$4$2", f = "Transact.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class Transact$setupTransactView$4$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<financial.atomic.muppet.Emitter.Event<java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$setupTransactView$4$2$1", f = "Transact.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: financial.atomic.transact.Transact$setupTransactView$4$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ financial.atomic.muppet.Emitter.Event<java.lang.Object> $it;
        int label;
        final /* synthetic */ financial.atomic.transact.Transact this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                financial.atomic.muppet.Emitter.Event<java.lang.Object> event = this.$it;
                jSONObject.put("reason", "error");
                java.lang.Object data = event.getData();
                if (data != null) {
                    jSONObject.put("errorCode", data.toString());
                }
                financial.atomic.transact.Transact transact = this.this$0;
                financial.atomic.transact.Transact.Event event2 = financial.atomic.transact.Transact.Event.CLOSE;
                this.label = 1;
                if (transact.emit((java.lang.Enum) event2, (financial.atomic.transact.Transact.Event) jSONObject, (kotlin.coroutines.Continuation<? super financial.atomic.transact.Emitter.Event<financial.atomic.transact.Transact.Event>>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((financial.atomic.transact.Transact$setupTransactView$4$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new financial.atomic.transact.Transact$setupTransactView$4$2.AnonymousClass1(this.this$0, this.$it, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(financial.atomic.transact.Transact transact, financial.atomic.muppet.Emitter.Event<java.lang.Object> event, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupTransactView$4$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = transact;
            this.$it = event;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.muppet.Emitter.Event<java.lang.Object> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.Transact$setupTransactView$4$2) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.this$0.get_scope(), kotlinx.coroutines.Dispatchers.getMain(), null, new financial.atomic.transact.Transact$setupTransactView$4$2.AnonymousClass1(this.this$0, (financial.atomic.muppet.Emitter.Event) this.L$0, null), 2, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        financial.atomic.transact.Transact$setupTransactView$4$2 transact$setupTransactView$4$2 = new financial.atomic.transact.Transact$setupTransactView$4$2(this.this$0, continuation);
        transact$setupTransactView$4$2.L$0 = obj;
        return transact$setupTransactView$4$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$setupTransactView$4$2(financial.atomic.transact.Transact transact, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupTransactView$4$2> continuation) {
        super(2, continuation);
        this.this$0 = transact;
    }
}
