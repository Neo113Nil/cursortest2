package rx.observers;

/* loaded from: classes18.dex */
public class SerializedObserver<T> implements rx.Observer<T> {
    private final rx.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
    private volatile boolean getHighSpeedVideoFpsRanges;
    private rx.observers.SerializedObserver.FastList getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    static final class FastList {
        java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        FastList() {
        }

        public final void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            int i = this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (objArr == null) {
                objArr = new java.lang.Object[16];
                this.getHighResolutionOutputSizeshNQ4ISI = objArr;
            } else if (i == objArr.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[(i >> 2) + i];
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
                this.getHighResolutionOutputSizeshNQ4ISI = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.getHighSpeedVideoSizes = i + 1;
        }
    }

    public SerializedObserver(rx.Observer<? super T> observer) {
        this.getHighResolutionOutputSizeshNQ4ISI = observer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x002d, code lost:
    
        continue;
     */
    @Override // rx.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNext(T t) {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getHighSpeedVideoSizes) {
                rx.observers.SerializedObserver.FastList fastList = this.getHighSpeedVideoFpsRangesFor;
                if (fastList == null) {
                    fastList = new rx.observers.SerializedObserver.FastList();
                    this.getHighSpeedVideoFpsRangesFor = fastList;
                }
                fastList.getHighSpeedVideoFpsRanges(rx.internal.operators.NotificationLite.next(t));
                return;
            }
            this.getHighSpeedVideoSizes = true;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                while (true) {
                    synchronized (this) {
                        rx.observers.SerializedObserver.FastList fastList2 = this.getHighSpeedVideoFpsRangesFor;
                        if (fastList2 == null) {
                            this.getHighSpeedVideoSizes = false;
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = null;
                        for (java.lang.Object obj : fastList2.getHighResolutionOutputSizeshNQ4ISI) {
                            if (obj != null) {
                                try {
                                    if (rx.internal.operators.NotificationLite.accept(this.getHighResolutionOutputSizeshNQ4ISI, obj)) {
                                        this.getHighSpeedVideoFpsRanges = true;
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    this.getHighSpeedVideoFpsRanges = true;
                                    rx.exceptions.Exceptions.throwIfFatal(th);
                                    this.getHighResolutionOutputSizeshNQ4ISI.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, t));
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                this.getHighSpeedVideoFpsRanges = true;
                rx.exceptions.Exceptions.throwOrReport(th2, this.getHighResolutionOutputSizeshNQ4ISI, t);
            }
        }
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        rx.exceptions.Exceptions.throwIfFatal(th);
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (this.getHighSpeedVideoSizes) {
                rx.observers.SerializedObserver.FastList fastList = this.getHighSpeedVideoFpsRangesFor;
                if (fastList == null) {
                    fastList = new rx.observers.SerializedObserver.FastList();
                    this.getHighSpeedVideoFpsRangesFor = fastList;
                }
                fastList.getHighSpeedVideoFpsRanges(rx.internal.operators.NotificationLite.error(th));
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (this.getHighSpeedVideoSizes) {
                rx.observers.SerializedObserver.FastList fastList = this.getHighSpeedVideoFpsRangesFor;
                if (fastList == null) {
                    fastList = new rx.observers.SerializedObserver.FastList();
                    this.getHighSpeedVideoFpsRangesFor = fastList;
                }
                fastList.getHighSpeedVideoFpsRanges(rx.internal.operators.NotificationLite.completed());
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        }
    }
}
