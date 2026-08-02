package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDematerialize<T> implements rx.Observable.Operator<T, rx.Notification<T>> {

    static final class Holder {
        static final rx.internal.operators.OperatorDematerialize<java.lang.Object> getHighSpeedVideoFpsRanges = new rx.internal.operators.OperatorDematerialize<>();

        Holder() {
        }
    }

    public static rx.internal.operators.OperatorDematerialize instance() {
        return rx.internal.operators.OperatorDematerialize.Holder.getHighSpeedVideoFpsRanges;
    }

    OperatorDematerialize() {
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super rx.Notification<T>> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<rx.Notification<T>>(subscriber) { // from class: rx.internal.operators.OperatorDematerialize.1
            boolean getHighSpeedVideoFpsRanges;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.Observer
            public /* synthetic */ void onNext(java.lang.Object obj) {
                rx.Notification notification = (rx.Notification) obj;
                int i = rx.internal.operators.OperatorDematerialize.AnonymousClass2.getHighSpeedVideoSizes[notification.getKind().ordinal()];
                if (i == 1) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    subscriber.onNext(notification.getValue());
                } else if (i == 2) {
                    onError(notification.getThrowable());
                } else if (i == 3) {
                    onCompleted();
                } else {
                    onError(new java.lang.IllegalArgumentException("Unsupported notification type: ".concat(java.lang.String.valueOf(notification))));
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                subscriber.onCompleted();
            }
        };
    }

    /* renamed from: rx.internal.operators.OperatorDematerialize$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[rx.Notification.Kind.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[rx.Notification.Kind.OnNext.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[rx.Notification.Kind.OnError.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[rx.Notification.Kind.OnCompleted.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
