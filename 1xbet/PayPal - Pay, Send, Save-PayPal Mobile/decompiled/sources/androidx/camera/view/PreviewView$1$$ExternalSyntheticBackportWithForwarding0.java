package androidx.camera.view;

/* loaded from: classes.dex */
public final /* synthetic */ class PreviewView$1$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
