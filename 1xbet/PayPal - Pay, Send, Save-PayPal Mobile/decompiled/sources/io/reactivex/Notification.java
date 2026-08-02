package io.reactivex;

/* loaded from: classes3.dex */
public final class Notification<T> {
    static final io.reactivex.Notification<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.Notification<>(null);
    final java.lang.Object Camera2StreamConfigurationMap;

    private Notification(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
    }

    public final boolean isOnComplete() {
        return this.Camera2StreamConfigurationMap == null;
    }

    public final boolean isOnError() {
        return io.reactivex.internal.util.NotificationLite.isError(this.Camera2StreamConfigurationMap);
    }

    public final boolean isOnNext() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        return (obj == null || io.reactivex.internal.util.NotificationLite.isError(obj)) ? false : true;
    }

    public final T getValue() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (obj == null || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.Camera2StreamConfigurationMap;
    }

    public final java.lang.Throwable getError() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof io.reactivex.Notification) {
            return io.reactivex.internal.functions.ObjectHelper.equals(this.Camera2StreamConfigurationMap, ((io.reactivex.Notification) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnErrorNotification[");
            sb.append(io.reactivex.internal.util.NotificationLite.getError(obj));
            sb.append("]");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("OnNextNotification[");
        sb2.append(this.Camera2StreamConfigurationMap);
        sb2.append("]");
        return sb2.toString();
    }

    public static <T> io.reactivex.Notification<T> createOnNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "value is null");
        return new io.reactivex.Notification<>(t);
    }

    public static <T> io.reactivex.Notification<T> createOnError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "error is null");
        return new io.reactivex.Notification<>(io.reactivex.internal.util.NotificationLite.error(th));
    }

    public static <T> io.reactivex.Notification<T> createOnComplete() {
        return (io.reactivex.Notification<T>) getHighResolutionOutputSizeshNQ4ISI;
    }
}
