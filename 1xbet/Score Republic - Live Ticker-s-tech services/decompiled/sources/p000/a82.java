package p000;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a82 {

    /* JADX INFO: renamed from: a */
    public final int f65a;

    /* JADX INFO: renamed from: b */
    public final qc1 f66b = new qc1();

    /* JADX INFO: renamed from: c */
    public final int f67c;

    /* JADX INFO: renamed from: d */
    public final Bundle f68d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f69e;

    public a82(int i, int i2, Bundle bundle, int i3) {
        this.f69e = i3;
        this.f65a = i;
        this.f67c = i2;
        this.f68d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m100a() {
        switch (this.f69e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m101b(p61 p61Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + p61Var.toString());
        }
        this.f66b.m4060a(p61Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m102c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f66b.m4061b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f67c + " id=" + this.f65a + " oneWay=" + m100a() + "}";
    }
}
