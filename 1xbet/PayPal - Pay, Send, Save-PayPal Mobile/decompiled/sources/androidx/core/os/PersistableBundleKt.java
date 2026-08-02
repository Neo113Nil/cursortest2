package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\b\u001a\u001f\u0010\n\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lkotlin/Pair;", "", "", "pairs", "Landroid/os/PersistableBundle;", "persistableBundleOf", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "()Landroid/os/PersistableBundle;", "", "toPersistableBundle", "(Ljava/util/Map;)Landroid/os/PersistableBundle;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistableBundleKt {
    @kotlin.Deprecated(message = "This method does not provide type safety at compile time. Use the platform `PersistableBundle` class directly instead.")
    public static final android.os.PersistableBundle persistableBundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle(pairArr.length);
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairArr) {
            androidx.core.os.PersistableBundleApi21ImplKt.getHighSpeedVideoSizes(persistableBundle, pair.component1(), pair.component2());
        }
        return persistableBundle;
    }

    public static final android.os.PersistableBundle persistableBundleOf() {
        return new android.os.PersistableBundle(0);
    }

    public static final android.os.PersistableBundle toPersistableBundle(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle(map.size());
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            androidx.core.os.PersistableBundleApi21ImplKt.getHighSpeedVideoSizes(persistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundle;
    }
}
