package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/HotReloader;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class HotReloader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.HotReloader.Companion INSTANCE = new androidx.compose.runtime.HotReloader.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/HotReloader$Companion;", "", "<init>", "()V", "context", "", "simulateHotReload$runtime", "(Ljava/lang/Object;)V", "", "key", "invalidateGroupsWithKey", "(I)V", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors", "()Ljava/util/List;", "clearErrors"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void invalidateGroupsWithKey(int key) {
            androidx.compose.runtime.Recomposer.INSTANCE.invalidateGroupsWithKey$runtime(key);
        }

        public final java.util.List<androidx.compose.runtime.RecomposerErrorInfo> getCurrentErrors() {
            return androidx.compose.runtime.Recomposer.INSTANCE.getCurrentErrors$runtime();
        }

        public final void clearErrors() {
            androidx.compose.runtime.Recomposer.INSTANCE.clearErrors$runtime();
        }

        public final void simulateHotReload$runtime(java.lang.Object context) {
            androidx.compose.runtime.Recomposer.INSTANCE.loadStateAndComposeForHotReload$runtime(androidx.compose.runtime.Recomposer.INSTANCE.saveStateAndDisposeForHotReload$runtime());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
