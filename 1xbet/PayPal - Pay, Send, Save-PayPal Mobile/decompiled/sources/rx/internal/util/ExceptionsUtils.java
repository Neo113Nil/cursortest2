package rx.internal.util;

/* loaded from: classes18.dex */
public enum ExceptionsUtils {
    ;

    private static final java.lang.Throwable getHighSpeedVideoFpsRanges = new java.lang.Throwable("Terminated");

    public static boolean addThrowable(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference, java.lang.Throwable th) {
        java.lang.Throwable th2;
        java.lang.Throwable compositeException;
        do {
            th2 = atomicReference.get();
            if (th2 == getHighSpeedVideoFpsRanges) {
                return false;
            }
            if (th2 == null) {
                compositeException = th;
            } else if (th2 instanceof rx.exceptions.CompositeException) {
                java.util.ArrayList arrayList = new java.util.ArrayList(((rx.exceptions.CompositeException) th2).getExceptions());
                arrayList.add(th);
                compositeException = new rx.exceptions.CompositeException(arrayList);
            } else {
                compositeException = new rx.exceptions.CompositeException(th2, th);
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, th2, compositeException));
        return true;
    }

    public static java.lang.Throwable terminate(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference) {
        java.lang.Throwable th = atomicReference.get();
        java.lang.Throwable th2 = getHighSpeedVideoFpsRanges;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static boolean isTerminated(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference) {
        return isTerminated(atomicReference.get());
    }

    public static boolean isTerminated(java.lang.Throwable th) {
        return th == getHighSpeedVideoFpsRanges;
    }
}
