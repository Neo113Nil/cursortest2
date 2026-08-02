package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lfinancial/atomic/transact/Emitter$Event;", "Lorg/json/JSONObject;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$setupEvents$16", f = "Transact.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class Transact$setupEvents$16 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<financial.atomic.transact.Emitter.Event<org.json.JSONObject>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.transact.Emitter.Event<org.json.JSONObject> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.Transact$setupEvents$16) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.Page page;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.transact.Emitter.Event event = (financial.atomic.transact.Emitter.Event) this.L$0;
        org.json.JSONObject jSONObject = (org.json.JSONObject) event.getData();
        if (kotlin.jvm.internal.Intrinsics.areEqual(jSONObject != null ? jSONObject.optString("name") : null, "Clicked Continue From Welcome Page")) {
            page = this.this$0.h;
            if (page == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                page = null;
            }
            page.once(financial.atomic.muppet.impl.Page.Event.finished, new financial.atomic.transact.Transact$setupEvents$16.AnonymousClass1(this.this$0, null));
        }
        this.this$0.a(event);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lfinancial/atomic/muppet/Emitter$Event;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$setupEvents$16$1", f = "Transact.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: financial.atomic.transact.Transact$setupEvents$16$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<financial.atomic.muppet.Emitter.Event<java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ financial.atomic.transact.Transact this$0;

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(financial.atomic.muppet.Emitter.Event<java.lang.Object> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((financial.atomic.transact.Transact$setupEvents$16.AnonymousClass1) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            financial.atomic.muppet.Page page;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                page = this.this$0.h;
                if (page == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    page = null;
                }
                this.label = 1;
                if (page.clearHistory(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new financial.atomic.transact.Transact$setupEvents$16.AnonymousClass1(this.this$0, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(financial.atomic.transact.Transact transact, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupEvents$16.AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = transact;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        financial.atomic.transact.Transact$setupEvents$16 transact$setupEvents$16 = new financial.atomic.transact.Transact$setupEvents$16(this.this$0, continuation);
        transact$setupEvents$16.L$0 = obj;
        return transact$setupEvents$16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$setupEvents$16(financial.atomic.transact.Transact transact, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupEvents$16> continuation) {
        super(2, continuation);
        this.this$0 = transact;
    }
}
