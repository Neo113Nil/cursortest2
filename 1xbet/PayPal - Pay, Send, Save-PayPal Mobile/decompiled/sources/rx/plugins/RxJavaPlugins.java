package rx.plugins;

/* loaded from: classes18.dex */
public class RxJavaPlugins {
    private static final rx.plugins.RxJavaPlugins getHighSpeedVideoFpsRangesFor = new rx.plugins.RxJavaPlugins();
    static final rx.plugins.RxJavaErrorHandler getHighResolutionOutputSizeshNQ4ISI = new rx.plugins.RxJavaErrorHandler() { // from class: rx.plugins.RxJavaPlugins.1
    };
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.RxJavaErrorHandler> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.RxJavaObservableExecutionHook> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.RxJavaSingleExecutionHook> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.RxJavaCompletableExecutionHook> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
    private final java.util.concurrent.atomic.AtomicReference<rx.plugins.RxJavaSchedulersHook> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

    @java.lang.Deprecated
    public static rx.plugins.RxJavaPlugins getInstance() {
        return getHighSpeedVideoFpsRangesFor;
    }

    RxJavaPlugins() {
    }

    public void reset() {
        rx.plugins.RxJavaPlugins rxJavaPlugins = getHighSpeedVideoFpsRangesFor;
        rxJavaPlugins.getHighSpeedVideoFpsRanges.set(null);
        rxJavaPlugins.getHighSpeedVideoSizes.set(null);
        rxJavaPlugins.getInputSizeshNQ4ISI.set(null);
        rxJavaPlugins.Camera2StreamConfigurationMap.set(null);
        rxJavaPlugins.getOutputMinFrameDuration.set(null);
    }

