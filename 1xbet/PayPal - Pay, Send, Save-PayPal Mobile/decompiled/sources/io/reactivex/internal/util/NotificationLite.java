package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public enum NotificationLite {
    COMPLETE;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(java.lang.Object obj) {
        return obj;
    }

    public static <T> java.lang.Object next(T t) {
        return t;
    }

    static final class ErrorNotification implements java.io.Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

        ErrorNotification(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationLite.Error[");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification) {
                return io.reactivex.internal.functions.ObjectHelper.equals(this.getHighResolutionOutputSizeshNQ4ISI, ((io.reactivex.internal.util.NotificationLite.ErrorNotification) obj).getHighResolutionOutputSizeshNQ4ISI);
            }
            return false;
        }
    }

    static final class SubscriptionNotification implements java.io.Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final org.reactivestreams.Subscription Camera2StreamConfigurationMap;

        SubscriptionNotification(org.reactivestreams.Subscription subscription) {
            this.Camera2StreamConfigurationMap = subscription;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationLite.Subscription[");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class DisposableNotification implements java.io.Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        DisposableNotification(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes = disposable;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationLite.Disposable[");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("]");
            return sb.toString();
        }
    }

    public static java.lang.Object complete() {
        return COMPLETE;
    }

    public static java.lang.Object error(java.lang.Throwable th) {
        return new io.reactivex.internal.util.NotificationLite.ErrorNotification(th);
    }

    public static java.lang.Object subscription(org.reactivestreams.Subscription subscription) {
        return new io.reactivex.internal.util.NotificationLite.SubscriptionNotification(subscription);
    }

    public static java.lang.Object disposable(io.reactivex.disposables.Disposable disposable) {
        return new io.reactivex.internal.util.NotificationLite.DisposableNotification(disposable);
    }

    public static boolean isComplete(java.lang.Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isError(java.lang.Object obj) {
        return obj instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification;
    }

    public static boolean isSubscription(java.lang.Object obj) {
        return obj instanceof io.reactivex.internal.util.NotificationLite.SubscriptionNotification;
    }

    public static boolean isDisposable(java.lang.Object obj) {
        return obj instanceof io.reactivex.internal.util.NotificationLite.DisposableNotification;
    }

    public static java.lang.Throwable getError(java.lang.Object obj) {
        return ((io.reactivex.internal.util.NotificationLite.ErrorNotification) obj).getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.reactivestreams.Subscription getSubscription(java.lang.Object obj) {
        return ((io.reactivex.internal.util.NotificationLite.SubscriptionNotification) obj).Camera2StreamConfigurationMap;
    }

    public static io.reactivex.disposables.Disposable getDisposable(java.lang.Object obj) {
        return ((io.reactivex.internal.util.NotificationLite.DisposableNotification) obj).getHighSpeedVideoSizes;
    }

    public static <T> boolean accept(java.lang.Object obj, org.reactivestreams.Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification) {
            subscriber.onError(((io.reactivex.internal.util.NotificationLite.ErrorNotification) obj).getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static <T> boolean accept(java.lang.Object obj, io.reactivex.Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification) {
            observer.onError(((io.reactivex.internal.util.NotificationLite.ErrorNotification) obj).getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(java.lang.Object obj, org.reactivestreams.Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification) {
            subscriber.onError(((io.reactivex.internal.util.NotificationLite.ErrorNotification) obj).getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }
        if (obj instanceof io.reactivex.internal.util.NotificationLite.SubscriptionNotification) {
            subscriber.onSubscribe(((io.reactivex.internal.util.NotificationLite.SubscriptionNotification) obj).Camera2StreamConfigurationMap);
            return false;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(java.lang.Object obj, io.reactivex.Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification) {
            observer.onError(((io.reactivex.internal.util.NotificationLite.ErrorNotification) obj).getHighResolutionOutputSizeshNQ4ISI);
            return true;
        }
        if (obj instanceof io.reactivex.internal.util.NotificationLite.DisposableNotification) {
            observer.onSubscribe(((io.reactivex.internal.util.NotificationLite.DisposableNotification) obj).getHighSpeedVideoSizes);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "NotificationLite.Complete";
    }
}
