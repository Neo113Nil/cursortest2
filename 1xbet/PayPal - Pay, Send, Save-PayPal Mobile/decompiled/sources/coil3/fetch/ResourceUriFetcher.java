package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil3/fetch/ResourceUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/Uri;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcoil3/request/Options;", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResourceUriFetcher implements coil3.fetch.Fetcher {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.Uri getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.view.Options getHighResolutionOutputSizeshNQ4ISI;

    public ResourceUriFetcher(coil3.Uri uri, coil3.view.Options options) {
        this.getHighSpeedVideoSizes = uri;
        this.getHighResolutionOutputSizeshNQ4ISI = options;
    }

    @Override // coil3.fetch.Fetcher
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        java.lang.Integer intOrNull;
        android.content.res.Resources resourcesForApplication;
        android.graphics.drawable.Drawable xmlDrawableCompat;
        java.lang.String authority = this.getHighSpeedVideoSizes.getAuthority();
        if (authority != null) {
            if (kotlin.text.StringsKt.isBlank(authority)) {
                authority = null;
            }
            if (authority != null) {
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) coil3.UriKt.getPathSegments(this.getHighSpeedVideoSizes));
                if (str != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(str)) != null) {
                    int intValue = intOrNull.intValue();
                    android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI.getContext();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(authority, context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                    }
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    resourcesForApplication.getValue(intValue, typedValue, true);
                    java.lang.String mimeTypeFromUrl = coil3.content.MimeTypeMap.INSTANCE.getMimeTypeFromUrl(typedValue.string.toString());
                    if (kotlin.jvm.internal.Intrinsics.areEqual(mimeTypeFromUrl, coil3.content.UtilsKt.MIME_TYPE_XML)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(authority, context.getPackageName())) {
                            xmlDrawableCompat = coil3.content.C0302ContextsKt.getDrawableCompat(context, intValue);
                        } else {
                            xmlDrawableCompat = coil3.content.C0302ContextsKt.getXmlDrawableCompat(context, resourcesForApplication, intValue);
                        }
                        android.graphics.drawable.BitmapDrawable bitmapDrawable = xmlDrawableCompat;
                        boolean isVector = coil3.content.Utils_androidKt.isVector(bitmapDrawable);
                        if (isVector) {
                            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), coil3.content.DrawableUtils.INSTANCE.convertToBitmap(bitmapDrawable, coil3.view.ImageRequests_androidKt.getBitmapConfig(this.getHighResolutionOutputSizeshNQ4ISI), this.getHighResolutionOutputSizeshNQ4ISI.getSize(), this.getHighResolutionOutputSizeshNQ4ISI.getScale(), coil3.view.ImageRequestsKt.getMaxBitmapSize(this.getHighResolutionOutputSizeshNQ4ISI), this.getHighResolutionOutputSizeshNQ4ISI.getPrecision() == coil3.view.Precision.INEXACT));
                        }
                        return new coil3.fetch.ImageFetchResult(coil3.Image_androidKt.asImage(bitmapDrawable), isVector, coil3.graphics.DataSource.DISK);
                    }
                    android.util.TypedValue typedValue2 = new android.util.TypedValue();
                    return new coil3.fetch.SourceFetchResult(coil3.graphics.ImageSourceKt.ImageSource(okio.Okio.buffer(okio.Okio.source(resourcesForApplication.openRawResource(intValue, typedValue2))), this.getHighResolutionOutputSizeshNQ4ISI.getFileSystem(), new coil3.graphics.ResourceMetadata(authority, intValue, typedValue2.density)), mimeTypeFromUrl, coil3.graphics.DataSource.DISK);
                }
                throw new java.lang.IllegalStateException("Invalid android.resource URI: ".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes)));
            }
        }
        throw new java.lang.IllegalStateException("Invalid android.resource URI: ".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes)));
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/fetch/ResourceUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Lcoil3/Uri;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<coil3.Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(coil3.Uri data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "android.resource")) {
                return new coil3.fetch.ResourceUriFetcher(data, options);
            }
            return null;
        }
    }
}
