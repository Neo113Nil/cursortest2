package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public final class b implements io.appmetrica.analytics.internal.IAppMetricaService {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f7201a;

    public b(android.os.IBinder iBinder) {
        this.f7201a = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f7201a;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7201a.transact(2, obtain, null, 1);
            obtain.recycle();
        } catch (java.lang.Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i2, android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
            obtain.writeInt(i2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7201a.transact(3, obtain, null, 1);
            obtain.recycle();
        } catch (java.lang.Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7201a.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (java.lang.Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
