package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000f0\f0\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\f0\u000b¢\u0006\u0004\b\u0013\u0010\u0011\u001a\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\n"}, d2 = {"", "context", "", "simulateHotReload", "(Ljava/lang/Object;)V", "", "key", "invalidateGroupsWithKey", "(I)V", "disableHotReloadMode", "()V", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "currentCompositionErrors", "()Ljava/util/List;", "", "getCurrentCompositionErrors", "clearCompositionErrors"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HotReloaderKt {
    public static final void simulateHotReload(java.lang.Object obj) {
        androidx.compose.runtime.HotReloader.INSTANCE.simulateHotReload$runtime(obj);
    }

    public static final void invalidateGroupsWithKey(int i) {
        androidx.compose.runtime.HotReloader.INSTANCE.invalidateGroupsWithKey(i);
    }

    public static final void disableHotReloadMode() {
        androidx.compose.runtime.Recomposer.INSTANCE.setHotReloadEnabled$runtime(false);
    }

    @kotlin.Deprecated(message = "currentCompositionErrors only reports errors that extend from Exception. This method is unsupported outside of Compose runtime tests. Internally, getCurrentCompositionErrors should be used instead.")
    public static final java.util.List<kotlin.Pair<java.lang.Exception, java.lang.Boolean>> currentCompositionErrors() {
        java.util.List<kotlin.Pair<java.lang.Throwable, java.lang.Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.lang.Throwable th = (java.lang.Throwable) pair.component1();
            boolean booleanValue = ((java.lang.Boolean) pair.component2()).booleanValue();
            java.lang.Exception exc = th instanceof java.lang.Exception ? (java.lang.Exception) th : null;
            kotlin.Pair pair2 = exc != null ? kotlin.TuplesKt.to(exc, java.lang.Boolean.valueOf(booleanValue)) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return arrayList;
    }

    public static final java.util.List<kotlin.Pair<java.lang.Throwable, java.lang.Boolean>> getCurrentCompositionErrors() {
        java.util.List<androidx.compose.runtime.RecomposerErrorInfo> currentErrors = androidx.compose.runtime.HotReloader.INSTANCE.getCurrentErrors();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(currentErrors, 10));
        for (androidx.compose.runtime.RecomposerErrorInfo recomposerErrorInfo : currentErrors) {
            arrayList.add(kotlin.TuplesKt.to(recomposerErrorInfo.getGetHighSpeedVideoSizes(), java.lang.Boolean.valueOf(recomposerErrorInfo.getGetHighSpeedVideoFpsRangesFor())));
        }
        return arrayList;
    }

    public static final void clearCompositionErrors() {
        androidx.compose.runtime.HotReloader.INSTANCE.clearErrors();
    }
}
