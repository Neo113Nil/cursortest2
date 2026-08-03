package androidx.compose.runtime;

/* compiled from: HotReloader.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"clearCompositionErrors", "", "currentCompositionErrors", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "invalidateGroupsWithKey", com.ironsource.X3.i.W, "", "simulateHotReload", "context", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HotReloaderKt {
    public static final void simulateHotReload(java.lang.Object obj) {
        androidx.compose.runtime.HotReloader.INSTANCE.simulateHotReload$runtime_release(obj);
    }

    public static final void invalidateGroupsWithKey(int i) {
        androidx.compose.runtime.HotReloader.INSTANCE.invalidateGroupsWithKey$runtime_release(i);
    }

    public static final java.util.List<kotlin.Pair<java.lang.Exception, java.lang.Boolean>> currentCompositionErrors() {
        java.util.List<androidx.compose.runtime.RecomposerErrorInfo> currentErrors$runtime_release = androidx.compose.runtime.HotReloader.INSTANCE.getCurrentErrors$runtime_release();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(currentErrors$runtime_release, 10));
        for (androidx.compose.runtime.RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(kotlin.TuplesKt.to(recomposerErrorInfo.getCause(), java.lang.Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    public static final void clearCompositionErrors() {
        androidx.compose.runtime.HotReloader.INSTANCE.clearErrors$runtime_release();
    }
}
