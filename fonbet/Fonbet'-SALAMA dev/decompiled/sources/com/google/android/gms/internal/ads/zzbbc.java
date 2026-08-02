package com.google.android.gms.internal.ads;

import F2.C0254t;
import J2.j;
import J2.k;
import J2.l;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class zzbbc {
    zzaxs zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbc() {
        this.zzc = J2.b.f3804b;
    }

    public zzbbc(final Context context) {
        ExecutorService executorService = J2.b.f3804b;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbax
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfe)).booleanValue();
                zzbbc zzbbcVar = zzbbc.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbbcVar.zza = (zzaxs) Q0.a.h0(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new k() { // from class: com.google.android.gms.internal.ads.zzbay
                            @Override // J2.k
                            public final Object zza(Object obj) {
                                return zzaxr.zzb((IBinder) obj);
                            }
                        });
                        zzbbcVar.zza.zze(new BinderC1507b(context2), "GMA_SDK");
                        zzbbcVar.zzb = true;
                    } catch (l | RemoteException | NullPointerException unused) {
                        j.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
