package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/fetch/JarFileFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", "uri", "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcoil3/Uri;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/request/Options;", "getHighSpeedVideoFpsRangesFor", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JarFileFetcher implements coil3.fetch.Fetcher {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.view.Options getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.Uri getHighResolutionOutputSizeshNQ4ISI;

    public JarFileFetcher(coil3.Uri uri, coil3.view.Options options) {
        this.getHighResolutionOutputSizeshNQ4ISI = uri;
        this.getHighSpeedVideoFpsRangesFor = options;
    }

    @Override // coil3.fetch.Fetcher
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        java.lang.String path = this.getHighResolutionOutputSizeshNQ4ISI.getPath();
        if (path == null) {
            path = "";
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) path, '!', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            throw new java.lang.IllegalStateException("Invalid jar:file URI: ".concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI)).toString());
        }
        okio.Path.Companion companion = okio.Path.INSTANCE;
        java.lang.String substring = path.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        okio.Path path2 = okio.Path.Companion.get$default(companion, substring, false, 1, (java.lang.Object) null);
        okio.Path.Companion companion2 = okio.Path.INSTANCE;
        java.lang.String substring2 = path.substring(indexOf$default + 1, path.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        okio.Path path3 = okio.Path.Companion.get$default(companion2, substring2, false, 1, (java.lang.Object) null);
        return new coil3.fetch.SourceFetchResult(coil3.graphics.ImageSourceKt.ImageSource$default(path3, okio.Okio.openZip(this.getHighSpeedVideoFpsRangesFor.getFileSystem(), path2), null, null, null, 28, null), coil3.content.MimeTypeMap.INSTANCE.getMimeTypeFromExtension(coil3.content.FileSystemsKt.getExtension(path3)), coil3.graphics.DataSource.DISK);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/fetch/JarFileFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Lcoil3/Uri;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<coil3.Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(coil3.Uri data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "jar:file")) {
                return new coil3.fetch.JarFileFetcher(data, options);
            }
            return null;
        }
    }
}
