package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class SessionProcessorUtil {
    private SessionProcessorUtil() {
    }

    public static boolean isOperationSupported(androidx.camera.core.impl.SessionProcessor sessionProcessor, int... iArr) {
        if (sessionProcessor == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return sessionProcessor.getSupportedCameraOperations().containsAll(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r3 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.camera.core.FocusMeteringAction getModifiedFocusMeteringAction(androidx.camera.core.impl.SessionProcessor sessionProcessor, androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        boolean z;
        if (sessionProcessor != null) {
            androidx.camera.core.FocusMeteringAction.Builder builder = new androidx.camera.core.FocusMeteringAction.Builder(focusMeteringAction);
            boolean z2 = true;
            if (focusMeteringAction.getMeteringPointsAf().isEmpty() || isOperationSupported(sessionProcessor, 1, 2)) {
                z = false;
            } else {
                builder.removePoints(1);
                z = true;
            }
            if (focusMeteringAction.getMeteringPointsAe().isEmpty() || isOperationSupported(sessionProcessor, 3)) {
                z2 = z;
            } else {
                builder.removePoints(2);
            }
            if (!focusMeteringAction.getMeteringPointsAwb().isEmpty() && !isOperationSupported(sessionProcessor, 4)) {
                builder.removePoints(4);
            }
            androidx.camera.core.FocusMeteringAction build = builder.build();
            if (build.getMeteringPointsAf().isEmpty() && build.getMeteringPointsAe().isEmpty() && build.getMeteringPointsAwb().isEmpty()) {
                return null;
            }
            return builder.build();
        }
        return focusMeteringAction;
    }
}
