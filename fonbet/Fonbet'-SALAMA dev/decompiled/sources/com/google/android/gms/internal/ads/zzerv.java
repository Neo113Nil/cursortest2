package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import n3.c;
import p3.d;

/* loaded from: classes.dex */
public final class zzerv implements zzesh {
    private final zzgbn zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    public zzerv(zzgbn zzgbnVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgbnVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    public static zzerw zzc(zzerv zzervVar) {
        boolean v6 = c.a(zzervVar.zzb).v();
        P p5 = o.f1952C.f1957c;
        boolean e7 = P.e(zzervVar.zzb);
        String str = zzervVar.zzc.f10834a;
        int myUid = Process.myUid();
        boolean z4 = myUid == 0 || myUid == 1000;
        ApplicationInfo applicationInfo = zzervVar.zzb.getApplicationInfo();
        int i7 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = zzervVar.zzb;
        return new zzerw(v6, e7, str, z4, i7, d.d(context, ModuleDescriptor.MODULE_ID, false), d.a(context, ModuleDescriptor.MODULE_ID), zzervVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerv.zzc(zzerv.this);
            }
        });
    }
}
