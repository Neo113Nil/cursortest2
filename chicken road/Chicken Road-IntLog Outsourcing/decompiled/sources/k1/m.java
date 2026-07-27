package k1;

import android.os.Bundle;
import android.util.Log;
import f2.s;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f10705a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.h f10706b = new I1.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f10707c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f10708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10709e;

    public m(int i2, int i3, Bundle bundle, int i6) {
        this.f10709e = i6;
        this.f10705a = i2;
        this.f10707c = i3;
        this.f10708d = bundle;
    }

    public final boolean a() {
        switch (this.f10709e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + sVar.toString());
        }
        this.f10706b.a(sVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f10706b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f10707c + " id=" + this.f10705a + " oneWay=" + a() + "}";
    }
}
