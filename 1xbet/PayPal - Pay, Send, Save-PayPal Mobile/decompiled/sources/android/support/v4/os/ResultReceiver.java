package android.support.v4.os;

/* loaded from: classes5.dex */
public class ResultReceiver implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.os.ResultReceiver> CREATOR = new android.os.Parcelable.Creator<android.support.v4.os.ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ android.support.v4.os.ResultReceiver createFromParcel(android.os.Parcel parcel) {
            return new android.support.v4.os.ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ android.support.v4.os.ResultReceiver[] newArray(int i) {
            return new android.support.v4.os.ResultReceiver[i];
        }
    };
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    android.support.v4.os.IResultReceiver getHighSpeedVideoFpsRanges;
    final android.os.Handler getHighSpeedVideoFpsRangesFor;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void onReceiveResult(int i, android.os.Bundle bundle) {
    }

    class MyRunnable implements java.lang.Runnable {
        final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRangesFor;

        MyRunnable(int i, android.os.Bundle bundle) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.support.v4.os.ResultReceiver.this.onReceiveResult(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    class MyResultReceiver extends android.support.v4.os.IResultReceiver.Stub {
        MyResultReceiver() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i, android.os.Bundle bundle) {
            if (android.support.v4.os.ResultReceiver.this.getHighSpeedVideoFpsRangesFor != null) {
                android.support.v4.os.ResultReceiver.this.getHighSpeedVideoFpsRangesFor.post(android.support.v4.os.ResultReceiver.this.new MyRunnable(i, bundle));
            } else {
                android.support.v4.os.ResultReceiver.this.onReceiveResult(i, bundle);
            }
        }
    }

    public ResultReceiver(android.os.Handler handler) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRangesFor = handler;
    }

    public void send(int i, android.os.Bundle bundle) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            android.os.Handler handler = this.getHighSpeedVideoFpsRangesFor;
            if (handler != null) {
                handler.post(new android.support.v4.os.ResultReceiver.MyRunnable(i, bundle));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        android.support.v4.os.IResultReceiver iResultReceiver = this.getHighSpeedVideoFpsRanges;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i, bundle);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new android.support.v4.os.ResultReceiver.MyResultReceiver();
            }
            parcel.writeStrongBinder(this.getHighSpeedVideoFpsRanges.asBinder());
        }
    }

    ResultReceiver(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = android.support.v4.os.IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}
