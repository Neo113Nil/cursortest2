package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class p extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6827a;
    public final /* synthetic */ financial.atomic.muppet.bridge.Page b;
    public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef c;
    public final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(financial.atomic.muppet.bridge.Page page, kotlin.jvm.internal.Ref.IntRef intRef, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = page;
        this.c = intRef;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.b.p pVar = new financial.atomic.muppet.b.p(this.b, this.c, this.d, continuation);
        pVar.f6827a = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((financial.atomic.muppet.b.p) create((financial.atomic.muppet.Emitter.Event) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        financial.atomic.muppet.bridge.Bridge bridge;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.Emitter.Event event = (financial.atomic.muppet.Emitter.Event) this.f6827a;
        bridge = this.b.Camera2StreamConfigurationMap;
        financial.atomic.muppet.inter.Page page = bridge.getPage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n                window.dispatchEvent(new CustomEvent('");
        sb.append(this.c.element);
        sb.append("', {\n                    detail: { type: '");
        sb.append(this.d);
        sb.append("', data: ");
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        java.lang.Object data = event.getData();
        if (data == null) {
            data = "null";
        }
        companion.getSerializersModule();
        sb.append(companion.encodeToString(kotlinx.serialization.internal.StringSerializer.INSTANCE, (java.lang.String) data));
        sb.append(" }\n                }))");
        page.evaluate(kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null), new kotlin.jvm.functions.Function1() { // from class: financial.atomic.muppet.b.p$$ExternalSyntheticLambda0
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
