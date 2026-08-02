package com.adjust.sdk;

/* loaded from: classes7.dex */
public class GooglePlayServicesClient {

    public static final class GooglePlayServicesConnection implements android.content.ServiceConnection {
        public final long getHighSpeedVideoFpsRanges;
        public boolean getHighSpeedVideoFpsRangesFor = false;
        public final java.util.concurrent.LinkedBlockingQueue getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.LinkedBlockingQueue(1);

        public GooglePlayServicesConnection(long j) {
            this.getHighSpeedVideoFpsRanges = j;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
        }
    }

    public static final class GooglePlayServicesInfo {
        private final java.lang.String gpsAdid;
        private final java.lang.Boolean trackingEnabled;

        public GooglePlayServicesInfo(java.lang.String str, java.lang.Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public final java.lang.String getGpsAdid() {
            return this.gpsAdid;
        }

        public final java.lang.Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static final class GooglePlayServicesInterface implements android.os.IInterface {
        public final android.os.IBinder getHighSpeedVideoFpsRangesFor;

        public GooglePlayServicesInterface(android.os.IBinder iBinder) {
            this.getHighSpeedVideoFpsRangesFor = iBinder;
        }

        public final java.lang.Boolean Camera2StreamConfigurationMap() {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.getHighSpeedVideoFpsRangesFor.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                boolean z = obtain2.readInt() != 0;
                obtain2.recycle();
                obtain.recycle();
                return java.lang.Boolean.valueOf(!z);
            } catch (java.lang.Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }

        @Override // android.os.IInterface
        public final android.os.IBinder asBinder() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String getHighSpeedVideoFpsRanges() {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getHighSpeedVideoFpsRangesFor.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo getGooglePlayServicesInfo(android.content.Context context, long j) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesConnection googlePlayServicesConnection = new com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesConnection(j);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, googlePlayServicesConnection, 1)) {
                throw new java.io.IOException("Google Play connection failed");
            }
            try {
                if (googlePlayServicesConnection.getHighSpeedVideoFpsRangesFor) {
                    throw new java.lang.IllegalStateException();
                }
                googlePlayServicesConnection.getHighSpeedVideoFpsRangesFor = true;
                com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInterface googlePlayServicesInterface = new com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInterface((android.os.IBinder) googlePlayServicesConnection.getHighResolutionOutputSizeshNQ4ISI.poll(googlePlayServicesConnection.getHighSpeedVideoFpsRanges, java.util.concurrent.TimeUnit.MILLISECONDS));
                return new com.adjust.sdk.GooglePlayServicesClient.GooglePlayServicesInfo(googlePlayServicesInterface.getHighSpeedVideoFpsRanges(), googlePlayServicesInterface.Camera2StreamConfigurationMap());
            } catch (java.lang.Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(googlePlayServicesConnection);
        }
    }
}
