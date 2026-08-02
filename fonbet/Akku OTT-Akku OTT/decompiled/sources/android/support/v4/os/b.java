package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final Handler mHandler;
    final boolean mLocal;
    android.support.v4.os.a mReceiver;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    /* renamed from: android.support.v4.os.b$b, reason: collision with other inner class name */
    public class BinderC0023b extends a.AbstractBinderC0021a {
        public BinderC0023b() {
            attachInterface(this, android.support.v4.os.a.o);
        }

        @Override // android.support.v4.os.a
        public final void m(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.mHandler;
            if (handler != null) {
                handler.post(bVar.new c(i, bundle));
            } else {
                bVar.onReceiveResult(i, bundle);
            }
        }
    }

    public class c implements Runnable {
        public final int a;
        public final Bundle b;

        public c(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.onReceiveResult(this.a, this.b);
        }
    }

    public b(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new c(i, bundle));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        android.support.v4.os.a aVar = this.mReceiver;
        if (aVar != null) {
            try {
                aVar.m(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.mReceiver == null) {
                    this.mReceiver = new BinderC0023b();
                }
                parcel.writeStrongBinder(this.mReceiver.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(Parcel parcel) {
        this.mLocal = false;
        android.support.v4.os.a aVar = null;
        this.mHandler = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = a.AbstractBinderC0021a.a;
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(android.support.v4.os.a.o);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.os.a)) {
                aVar = (android.support.v4.os.a) queryLocalInterface;
            } else {
                a.AbstractBinderC0021a.C0022a c0022a = new a.AbstractBinderC0021a.C0022a();
                c0022a.a = readStrongBinder;
                aVar = c0022a;
            }
        }
        this.mReceiver = aVar;
    }
}
