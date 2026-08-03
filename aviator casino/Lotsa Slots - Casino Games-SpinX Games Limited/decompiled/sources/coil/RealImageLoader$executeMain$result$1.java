package coil;

/* compiled from: RealImageLoader.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class RealImageLoader$executeMain$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil.request.ImageResult>, java.lang.Object> {
    final /* synthetic */ coil.EventListener $eventListener;
    final /* synthetic */ android.graphics.Bitmap $placeholderBitmap;
    final /* synthetic */ coil.request.ImageRequest $request;
    final /* synthetic */ coil.size.Size $size;
    int label;
    final /* synthetic */ coil.RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$executeMain$result$1(coil.request.ImageRequest imageRequest, coil.RealImageLoader realImageLoader, coil.size.Size size, coil.EventListener eventListener, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation<? super coil.RealImageLoader$executeMain$result$1> continuation) {
        super(2, continuation);
        this.$request = imageRequest;
        this.this$0 = realImageLoader;
        this.$size = size;
        this.$eventListener = eventListener;
        this.$placeholderBitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil.RealImageLoader$executeMain$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        return ((coil.RealImageLoader$executeMain$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coil.request.ImageRequest imageRequest = this.$request;
            list = this.this$0.interceptors;
            coil.request.ImageRequest imageRequest2 = this.$request;
            coil.size.Size size = this.$size;
            coil.EventListener eventListener = this.$eventListener;
            boolean z = this.$placeholderBitmap != null;
            this.label = 1;
            obj = new coil.intercept.RealInterceptorChain(imageRequest, list, 0, imageRequest2, size, eventListener, z).proceed(this.$request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
