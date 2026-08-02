package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.StringBuilder f6819a;
    public financial.atomic.muppet.inter.Page b;
    public int c;
    public final /* synthetic */ financial.atomic.muppet.bridge.Bridge d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(financial.atomic.muppet.bridge.Bridge bridge, int i, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = bridge;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.g(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.b.g(this.d, this.e, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.inter.Page page;
        java.lang.StringBuilder sb;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.Deferred<java.lang.String> remove = this.d.getStore().getDeferrables().remove(kotlin.coroutines.jvm.internal.Boxing.boxInt(this.e));
            if (remove != null) {
                financial.atomic.muppet.bridge.Bridge bridge = this.d;
                int i2 = this.e;
                financial.atomic.muppet.inter.Page page2 = bridge.getPage();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\n                            window.dispatchEvent(new CustomEvent('");
                sb2.append(i2);
                sb2.append("', {\n                                detail: ");
                this.f6819a = sb2;
                this.b = page2;
                this.c = 1;
                obj = remove.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                page = page2;
                sb = sb2;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        page = this.b;
        sb = this.f6819a;
        kotlin.ResultKt.throwOnFailure(obj);
        sb.append((java.lang.String) obj);
        sb.append("\n                            }))");
        page.evaluate(kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null), new kotlin.jvm.functions.Function1() { // from class: financial.atomic.muppet.b.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
