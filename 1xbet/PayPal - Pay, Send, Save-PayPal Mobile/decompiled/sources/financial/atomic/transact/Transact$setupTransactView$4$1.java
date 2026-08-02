package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lfinancial/atomic/muppet/Emitter$Event;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact$setupTransactView$4$1", f = "Transact.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class Transact$setupTransactView$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<financial.atomic.muppet.Emitter.Event<java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ financial.atomic.transact.Config $config;
    final /* synthetic */ financial.atomic.muppet.Page $this_apply;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$0(java.lang.String str) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(financial.atomic.muppet.Emitter.Event<java.lang.Object> event, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.transact.Transact$setupTransactView$4$1) create(event, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.StringBuilder sb;
        java.lang.String unused;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.muppet.Emitter.Event event = (financial.atomic.muppet.Emitter.Event) this.L$0;
            unused = this.this$0.d;
            event.getType();
            java.util.Objects.toString(event.getData());
            str = this.this$0.d;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("started: ");
            financial.atomic.muppet.Page page = this.$this_apply;
            this.L$0 = str;
            this.L$1 = sb2;
            this.label = 1;
            obj = financial.atomic.muppet.Page.cookie$default(page, null, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            sb = sb2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (java.lang.StringBuilder) this.L$1;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        sb.append((java.lang.String) obj);
        if (this.$config.getNativeAuthentication()) {
            this.$this_apply.evaluate("window.SUPPORTS_NATIVE_AUTHENTICATION = true", new kotlin.jvm.functions.Function1() { // from class: financial.atomic.transact.Transact$setupTransactView$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = financial.atomic.transact.Transact$setupTransactView$4$1.invokeSuspend$lambda$0((java.lang.String) obj2);
                    return invokeSuspend$lambda$0;
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        financial.atomic.transact.Transact$setupTransactView$4$1 transact$setupTransactView$4$1 = new financial.atomic.transact.Transact$setupTransactView$4$1(this.this$0, this.$this_apply, this.$config, continuation);
        transact$setupTransactView$4$1.L$0 = obj;
        return transact$setupTransactView$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$setupTransactView$4$1(financial.atomic.transact.Transact transact, financial.atomic.muppet.Page page, financial.atomic.transact.Config config, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupTransactView$4$1> continuation) {
        super(2, continuation);
        this.this$0 = transact;
        this.$this_apply = page;
        this.$config = config;
    }
}
