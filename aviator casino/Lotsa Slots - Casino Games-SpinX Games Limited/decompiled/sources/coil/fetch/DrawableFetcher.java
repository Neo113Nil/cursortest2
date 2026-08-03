package coil.fetch;

/* compiled from: DrawableFetcher.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcoil/fetch/DrawableFetcher;", "Lcoil/fetch/Fetcher;", "data", "Landroid/graphics/drawable/Drawable;", "options", "Lcoil/request/Options;", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/Options;)V", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawableFetcher implements coil.fetch.Fetcher {
    private final android.graphics.drawable.Drawable data;
    private final coil.request.Options options;

    public DrawableFetcher(android.graphics.drawable.Drawable drawable, coil.request.Options options) {
        this.data = drawable;
        this.options = options;
    }

    @Override // coil.fetch.Fetcher
    public java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> continuation) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        boolean isVector = coil.util.Utils.isVector(this.data);
        if (isVector) {
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.options.getContext().getResources(), coil.util.DrawableUtils.INSTANCE.convertToBitmap(this.data, this.options.getConfig(), this.options.getSize(), this.options.getScale(), this.options.getAllowInexactSize()));
        } else {
            bitmapDrawable = this.data;
        }
        return new coil.fetch.DrawableResult(bitmapDrawable, isVector, coil.decode.DataSource.MEMORY);
    }

    /* compiled from: DrawableFetcher.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcoil/fetch/DrawableFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "create", "Lcoil/fetch/Fetcher;", "data", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.fetch.Fetcher.Factory<android.graphics.drawable.Drawable> {
        @Override // coil.fetch.Fetcher.Factory
        public coil.fetch.Fetcher create(android.graphics.drawable.Drawable data, coil.request.Options options, coil.ImageLoader imageLoader) {
            return new coil.fetch.DrawableFetcher(data, options);
        }
    }
}
