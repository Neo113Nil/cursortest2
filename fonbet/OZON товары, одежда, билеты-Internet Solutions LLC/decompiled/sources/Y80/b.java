package Y80;

import B4.C2577f;
import B4.C2584m;
import B4.H;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2584m f34782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f34784c;

    public /* synthetic */ b(C2584m c2584m, int i11, Bundle bundle) {
        this.f34782a = c2584m;
        this.f34783b = i11;
        this.f34784c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2577f i11;
        Bundle bundle = this.f34784c;
        C2584m c2584m = this.f34782a;
        H y11 = c2584m.y();
        int i12 = this.f34783b;
        if (y11 == null || (i11 = y11.i(i12)) == null) {
            i11 = c2584m.A().i(i12);
        }
        if (i11 != null) {
            try {
                L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " navController.navigate");
                c2584m.I(i12, bundle);
            } catch (Exception e11) {
                Log.e("nav", "nav error " + e11);
            }
        }
    }
}
