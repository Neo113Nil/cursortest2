package coil.fetch;

/* compiled from: FileFetcher.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcoil/fetch/FileFetcher;", "Lcoil/fetch/Fetcher;", "data", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileFetcher implements coil.fetch.Fetcher {
    private final java.io.File data;

    public FileFetcher(java.io.File file) {
        this.data = file;
    }

    @Override // coil.fetch.Fetcher
    public java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> continuation) {
        return new coil.fetch.SourceResult(coil.decode.ImageSources.create$default(okio.Path.Companion.get$default(okio.Path.INSTANCE, this.data, false, 1, (java.lang.Object) null), null, null, null, 14, null), android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(kotlin.io.FilesKt.getExtension(this.data)), coil.decode.DataSource.DISK);
    }

    /* compiled from: FileFetcher.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcoil/fetch/FileFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/io/File;", "<init>", "()V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.fetch.Fetcher.Factory<java.io.File> {
        @Override // coil.fetch.Fetcher.Factory
        public coil.fetch.Fetcher create(java.io.File data, coil.request.Options options, coil.ImageLoader imageLoader) {
            return new coil.fetch.FileFetcher(data);
        }
    }
}
