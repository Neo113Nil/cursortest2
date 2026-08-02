package com.google.android.gms.ads;

import F2.C0227f;
import F2.C0247p;
import F2.C0252s;
import J2.j;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbsh;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C0247p c0247p = C0252s.f2717f.f2719b;
            zzbok zzbokVar = new zzbok();
            c0247p.getClass();
            zzbsh zzbshVar = (zzbsh) new C0227f(this, zzbokVar).d(this, false);
            if (zzbshVar == null) {
                j.d("OfflineUtils is null");
            } else {
                zzbshVar.zze(getIntent());
            }
        } catch (RemoteException e7) {
            j.d("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
