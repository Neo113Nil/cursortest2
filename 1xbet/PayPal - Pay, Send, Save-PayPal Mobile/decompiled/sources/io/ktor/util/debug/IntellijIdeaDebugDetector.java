package io.ktor.util.debug;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0007\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/util/debug/IntellijIdeaDebugDetector;", "", "<init>", "()V", "", "isDebuggerConnected$delegate", "Lkotlin/Lazy;", "isDebuggerConnected", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IntellijIdeaDebugDetector {
    public static final io.ktor.util.debug.IntellijIdeaDebugDetector INSTANCE = new io.ktor.util.debug.IntellijIdeaDebugDetector();

    /* renamed from: isDebuggerConnected$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy isDebuggerConnected = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.debug.IntellijIdeaDebugDetector$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            boolean highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = io.ktor.util.debug.IntellijIdeaDebugDetector.getHighSpeedVideoFpsRanges();
            return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
        }
    });

    private IntellijIdeaDebugDetector() {
    }

    public final boolean isDebuggerConnected() {
        return ((java.lang.Boolean) isDebuggerConnected.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges() {
        try {
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) java.lang.management.ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), (java.lang.CharSequence) "jdwp", false, 2, (java.lang.Object) null);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
