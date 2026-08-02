package com.google.android.gms.internal.ads;

import E2.o;
import F2.A0;
import F2.C0254t;
import F2.F0;
import I2.P;
import S2.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import y2.f;
import y2.h;
import y2.i;
import y2.j;
import y2.n;
import y2.s;
import y2.v;

/* loaded from: classes.dex */
public final class zzdum extends A0 {
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdua zzd;
    private final zzgbn zze;
    private zzdtp zzf;

    public zzdum(Context context, WeakReference weakReference, zzdua zzduaVar, zzdun zzdunVar, zzgbn zzgbnVar) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.zza = new HashMap();
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzduaVar;
        this.zze = zzgbnVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static i zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new i((h) new h(6).a(bundle, AdMobAdapter.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        v responseInfo;
        F0 f02;
        if (obj instanceof n) {
            responseInfo = ((n) obj).f18175e;
        } else if (obj instanceof A2.b) {
            responseInfo = ((A2.b) obj).getResponseInfo();
        } else if (obj instanceof K2.a) {
            responseInfo = ((K2.a) obj).getResponseInfo();
        } else if (obj instanceof c) {
            responseInfo = ((c) obj).getResponseInfo();
        } else if (obj instanceof T2.a) {
            responseInfo = ((T2.a) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (f02 = responseInfo.f18183a) == null) {
            return "";
        }
        try {
            return f02.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgbc.zzr(this.zzf.zzb(str), new zzduk(this, str2), this.zze);
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgbc.zzr(this.zzf.zzb(str), new zzdul(this, str2), this.zze);
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // F2.B0
    public final void zze(String str, InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2) {
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        ViewGroup viewGroup = (ViewGroup) BinderC1507b.t0(interfaceC1506a2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzdun.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdun.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdtp zzdtpVar) {
        this.zzf = zzdtpVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c3;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1372958932:
                    if (str2.equals("INTERSTITIAL")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                A2.b.load(zzj(), str, zzk(), new zzdue(this, str, str3));
                return;
            }
            if (c3 == 1) {
                AdView adView = new AdView(zzj());
                adView.setAdSize(j.f18155i);
                adView.setAdUnitId(str);
                adView.setAdListener(new zzduf(this, str, adView, str3));
                adView.b(zzk());
                return;
            }
            if (c3 == 2) {
                K2.a.load(zzj(), str, zzk(), new zzdug(this, str, str3));
                return;
            }
            if (c3 == 3) {
                f fVar = new f(zzj(), str);
                fVar.b(new O2.c() { // from class: com.google.android.gms.internal.ads.zzdub
                    @Override // O2.c
                    public final void onNativeAdLoaded(NativeAd nativeAd) {
                        zzdum.this.zzg(str, nativeAd, str3);
                    }
                });
                fVar.c(new zzduj(this, str3));
                fVar.a().a(zzk().f18154a);
                return;
            }
            if (c3 == 4) {
                c.load(zzj(), str, zzk(), new zzduh(this, str, str3));
            } else {
                if (c3 != 5) {
                    return;
                }
                T2.a.load(zzj(), str, zzk(), new zzdui(this, str, str3));
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003e, B:24:0x0049, B:27:0x0050, B:29:0x0054, B:32:0x005b, B:34:0x005f, B:37:0x006b, B:39:0x006f, B:42:0x007b, B:44:0x0089, B:46:0x008d, B:48:0x0091, B:51:0x0039), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003e, B:24:0x0049, B:27:0x0050, B:29:0x0054, B:32:0x005b, B:34:0x005f, B:37:0x006b, B:39:0x006f, B:42:0x007b, B:44:0x0089, B:46:0x008d, B:48:0x0091, B:51:0x0039), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzi(String str, String str2) {
        Object obj;
        try {
            Activity zzg = this.zzd.zzg();
            if (zzg != null && (obj = this.zza.get(str)) != null) {
                zzbbp zzbbpVar = zzbby.zzjt;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    if (!(obj instanceof A2.b)) {
                        if (!(obj instanceof K2.a)) {
                            if (!(obj instanceof c)) {
                                if (obj instanceof T2.a) {
                                }
                                zzn(zzl(obj), str2);
                                if (!(obj instanceof A2.b)) {
                                    ((A2.b) obj).show(zzg);
                                    return;
                                }
                                if (obj instanceof K2.a) {
                                    ((K2.a) obj).show(zzg);
                                    return;
                                }
                                if (obj instanceof c) {
                                    ((c) obj).show(zzg, new s() { // from class: com.google.android.gms.internal.ads.zzduc
                                        @Override // y2.s
                                        public final void onUserEarnedReward(S2.b bVar) {
                                        }
                                    });
                                    return;
                                }
                                if (obj instanceof T2.a) {
                                    ((T2.a) obj).show(zzg, new s() { // from class: com.google.android.gms.internal.ads.zzdud
                                        @Override // y2.s
                                        public final void onUserEarnedReward(S2.b bVar) {
                                        }
                                    });
                                    return;
                                }
                                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                                    Intent intent = new Intent();
                                    Context zzj = zzj();
                                    intent.setClassName(zzj, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                    intent.putExtra("adUnit", str);
                                    P p5 = o.f1952C.f1957c;
                                    P.p(zzj, intent);
                                    return;
                                }
                            }
                        }
                    }
                }
                this.zza.remove(str);
                zzn(zzl(obj), str2);
                if (!(obj instanceof A2.b)) {
                }
            }
        } finally {
        }
    }
}
