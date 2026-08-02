package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/coroutines/debug/internal/AgentInstallationType;", "", "<init>", "()V", "", "isInstalledStatically", "Z", "isInstalledStatically$kotlinx_coroutines_core", "()Z", "setInstalledStatically$kotlinx_coroutines_core", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AgentInstallationType {
    public static final kotlinx.coroutines.debug.internal.AgentInstallationType INSTANCE = new kotlinx.coroutines.debug.internal.AgentInstallationType();
    private static boolean isInstalledStatically;

    private AgentInstallationType() {
    }

    public final boolean isInstalledStatically$kotlinx_coroutines_core() {
        return isInstalledStatically;
    }

    public final void setInstalledStatically$kotlinx_coroutines_core(boolean z) {
        isInstalledStatically = z;
    }
}
