package androidx.core.os;

/* compiled from: PersistableBundle.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a=\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0007¨\u0006\n"}, d2 = {"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "toPersistableBundle", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistableBundleKt {
    public static final android.os.PersistableBundle persistableBundleOf(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        android.os.PersistableBundle createPersistableBundle = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(pairArr.length);
        for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair : pairArr) {
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(createPersistableBundle, pair.component1(), pair.component2());
        }
        return createPersistableBundle;
    }

    public static final android.os.PersistableBundle persistableBundleOf() {
        return androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }

    public static final android.os.PersistableBundle toPersistableBundle(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        android.os.PersistableBundle createPersistableBundle = androidx.core.os.PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            androidx.core.os.PersistableBundleApi21ImplKt.putValue(createPersistableBundle, entry.getKey(), entry.getValue());
        }
        return createPersistableBundle;
    }
}
