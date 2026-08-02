package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/util/FetcherServiceLoaderTarget;", "", "T", "Lcoil3/fetch/Fetcher$Factory;", "factory", "()Lcoil3/fetch/Fetcher$Factory;", "Lkotlin/reflect/KClass;", "type", "()Lkotlin/reflect/KClass;", "", "priority", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FetcherServiceLoaderTarget<T> {
    coil3.fetch.Fetcher.Factory<T> factory();

    default int priority() {
        return 0;
    }

    kotlin.reflect.KClass<T> type();
}
