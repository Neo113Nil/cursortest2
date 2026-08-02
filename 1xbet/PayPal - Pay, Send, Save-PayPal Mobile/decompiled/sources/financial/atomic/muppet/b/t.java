package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class t extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6831a;
    public final /* synthetic */ kotlinx.serialization.json.JsonArray b;
    public final /* synthetic */ financial.atomic.muppet.inter.Page c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(financial.atomic.muppet.inter.Page page, kotlin.coroutines.Continuation continuation, kotlinx.serialization.json.JsonArray jsonArray) {
        super(2, continuation);
        this.b = jsonArray;
        this.c = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.b.t(this.c, continuation, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.serialization.json.JsonArray jsonArray = this.b;
        return new financial.atomic.muppet.b.t(this.c, (kotlin.coroutines.Continuation) obj2, jsonArray).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r11 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r11 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6831a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Integer intOrNull = kotlinx.serialization.json.JsonElementKt.getIntOrNull(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.b.get(0)));
            int intValue = intOrNull != null ? intOrNull.intValue() : 0;
            java.lang.Integer intOrNull2 = kotlinx.serialization.json.JsonElementKt.getIntOrNull(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.b.get(1)));
            int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
            java.lang.Double doubleOrNull = kotlinx.serialization.json.JsonElementKt.getDoubleOrNull(kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(this.b.get(2)));
            if (doubleOrNull != null) {
                financial.atomic.muppet.inter.Page page = this.c;
                double doubleValue = doubleOrNull.doubleValue();
                this.f6831a = 1;
                obj = page.screenshot(intValue, intValue2, doubleValue, this);
            } else {
                financial.atomic.muppet.inter.Page page2 = this.c;
                this.f6831a = 2;
                obj = financial.atomic.muppet.inter.Page.DefaultImpls.screenshot$default(page2, 0, 0, 0.0d, this, 7, null);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = (java.lang.String) obj;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            str = (java.lang.String) obj;
        }
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        companion.getSerializersModule();
        return companion.encodeToString(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), str);
    }
}
