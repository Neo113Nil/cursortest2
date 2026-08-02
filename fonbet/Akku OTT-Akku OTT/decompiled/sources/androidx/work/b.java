package androidx.work;

import android.os.Bundle;
import com.facebook.appevents.H;
import com.facebook.internal.E;
import kotlinx.coroutines.InterfaceC1120x0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ListenableFutureKt.launchFuture$lambda$1$lambda$0((InterfaceC1120x0) this.b);
                break;
            default:
                Bundle bundle = (Bundle) this.b;
                H h = H.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                    try {
                        if (!H.c.get()) {
                            h.b();
                        }
                        h.e(bundle);
                        h.f("com.facebook.appevents.UserDataStore.userData", E.D(H.d));
                        h.f("com.facebook.appevents.UserDataStore.internalUserData", E.D(H.e));
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, H.class);
                    }
                }
                break;
        }
    }
}
