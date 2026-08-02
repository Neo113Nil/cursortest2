package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.location.C0926e;
import com.google.android.gms.location.InterfaceC0925d;
import com.google.android.gms.location.K;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzaf {
    @Deprecated
    public final i<Status> addGeofences(h hVar, List<InterfaceC0925d> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (InterfaceC0925d interfaceC0925d : list) {
                if (interfaceC0925d != null) {
                    C0875q.b(interfaceC0925d instanceof zzbe, "Geofence must be created using Geofence.Builder.");
                    arrayList.add((zzbe) interfaceC0925d);
                }
            }
        }
        C0875q.b(!arrayList.isEmpty(), "No geofence has been added to this request.");
        return hVar.b(new zzac(this, hVar, new C0926e(arrayList, 5, "", null), pendingIntent));
    }

    public final i<Status> removeGeofences(h hVar, PendingIntent pendingIntent) {
        C0875q.h(pendingIntent, "PendingIntent can not be null.");
        return zza(hVar, new K(null, pendingIntent, ""));
    }

    public final i<Status> zza(h hVar, K k) {
        return hVar.b(new zzad(this, hVar, k));
    }

    public final i<Status> removeGeofences(h hVar, List<String> list) {
        C0875q.h(list, "geofence can't be null.");
        C0875q.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return zza(hVar, new K(list, null, ""));
    }

    public final i<Status> addGeofences(h hVar, C0926e c0926e, PendingIntent pendingIntent) {
        return hVar.b(new zzac(this, hVar, c0926e, pendingIntent));
    }
}
