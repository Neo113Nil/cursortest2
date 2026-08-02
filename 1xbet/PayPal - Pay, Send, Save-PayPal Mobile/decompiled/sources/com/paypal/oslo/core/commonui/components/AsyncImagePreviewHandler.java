package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePreviewHandler;", "", "Lkotlin/Function0;", "Lcom/paypal/oslo/core/commonui/components/Image;", "onRequest", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcoil3/compose/AsyncImagePreviewHandler;", "delegate", "Lcoil3/compose/AsyncImagePreviewHandler;", "getDelegate$common_ui_release", "()Lcoil3/compose/AsyncImagePreviewHandler;", "getDelegate$common_ui_release$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AsyncImagePreviewHandler {
    public static final int $stable = 0;
    private final coil3.compose.AsyncImagePreviewHandler delegate;

    public static /* synthetic */ void getDelegate$common_ui_release$annotations() {
    }

    public AsyncImagePreviewHandler(final kotlin.jvm.functions.Function0<com.paypal.oslo.core.commonui.components.Image> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.delegate = new coil3.compose.AsyncImagePreviewHandler() { // from class: com.paypal.oslo.core.commonui.components.AsyncImagePreviewHandler$special$$inlined$AsyncImagePreviewHandlerNotNull$1
            @Override // coil3.compose.AsyncImagePreviewHandler
            public final java.lang.Object handle(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePainter.State> continuation) {
                coil3.Image delegate = ((com.paypal.oslo.core.commonui.components.Image) kotlin.jvm.functions.Function0.this.invoke()).getDelegate();
                return new coil3.compose.AsyncImagePainter.State.Success(coil3.compose.ImagePainter_androidKt.m9746asPainter55t9rM$default(delegate, imageRequest.getContext(), 0, 2, null), new coil3.view.SuccessResult(delegate, imageRequest, null, null, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
            }
        };
    }

    /* renamed from: getDelegate$common_ui_release, reason: from getter */
    public final coil3.compose.AsyncImagePreviewHandler getDelegate() {
        return this.delegate;
    }
}
