package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/SuccessResult;", "Lcom/paypal/oslo/core/commonui/components/ImageResult;", "Lcom/paypal/oslo/core/commonui/components/Image;", "image", "Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "request", "Lcom/paypal/oslo/core/commonui/components/DataSource;", "dataSource", "<init>", "(Lcom/paypal/oslo/core/commonui/components/Image;Lcom/paypal/oslo/core/commonui/components/ImageRequest;Lcom/paypal/oslo/core/commonui/components/DataSource;)V", "Lcoil3/request/SuccessResult;", "coilResult", "(Lcoil3/request/SuccessResult;)V", "toCoilResult$common_ui_release", "()Lcoil3/request/SuccessResult;", "Lcom/paypal/oslo/core/commonui/components/Image;", "getImage", "()Lcom/paypal/oslo/core/commonui/components/Image;", "Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "getRequest", "()Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "Lcom/paypal/oslo/core/commonui/components/DataSource;", "getDataSource", "()Lcom/paypal/oslo/core/commonui/components/DataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SuccessResult extends com.paypal.oslo.core.commonui.components.ImageResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.commonui.components.DataSource dataSource;
    private final com.paypal.oslo.core.commonui.components.Image image;
    private final com.paypal.oslo.core.commonui.components.ImageRequest request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessResult(com.paypal.oslo.core.commonui.components.Image image, com.paypal.oslo.core.commonui.components.ImageRequest imageRequest, com.paypal.oslo.core.commonui.components.DataSource dataSource) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "");
        this.image = image;
        this.request = imageRequest;
        this.dataSource = dataSource;
    }

    @Override // com.paypal.oslo.core.commonui.components.ImageResult
    public final com.paypal.oslo.core.commonui.components.Image getImage() {
        return this.image;
    }

    @Override // com.paypal.oslo.core.commonui.components.ImageResult
    public final com.paypal.oslo.core.commonui.components.ImageRequest getRequest() {
        return this.request;
    }

    public /* synthetic */ SuccessResult(com.paypal.oslo.core.commonui.components.Image image, com.paypal.oslo.core.commonui.components.ImageRequest imageRequest, com.paypal.oslo.core.commonui.components.DataSource dataSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(image, (i & 2) != 0 ? null : imageRequest, (i & 4) != 0 ? com.paypal.oslo.core.commonui.components.DataSource.MEMORY_CACHE : dataSource);
    }

    public final com.paypal.oslo.core.commonui.components.DataSource getDataSource() {
        return this.dataSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuccessResult(coil3.view.SuccessResult successResult) {
        this(new com.paypal.oslo.core.commonui.components.Image(successResult.getImage()), null, com.paypal.oslo.core.commonui.components.DataSource.INSTANCE.fromCoil(successResult.getDataSource()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successResult, "");
    }

    @Override // com.paypal.oslo.core.commonui.components.ImageResult
    public final coil3.view.SuccessResult toCoilResult$common_ui_release() {
        com.paypal.oslo.core.commonui.components.ImageRequest request = getRequest();
        coil3.view.ImageRequest coilRequest = request != null ? com.paypal.oslo.core.commonui.components.AsyncImageKt.toCoilRequest(request) : null;
        if (coilRequest == null) {
            throw new java.lang.IllegalStateException("Request is required to convert to Coil result".toString());
        }
        return new coil3.view.SuccessResult(getImage().getDelegate(), coilRequest, this.dataSource.toCoilDataSource$common_ui_release(), null, null, false, false, 120, null);
    }
}
