package coil3;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\f\u0010\u000f"}, d2 = {"Lcoil3/Extras;", "other", "plus", "(Lcoil3/Extras;Lcoil3/Extras;)Lcoil3/Extras;", "T", "Lcoil3/Extras$Key;", "key", "getOrDefault", "(Lcoil3/Extras;Lcoil3/Extras$Key;)Ljava/lang/Object;", "orEmpty", "(Lcoil3/Extras;)Lcoil3/Extras;", "Lcoil3/request/ImageRequest;", "getExtra", "(Lcoil3/request/ImageRequest;Lcoil3/Extras$Key;)Ljava/lang/Object;", "Lcoil3/request/Options;", "(Lcoil3/request/Options;Lcoil3/Extras$Key;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtrasKt {
    public static final coil3.Extras plus(coil3.Extras extras, coil3.Extras extras2) {
        return new coil3.Extras.Builder((java.util.Map<coil3.Extras.Key<?>, ? extends java.lang.Object>) kotlin.collections.MapsKt.plus(extras.asMap(), extras2.asMap())).build();
    }

    public static final <T> T getOrDefault(coil3.Extras extras, coil3.Extras.Key<T> key) {
        T t = (T) extras.get(key);
        return t == null ? key.getDefault() : t;
    }

    public static final coil3.Extras orEmpty(coil3.Extras extras) {
        return extras == null ? coil3.Extras.EMPTY : extras;
    }

    public static final <T> T getExtra(coil3.view.ImageRequest imageRequest, coil3.Extras.Key<T> key) {
        T t = (T) imageRequest.getExtras().get(key);
        if (t != null) {
            return t;
        }
        T t2 = (T) imageRequest.getDefaults().getExtras().get(key);
        return t2 == null ? key.getDefault() : t2;
    }

    public static final <T> T getExtra(coil3.view.Options options, coil3.Extras.Key<T> key) {
        T t = (T) options.getExtras().get(key);
        return t == null ? key.getDefault() : t;
    }
}
