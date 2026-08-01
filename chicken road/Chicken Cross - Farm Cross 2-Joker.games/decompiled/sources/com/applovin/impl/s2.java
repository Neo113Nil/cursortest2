package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.s2;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class s2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4418a;
    private final com.applovin.impl.sdk.p b;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f4419a;
        private final x4 b;

        public a(com.applovin.impl.sdk.p pVar, x4 x4Var) {
            this.f4419a = pVar;
            this.b = x4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.l.p().unbindService(this);
            } catch (Exception e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4419a.d("LicenseVerificationManager", "Failed to unbind license service", e);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f4419a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int nextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f4419a, this.b, nextInt, new Runnable() { // from class: com.applovin.impl.s2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    s2.a.this.a();
                }
            });
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                obtain.writeLong(nextInt);
                obtain.writeString(com.applovin.impl.sdk.l.p().getPackageName());
                obtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, obtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4419a.a("LicenseVerificationManager", "Failed to check license", e);
                }
                a();
                this.b.a((Object) e);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.p.a()) {
                this.f4419a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.b.a((Object) illegalStateException);
        }
    }

    private static final class b extends Binder {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f4420a;
        private final x4 b;
        private final int c;
        private final Runnable d;

        public b(com.applovin.impl.sdk.p pVar, x4 x4Var, int i, Runnable runnable) {
            this.f4420a = pVar;
            this.b = x4Var;
            this.c = i;
            this.d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f4420a.a("LicenseVerificationManager", "Verified with code " + readInt);
                }
                this.b.b(t2.a().b(readString).a(readString2).b(readInt).a(this.c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f4420a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.b.a((Object) new Exception(th));
                    this.d.run();
                    return false;
                } finally {
                    this.d.run();
                }
            }
        }
    }

    public s2(com.applovin.impl.sdk.l lVar) {
        this.f4418a = lVar;
        this.b = lVar.Q();
    }

    public x4 a(long j) {
        x4 x4Var = new x4("verify_license");
        if (j > 0) {
            o6.a(j, x4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f4418a);
        }
        try {
            if (!com.applovin.impl.sdk.l.p().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.b, x4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.k("LicenseVerificationManager", exc.getMessage());
                }
                x4Var.a((Object) exc);
            }
        } catch (Exception e) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("LicenseVerificationManager", "Failed to verify license", e);
            }
            x4Var.a((Object) e);
        }
        return x4Var;
    }
}
