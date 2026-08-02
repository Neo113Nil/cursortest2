package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class ScriptHandlerImpl implements androidx.webkit.ScriptHandler {
    private final org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface getHighSpeedVideoFpsRangesFor;

    private ScriptHandlerImpl(org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.getHighSpeedVideoFpsRangesFor = scriptHandlerBoundaryInterface;
    }

    @Override // androidx.webkit.ScriptHandler
    public void remove() {
        this.getHighSpeedVideoFpsRangesFor.remove();
    }

    public static androidx.webkit.internal.ScriptHandlerImpl toScriptHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        return new androidx.webkit.internal.ScriptHandlerImpl((org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
