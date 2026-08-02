package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/LocalAsyncImagePreviewHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePreviewHandler;", "handler", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Lcom/paypal/oslo/core/commonui/components/AsyncImagePreviewHandler;)Landroidx/compose/runtime/ProvidedValue;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LocalAsyncImagePreviewHandler {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.commonui.components.LocalAsyncImagePreviewHandler INSTANCE = new com.paypal.oslo.core.commonui.components.LocalAsyncImagePreviewHandler();

    private LocalAsyncImagePreviewHandler() {
    }

    public final androidx.compose.runtime.ProvidedValue<?> provides(com.paypal.oslo.core.commonui.components.AsyncImagePreviewHandler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        return coil3.compose.LocalAsyncImagePreviewHandlerKt.getLocalAsyncImagePreviewHandler().provides(handler.getDelegate());
    }
}
