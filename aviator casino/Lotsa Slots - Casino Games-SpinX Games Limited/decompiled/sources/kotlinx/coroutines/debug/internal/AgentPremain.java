package kotlinx.coroutines.debug.internal;

/* compiled from: AgentPremain.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/AgentPremain;", "", "<init>", "()V", "enableCreationStackTraces", "", "premain", "", "args", "", "instrumentation", "Ljava/lang/instrument/Instrumentation;", "installSignalHandler", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AgentPremain {
    public static final kotlinx.coroutines.debug.internal.AgentPremain INSTANCE = new kotlinx.coroutines.debug.internal.AgentPremain();
    private static final boolean enableCreationStackTraces;

    private AgentPremain() {
    }

    static {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String property = java.lang.System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(property != null ? java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(property)) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
        enableCreationStackTraces = bool != null ? bool.booleanValue() : kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.getEnableCreationStackTraces$kotlinx_coroutines_core();
    }

    @kotlin.jvm.JvmStatic
    public static final void premain(java.lang.String args, java.lang.instrument.Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(kotlinx.coroutines.debug.internal.AgentPremain.DebugProbesTransformer.INSTANCE);
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.setEnableCreationStackTraces$kotlinx_coroutines_core(enableCreationStackTraces);
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.install$kotlinx_coroutines_core();
        INSTANCE.installSignalHandler();
    }

    /* compiled from: AgentPremain.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/debug/internal/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "<init>", "()V", "transform", "", "loader", "Ljava/lang/ClassLoader;", "className", "", "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DebugProbesTransformer implements java.lang.instrument.ClassFileTransformer {
        public static final kotlinx.coroutines.debug.internal.AgentPremain.DebugProbesTransformer INSTANCE = new kotlinx.coroutines.debug.internal.AgentPremain.DebugProbesTransformer();

        private DebugProbesTransformer() {
        }

        public byte[] transform(java.lang.ClassLoader loader, java.lang.String className, java.lang.Class<?> classBeingRedefined, java.security.ProtectionDomain protectionDomain, byte[] classfileBuffer) {
            if (loader == null || !kotlin.jvm.internal.Intrinsics.areEqual(className, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
            return kotlin.io.ByteStreamsKt.readBytes(loader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    private final void installSignalHandler() {
        try {
            sun.misc.Signal.handle(new sun.misc.Signal("TRAP"), new sun.misc.SignalHandler() { // from class: kotlinx.coroutines.debug.internal.AgentPremain$$ExternalSyntheticLambda0
                public final void handle(sun.misc.Signal signal) {
                    kotlinx.coroutines.debug.internal.AgentPremain.installSignalHandler$lambda$1(signal);
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installSignalHandler$lambda$1(sun.misc.Signal signal) {
        if (kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isInstalled$kotlinx_coroutines_debug()) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.dumpCoroutines(java.lang.System.out);
        } else {
            java.lang.System.out.println((java.lang.Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }
}
