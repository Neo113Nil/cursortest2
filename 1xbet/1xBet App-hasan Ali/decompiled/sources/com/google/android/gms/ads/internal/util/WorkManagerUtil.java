package com.google.android.gms.ads.internal.util;

import Q1.j;
import R2.a;
import T2.x;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;
import f2.C1944b;
import f2.C1945c;
import f2.C1947e;
import f2.C1948f;
import g2.l;
import java.util.HashMap;
import java.util.HashSet;
import o2.i;
import p2.C2244b;
import s3.BinderC2361b;
import s3.InterfaceC2360a;
import v3.e;

/* loaded from: classes.dex */
public class WorkManagerUtil extends E5 implements x {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public static void u3(Context context) {
        try {
            l.R(context.getApplicationContext(), new C1944b(new j(27)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            F5.b(parcel);
            boolean zzf = zzf(h1, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
            return true;
        }
        if (i == 2) {
            InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            zze(h12);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
        a aVar = (a) F5.a(parcel, a.CREATOR);
        F5.b(parcel);
        boolean zzg = zzg(h13, aVar);
        parcel2.writeNoException();
        parcel2.writeInt(zzg ? 1 : 0);
        return true;
    }

    @Override // T2.x
    public final void zze(InterfaceC2360a interfaceC2360a) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        u3(context);
        try {
            l Q5 = l.Q(context);
            Q5.f17131n.t(new C2244b(Q5, 0));
            C1947e c1947e = new C1947e();
            C1945c c1945c = new C1945c();
            c1945c.f16982a = 1;
            c1945c.f = -1L;
            c1945c.f16987g = -1L;
            c1945c.f16988h = new C1947e();
            c1945c.f16983b = false;
            int i = Build.VERSION.SDK_INT;
            c1945c.f16984c = false;
            c1945c.f16982a = 2;
            c1945c.f16985d = false;
            c1945c.f16986e = false;
            if (i >= 24) {
                c1945c.f16988h = c1947e;
                c1945c.f = -1L;
                c1945c.f16987g = -1L;
            }
            e eVar = new e(OfflinePingSender.class);
            ((i) eVar.f20433m).f18640j = c1945c;
            ((HashSet) eVar.f20434n).add("offline_ping_sender_work");
            Q5.r(eVar.p());
        } catch (IllegalStateException e3) {
            U2.j.j("Failed to instantiate WorkManager.", e3);
        }
    }

    @Override // T2.x
    public final boolean zzf(InterfaceC2360a interfaceC2360a, String str, String str2) {
        return zzg(interfaceC2360a, new a(str, str2, ""));
    }

    @Override // T2.x
    public final boolean zzg(InterfaceC2360a interfaceC2360a, a aVar) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        u3(context);
        C1947e c1947e = new C1947e();
        C1945c c1945c = new C1945c();
        c1945c.f16982a = 1;
        c1945c.f = -1L;
        c1945c.f16987g = -1L;
        c1945c.f16988h = new C1947e();
        c1945c.f16983b = false;
        int i = Build.VERSION.SDK_INT;
        c1945c.f16984c = false;
        c1945c.f16982a = 2;
        c1945c.f16985d = false;
        c1945c.f16986e = false;
        if (i >= 24) {
            c1945c.f16988h = c1947e;
            c1945c.f = -1L;
            c1945c.f16987g = -1L;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uri", aVar.f5172k);
        hashMap.put("gws_query_id", aVar.f5173l);
        hashMap.put("image_url", aVar.f5174m);
        C1948f c1948f = new C1948f(hashMap);
        C1948f.c(c1948f);
        e eVar = new e(OfflineNotificationPoster.class);
        i iVar = (i) eVar.f20433m;
        iVar.f18640j = c1945c;
        iVar.f18637e = c1948f;
        ((HashSet) eVar.f20434n).add("offline_notification_work");
        try {
            l.Q(context).r(eVar.p());
            return true;
        } catch (IllegalStateException e3) {
            U2.j.j("Failed to instantiate WorkManager.", e3);
            return false;
        }
    }
}
