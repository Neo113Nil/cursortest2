package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/ImageLoader;", "", "Lcoil3/ImageLoader;", "delegate", "<init>", "(Lcoil3/ImageLoader;)V", "Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "request", "Lcom/paypal/oslo/core/commonui/components/ImageResult;", "execute", "(Lcom/paypal/oslo/core/commonui/components/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enqueue", "(Lcom/paypal/oslo/core/commonui/components/ImageRequest;)V", "Lcoil3/ImageLoader;", "getDelegate$common_ui_release", "()Lcoil3/ImageLoader;", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImageLoader {
    public static final int $stable = 8;
    private final coil3.ImageLoader delegate;

    public ImageLoader(coil3.ImageLoader imageLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoader, "");
        this.delegate = imageLoader;
    }

    /* renamed from: getDelegate$common_ui_release, reason: from getter */
    public final coil3.ImageLoader getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(com.paypal.oslo.core.commonui.components.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.ImageResult> continuation) {
        com.paypal.oslo.core.commonui.components.ImageLoader$execute$1 imageLoader$execute$1;
        int i;
        coil3.view.ImageResult imageResult;
        if (continuation instanceof com.paypal.oslo.core.commonui.components.ImageLoader$execute$1) {
            imageLoader$execute$1 = (com.paypal.oslo.core.commonui.components.ImageLoader$execute$1) continuation;
            if ((imageLoader$execute$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                imageLoader$execute$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = imageLoader$execute$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = imageLoader$execute$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coil3.ImageLoader imageLoader = this.delegate;
                    coil3.view.ImageRequest coilRequest = com.paypal.oslo.core.commonui.components.AsyncImageKt.toCoilRequest(imageRequest);
                    imageLoader$execute$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(imageRequest);
                    imageLoader$execute$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = imageLoader.execute(coilRequest, imageLoader$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                imageResult = (coil3.view.ImageResult) obj;
                if (!(imageResult instanceof coil3.view.SuccessResult)) {
                    return new com.paypal.oslo.core.commonui.components.SuccessResult((coil3.view.SuccessResult) imageResult);
                }
                if (imageResult instanceof coil3.view.ErrorResult) {
                    return new com.paypal.oslo.core.commonui.components.ErrorResult((coil3.view.ErrorResult) imageResult);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        imageLoader$execute$1 = new com.paypal.oslo.core.commonui.components.ImageLoader$execute$1(this, continuation);
        java.lang.Object obj2 = imageLoader$execute$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imageLoader$execute$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        imageResult = (coil3.view.ImageResult) obj2;
        if (!(imageResult instanceof coil3.view.SuccessResult)) {
        }
    }

    public final void enqueue(com.paypal.oslo.core.commonui.components.ImageRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.delegate.enqueue(com.paypal.oslo.core.commonui.components.AsyncImageKt.toCoilRequest(request));
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/ImageLoader$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/core/commonui/components/ImageLoader;", "build", "()Lcom/paypal/oslo/core/commonui/components/ImageLoader;", "Lcoil3/ImageLoader$Builder;", "Camera2StreamConfigurationMap", "Lcoil3/ImageLoader$Builder;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final coil3.ImageLoader.Builder getHighSpeedVideoFpsRangesFor;

        public Builder(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            this.getHighSpeedVideoFpsRangesFor = new coil3.ImageLoader.Builder(context);
        }

        public final com.paypal.oslo.core.commonui.components.ImageLoader build() {
            return new com.paypal.oslo.core.commonui.components.ImageLoader(this.getHighSpeedVideoFpsRangesFor.build());
        }
    }
}
