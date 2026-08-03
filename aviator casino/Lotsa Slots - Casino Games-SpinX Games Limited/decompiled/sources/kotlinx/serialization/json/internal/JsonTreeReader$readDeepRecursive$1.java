package kotlinx.serialization.json.internal;

/* compiled from: JsonTreeReader.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class JsonTreeReader$readDeepRecursive$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>, kotlin.Unit, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ kotlinx.serialization.json.internal.JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonTreeReader$readDeepRecursive$1(kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1> continuation) {
        super(3, continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> deepRecursiveScope, kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> continuation) {
        kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1(this.this$0, continuation);
        jsonTreeReader$readDeepRecursive$1.L$0 = deepRecursiveScope;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer;
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer2;
        kotlinx.serialization.json.JsonElement readArray;
        kotlinx.serialization.json.JsonPrimitive readValue;
        kotlinx.serialization.json.JsonPrimitive readValue2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.DeepRecursiveScope deepRecursiveScope = (kotlin.DeepRecursiveScope) this.L$0;
            abstractJsonLexer = this.this$0.lexer;
            byte peekNextToken = abstractJsonLexer.peekNextToken();
            if (peekNextToken == 1) {
                readValue2 = this.this$0.readValue(true);
                return readValue2;
            }
            if (peekNextToken == 0) {
                readValue = this.this$0.readValue(false);
                return readValue;
            }
            if (peekNextToken != 6) {
                if (peekNextToken == 8) {
                    readArray = this.this$0.readArray();
                    return readArray;
                }
                abstractJsonLexer2 = this.this$0.lexer;
                kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer2, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            this.label = 1;
            obj = this.this$0.readObject(deepRecursiveScope, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (kotlinx.serialization.json.JsonElement) obj;
    }
}
