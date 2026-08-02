package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PriorityTask;", "", "", "priority", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "request", "<init>", "(ILandroidx/compose/foundation/lazy/layout/PrefetchRequest;)V", com.visa.cbp.getEncExpo.warmup, "getPriority", "()I", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "getRequest", "()Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PriorityTask {
    private static final int Low = 0;
    private final int priority;
    private final androidx.compose.foundation.lazy.layout.PrefetchRequest request;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.PriorityTask.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.PriorityTask.Companion(null);
    public static final int $stable = 8;
    private static final int High = 1;

    public PriorityTask(int i, androidx.compose.foundation.lazy.layout.PrefetchRequest prefetchRequest) {
        this.priority = i;
        this.request = prefetchRequest;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PriorityTask$Companion;", "", "<init>", "()V", "", "Low", com.visa.cbp.getEncExpo.warmup, "getLow", "()I", "High", "getHigh"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int getLow() {
            return androidx.compose.foundation.lazy.layout.PriorityTask.Low;
        }

        public final int getHigh() {
            return androidx.compose.foundation.lazy.layout.PriorityTask.High;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getPriority() {
        return this.priority;
    }

    public final androidx.compose.foundation.lazy.layout.PrefetchRequest getRequest() {
        return this.request;
    }
}
