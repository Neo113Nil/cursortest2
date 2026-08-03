package com.vungle.ads.internal.util;

/* compiled from: ImageLoader.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nJH\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0011J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/internal/util/ImageLoader;", "", "()V", "ioExecutor", "Ljava/util/concurrent/Executor;", "displayImage", "", com.facebook.share.internal.ShareConstants.MEDIA_URI, "", "onImageLoaded", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Lkotlin/ParameterName;", "name", "bitmap", "getImageSize", "onImageSizeLoaded", "Lkotlin/Function2;", "", "width", "height", com.ironsource.X3.a.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageLoader {
    private static final java.lang.String FILE_SCHEME = "file://";
    private java.util.concurrent.Executor ioExecutor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.util.ImageLoader.Companion INSTANCE = new com.vungle.ads.internal.util.ImageLoader.Companion(null);
    private static final java.lang.String TAG = "ImageLoader";
    private static final com.vungle.ads.internal.util.ImageLoader instance = new com.vungle.ads.internal.util.ImageLoader();

    private ImageLoader() {
    }

    public final void init(java.util.concurrent.Executor ioExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }

    public final void displayImage(final java.lang.String uri, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onImageLoaded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        java.lang.String str = uri;
        if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG3 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.w(TAG3, "the uri is required.");
            return;
        }
        java.util.concurrent.Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.util.ImageLoader$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.util.ImageLoader.m10510displayImage$lambda0(uri, onImageLoaded);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m10510displayImage$lambda0(java.lang.String str, kotlin.jvm.functions.Function1 onImageLoaded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        if (kotlin.text.StringsKt.startsWith$default(str, "file://", false, 2, (java.lang.Object) null)) {
            java.lang.String substring = str.substring(7);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile(substring);
            if (decodeFile != null) {
                onImageLoaded.invoke(decodeFile);
                return;
            }
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void getImageSize(java.lang.String uri, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onImageSizeLoaded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onImageSizeLoaded, "onImageSizeLoaded");
        java.lang.String str = uri;
        if (str == null || str.length() == 0 || !kotlin.text.StringsKt.startsWith$default(uri, "file://", false, 2, (java.lang.Object) null)) {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "the valid uri is required.");
            return;
        }
        java.lang.String substring = uri.substring(7);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(substring, options);
        onImageSizeLoaded.invoke(java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
    }

    /* compiled from: ImageLoader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/util/ImageLoader$Companion;", "", "()V", "FILE_SCHEME", "", "TAG", "kotlin.jvm.PlatformType", com.ironsource.C3232q2.p, "Lcom/vungle/ads/internal/util/ImageLoader;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "()Lcom/vungle/ads/internal/util/ImageLoader;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.vungle.ads.internal.util.ImageLoader getInstance() {
            return com.vungle.ads.internal.util.ImageLoader.instance;
        }
    }
}
