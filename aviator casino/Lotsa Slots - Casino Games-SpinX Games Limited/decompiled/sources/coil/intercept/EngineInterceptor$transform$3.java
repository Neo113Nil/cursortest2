package coil.intercept;

/* compiled from: EngineInterceptor.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {246}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes2.dex */
final class EngineInterceptor$transform$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult>, java.lang.Object> {
    final /* synthetic */ coil.EventListener $eventListener;
    final /* synthetic */ coil.request.Options $options;
    final /* synthetic */ coil.request.ImageRequest $request;
    final /* synthetic */ coil.intercept.EngineInterceptor.ExecuteResult $result;
    final /* synthetic */ java.util.List<coil.transform.Transformation> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ coil.intercept.EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EngineInterceptor$transform$3(coil.intercept.EngineInterceptor engineInterceptor, coil.intercept.EngineInterceptor.ExecuteResult executeResult, coil.request.Options options, java.util.List<? extends coil.transform.Transformation> list, coil.EventListener eventListener, coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor$transform$3> continuation) {
        super(2, continuation);
        this.this$0 = engineInterceptor;
        this.$result = executeResult;
        this.$options = options;
        this.$transformations = list;
        this.$eventListener = eventListener;
        this.$request = imageRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        coil.intercept.EngineInterceptor$transform$3 engineInterceptor$transform$3 = new coil.intercept.EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, continuation);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult> continuation) {
        return ((coil.intercept.EngineInterceptor$transform$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0072 -> B:5:0x0075). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap convertDrawableToBitmap;
        coil.request.Options options;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        android.graphics.Bitmap bitmap;
        int size;
        java.util.List<coil.transform.Transformation> list;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
            convertDrawableToBitmap = this.this$0.convertDrawableToBitmap(this.$result.getDrawable(), this.$options, this.$transformations);
            this.$eventListener.transformStart(this.$request, convertDrawableToBitmap);
            java.util.List<coil.transform.Transformation> list2 = this.$transformations;
            options = this.$options;
            coroutineScope = coroutineScope2;
            bitmap = convertDrawableToBitmap;
            size = list2.size();
            list = list2;
            i = 0;
            if (i < size) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            i = this.I$0;
            options = (coil.request.Options) this.L$2;
            list = (java.util.List) this.L$1;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            bitmap = (android.graphics.Bitmap) obj;
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
            i++;
            if (i < size) {
                coil.transform.Transformation transformation = list.get(i);
                coil.size.Size size2 = options.getSize();
                this.L$0 = coroutineScope;
                this.L$1 = list;
                this.L$2 = options;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                obj = transformation.transform(bitmap, size2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bitmap = (android.graphics.Bitmap) obj;
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
                i++;
                if (i < size) {
                    this.$eventListener.transformEnd(this.$request, bitmap);
                    return coil.intercept.EngineInterceptor.ExecuteResult.copy$default(this.$result, new android.graphics.drawable.BitmapDrawable(this.$request.getContext().getResources(), bitmap), false, null, null, 14, null);
                }
            }
        }
    }
}
