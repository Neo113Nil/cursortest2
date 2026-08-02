package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/time/Duration;", "", "toMillisCompat", "(Ljava/time/Duration;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DurationApi26Impl {
    public static final long toMillisCompat(java.time.Duration duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
        return duration.toMillis();
    }
}
