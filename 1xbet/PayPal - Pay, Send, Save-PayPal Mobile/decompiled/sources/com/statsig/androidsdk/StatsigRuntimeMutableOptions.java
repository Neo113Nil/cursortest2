package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005"}, d2 = {"Lcom/statsig/androidsdk/StatsigRuntimeMutableOptions;", "", "", "loggingEnabled", "<init>", "(Z)V", "Z", "getLoggingEnabled", "()Z", "setLoggingEnabled"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class StatsigRuntimeMutableOptions {

    @com.google.gson.annotations.SerializedName("loggingEnabled")
    private boolean loggingEnabled;

    public StatsigRuntimeMutableOptions(boolean z) {
        this.loggingEnabled = z;
    }

    public /* synthetic */ StatsigRuntimeMutableOptions(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    public StatsigRuntimeMutableOptions() {
        this(false, 1, null);
    }
}
