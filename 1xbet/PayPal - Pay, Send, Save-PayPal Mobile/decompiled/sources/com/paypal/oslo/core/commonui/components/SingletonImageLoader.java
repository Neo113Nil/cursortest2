package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/SingletonImageLoader;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/paypal/oslo/core/commonui/components/ImageLoader;", "factory", "", "setSafe", "(Lkotlin/jvm/functions/Function1;)V", "loader", "setUnsafe", "(Lcom/paypal/oslo/core/commonui/components/ImageLoader;)V", "reset", "context", "get", "(Landroid/content/Context;)Lcom/paypal/oslo/core/commonui/components/ImageLoader;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SingletonImageLoader {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.commonui.components.SingletonImageLoader INSTANCE = new com.paypal.oslo.core.commonui.components.SingletonImageLoader();

    private SingletonImageLoader() {
    }

    public final void setSafe(final kotlin.jvm.functions.Function1<? super android.content.Context, com.paypal.oslo.core.commonui.components.ImageLoader> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        coil3.SingletonImageLoader.setSafe(new coil3.SingletonImageLoader.Factory() { // from class: com.paypal.oslo.core.commonui.components.SingletonImageLoader$$ExternalSyntheticLambda0
            @Override // coil3.SingletonImageLoader.Factory
            public final coil3.ImageLoader newImageLoader(android.content.Context context) {
                return com.paypal.oslo.core.commonui.components.SingletonImageLoader.m11201$r8$lambda$AoGQsHqfm1MTCItKAuue4ldVh0(kotlin.jvm.functions.Function1.this, context);
            }
        });
    }

    public final void setUnsafe(com.paypal.oslo.core.commonui.components.ImageLoader loader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loader, "");
        coil3.SingletonImageLoader.setUnsafe(loader.getDelegate());
    }

    public final void reset() {
        coil3.SingletonImageLoader.reset();
    }

    public final com.paypal.oslo.core.commonui.components.ImageLoader get(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.core.commonui.components.ImageLoader(coil3.SingletonImageLoader.get(context));
    }

    /* renamed from: $r8$lambda$AoGQsHqfm1MTCItKAuue-4ldVh0, reason: not valid java name */
    public static /* synthetic */ coil3.ImageLoader m11201$r8$lambda$AoGQsHqfm1MTCItKAuue4ldVh0(kotlin.jvm.functions.Function1 function1, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return ((com.paypal.oslo.core.commonui.components.ImageLoader) function1.invoke(context)).getDelegate();
    }
}
