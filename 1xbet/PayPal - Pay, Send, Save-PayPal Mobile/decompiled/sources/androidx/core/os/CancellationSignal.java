package androidx.core.os;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class CancellationSignal {
    private androidx.core.os.CancellationSignal.OnCancelListener Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private java.lang.Object getHighSpeedVideoSizes;

    public interface OnCancelListener {
        void onCancel();
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.getHighSpeedVideoFpsRangesFor;
        }
        return z;
    }

    public final void throwIfCanceled() {
        if (isCanceled()) {
            throw new androidx.core.os.OperationCanceledException();
        }
    }

    public final void cancel() {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges = true;
            androidx.core.os.CancellationSignal.OnCancelListener onCancelListener = this.Camera2StreamConfigurationMap;
            java.lang.Object obj = this.getHighSpeedVideoSizes;
            if (onCancelListener != null) {
                try {
                    onCancelListener.onCancel();
                } catch (java.lang.Throwable th) {
                    synchronized (this) {
                        this.getHighSpeedVideoFpsRanges = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((android.os.CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.getHighSpeedVideoFpsRanges = false;
                notifyAll();
            }
        }
    }

    public final void setOnCancelListener(androidx.core.os.CancellationSignal.OnCancelListener onCancelListener) {
        synchronized (this) {
            while (this.getHighSpeedVideoFpsRanges) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (this.Camera2StreamConfigurationMap == onCancelListener) {
                return;
            }
            this.Camera2StreamConfigurationMap = onCancelListener;
            if (!this.getHighSpeedVideoFpsRangesFor || onCancelListener == null) {
                return;
            }
            onCancelListener.onCancel();
        }
    }

    public final java.lang.Object getCancellationSignalObject() {
        java.lang.Object obj;
        synchronized (this) {
            if (this.getHighSpeedVideoSizes == null) {
                android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
                this.getHighSpeedVideoSizes = cancellationSignal;
                if (this.getHighSpeedVideoFpsRangesFor) {
                    android.os.CancellationSignal cancellationSignal2 = cancellationSignal;
                    cancellationSignal.cancel();
                }
            }
            obj = this.getHighSpeedVideoSizes;
        }
        return obj;
    }
}
