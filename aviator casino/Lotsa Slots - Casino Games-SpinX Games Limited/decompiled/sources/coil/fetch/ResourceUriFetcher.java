package coil.fetch;

/* compiled from: ResourceUriFetcher.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcoil/fetch/ResourceUriFetcher;", "Lcoil/fetch/Fetcher;", "data", "Landroid/net/Uri;", "options", "Lcoil/request/Options;", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "throwInvalidUriException", "", "Factory", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourceUriFetcher implements coil.fetch.Fetcher {
    private static final java.lang.String MIME_TYPE_XML = "text/xml";
    private final android.net.Uri data;
    private final coil.request.Options options;

    public ResourceUriFetcher(android.net.Uri uri, coil.request.Options options) {
        this.data = uri;
        this.options = options;
    }

    @Override // coil.fetch.Fetcher
    public java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> continuation) {
        java.lang.Integer intOrNull;
        android.content.res.Resources resourcesForApplication;
        android.graphics.drawable.Drawable xmlDrawableCompat;
        java.lang.String authority = this.data.getAuthority();
        if (authority != null) {
            if (!(!kotlin.text.StringsKt.isBlank(authority))) {
                authority = null;
            }
            if (authority != null) {
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.data.getPathSegments());
                if (str == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str)) == null) {
                    throwInvalidUriException(this.data);
                    throw new kotlin.KotlinNothingValueException();
                }
                int intValue = intOrNull.intValue();
                android.content.Context context = this.options.getContext();
                if (kotlin.jvm.internal.Intrinsics.areEqual(authority, context.getPackageName())) {
                    resourcesForApplication = context.getResources();
                } else {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                }
                android.util.TypedValue typedValue = new android.util.TypedValue();
                resourcesForApplication.getValue(intValue, typedValue, true);
                java.lang.CharSequence charSequence = typedValue.string;
                java.lang.String mimeTypeFromUrl = coil.util.Utils.getMimeTypeFromUrl(android.webkit.MimeTypeMap.getSingleton(), charSequence.subSequence(kotlin.text.StringsKt.lastIndexOf$default(charSequence, kotlinx.io.files.FileSystemKt.UnixPathSeparator, 0, false, 6, (java.lang.Object) null), charSequence.length()).toString());
                if (kotlin.jvm.internal.Intrinsics.areEqual(mimeTypeFromUrl, MIME_TYPE_XML)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(authority, context.getPackageName())) {
                        xmlDrawableCompat = coil.util.Contexts.getDrawableCompat(context, intValue);
                    } else {
                        xmlDrawableCompat = coil.util.Contexts.getXmlDrawableCompat(context, resourcesForApplication, intValue);
                    }
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = xmlDrawableCompat;
                    boolean isVector = coil.util.Utils.isVector(bitmapDrawable);
                    if (isVector) {
                        bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), coil.util.DrawableUtils.INSTANCE.convertToBitmap(bitmapDrawable, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
                    }
                    return new coil.fetch.DrawableResult(bitmapDrawable, isVector, coil.decode.DataSource.DISK);
                }
                android.util.TypedValue typedValue2 = new android.util.TypedValue();
                return new coil.fetch.SourceResult(coil.decode.ImageSources.create(okio.Okio.buffer(okio.Okio.source(resourcesForApplication.openRawResource(intValue, typedValue2))), context, new coil.decode.ResourceMetadata(authority, intValue, typedValue2.density)), mimeTypeFromUrl, coil.decode.DataSource.DISK);
            }
        }
        throwInvalidUriException(this.data);
        throw new kotlin.KotlinNothingValueException();
    }

    private final java.lang.Void throwInvalidUriException(android.net.Uri data) {
        throw new java.lang.IllegalStateException("Invalid android.resource URI: " + data);
    }

    /* compiled from: ResourceUriFetcher.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcoil/fetch/ResourceUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "<init>", "()V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.fetch.Fetcher.Factory<android.net.Uri> {
        @Override // coil.fetch.Fetcher.Factory
        public coil.fetch.Fetcher create(android.net.Uri data, coil.request.Options options, coil.ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new coil.fetch.ResourceUriFetcher(data, options);
            }
            return null;
        }

        private final boolean isApplicable(android.net.Uri data) {
            return kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "android.resource");
        }
    }
}
