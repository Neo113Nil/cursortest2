package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdqm extends zzcyl {
    public static final zzgxm zzc = zzgxm.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdqr zze;
    private final zzdqz zzf;
    private final zzdrq zzg;
    private final zzdqw zzh;
    private final zzdrb zzi;
    private final zzinq zzj;
    private final zzinq zzk;
    private final zzinq zzl;
    private final zzinq zzm;
    private final zzinq zzn;
    private zzdso zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzceo zzt;
    private final zzbbd zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdqo zzx;
    private final zzeud zzy;
    private final Map zzz;

    public zzdqm(zzcyk zzcykVar, Executor executor, zzdqr zzdqrVar, zzdqz zzdqzVar, zzdrq zzdrqVar, zzdqw zzdqwVar, zzdrb zzdrbVar, zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, zzinq zzinqVar4, zzinq zzinqVar5, zzceo zzceoVar, zzbbd zzbbdVar, VersionInfoParcel versionInfoParcel, Context context, zzdqo zzdqoVar, zzeud zzeudVar, zzbfj zzbfjVar) {
        super(zzcykVar);
        this.zzd = executor;
        this.zze = zzdqrVar;
        this.zzf = zzdqzVar;
        this.zzg = zzdrqVar;
        this.zzh = zzdqwVar;
        this.zzi = zzdrbVar;
        this.zzj = zzinqVar;
        this.zzk = zzinqVar2;
        this.zzl = zzinqVar3;
        this.zzm = zzinqVar4;
        this.zzn = zzinqVar5;
        this.zzt = zzceoVar;
        this.zzu = zzbbdVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdqoVar;
        this.zzy = zzeudVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmk)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzy >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzml)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdso zzdsoVar) {
        Iterator<String> keys;
        View view;
        zzbay zzb;
        if (!this.zzp) {
            this.zzo = zzdsoVar;
            this.zzg.zza(zzdsoVar);
            this.zzf.zza(zzdsoVar.zzdF(), zzdsoVar.zzi(), zzdsoVar.zzj(), zzdsoVar, zzdsoVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdE)).booleanValue() && (zzb = this.zzu.zzb()) != null) {
                zzb.zzh(zzdsoVar.zzdF());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcA)).booleanValue()) {
                zzfld zzfldVar = this.zzb;
                if (zzfldVar.zzak && (keys = zzfldVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        zzdso zzdsoVar2 = this.zzo;
                        WeakReference weakReference = zzdsoVar2 == null ? null : (WeakReference) zzdsoVar2.zzh().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzbfi zzbfiVar = new zzbfi(this.zzw, view);
                            this.zzA.add(zzbfiVar);
                            zzbfiVar.zza(new zzdqb(this, next));
                        }
                    }
                }
            }
            if (zzdsoVar.zzf() != null) {
                zzdsoVar.zzf().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdso zzdsoVar) {
        this.zzf.zzb(zzdsoVar.zzdF(), zzdsoVar.zzh());
        if (zzdsoVar.zzdA() != null) {
            zzdsoVar.zzdA().setClickable(false);
            zzdsoVar.zzdA().removeAllViews();
        }
        if (zzdsoVar.zzf() != null) {
            zzdsoVar.zzf().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View zzag;
        if (!this.zzr && (zzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpu)).booleanValue()) {
                Rect rect = new Rect();
                if (zzag.getGlobalVisibleRect(rect, new Point()) && zzag.getHeight() == rect.height() && zzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpv)).booleanValue()) {
                zzbix zzbixVar = zzbjg.zzpw;
                if (((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).floatValue() > 0.0d) {
                    double floatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).floatValue();
                    if (zzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= zzag.getHeight() * zzag.getWidth() * (floatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(zzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgxm zzgxmVar = zzc;
            int size = zzgxmVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgxmVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdso zzdsoVar = this.zzo;
        if (zzdsoVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzm = zzdsoVar.zzm();
        if (zzm != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzm);
        }
        return zzdrq.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgx)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture zzX = this.zze.zzX();
        if (zzX == null) {
            return;
        }
        zzhcy.zzr(zzX, new zzdqc(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzeml zzemlVar) {
        zzclm zzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzemlVar == null || zzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzemlVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzf.zzr(zzdgVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzf.zzs(zzdcVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdso zzdsoVar = this.zzo;
        if (zzdsoVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdsoVar instanceof zzdrk;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqm.this.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznj)).booleanValue()) {
            zzdso zzdsoVar = this.zzo;
            if (zzdsoVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdsoVar instanceof zzdrk;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqi
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdqm.this.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzeml zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzemh zzemhVar;
        zzemi zzemiVar;
        zzdqw zzdqwVar = this.zzh;
        if (zzdqwVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdqr zzdqrVar = this.zze;
            zzclm zzW = zzdqrVar.zzW();
            zzclm zzT = zzdqrVar.zzT();
            if (zzW == null && zzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdqwVar.zzg();
            int zzc2 = zzdqwVar.zzg().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    String str3 = zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : ShareConstants.VIDEO_URL;
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String sb2 = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    return null;
                }
                if (zzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else if (z2) {
                str2 = "javascript";
                zzW = zzT;
            } else {
                zzW = null;
                str2 = null;
            }
            if (zzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb3.append(i8);
            sb3.append(".");
            sb3.append(i9);
            String sb4 = sb3.toString();
            if (z2) {
                zzemhVar = zzemh.VIDEO;
                zzemiVar = zzemi.DEFINED_BY_JAVASCRIPT;
            } else {
                zzemhVar = zzemh.NATIVE_DISPLAY;
                zzemiVar = zzdqrVar.zzx() == 3 ? zzemi.UNSPECIFIED : zzemi.ONE_PIXEL;
            }
            zzeml zzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(sb4, zzW.zzD(), "", "javascript", str2, str, zzemiVar, zzemhVar, this.zzb.zzal);
            if (zzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdqrVar.zzq(zzd);
            zzW.zzak(zzd);
            if (z2) {
                zzfvm zza = zzd.zza();
                if (zzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza, zzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzd.zza());
                zzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgx)).booleanValue()) {
            zzdqr zzdqrVar = this.zze;
            if (zzdqrVar.zzx() != 3) {
                zzcgo zzY = zzdqrVar.zzY();
                if (zzY == null) {
                    return;
                }
                zzhcy.zzr(zzY, new zzdqd(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzeml zzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzZ.zza(), view);
    }

    public final zzdqo zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzy.zza(zzdqVar);
    }

    public final void zzR(Bundle bundle) {
        final zzclm zzT = this.zze.zzT();
        if (zzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgxm zzgxmVar = zzdqm.zzc;
                    zzclm.this.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        zzdso zzdsoVar = this.zzo;
        if (zzdsoVar != null) {
            this.zzf.zzf(null, zzdsoVar.zzdF(), this.zzo.zzh(), this.zzo.zzi(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdso zzdsoVar = this.zzo;
        if (zzdsoVar != null) {
            this.zzf.zzf(view, zzdsoVar.zzdF(), this.zzo.zzh(), this.zzo.zzi(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdqr zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdso zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdqm.this.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzz = this.zzf.zzz(bundle);
        this.zzq = zzz;
        return zzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdso zzdsoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcy)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqm.this.zzU(zzdsoVar);
                }
            });
        } else {
            zzU(zzdsoVar);
        }
    }

    public final synchronized void zzh(final zzdso zzdsoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcy)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqm.this.zzV(zzdsoVar);
                }
            });
        } else {
            zzV(zzdsoVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzclm zzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdqr zzdqrVar = this.zze;
            if (zzdqrVar.zzT() != null && (zzT = zzdqrVar.zzT()) != null) {
                zzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdqm.this.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdqz zzdqzVar = this.zzf;
            Objects.requireNonNull(zzdqzVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdql
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqz.this.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    public final synchronized void zzu(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcA)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it = map3.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) map3.get((String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z) {
            zzae(view, map, map2);
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeU)).booleanValue() && map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && zzI(view2)) {
                    zzae(view, map, map2);
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzboj zzbojVar) {
        this.zzf.zzp(zzbojVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            zzdqr zzdqrVar = this.zze;
            int zzx = zzdqrVar.zzx();
            if (zzx == 1) {
                zzbnt zza = this.zzi.zza();
                if (zza != null) {
                    zzai("Google", true);
                    zza.zze((zzbnj) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzx == 2) {
                zzbnq zzb = this.zzi.zzb();
                if (zzb != null) {
                    zzai("Google", true);
                    zzb.zze((zzbnh) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzx == 3) {
                zzbnz zzf = this.zzi.zzf(zzdqrVar.zzS());
                if (zzf != null) {
                    if (zzdqrVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzf.zze((zzbnm) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzx == 6) {
                zzbog zzc2 = this.zzi.zzc();
                if (zzc2 != null) {
                    zzai("Google", true);
                    zzc2.zze((zzbom) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbtc zze = this.zzi.zze();
                if (zze != null) {
                    zze.zze((zzbsw) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
