package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0015\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0015\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0015\u0010\f\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\r\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/Lock3ABehavior;", "", "shouldUnlockAe-t6FjEyI", "(Landroidx/camera/camera2/pipe/Lock3ABehavior;)Z", "shouldUnlockAe", "shouldUnlockAf-t6FjEyI", "shouldUnlockAf", "shouldUnlockAwb-t6FjEyI", "shouldUnlockAwb", "shouldWaitForAeToConverge-t6FjEyI", "shouldWaitForAeToConverge", "shouldWaitForAwbToConverge-t6FjEyI", "shouldWaitForAwbToConverge", "shouldWaitForAfToConverge-t6FjEyI", "shouldWaitForAfToConverge"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Controller3AKt {
    /* renamed from: shouldUnlockAe-t6FjEyI, reason: not valid java name */
    public static final boolean m912shouldUnlockAet6FjEyI(androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior) {
        int m531getAFTER_NEW_SCANhRqSH3k = androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m531getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return androidx.camera.camera2.pipe.Lock3ABehavior.m526equalsimpl0(lock3ABehavior.m529unboximpl(), m531getAFTER_NEW_SCANhRqSH3k);
    }

    /* renamed from: shouldUnlockAf-t6FjEyI, reason: not valid java name */
    public static final boolean m913shouldUnlockAft6FjEyI(androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior) {
        int m531getAFTER_NEW_SCANhRqSH3k = androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m531getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return androidx.camera.camera2.pipe.Lock3ABehavior.m526equalsimpl0(lock3ABehavior.m529unboximpl(), m531getAFTER_NEW_SCANhRqSH3k);
    }

    /* renamed from: shouldUnlockAwb-t6FjEyI, reason: not valid java name */
    public static final boolean m914shouldUnlockAwbt6FjEyI(androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior) {
        int m531getAFTER_NEW_SCANhRqSH3k = androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m531getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return androidx.camera.camera2.pipe.Lock3ABehavior.m526equalsimpl0(lock3ABehavior.m529unboximpl(), m531getAFTER_NEW_SCANhRqSH3k);
    }

    /* renamed from: shouldWaitForAeToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m915shouldWaitForAeToConverget6FjEyI(androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !androidx.camera.camera2.pipe.Lock3ABehavior.m526equalsimpl0(lock3ABehavior.m529unboximpl(), androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m532getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* renamed from: shouldWaitForAwbToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m917shouldWaitForAwbToConverget6FjEyI(androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !androidx.camera.camera2.pipe.Lock3ABehavior.m526equalsimpl0(lock3ABehavior.m529unboximpl(), androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m532getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* renamed from: shouldWaitForAfToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m916shouldWaitForAfToConverget6FjEyI(androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !androidx.camera.camera2.pipe.Lock3ABehavior.m526equalsimpl0(lock3ABehavior.m529unboximpl(), androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m532getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    public static final /* synthetic */ boolean access$isNullOrIn(java.lang.Object obj, java.util.Collection collection) {
        if (obj != null) {
            return collection.contains(obj);
        }
        return true;
    }
}
