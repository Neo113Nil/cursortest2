package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/ImageResult;", "", "<init>", "()V", "Lcoil3/request/ImageResult;", "toCoilResult$common_ui_release", "()Lcoil3/request/ImageResult;", "Lcom/paypal/oslo/core/commonui/components/Image;", "getImage", "()Lcom/paypal/oslo/core/commonui/components/Image;", "image", "Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "getRequest", "()Lcom/paypal/oslo/core/commonui/components/ImageRequest;", "request", "Lcom/paypal/oslo/core/commonui/components/ErrorResult;", "Lcom/paypal/oslo/core/commonui/components/SuccessResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ImageResult {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.core.commonui.components.Image getImage();

    public abstract com.paypal.oslo.core.commonui.components.ImageRequest getRequest();

    public abstract coil3.view.ImageResult toCoilResult$common_ui_release();

    private ImageResult() {
    }

    public /* synthetic */ ImageResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
