package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzesw implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzesw(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    public static zzesu zzc(zzesw zzeswVar) {
        boolean z4;
        int i7;
        TelephonyManager telephonyManager = (TelephonyManager) zzeswVar.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        int i8 = -1;
        if (P.b(zzeswVar.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) zzeswVar.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i7 = type;
                i8 = ordinal;
            } else {
                i7 = -1;
            }
            z4 = connectivityManager.isActiveNetworkMetered();
        } else {
            z4 = false;
            i7 = -2;
        }
        return new zzesu(networkOperator, i7, oVar.f1959e.g(zzeswVar.zzb), phoneType, z4, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesw.zzc(zzesw.this);
            }
        });
    }
}