    public rx.plugins.RxJavaErrorHandler getErrorHandler() {
        if (this.getHighSpeedVideoFpsRanges.get() == null) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(rx.plugins.RxJavaErrorHandler.class, getHighSpeedVideoFpsRanges());
            if (highSpeedVideoSizes == null) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, null, getHighResolutionOutputSizeshNQ4ISI);
            } else {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, null, (rx.plugins.RxJavaErrorHandler) highSpeedVideoSizes);
            }
        }
        return this.getHighSpeedVideoFpsRanges.get();
    }

    public void registerErrorHandler(rx.plugins.RxJavaErrorHandler rxJavaErrorHandler) {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, null, rxJavaErrorHandler)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Another strategy was already registered: ");
        sb.append(this.getHighSpeedVideoFpsRanges.get());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public rx.plugins.RxJavaObservableExecutionHook getObservableExecutionHook() {
        if (this.getHighSpeedVideoSizes.get() == null) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(rx.plugins.RxJavaObservableExecutionHook.class, getHighSpeedVideoFpsRanges());
            if (highSpeedVideoSizes == null) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, rx.plugins.RxJavaObservableExecutionHookDefault.Camera2StreamConfigurationMap());
            } else {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, (rx.plugins.RxJavaObservableExecutionHook) highSpeedVideoSizes);
            }
        }
        return this.getHighSpeedVideoSizes.get();
    }

    public void registerObservableExecutionHook(rx.plugins.RxJavaObservableExecutionHook rxJavaObservableExecutionHook) {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, rxJavaObservableExecutionHook)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Another strategy was already registered: ");
        sb.append(this.getHighSpeedVideoSizes.get());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public rx.plugins.RxJavaSingleExecutionHook getSingleExecutionHook() {
        if (this.getInputSizeshNQ4ISI.get() == null) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(rx.plugins.RxJavaSingleExecutionHook.class, getHighSpeedVideoFpsRanges());
            if (highSpeedVideoSizes == null) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, null, rx.plugins.RxJavaSingleExecutionHookDefault.getHighResolutionOutputSizeshNQ4ISI());
            } else {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, null, (rx.plugins.RxJavaSingleExecutionHook) highSpeedVideoSizes);
            }
        }
        return this.getInputSizeshNQ4ISI.get();
    }

    public void registerSingleExecutionHook(rx.plugins.RxJavaSingleExecutionHook rxJavaSingleExecutionHook) {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, null, rxJavaSingleExecutionHook)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Another strategy was already registered: ");
        sb.append(this.getInputSizeshNQ4ISI.get());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public rx.plugins.RxJavaCompletableExecutionHook getCompletableExecutionHook() {
        if (this.Camera2StreamConfigurationMap.get() == null) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(rx.plugins.RxJavaCompletableExecutionHook.class, getHighSpeedVideoFpsRanges());
            if (highSpeedVideoSizes == null) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, new rx.plugins.RxJavaCompletableExecutionHook() { // from class: rx.plugins.RxJavaPlugins.2
                });
            } else {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, (rx.plugins.RxJavaCompletableExecutionHook) highSpeedVideoSizes);
            }
        }
        return this.Camera2StreamConfigurationMap.get();
    }

    public void registerCompletableExecutionHook(rx.plugins.RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook) {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, rxJavaCompletableExecutionHook)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Another strategy was already registered: ");
        sb.append(this.getInputSizeshNQ4ISI.get());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static java.util.Properties getHighSpeedVideoFpsRanges() {
        try {
            return java.lang.System.getProperties();
        } catch (java.lang.SecurityException unused) {
            return new java.util.Properties();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        r3 = r5.substring(0, r5.length() - 6).substring(14);
        r4 = new java.lang.StringBuilder();
        r4.append("rxjava.plugin.");
        r4.append(r3);
        r4.append(".impl");
        r2 = r4.toString();
        r1 = r8.getProperty(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r3 = new java.lang.StringBuilder();
        r3.append("Implementing class declaration for ");
        r3.append(r0);
        r3.append(" missing: ");
        r3.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException(r3.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.Object getHighSpeedVideoSizes(java.lang.Class<?> cls, java.util.Properties properties) {
        java.util.Properties properties2 = (java.util.Properties) properties.clone();
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rxjava.plugin.");
        sb.append(simpleName);
        sb.append(".implementation");
        java.lang.String property = properties2.getProperty(sb.toString());
        if (property == null) {
            try {
                java.util.Iterator it = properties2.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String obj = entry.getKey().toString();
                    if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                        break;
                    }
                }
            } catch (java.lang.SecurityException e) {
                e.printStackTrace();
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return java.lang.Class.forName(property).asSubclass(cls).newInstance();
        } catch (java.lang.ClassCastException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(simpleName);
            sb2.append(" implementation is not an instance of ");
            sb2.append(simpleName);
            sb2.append(": ");
            sb2.append(property);
            throw new java.lang.IllegalStateException(sb2.toString(), e2);
        } catch (java.lang.ClassNotFoundException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(simpleName);
            sb3.append(" implementation class not found: ");
            sb3.append(property);
            throw new java.lang.IllegalStateException(sb3.toString(), e3);
        } catch (java.lang.IllegalAccessException e4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(simpleName);
            sb4.append(" implementation not able to be accessed: ");
            sb4.append(property);
            throw new java.lang.IllegalStateException(sb4.toString(), e4);
        } catch (java.lang.InstantiationException e5) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(simpleName);
            sb5.append(" implementation not able to be instantiated: ");
            sb5.append(property);
            throw new java.lang.IllegalStateException(sb5.toString(), e5);
        }
    }

    public rx.plugins.RxJavaSchedulersHook getSchedulersHook() {
        if (this.getOutputMinFrameDuration.get() == null) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(rx.plugins.RxJavaSchedulersHook.class, getHighSpeedVideoFpsRanges());
            if (highSpeedVideoSizes == null) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, null, rx.plugins.RxJavaSchedulersHook.getDefaultInstance());
            } else {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, null, (rx.plugins.RxJavaSchedulersHook) highSpeedVideoSizes);
            }
        }
        return this.getOutputMinFrameDuration.get();
    }

    public void registerSchedulersHook(rx.plugins.RxJavaSchedulersHook rxJavaSchedulersHook) {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, null, rxJavaSchedulersHook)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Another strategy was already registered: ");
        sb.append(this.getOutputMinFrameDuration.get());
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
