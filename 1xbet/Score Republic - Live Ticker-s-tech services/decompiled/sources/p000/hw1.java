package p000;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hw1 {

    /* JADX INFO: renamed from: a */
    public final HashSet f3350a;

    /* JADX INFO: renamed from: b */
    public final b90 f3351b;

    public hw1(AppMeasurementSdk appMeasurementSdk, b90 b90Var) {
        this.f3351b = b90Var;
        tv1 tv1Var = new tv1(this);
        mw1 mw1Var = appMeasurementSdk.f1350a;
        ArrayList arrayList = mw1Var.f5171c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (tv1Var.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kw1 kw1Var = new kw1(tv1Var);
            arrayList.add(new Pair(tv1Var, kw1Var));
            if (mw1Var.f5174f != null) {
                try {
                    mw1Var.f5174f.registerOnMeasurementEventListener(kw1Var);
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                    mw1Var.m3434b(new zv1(mw1Var, kw1Var, 3));
                }
            } else {
                mw1Var.m3434b(new zv1(mw1Var, kw1Var, 3));
            }
        }
        this.f3350a = new HashSet();
    }
}
