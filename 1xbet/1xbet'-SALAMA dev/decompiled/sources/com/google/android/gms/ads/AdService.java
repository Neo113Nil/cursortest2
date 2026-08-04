package com.google.android.gms.ads;

import F2.C0227f;
import F2.C0247p;
import F2.C0252s;
import J2.j;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbsh;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C0247p c0247p = C0252s.f2717f.f2719b;
            zzbok zzbokVar = new zzbok();
            c0247p.getClass();
            ((zzbsh) new C0227f(this, zzbokVar).d(this, false)).zze(intent);
        } catch (RemoteException e7) {
            j.d("RemoteException calling handleNotificationIntent: ".concat(e7.toString()));
        }
    }
}
