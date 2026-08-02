package K4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import w1.F0;

/* renamed from: K4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0319f extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4012a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4013b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4014c;

    public /* synthetic */ C0319f(Object obj, int i7) {
        this.f4012a = i7;
        this.f4014c = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4012a) {
            case 0:
                F0 f02 = (F0) this.f4014c;
                boolean x4 = f02.x();
                if (f02.x() && !this.f4013b) {
                    f02.D(true);
                } else if (!x4 && this.f4013b) {
                    f02.D(false);
                }
                this.f4013b = x4;
                break;
            default:
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z4 = this.f4013b;
                boolean z7 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f4013b = z7;
                if (z7 && !z4) {
                    ((V5.a) this.f4014c).f6675d.t();
                    break;
                }
                break;
        }
    }
}
