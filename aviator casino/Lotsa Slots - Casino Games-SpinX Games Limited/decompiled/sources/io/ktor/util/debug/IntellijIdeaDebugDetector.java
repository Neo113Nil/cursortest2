package io.ktor.util.debug;

/* compiled from: IntellijIdeaDebugDetectorJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/util/debug/IntellijIdeaDebugDetector;", "", "<init>", "()V", "", "isDebuggerConnected$delegate", "Lkotlin/Lazy;", "isDebuggerConnected", "()Z", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntellijIdeaDebugDetector {
    public static final io.ktor.util.debug.IntellijIdeaDebugDetector INSTANCE = new io.ktor.util.debug.IntellijIdeaDebugDetector();

    /* renamed from: isDebuggerConnected$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy isDebuggerConnected = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.debug.IntellijIdeaDebugDetector$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            boolean isDebuggerConnected_delegate$lambda$0;
            isDebuggerConnected_delegate$lambda$0 = io.ktor.util.debug.IntellijIdeaDebugDetector.isDebuggerConnected_delegate$lambda$0();
            return java.lang.Boolean.valueOf(isDebuggerConnected_delegate$lambda$0);
        }
    });

    private IntellijIdeaDebugDetector() {
    }

    public final boolean isDebuggerConnected() {
        return ((java.lang.Boolean) isDebuggerConnected.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDebuggerConnected_delegate$lambda$0() {
        try {
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) java.lang.management.ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), (java.lang.CharSequence) "jdwp", false, 2, (java.lang.Object) null);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
