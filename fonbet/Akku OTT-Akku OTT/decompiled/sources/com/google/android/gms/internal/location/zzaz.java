package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.BinderC0844s;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.common.api.internal.InterfaceC0831e;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.location.AbstractC0927f;
import com.google.android.gms.location.C0924c;
import com.google.android.gms.location.C0926e;
import com.google.android.gms.location.C0930i;
import com.google.android.gms.location.C0931j;
import com.google.android.gms.location.InterfaceC0928g;
import com.google.android.gms.location.K;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.V;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, h.a aVar, h.b bVar, String str, C0863e c0863e) {
        super(context, looper, aVar, bVar, str, c0863e);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception unused) {
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() throws RemoteException {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, C0838l<AbstractC0927f> c0838l, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, c0838l, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, C0838l<InterfaceC0928g> c0838l, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, c0838l, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(C0838l.a<InterfaceC0928g> aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzh(aVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(C0838l.a<AbstractC0927f> aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzi(aVar, zzaiVar);
    }

    public final void zzI(boolean z) throws RemoteException {
        this.zzf.zzk(z);
    }

    public final void zzJ(Location location) throws RemoteException {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) throws RemoteException {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(C0930i c0930i, InterfaceC0831e<C0931j> interfaceC0831e, String str) throws RemoteException {
        checkConnected();
        C0875q.b(c0930i != null, "locationSettingsRequest can't be null nor empty.");
        C0875q.b(interfaceC0831e != null, "listener can't be null.");
        ((zzam) getService()).zzt(c0930i, new zzay(interfaceC0831e), null);
    }

    public final void zzq(long j, PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        C0875q.g(pendingIntent);
        C0875q.b(j >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) getService()).zzh(j, true, pendingIntent);
    }

    public final void zzr(C0924c c0924c, PendingIntent pendingIntent, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.h(c0924c, "activityTransitionRequest must be specified.");
        C0875q.h(pendingIntent, "PendingIntent must be specified.");
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zzi(c0924c, pendingIntent, new BinderC0844s(interfaceC0831e));
    }

    public final void zzs(PendingIntent pendingIntent, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new BinderC0844s(interfaceC0831e));
    }

    public final void zzt(PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        C0875q.g(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.h(pendingIntent, "PendingIntent must be specified.");
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new BinderC0844s(interfaceC0831e));
    }

    public final void zzv(C0926e c0926e, PendingIntent pendingIntent, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.h(c0926e, "geofencingRequest can't be null.");
        C0875q.h(pendingIntent, "PendingIntent must be specified.");
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zzd(c0926e, pendingIntent, new zzaw(interfaceC0831e));
    }

    public final void zzw(K k, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.h(k, "removeGeofencingRequest can't be null.");
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zzg(k, new zzax(interfaceC0831e));
    }

    public final void zzx(PendingIntent pendingIntent, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.h(pendingIntent, "PendingIntent must be specified.");
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(interfaceC0831e), getContext().getPackageName());
    }

    public final void zzy(List<String> list, InterfaceC0831e<Status> interfaceC0831e) throws RemoteException {
        checkConnected();
        C0875q.b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        C0875q.h(interfaceC0831e, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(interfaceC0831e), getContext().getPackageName());
    }

    public final Location zzz(String str) throws RemoteException {
        return ArrayUtils.contains(getAvailableFeatures(), V.a) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
