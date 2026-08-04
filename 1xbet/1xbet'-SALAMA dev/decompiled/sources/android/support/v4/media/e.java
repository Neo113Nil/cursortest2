package android.support.v4.media;

import F.x;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f8008b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8009a;

    public e(Context context, ComponentName componentName, x xVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8009a = new d(context, componentName, xVar);
        } else {
            this.f8009a = new c(context, componentName, xVar);
        }
    }

    public final void a() {
        Messenger messenger;
        c cVar = this.f8009a;
        V0 v6 = cVar.f8005f;
        if (v6 != null && (messenger = cVar.f8006g) != null) {
            try {
                v6.Y(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        cVar.f8001b.disconnect();
    }
}
