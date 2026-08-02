package q0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import d6.C0977k;
import e3.C1023h;
import n1.C1450e;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1450e f15756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f15760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1023h f15761f;

    public o(int i7, int i8, Bundle bundle, C1023h c1023h, String str, C1450e c1450e) {
        this.f15761f = c1023h;
        this.f15756a = c1450e;
        this.f15757b = str;
        this.f15758c = i7;
        this.f15759d = i8;
        this.f15760e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1450e c1450e = this.f15756a;
        IBinder binder = ((Messenger) c1450e.f15308b).getBinder();
        C1023h c1023h = this.f15761f;
        ((s) c1023h.f12667a).f15781e.remove(binder);
        String str = this.f15757b;
        h hVar = new h((s) c1023h.f12667a, str, this.f15758c, this.f15759d, c1450e);
        s sVar = (s) c1023h.f12667a;
        sVar.getClass();
        hVar.f15744f = sVar.b(this.f15760e);
        sVar.getClass();
        if (hVar.f15744f == null) {
            StringBuilder k7 = e1.k.k("No root for client ", str, " from service ");
            k7.append(o.class.getName());
            Log.i("MBServiceCompat", k7.toString());
            try {
                c1450e.A(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                return;
            }
        }
        try {
            sVar.f15781e.put(binder, hVar);
            binder.linkToDeath(hVar, 0);
            MediaSessionCompat$Token mediaSessionCompat$Token = sVar.f15783x;
            if (mediaSessionCompat$Token != null) {
                C0977k c0977k = hVar.f15744f;
                String str2 = (String) c0977k.f12441b;
                Bundle bundle = (Bundle) c0977k.f12442c;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                c1450e.A(1, bundle2);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
            sVar.f15781e.remove(binder);
        }
    }
}
