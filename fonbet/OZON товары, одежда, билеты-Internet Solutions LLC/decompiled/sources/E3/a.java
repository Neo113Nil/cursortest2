package E3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* loaded from: classes8.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0163a();

    /* renamed from: a, reason: collision with root package name */
    private final int f7395a;

    /* renamed from: E3.a$a, reason: collision with other inner class name */
    final class C0163a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(int i11) {
        this.f7395a = (i11 & 2) != 0 ? i11 | 1 : i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r3.hasCapability(16) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Context context) {
        Intent registerReceiver;
        int intExtra;
        ConnectivityManager connectivityManager;
        int i11;
        Network activeNetwork;
        int i12 = 0;
        if (d()) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i11 = this.f7395a;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities != null) {
                    }
                } catch (SecurityException unused) {
                }
            }
            i12 = i11 & 3;
        }
        if (b() && ((registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i12 |= 8;
        }
        if (c()) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            if (!((PowerManager) systemService2).isDeviceIdleMode()) {
                i12 |= 4;
            }
        }
        return (!e() || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i12 : i12 | 16;
        if ((i11 & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
            i12 = 2;
        }
        if (b()) {
            i12 |= 8;
        }
        if (c()) {
        }
        if (e()) {
            return i12;
        }
    }

    public final boolean b() {
        return (this.f7395a & 8) != 0;
    }

    public final boolean c() {
        return (this.f7395a & 4) != 0;
    }

    public final boolean d() {
        return (this.f7395a & 1) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (this.f7395a & 16) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            if (this.f7395a == ((a) obj).f7395a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7395a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f7395a);
    }
}
