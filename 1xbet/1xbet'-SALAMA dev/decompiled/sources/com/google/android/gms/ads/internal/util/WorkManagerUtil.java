package com.google.android.gms.ads.internal.util;

import I2.z;
import J2.j;
import M4.e;
import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import java.util.HashMap;
import java.util.HashSet;
import p023d1.b;
import p023d1.c;
import p023d1.g;
import p031e1.l;
import p088m1.i;
import p105o3.a;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends zzaxo implements z {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public static void Z(Context context) {
        try {
            l.n0(context.getApplicationContext(), new b(new e()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzaxp.zzc(parcel);
            boolean zZzf = zzf(aVarZ, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i7 == 2) {
            a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zze(aVarZ2);
            parcel2.writeNoException();
        } else {
            if (i7 != 3) {
                return false;
            }
            a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
            zza zzaVar = (zza) zzaxp.zza(parcel, zza.CREATOR);
            zzaxp.zzc(parcel);
            boolean zZzg = zzg(aVarZ3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }

    @Override // I2.z
    public final void zze(a aVar) {
        Context context = (Context) p105o3.b.t0(aVar);
        Z(context);
        try {
            l lVarM0 = l.m0(context);
            lVarM0.f12553x.G(new p096n1.b(lVarM0, 0));
            p023d1.e eVar = new p023d1.e();
            c cVar = new c();
            cVar.f12349a = 1;
            cVar.f12354f = -1L;
            cVar.f12355g = -1L;
            new HashSet();
            cVar.f12350b = false;
            cVar.f12351c = false;
            cVar.f12349a = 2;
            cVar.f12352d = false;
            cVar.f12353e = false;
            cVar.f12356h = eVar;
            cVar.f12354f = -1L;
            cVar.f12355g = -1L;
            C1050x1 c1050x1 = new C1050x1(OfflinePingSender.class);
            ((i) c1050x1.f17932c).j = cVar;
            ((HashSet) c1050x1.f17933d).add("offline_ping_sender_work");
            lVarM0.D(c1050x1.E());
        } catch (IllegalStateException e7) {
            j.h("Failed to instantiate WorkManager.", e7);
        }
    }

    @Override // I2.z
    public final boolean zzf(a aVar, String str, String str2) {
        return zzg(aVar, new zza(str, str2, ""));
    }

    @Override // I2.z
    public final boolean zzg(a aVar, zza zzaVar) throws Throwable {
        Context context = (Context) p105o3.b.t0(aVar);
        Z(context);
        p023d1.e eVar = new p023d1.e();
        c cVar = new c();
        cVar.f12349a = 1;
        cVar.f12354f = -1L;
        cVar.f12355g = -1L;
        new HashSet();
        cVar.f12350b = false;
        cVar.f12351c = false;
        cVar.f12349a = 2;
        cVar.f12352d = false;
        cVar.f12353e = false;
        cVar.f12356h = eVar;
        cVar.f12354f = -1L;
        cVar.f12355g = -1L;
        HashMap map = new HashMap();
        map.put("uri", zzaVar.f10795a);
        map.put("gws_query_id", zzaVar.f10796b);
        map.put("image_url", zzaVar.f10797c);
        g gVar = new g(map);
        g.c(gVar);
        C1050x1 c1050x1 = new C1050x1(OfflineNotificationPoster.class);
        i iVar = (i) c1050x1.f17932c;
        iVar.j = cVar;
        iVar.f15226e = gVar;
        ((HashSet) c1050x1.f17933d).add("offline_notification_work");
        try {
            l.m0(context).D(c1050x1.E());
            return true;
        } catch (IllegalStateException e7) {
            j.h("Failed to instantiate WorkManager.", e7);
            return false;
        }
    }
}
