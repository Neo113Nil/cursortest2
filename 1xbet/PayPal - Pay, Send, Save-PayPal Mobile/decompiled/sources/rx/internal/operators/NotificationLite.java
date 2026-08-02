package rx.internal.operators;

/* loaded from: classes18.dex */
public final class NotificationLite {
    private static final java.lang.Object getHighSpeedVideoSizes = new java.io.Serializable() { // from class: rx.internal.operators.NotificationLite.1
        private static final long serialVersionUID = 1;

        public final java.lang.String toString() {
            return "Notification=>Completed";
        }
    };
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.io.Serializable() { // from class: rx.internal.operators.NotificationLite.2
        private static final long serialVersionUID = 2;

        public final java.lang.String toString() {
            return "Notification=>NULL";
        }
    };

    private NotificationLite() {
    }

    static final class OnErrorSentinel implements java.io.Serializable {
        private static final long serialVersionUID = 3;
        final java.lang.Throwable getHighSpeedVideoSizes;

        public OnErrorSentinel(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Notification=>Error:");
            sb.append(this.getHighSpeedVideoSizes);
            return sb.toString();
        }
    }

    public static <T> java.lang.Object next(T t) {
        return t == null ? getHighSpeedVideoFpsRanges : t;
    }

    public static java.lang.Object completed() {
        return getHighSpeedVideoSizes;
    }

    public static java.lang.Object error(java.lang.Throwable th) {
        return new rx.internal.operators.NotificationLite.OnErrorSentinel(th);
    }

    public static <T> boolean accept(rx.Observer<? super T> observer, java.lang.Object obj) {
        if (obj == getHighSpeedVideoSizes) {
            observer.onCompleted();
            return true;
        }
        if (obj == getHighSpeedVideoFpsRanges) {
            observer.onNext(null);
            return false;
        }
        if (obj != null) {
            if (obj.getClass() == rx.internal.operators.NotificationLite.OnErrorSentinel.class) {
                observer.onError(((rx.internal.operators.NotificationLite.OnErrorSentinel) obj).getHighSpeedVideoSizes);
                return true;
            }
            observer.onNext(obj);
            return false;
        }
        throw new java.lang.IllegalArgumentException("The lite notification can not be null");
    }

    public static boolean isCompleted(java.lang.Object obj) {
        return obj == getHighSpeedVideoSizes;
    }

    public static boolean isError(java.lang.Object obj) {
        return obj instanceof rx.internal.operators.NotificationLite.OnErrorSentinel;
    }

    public static boolean isNull(java.lang.Object obj) {
        return obj == getHighSpeedVideoFpsRanges;
    }

    public static boolean isNext(java.lang.Object obj) {
        return (obj == null || isError(obj) || isCompleted(obj)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(java.lang.Object obj) {
        if (obj == getHighSpeedVideoFpsRanges) {
            return null;
        }
        return obj;
    }

    public static java.lang.Throwable getError(java.lang.Object obj) {
        return ((rx.internal.operators.NotificationLite.OnErrorSentinel) obj).getHighSpeedVideoSizes;
    }
}
