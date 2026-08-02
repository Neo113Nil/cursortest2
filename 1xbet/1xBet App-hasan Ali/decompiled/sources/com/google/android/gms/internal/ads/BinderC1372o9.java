package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.o9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1372o9 extends E5 implements InterfaceC0924e9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14775k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14776l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1372o9(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f14775k = i;
        this.f14776l = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:6|(2:7|8)|9|(2:10|11)|12|(2:13|14)|15|(2:16|17)|18|19|20|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|f5)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:6|(2:7|8)|9|10|11|12|(2:13|14)|15|(2:16|17)|18|19|20|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|f5)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Can't wrap try/catch for region: R(34:6|(2:7|8)|9|10|11|12|13|14|15|(2:16|17)|18|19|20|(20:68|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(2:43|f5)|51|52|54)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|51|52|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        U2.j.g("Exception occurred while getting video controller", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a8, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a9, code lost:
    
        U2.j.g("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0097, code lost:
    
        U2.j.g("", r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x008b, code lost:
    
        U2.j.g("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: RemoteException -> 0x00a8, TRY_LEAVE, TryCatch #3 {RemoteException -> 0x00a8, blocks: (B:31:0x009d, B:33:0x00a3), top: B:30:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: RemoteException -> 0x00c5, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x00c5, blocks: (B:37:0x00b7, B:39:0x00bd), top: B:36:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0924e9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(InterfaceC1192k9 interfaceC1192k9) {
        String str;
        String str2;
        String str3;
        String str4;
        Double d5;
        InterfaceC2360a o5;
        double b3;
        switch (this.f14775k) {
            case 0:
                C0375o c0375o = new C0375o(interfaceC1192k9);
                com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.f14776l;
                eVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                aVar.f7423l = new Bundle();
                InterfaceC1192k9 interfaceC1192k92 = (InterfaceC1192k9) c0375o.f5042l;
                Object obj = null;
                try {
                    str = interfaceC1192k92.s();
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    str = null;
                }
                aVar.f7414a = str;
                aVar.f7415b = (ArrayList) c0375o.f5043m;
                try {
                    str2 = interfaceC1192k92.n();
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                    str2 = null;
                }
                aVar.f7416c = str2;
                aVar.f7417d = (J8) c0375o.f5044n;
                try {
                    str3 = interfaceC1192k92.r();
                } catch (RemoteException e6) {
                    U2.j.g("", e6);
                    str3 = null;
                }
                aVar.f7418e = str3;
                try {
                    str4 = interfaceC1192k92.m();
                } catch (RemoteException e7) {
                    U2.j.g("", e7);
                    str4 = null;
                }
                aVar.f = str4;
                try {
                    b3 = interfaceC1192k92.b();
                } catch (RemoteException e8) {
                    U2.j.g("", e8);
                }
                try {
                    if (b3 != -1.0d) {
                        d5 = Double.valueOf(b3);
                        aVar.f7419g = d5;
                        String str5 = interfaceC1192k92.w();
                        aVar.f7420h = str5;
                        String str6 = interfaceC1192k92.A();
                        aVar.i = str6;
                        o5 = interfaceC1192k92.o();
                        if (o5 != null) {
                            obj = BinderC2361b.t1(o5);
                        }
                        aVar.f7422k = obj;
                        aVar.f7424m = true;
                        aVar.f7425n = true;
                        v3.g gVar = (v3.g) c0375o.f5045o;
                        if (interfaceC1192k92.g() != null) {
                            gVar.I(interfaceC1192k92.g());
                        }
                        aVar.f7421j = gVar;
                        C0905dr c0905dr = (C0905dr) ((W2.l) eVar.f7432m);
                        c0905dr.getClass();
                        m3.v.c("#008 Must be called on the main UI thread.");
                        U2.j.d("Adapter called onAdLoaded.");
                        c0905dr.f13187m = aVar;
                        if (!(((AbstractAdViewAdapter) eVar.f7431l) instanceof AdMobAdapter)) {
                            Object obj2 = new Object();
                            new BinderC0701Va();
                            synchronized (obj2) {
                            }
                        }
                        ((InterfaceC0659Pa) c0905dr.f13186l).n();
                        return;
                    }
                    ((InterfaceC0659Pa) c0905dr.f13186l).n();
                    return;
                } catch (RemoteException e9) {
                    U2.j.k("#007 Could not call remote method.", e9);
                    return;
                }
                d5 = null;
                aVar.f7419g = d5;
                String str52 = interfaceC1192k92.w();
                aVar.f7420h = str52;
                String str62 = interfaceC1192k92.A();
                aVar.i = str62;
                o5 = interfaceC1192k92.o();
                if (o5 != null) {
                }
                aVar.f7422k = obj;
                aVar.f7424m = true;
                aVar.f7425n = true;
                v3.g gVar2 = (v3.g) c0375o.f5045o;
                if (interfaceC1192k92.g() != null) {
                }
                aVar.f7421j = gVar2;
                C0905dr c0905dr2 = (C0905dr) ((W2.l) eVar.f7432m);
                c0905dr2.getClass();
                m3.v.c("#008 Must be called on the main UI thread.");
                U2.j.d("Adapter called onAdLoaded.");
                c0905dr2.f13187m = aVar;
                if (!(((AbstractAdViewAdapter) eVar.f7431l) instanceof AdMobAdapter)) {
                }
            default:
                ((Z2.c) this.f14776l).d(new C0574Db(interfaceC1192k9));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1192k9 c1147j9;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c1147j9 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c1147j9 = queryLocalInterface instanceof InterfaceC1192k9 ? (InterfaceC1192k9) queryLocalInterface : new C1147j9(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 0);
        }
        F5.b(parcel);
        l0(c1147j9);
        parcel2.writeNoException();
        return true;
    }
}
