package androidx.compose.foundation.lazy.layout;

@kotlin.Deprecated(message = "Customization of PrefetchScheduler is no longer supported. LazyLayout will attach an appropriate scheduler internally. If you needed to customize it please file a Feature Request.")
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "", "", "availableTimeNanos", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PrefetchRequestScope {
    long availableTimeNanos();
}
