package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/Api26Impl;", "", "<init>", "()V", "Ljava/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "", "toMillis", "(Ljava/time/Duration;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.Api26Impl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C0274Api26Impl {
    public static final androidx.view.C0274Api26Impl INSTANCE = new androidx.view.C0274Api26Impl();

    private C0274Api26Impl() {
    }

    public final long toMillis(java.time.Duration timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "");
        return timeout.toMillis();
    }
}
