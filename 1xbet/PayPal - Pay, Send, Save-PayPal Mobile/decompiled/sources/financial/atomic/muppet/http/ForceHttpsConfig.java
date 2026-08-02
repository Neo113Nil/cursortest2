package financial.atomic.muppet.http;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Lfinancial/atomic/muppet/http/ForceHttpsConfig;", "", "<init>", "()V", "", "", "bypass", "Ljava/util/Set;", "getBypass", "()Ljava/util/Set;", "setBypass", "(Ljava/util/Set;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ForceHttpsConfig {
    private java.util.Set<java.lang.String> bypass = kotlin.collections.SetsKt.emptySet();

    public final java.util.Set<java.lang.String> getBypass() {
        return this.bypass;
    }

    public final void setBypass(java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.bypass = set;
    }
}
