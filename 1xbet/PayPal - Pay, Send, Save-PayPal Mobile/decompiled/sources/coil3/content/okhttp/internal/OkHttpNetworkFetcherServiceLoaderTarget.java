package coil3.content.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcoil3/network/okhttp/internal/OkHttpNetworkFetcherServiceLoaderTarget;", "Lcoil3/util/FetcherServiceLoaderTarget;", "Lcoil3/Uri;", "<init>", "()V", "Lcoil3/network/NetworkFetcher$Factory;", "factory", "()Lcoil3/network/NetworkFetcher$Factory;", "Lkotlin/reflect/KClass;", "type", "()Lkotlin/reflect/KClass;", "", "priority", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkHttpNetworkFetcherServiceLoaderTarget implements coil3.content.FetcherServiceLoaderTarget<coil3.Uri> {
    @Override // coil3.content.FetcherServiceLoaderTarget
    public final int priority() {
        return 2;
    }

    @Override // coil3.content.FetcherServiceLoaderTarget
    public final coil3.fetch.Fetcher.Factory<coil3.Uri> factory() {
        return coil3.content.okhttp.OkHttpNetworkFetcher.factory();
    }

    @Override // coil3.content.FetcherServiceLoaderTarget
    public final kotlin.reflect.KClass<coil3.Uri> type() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class);
    }
}
