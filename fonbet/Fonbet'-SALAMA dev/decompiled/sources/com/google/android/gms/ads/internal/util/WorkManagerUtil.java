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
import d1.C0949b;
import d1.C0950c;
import d1.C0952e;
import d1.C0954g;
import e1.l;
import java.util.HashMap;
import java.util.HashSet;
import m1.i;
import n1.C1447b;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import w1.C1759x1;

/* loaded from: classes.dex */
public class WorkManagerUtil extends zzaxo implements z {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public static void Z(Context context) {
        try {
            l.n0(context.getApplicationContext(), new C0949b(new e()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaxp.zzc(parcel);
            boolean zzf = zzf(Z6, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i7 == 2) {
            InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zze(Z7);
            parcel2.writeNoException();
        } else {
            if (i7 != 3) {
                return false;
            }
            InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
            zza zzaVar = (zza) zzaxp.zza(parcel, zza.CREATOR);
            zzaxp.zzc(parcel);
            boolean zzg = zzg(Z8, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }

    @Override // I2.z
    public final void zze(InterfaceC1506a interfaceC1506a) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        Z(context);
        try {
            l m02 = l.m0(context);
            m02.f12547x.G(new C1447b(m02, 0));
            C0952e c0952e = new C0952e();
            C0950c c0950c = new C0950c();
            c0950c.f12343a = 1;
            c0950c.f12348f = -1L;
            c0950c.f12349g = -1L;
            new HashSet();
            c0950c.f12344b = false;
            c0950c.f12345c = false;
            c0950c.f12343a = 2;
            c0950c.f12346d = false;
            c0950c.f12347e = false;
            c0950c.f12350h = c0952e;
            c0950c.f12348f = -1L;
            c0950c.f12349g = -1L;
            C1759x1 c1759x1 = new C1759x1(OfflinePingSender.class);
            ((i) c1759x1.f17926c).j = c0950c;
            ((HashSet) c1759x1.f17927d).add("offline_ping_sender_work");
            m02.D(c1759x1.E());
        } catch (IllegalStateException e7) {
            j.h("Failed to instantiate WorkManager.", e7);
        }
    }

    @Override // I2.z
    public final boolean zzf(InterfaceC1506a interfaceC1506a, String str, String str2) {
        return zzg(interfaceC1506a, new zza(str, str2, ""));
    }

    @Override // I2.z
    public final boolean zzg(InterfaceC1506a interfaceC1506a, zza zzaVar) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        Z(context);
        C0952e c0952e = new C0952e();
        C0950c c0950c = new C0950c();
        c0950c.f12343a = 1;
        c0950c.f12348f = -1L;
        c0950c.f12349g = -1L;
        new HashSet();
        c0950c.f12344b = false;
        c0950c.f12345c = false;
        c0950c.f12343a = 2;
        c0950c.f12346d = false;
        c0950c.f12347e = false;
        c0950c.f12350h = c0952e;
        c0950c.f12348f = -1L;
        c0950c.f12349g = -1L;
        HashMap hashMap = new HashMap();
        hashMap.put("uri", zzaVar.f10795a);
        hashMap.put("gws_query_id", zzaVar.f10796b);
        hashMap.put("image_url", zzaVar.f10797c);
        C0954g c0954g = new C0954g(hashMap);
        C0954g.c(c0954g);
        C1759x1 c1759x1 = new C1759x1(OfflineNotificationPoster.class);
        i iVar = (i) c1759x1.f17926c;
        iVar.j = c0950c;
        iVar.f15220e = c0954g;
        ((HashSet) c1759x1.f17927d).add("offline_notification_work");
        try {
            l.m0(context).D(c1759x1.E());
            return true;
        } catch (IllegalStateException e7) {
            j.h("Failed to instantiate WorkManager.", e7);
            return false;
        }
    }
}
