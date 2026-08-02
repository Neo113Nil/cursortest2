package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/core/os/ProfilingRequest;", "", "", "profilingType", "Landroid/os/Bundle;", "params", "", "tag", "Landroid/os/CancellationSignal;", "cancellationSignal", "<init>", "(ILandroid/os/Bundle;Ljava/lang/String;Landroid/os/CancellationSignal;)V", com.visa.cbp.getEncExpo.warmup, "getProfilingType", "()I", "Landroid/os/Bundle;", "getParams", "()Landroid/os/Bundle;", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Landroid/os/CancellationSignal;", "getCancellationSignal", "()Landroid/os/CancellationSignal;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfilingRequest {
    private final android.os.CancellationSignal cancellationSignal;
    private final android.os.Bundle params;
    private final int profilingType;
    private final java.lang.String tag;

    public ProfilingRequest(int i, android.os.Bundle bundle, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.profilingType = i;
        this.params = bundle;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    public final int getProfilingType() {
        return this.profilingType;
    }

    public final android.os.Bundle getParams() {
        return this.params;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final android.os.CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }
}
