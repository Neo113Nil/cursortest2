package rx;

/* loaded from: classes18.dex */
public final class Notification<T> {
    private static final rx.Notification<java.lang.Void> getHighSpeedVideoFpsRangesFor = new rx.Notification<>(rx.Notification.Kind.OnCompleted, null, null);
    private final rx.Notification.Kind Camera2StreamConfigurationMap;
    private final T getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Throwable getHighSpeedVideoFpsRanges;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public static <T> rx.Notification<T> createOnNext(T t) {
        return new rx.Notification<>(rx.Notification.Kind.OnNext, t, null);
    }

    public static <T> rx.Notification<T> createOnError(java.lang.Throwable th) {
        return new rx.Notification<>(rx.Notification.Kind.OnError, null, th);
    }

    public static <T> rx.Notification<T> createOnCompleted() {
        return (rx.Notification<T>) getHighSpeedVideoFpsRangesFor;
    }

    @java.lang.Deprecated
    public static <T> rx.Notification<T> createOnCompleted(java.lang.Class<T> cls) {
        return (rx.Notification<T>) getHighSpeedVideoFpsRangesFor;
    }

    private Notification(rx.Notification.Kind kind, T t, java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.getHighSpeedVideoFpsRanges = th;
        this.Camera2StreamConfigurationMap = kind;
    }

    public final java.lang.Throwable getThrowable() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final T getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean hasValue() {
        return isOnNext() && this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public final boolean hasThrowable() {
        return isOnError() && this.getHighSpeedVideoFpsRanges != null;
    }

    public final rx.Notification.Kind getKind() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean isOnError() {
        return getKind() == rx.Notification.Kind.OnError;
    }

    public final boolean isOnCompleted() {
        return getKind() == rx.Notification.Kind.OnCompleted;
    }

    public final boolean isOnNext() {
        return getKind() == rx.Notification.Kind.OnNext;
    }

    public final void accept(rx.Observer<? super T> observer) {
        if (this.Camera2StreamConfigurationMap == rx.Notification.Kind.OnNext) {
            observer.onNext(getValue());
        } else if (this.Camera2StreamConfigurationMap == rx.Notification.Kind.OnCompleted) {
            observer.onCompleted();
        } else {
            observer.onError(getThrowable());
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(super.toString());
        sb.append(' ');
        sb.append(getKind());
        if (hasValue()) {
            sb.append(' ');
            sb.append(getValue());
        }
        if (hasThrowable()) {
            sb.append(' ');
            sb.append(getThrowable().getMessage());
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = getKind().hashCode();
        if (hasValue()) {
            hashCode = (hashCode * 31) + getValue().hashCode();
        }
        return hasThrowable() ? (hashCode * 31) + getThrowable().hashCode() : hashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        T t;
        T t2;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        rx.Notification notification = (rx.Notification) obj;
        return notification.getKind() == getKind() && ((t = this.getHighResolutionOutputSizeshNQ4ISI) == (t2 = notification.getHighResolutionOutputSizeshNQ4ISI) || (t != null && t.equals(t2))) && ((th = this.getHighSpeedVideoFpsRanges) == (th2 = notification.getHighSpeedVideoFpsRanges) || (th != null && th.equals(th2)));
    }
}
