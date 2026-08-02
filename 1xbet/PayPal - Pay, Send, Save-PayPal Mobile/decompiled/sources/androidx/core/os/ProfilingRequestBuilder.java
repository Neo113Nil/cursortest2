package androidx.core.os;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H$¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H$¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H$¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/core/os/ProfilingRequestBuilder;", "T", "", "<init>", "()V", "", "tag", "setTag", "(Ljava/lang/String;)Landroidx/core/os/ProfilingRequestBuilder;", "Landroid/os/CancellationSignal;", "cancellationSignal", "setCancellationSignal", "(Landroid/os/CancellationSignal;)Landroidx/core/os/ProfilingRequestBuilder;", "Landroidx/core/os/ProfilingRequest;", "build", "()Landroidx/core/os/ProfilingRequest;", "", "getProfilingType", "()I", "getThis", "()Landroidx/core/os/ProfilingRequestBuilder;", "Landroid/os/Bundle;", "getParams", "()Landroid/os/Bundle;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/os/CancellationSignal;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ProfilingRequestBuilder<T extends androidx.core.os.ProfilingRequestBuilder<T>> {
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighSpeedVideoFpsRangesFor;

    protected abstract android.os.Bundle getParams();

    protected abstract int getProfilingType();

    protected abstract T getThis();

    public final T setTag(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        this.getHighResolutionOutputSizeshNQ4ISI = tag;
        return getThis();
    }

    public final T setCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "");
        this.getHighSpeedVideoFpsRangesFor = cancellationSignal;
        return getThis();
    }

    public final androidx.core.os.ProfilingRequest build() {
        return new androidx.core.os.ProfilingRequest(getProfilingType(), getParams(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }
}
