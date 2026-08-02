package com.google.android.gms.internal.ads;

import Q2.C0379q;
import Q2.InterfaceC0391w0;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0729Za extends E5 implements InterfaceC0638Ma {

    /* renamed from: k, reason: collision with root package name */
    public final Object f12481k;

    /* renamed from: l, reason: collision with root package name */
    public C0905dr f12482l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0567Cc f12483m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2360a f12484n;

    public BinderC0729Za() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean x3(Q2.X0 x02) {
        if (x02.f4962p) {
            return true;
        }
        U2.e eVar = C0379q.f.f5048a;
        return U2.e.j();
    }

    public static final String y3(Q2.X0 x02, String str) {
        String str2 = x02.f4952E;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void B2(InterfaceC2360a interfaceC2360a, Q2.a1 a1Var, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa) {
        J2.i iVar;
        Object obj = this.f12481k;
        boolean z3 = obj instanceof MediationBannerAdapter;
        if (!z3 && !(obj instanceof W2.a)) {
            U2.j.i(MediationBannerAdapter.class.getCanonicalName() + " or " + W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting banner ad from adapter.");
        boolean z5 = a1Var.f4987x;
        int i = a1Var.f4975l;
        int i5 = a1Var.f4978o;
        if (z5) {
            J2.i iVar2 = new J2.i(i5, i);
            iVar2.f2718e = true;
            iVar2.f = i;
            iVar = iVar2;
        } else {
            iVar = new J2.i(i5, i, a1Var.f4974k);
        }
        if (!z3) {
            if (obj instanceof W2.a) {
                try {
                    C0708Wa c0708Wa = new C0708Wa(this, interfaceC0659Pa, 0);
                    w3(str, x02, str2);
                    v3(x02);
                    x3(x02);
                    y3(x02, str);
                    ((W2.a) obj).loadBannerAd(new W2.g(), c0708Wa);
                    return;
                } catch (Throwable th) {
                    U2.j.g("", th);
                    AbstractC1668us.r(interfaceC2360a, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = x02.f4961o;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j5 = x02.f4958l;
            if (j5 != -1) {
                new Date(j5);
            }
            boolean x32 = x3(x02);
            int i6 = x02.f4963q;
            boolean z6 = x02.f4949B;
            y3(x02, str);
            C4.b bVar = new C4.b(hashSet, x32, i6, z6);
            Bundle bundle = x02.f4969w;
            mediationBannerAdapter.requestBannerAd((Context) BinderC2361b.t1(interfaceC2360a), new C0905dr(interfaceC0659Pa), w3(str, x02, str2), iVar, bVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            U2.j.g("", th2);
            AbstractC1668us.r(interfaceC2360a, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final boolean G() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void G0(InterfaceC2360a interfaceC2360a) {
        Object obj = this.f12481k;
        if (obj instanceof W2.a) {
            U2.j.d("Show rewarded ad from adapter.");
            U2.j.f("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final boolean I() {
        Object obj = this.f12481k;
        if ((obj instanceof W2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f12483m != null;
        }
        U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void K() {
        Object obj = this.f12481k;
        if (obj instanceof W2.e) {
            try {
                ((W2.e) obj).onResume();
            } catch (Throwable th) {
                U2.j.g("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C0673Ra M() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void P1(InterfaceC2360a interfaceC2360a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void R1(InterfaceC2360a interfaceC2360a, InterfaceC0567Cc interfaceC0567Cc, List list) {
        U2.j.i("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void R2(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, InterfaceC0659Pa interfaceC0659Pa) {
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting rewarded interstitial ad from adapter.");
        try {
            C0708Wa c0708Wa = new C0708Wa(this, interfaceC0659Pa, 2);
            w3(str, x02, null);
            v3(x02);
            x3(x02);
            y3(x02, str);
            ((W2.a) obj).loadRewardedInterstitialAd(new W2.m(), c0708Wa);
        } catch (Exception e3) {
            AbstractC1668us.r(interfaceC2360a, e3, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C0680Sa U() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void U0(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa, B8 b8, ArrayList arrayList) {
        Object obj = this.f12481k;
        boolean z3 = obj instanceof MediationNativeAdapter;
        if (!z3 && !(obj instanceof W2.a)) {
            U2.j.i(MediationNativeAdapter.class.getCanonicalName() + " or " + W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting native ad from adapter.");
        if (z3) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = x02.f4961o;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j5 = x02.f4958l;
                if (j5 != -1) {
                    new Date(j5);
                }
                boolean x32 = x3(x02);
                int i = x02.f4963q;
                boolean z5 = x02.f4949B;
                y3(x02, str);
                C0801bb c0801bb = new C0801bb(hashSet, x32, i, b8, arrayList, z5);
                Bundle bundle = x02.f4969w;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f12482l = new C0905dr(interfaceC0659Pa);
                mediationNativeAdapter.requestNativeAd((Context) BinderC2361b.t1(interfaceC2360a), this.f12482l, w3(str, x02, str2), c0801bb, bundle2);
                return;
            } catch (Throwable th) {
                U2.j.g("", th);
                AbstractC1668us.r(interfaceC2360a, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof W2.a) {
            try {
                C0722Ya c0722Ya = new C0722Ya(this, interfaceC0659Pa, 1);
                w3(str, x02, str2);
                v3(x02);
                x3(x02);
                y3(x02, str);
                ((W2.a) obj).loadNativeAdMapper(new W2.k(), c0722Ya);
            } catch (Throwable th2) {
                U2.j.g("", th2);
                AbstractC1668us.r(interfaceC2360a, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    C0708Wa c0708Wa = new C0708Wa(this, interfaceC0659Pa, 1);
                    w3(str, x02, str2);
                    v3(x02);
                    x3(x02);
                    y3(x02, str);
                    ((W2.a) obj).loadNativeAd(new W2.k(), c0708Wa);
                } catch (Throwable th3) {
                    U2.j.g("", th3);
                    AbstractC1668us.r(interfaceC2360a, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void V() {
        Object obj = this.f12481k;
        if (obj instanceof W2.a) {
            U2.j.f("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void b0() {
        Object obj = this.f12481k;
        if (obj instanceof MediationInterstitialAdapter) {
            U2.j.d("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                U2.j.g("", th);
                throw new RemoteException();
            }
        }
        U2.j.i(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void b1(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa) {
        Object obj = this.f12481k;
        boolean z3 = obj instanceof MediationInterstitialAdapter;
        if (!z3 && !(obj instanceof W2.a)) {
            U2.j.i(MediationInterstitialAdapter.class.getCanonicalName() + " or " + W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting interstitial ad from adapter.");
        if (!z3) {
            if (obj instanceof W2.a) {
                try {
                    C0722Ya c0722Ya = new C0722Ya(this, interfaceC0659Pa, 0);
                    w3(str, x02, str2);
                    v3(x02);
                    x3(x02);
                    y3(x02, str);
                    ((W2.a) obj).loadInterstitialAd(new W2.i(), c0722Ya);
                    return;
                } catch (Throwable th) {
                    U2.j.g("", th);
                    AbstractC1668us.r(interfaceC2360a, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = x02.f4961o;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j5 = x02.f4958l;
            if (j5 != -1) {
                new Date(j5);
            }
            boolean x32 = x3(x02);
            int i = x02.f4963q;
            boolean z5 = x02.f4949B;
            y3(x02, str);
            C4.b bVar = new C4.b(hashSet, x32, i, z5);
            Bundle bundle = x02.f4969w;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC2361b.t1(interfaceC2360a), new C0905dr(interfaceC0659Pa), w3(str, x02, str2), bVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            U2.j.g("", th2);
            AbstractC1668us.r(interfaceC2360a, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void c2(InterfaceC2360a interfaceC2360a, Q2.X0 x02, InterfaceC0567Cc interfaceC0567Cc, String str) {
        Object obj = this.f12481k;
        if ((obj instanceof W2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f12484n = interfaceC2360a;
            this.f12483m = interfaceC0567Cc;
            interfaceC0567Cc.c3(new BinderC2361b(obj));
            return;
        }
        U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void d3(InterfaceC2360a interfaceC2360a, Q2.a1 a1Var, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa) {
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting interscroller ad from adapter.");
        try {
            W2.a aVar = (W2.a) obj;
            C1390oj c1390oj = new C1390oj(9, interfaceC0659Pa, aVar);
            w3(str, x02, str2);
            v3(x02);
            x3(x02);
            y3(x02, str);
            int i = a1Var.f4978o;
            int i5 = a1Var.f4975l;
            J2.i iVar = new J2.i(i, i5);
            iVar.f2719g = true;
            iVar.f2720h = i5;
            aVar.loadInterscrollerAd(new W2.g(), c1390oj);
        } catch (Exception e3) {
            U2.j.g("", e3);
            AbstractC1668us.r(interfaceC2360a, e3, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final InterfaceC0391w0 g() {
        Object obj = this.f12481k;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                U2.j.g("", th);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.tb)).booleanValue() != false) goto L42;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g3(InterfaceC2360a interfaceC2360a, S9 s9, ArrayList arrayList) {
        char c5;
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            throw new RemoteException();
        }
        V9 v9 = new V9(10);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str = ((W9) obj2).f12025k;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            J2.c cVar = J2.c.f2704q;
            switch (c5) {
                case 0:
                    cVar = J2.c.f2699l;
                    break;
                case 1:
                    cVar = J2.c.f2700m;
                    break;
                case 2:
                    cVar = J2.c.f2701n;
                    break;
                case 3:
                    cVar = J2.c.f2702o;
                    break;
                case 4:
                    cVar = J2.c.f2703p;
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    cVar = null;
                    break;
            }
            if (cVar != null) {
                arrayList2.add(new Q1.j(10));
            }
        }
        ((W2.a) obj).initialize((Context) BinderC2361b.t1(interfaceC2360a), v9, arrayList2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C0666Qa h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void i1(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, InterfaceC0659Pa interfaceC0659Pa) {
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting app open ad from adapter.");
        try {
            C0722Ya c0722Ya = new C0722Ya(this, interfaceC0659Pa, 2);
            w3(str, x02, null);
            v3(x02);
            x3(x02);
            y3(x02, str);
            ((W2.a) obj).loadAppOpenAd(new W2.f(), c0722Ya);
        } catch (Exception e3) {
            U2.j.g("", e3);
            AbstractC1668us.r(interfaceC2360a, e3, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final InterfaceC0694Ua k() {
        com.google.ads.mediation.a aVar;
        Object obj = this.f12481k;
        if (!(obj instanceof MediationNativeAdapter)) {
            boolean z3 = obj instanceof W2.a;
            return null;
        }
        C0905dr c0905dr = this.f12482l;
        if (c0905dr == null || (aVar = (com.google.ads.mediation.a) c0905dr.f13187m) == null) {
            return null;
        }
        return new BinderC0845cb(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void k1() {
        Object obj = this.f12481k;
        if (obj instanceof W2.e) {
            try {
                ((W2.e) obj).onPause();
            } catch (Throwable th) {
                U2.j.g("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C1651ub l() {
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            return null;
        }
        ((W2.a) obj).getSDKVersionInfo();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void l1(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, InterfaceC0659Pa interfaceC0659Pa) {
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        U2.j.d("Requesting rewarded ad from adapter.");
        try {
            C0708Wa c0708Wa = new C0708Wa(this, interfaceC0659Pa, 2);
            w3(str, x02, null);
            v3(x02);
            x3(x02);
            y3(x02, str);
            ((W2.a) obj).loadRewardedAd(new W2.m(), c0708Wa);
        } catch (Exception e3) {
            U2.j.g("", e3);
            AbstractC1668us.r(interfaceC2360a, e3, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final InterfaceC2360a m() {
        Object obj = this.f12481k;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new BinderC2361b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                U2.j.g("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof W2.a) {
            return new BinderC2361b(null);
        }
        U2.j.i(MediationBannerAdapter.class.getCanonicalName() + " or " + W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void m1(boolean z3) {
        Object obj = this.f12481k;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z3);
                return;
            } catch (Throwable th) {
                U2.j.g("", th);
                return;
            }
        }
        U2.j.d(AbstractAdViewAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void n() {
        Object obj = this.f12481k;
        if (obj instanceof W2.e) {
            try {
                ((W2.e) obj).onDestroy();
            } catch (Throwable th) {
                U2.j.g("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C1651ub o() {
        Object obj = this.f12481k;
        if (!(obj instanceof W2.a)) {
            return null;
        }
        ((W2.a) obj).getVersionInfo();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void o0(Q2.X0 x02, String str) {
        u3(x02, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void p3(InterfaceC2360a interfaceC2360a) {
        Object obj = this.f12481k;
        if ((obj instanceof W2.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                b0();
                return;
            } else {
                U2.j.d("Show interstitial ad from adapter.");
                U2.j.f("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        U2.j.i(MediationInterstitialAdapter.class.getCanonicalName() + " or " + W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0659Pa c0645Na;
        InterfaceC0659Pa c0645Na2;
        InterfaceC0659Pa c0645Na3;
        InterfaceC0659Pa c0645Na4;
        InterfaceC0567Cc c0551Ac;
        InterfaceC0659Pa c0645Na5;
        InterfaceC0567Cc interfaceC0567Cc;
        C1529ro c1529ro;
        InterfaceC0659Pa c0645Na6;
        S9 r9;
        InterfaceC0659Pa c0645Na7;
        InterfaceC0659Pa c0645Na8;
        InterfaceC0659Pa interfaceC0659Pa = null;
        switch (i) {
            case 1:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.a1 a1Var = (Q2.a1) F5.a(parcel, Q2.a1.CREATOR);
                Q2.X0 x02 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0645Na = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na = queryLocalInterface instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface : new C0645Na(readStrongBinder);
                }
                F5.b(parcel);
                B2(h1, a1Var, x02, readString, null, c0645Na);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC2360a m5 = m();
                parcel2.writeNoException();
                F5.e(parcel2, m5);
                return true;
            case 3:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x03 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c0645Na2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na2 = queryLocalInterface2 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface2 : new C0645Na(readStrongBinder2);
                }
                F5.b(parcel);
                b1(h12, x03, readString2, null, c0645Na2);
                parcel2.writeNoException();
                return true;
            case 4:
                b0();
                parcel2.writeNoException();
                return true;
            case 5:
                n();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.a1 a1Var2 = (Q2.a1) F5.a(parcel, Q2.a1.CREATOR);
                Q2.X0 x04 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c0645Na3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na3 = queryLocalInterface3 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface3 : new C0645Na(readStrongBinder3);
                }
                F5.b(parcel);
                B2(h13, a1Var2, x04, readString3, readString4, c0645Na3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x05 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c0645Na4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na4 = queryLocalInterface4 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface4 : new C0645Na(readStrongBinder4);
                }
                F5.b(parcel);
                b1(h14, x05, readString5, readString6, c0645Na4);
                parcel2.writeNoException();
                return true;
            case 8:
                k1();
                parcel2.writeNoException();
                return true;
            case 9:
                K();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x06 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    c0551Ac = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    c0551Ac = queryLocalInterface5 instanceof InterfaceC0567Cc ? (InterfaceC0567Cc) queryLocalInterface5 : new C0551Ac(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 0);
                }
                String readString7 = parcel.readString();
                F5.b(parcel);
                c2(h15, x06, c0551Ac, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                Q2.X0 x07 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString8 = parcel.readString();
                F5.b(parcel);
                u3(x07, readString8);
                parcel2.writeNoException();
                return true;
            case 12:
                V();
                throw null;
            case 13:
                boolean I5 = I();
                parcel2.writeNoException();
                ClassLoader classLoader = F5.f8654a;
                parcel2.writeInt(I5 ? 1 : 0);
                return true;
            case 14:
                InterfaceC2360a h16 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x08 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    c0645Na5 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na5 = queryLocalInterface6 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface6 : new C0645Na(readStrongBinder6);
                }
                B8 b8 = (B8) F5.a(parcel, B8.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                F5.b(parcel);
                U0(h16, x08, readString9, readString10, c0645Na5, b8, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                F5.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                F5.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                F5.d(parcel2, bundle3);
                return true;
            case 20:
                Q2.X0 x09 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                F5.b(parcel);
                u3(x09, readString11);
                parcel2.writeNoException();
                return true;
            case C1639u7.zzm /* 21 */:
                InterfaceC2360a h17 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                P1(h17);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = F5.f8654a;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC2360a h18 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC0567Cc = queryLocalInterface7 instanceof InterfaceC0567Cc ? (InterfaceC0567Cc) queryLocalInterface7 : new C0551Ac(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 0);
                } else {
                    interfaceC0567Cc = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                F5.b(parcel);
                R1(h18, interfaceC0567Cc, createStringArrayList2);
                throw null;
            case 24:
                C0905dr c0905dr = this.f12482l;
                U8 u8 = (c0905dr == null || (c1529ro = (C1529ro) c0905dr.f13188n) == null) ? null : (U8) c1529ro.f15382l;
                parcel2.writeNoException();
                F5.e(parcel2, u8);
                return true;
            case 25:
                boolean f = F5.f(parcel);
                F5.b(parcel);
                m1(f);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC0391w0 g5 = g();
                parcel2.writeNoException();
                F5.e(parcel2, g5);
                return true;
            case 27:
                InterfaceC0694Ua k5 = k();
                parcel2.writeNoException();
                F5.e(parcel2, k5);
                return true;
            case 28:
                InterfaceC2360a h19 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x010 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    c0645Na6 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na6 = queryLocalInterface8 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface8 : new C0645Na(readStrongBinder8);
                }
                F5.b(parcel);
                l1(h19, x010, readString12, c0645Na6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC2360a h110 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                G0(h110);
                throw null;
            case 31:
                InterfaceC2360a h111 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    r9 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    r9 = queryLocalInterface9 instanceof S9 ? (S9) queryLocalInterface9 : new R9(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 0);
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(W9.CREATOR);
                F5.b(parcel);
                g3(h111, r9, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC2360a h112 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x011 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    c0645Na7 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na7 = queryLocalInterface10 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface10 : new C0645Na(readStrongBinder10);
                }
                F5.b(parcel);
                R2(h112, x011, readString13, c0645Na7);
                parcel2.writeNoException();
                return true;
            case 33:
                o();
                parcel2.writeNoException();
                ClassLoader classLoader5 = F5.f8654a;
                parcel2.writeInt(0);
                return true;
            case 34:
                l();
                parcel2.writeNoException();
                ClassLoader classLoader6 = F5.f8654a;
                parcel2.writeInt(0);
                return true;
            case 35:
                InterfaceC2360a h113 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.a1 a1Var3 = (Q2.a1) F5.a(parcel, Q2.a1.CREATOR);
                Q2.X0 x012 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    c0645Na8 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c0645Na8 = queryLocalInterface11 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface11 : new C0645Na(readStrongBinder11);
                }
                F5.b(parcel);
                d3(h113, a1Var3, x012, readString14, readString15, c0645Na8);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader7 = F5.f8654a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                InterfaceC2360a h114 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                p3(h114);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC2360a h115 = BinderC2361b.h1(parcel.readStrongBinder());
                Q2.X0 x013 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC0659Pa = queryLocalInterface12 instanceof InterfaceC0659Pa ? (InterfaceC0659Pa) queryLocalInterface12 : new C0645Na(readStrongBinder12);
                }
                F5.b(parcel);
                i1(h115, x013, readString16, interfaceC0659Pa);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC2360a h116 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                y1(h116);
                throw null;
        }
    }

    public final void u3(Q2.X0 x02, String str) {
        Object obj = this.f12481k;
        if (obj instanceof W2.a) {
            l1(this.f12484n, x02, str, new BinderC0756ab((W2.a) obj, this.f12483m));
            return;
        }
        U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public final void v3(Q2.X0 x02) {
        Bundle bundle = x02.f4969w;
        if (bundle == null || bundle.getBundle(this.f12481k.getClass().getName()) == null) {
            new Bundle();
        }
    }

    public final Bundle w3(String str, Q2.X0 x02, String str2) {
        U2.j.d("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f12481k instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (x02 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", x02.f4963q);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            U2.j.g("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void y1(InterfaceC2360a interfaceC2360a) {
        Object obj = this.f12481k;
        if (obj instanceof W2.a) {
            U2.j.d("Show app open ad from adapter.");
            U2.j.f("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        U2.j.i(W2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public BinderC0729Za(W2.a aVar) {
        this();
        this.f12481k = aVar;
    }

    public BinderC0729Za(W2.e eVar) {
        this();
        this.f12481k = eVar;
    }
}
