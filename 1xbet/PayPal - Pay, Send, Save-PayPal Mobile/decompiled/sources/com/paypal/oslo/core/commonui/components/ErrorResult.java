package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/ErrorResult;", "Lcom/paypal/oslo/core/commonui/components/ImageResult;", "Lcom/paypal/oslo/core/commonui/components/Image;", "image", "Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "request", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Lcom/paypal/oslo/core/commonui/components/Image;Lcom/paypal/oslo/core/commonui/components/ImageRequest;Ljava/lang/Throwable;)V", "Lcoil3/request/ErrorResult;", "coilResult", "(Lcoil3/request/ErrorResult;)V", "toCoilResult$common_ui_release", "()Lcoil3/request/ErrorResult;", "Lcom/paypal/oslo/core/commonui/components/Image;", "getImage", "()Lcom/paypal/oslo/core/commonui/components/Image;", "Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "getRequest", "()Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ErrorResult extends com.paypal.oslo.core.commonui.components.ImageResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.commonui.components.Image image;
    private final com.paypal.oslo.core.commonui.components.ImageRequest request;
    private final java.lang.Throwable throwable;

    public ErrorResult(com.paypal.oslo.core.commonui.components.Image image, com.paypal.oslo.core.commonui.components.ImageRequest imageRequest, java.lang.Throwable th) {
        super(null);
        this.image = image;
        this.request = imageRequest;
        this.throwable = th;
    }

    public /* synthetic */ ErrorResult(com.paypal.oslo.core.commonui.components.Image image, com.paypal.oslo.core.commonui.components.ImageRequest imageRequest, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : imageRequest, (i & 4) != 0 ? null : th);
    }

    @Override // com.paypal.oslo.core.commonui.components.ImageResult
    public final com.paypal.oslo.core.commonui.components.Image getImage() {
        return this.image;
    }

    @Override // com.paypal.oslo.core.commonui.components.ImageResult
    public final com.paypal.oslo.core.commonui.components.ImageRequest getRequest() {
        return this.request;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ErrorResult(coil3.view.ErrorResult errorResult) {
        this(r0 != null ? new com.paypal.oslo.core.commonui.components.Image(r0) : null, null, errorResult.getThrowable());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResult, "");
        coil3.Image image = errorResult.getImage();
    }

    @Override // com.paypal.oslo.core.commonui.components.ImageResult
    public final coil3.view.ErrorResult toCoilResult$common_ui_release() {
        com.paypal.oslo.core.commonui.components.ImageRequest request = getRequest();
        coil3.view.ImageRequest coilRequest = request != null ? com.paypal.oslo.core.commonui.components.AsyncImageKt.toCoilRequest(request) : null;
        if (coilRequest == null) {
            throw new java.lang.IllegalStateException("Request is required to convert to Coil result".toString());
        }
        com.paypal.oslo.core.commonui.components.Image image = getImage();
        coil3.Image delegate = image != null ? image.getDelegate() : null;
        java.lang.RuntimeException runtimeException = this.throwable;
        if (runtimeException == null) {
            runtimeException = new java.lang.RuntimeException(com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR);
        }
        return new coil3.view.ErrorResult(delegate, coilRequest, runtimeException);
    }

    public ErrorResult() {
        this(null, null, null, 7, null);
    }
}
