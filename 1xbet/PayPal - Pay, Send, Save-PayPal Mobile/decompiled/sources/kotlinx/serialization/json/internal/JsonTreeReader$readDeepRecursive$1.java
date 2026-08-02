package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {0}, l = {113}, m = "invokeSuspend", n = {"$this$DeepRecursiveFunction"}, nl = {114}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class JsonTreeReader$readDeepRecursive$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>, kotlin.Unit, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement>, java.lang.Object> {
    final /* synthetic */ kotlinx.serialization.json.internal.JsonTreeReader getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer;
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer2;
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges;
        kotlinx.serialization.json.JsonPrimitive highSpeedVideoFpsRanges2;
        kotlinx.serialization.json.JsonPrimitive highSpeedVideoFpsRanges3;
        kotlin.DeepRecursiveScope deepRecursiveScope = (kotlin.DeepRecursiveScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            abstractJsonLexer = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            byte peekNextToken = abstractJsonLexer.peekNextToken();
            if (peekNextToken == 1) {
                highSpeedVideoFpsRanges3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(true);
                return highSpeedVideoFpsRanges3;
            }
            if (peekNextToken == 0) {
                highSpeedVideoFpsRanges2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(false);
                return highSpeedVideoFpsRanges2;
            }
            if (peekNextToken != 6) {
                if (peekNextToken == 8) {
                    highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                    return highSpeedVideoFpsRanges;
                }
                abstractJsonLexer2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer2, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deepRecursiveScope);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.serialization.json.internal.JsonTreeReader.access$readObject(this.getHighResolutionOutputSizeshNQ4ISI, deepRecursiveScope, this);
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

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> deepRecursiveScope, kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> continuation) {
        kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        jsonTreeReader$readDeepRecursive$1.getHighSpeedVideoSizes = deepRecursiveScope;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonTreeReader$readDeepRecursive$1(kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = jsonTreeReader;
    }
}
