package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzdcy;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfmv;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzgub;
import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzhdi;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.U3;
import com.ironsource.mediationsdk.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzap extends zzcfd {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbkl zzI;
    private final zzj zzJ;
    private final zza zzK;
    private final zzcob zzf;
    private Context zzg;
    private final zzbbd zzh;
    private final zzfma zzi;
    private final zzfmv zzj;
    private final zzhdi zzk;
    private final ScheduledExecutorService zzl;
    private zzcal zzm;
    private final zzeao zzp;
    private final zzfte zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziq)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzip)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzis)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziu)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzit);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziv);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziw);

    zzap(zzcob zzcobVar, Context context, zzbbd zzbbdVar, zzfmv zzfmvVar, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzeao zzeaoVar, zzfte zzfteVar, VersionInfoParcel versionInfoParcel, zzbkl zzbklVar, zzfma zzfmaVar, zzj zzjVar, zza zzaVar) {
        List list;
        this.zzf = zzcobVar;
        this.zzg = context;
        this.zzh = zzbbdVar;
        this.zzi = zzfmaVar;
        this.zzj = zzfmvVar;
        this.zzk = zzhdiVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzeaoVar;
        this.zzq = zzfteVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbklVar;
        this.zzJ = zzjVar;
        this.zzK = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzix)).booleanValue()) {
            this.zzB = zzZ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziy));
            this.zzC = zzZ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziz));
            this.zzD = zzZ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziA));
            list = zzZ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziB));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzY(uri, "nas", str) : uri;
    }

    private final void zzQ(final List list, final IObjectWrapper iObjectWrapper, zzcai zzcaiVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziG)).booleanValue()) {
            try {
                zzcaiVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        zzhdi zzhdiVar = this.zzk;
        ListenableFuture submit = zzhdiVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzap.this.zzn(list, iObjectWrapper);
            }
        });
        if (zzX()) {
            submit = zzhcy.zzj(submit, new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzap.this.zzo((ArrayList) obj);
                }
            }, zzhdiVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzhcy.zzr(submit, new zzz(this, zzcaiVar, z), this.zzf.zzb());
    }

    private final void zzR(List list, final IObjectWrapper iObjectWrapper, zzcai zzcaiVar, boolean z) {
        ListenableFuture submit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziG)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzcaiVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzc((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            String valueOf = String.valueOf(list);
            String.valueOf(valueOf);
            String valueOf2 = String.valueOf(valueOf);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(valueOf2));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzc(uri)) {
                zzhdi zzhdiVar = this.zzk;
                submit = zzhdiVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzap.this.zzp(uri, iObjectWrapper);
                    }
                });
                if (zzX()) {
                    submit = zzhcy.zzj(submit, new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzap.this.zzq((Uri) obj);
                        }
                    }, zzhdiVar);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String valueOf3 = String.valueOf(uri);
                String.valueOf(valueOf3);
                String valueOf4 = String.valueOf(valueOf3);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf4));
                submit = zzhcy.zza(uri);
            }
            arrayList.add(submit);
        }
        zzhcy.zzr(zzhcy.zzm(arrayList), new zzaa(this, zzcaiVar, z), this.zzf.zzb());
    }

    private final void zzS() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzli)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzll)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlp)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final void zzw() {
        ListenableFuture zzc2;
        if (((Boolean) zzblm.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmJ)).booleanValue()) {
            zzc2 = zzhcy.zzf(new zzhcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.zzhcf
                public final /* synthetic */ ListenableFuture zza() {
                    return zzap.this.zzr();
                }
            }, zzcgj.zza);
        } else {
            try {
                zzc2 = zzV(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
            } catch (NullPointerException e) {
                zzc2 = zzhcy.zzc(e);
            }
        }
        zzhcy.zzr(zzc2, new zzab(this), this.zzf.zzb());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzx zzV(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        char c;
        zzflv zzflvVar = new zzflv();
        if ("REWARDED".equals(str2)) {
            zzflvVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzflvVar.zzj().zza(3);
        }
        zzw zzr = this.zzf.zzr();
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.zza(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzflvVar.zzg(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzflvVar.zza(zzmVar);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals(j.f8411a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            zzrVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzr.zzc() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzr() : com.google.android.gms.ads.internal.client.zzr.zzd() : com.google.android.gms.ads.internal.client.zzr.zzb() : new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
        }
        zzflvVar.zzc(zzrVar);
        zzflvVar.zzu(true);
        zzflvVar.zzv(bundle);
        zzdcyVar.zzb(zzflvVar.zzB());
        zzr.zzc(zzdcyVar.zze());
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        zzr.zzb(new zzat(zzasVar, null));
        new zzdjo();
        return zzr.zza();
    }

    private final ListenableFuture zzW(final String str) {
        final zzdvv[] zzdvvVarArr = new zzdvv[1];
        ListenableFuture zzb2 = this.zzj.zzb();
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzap.this.zzt(zzdvvVarArr, str, (zzdvv) obj);
            }
        };
        zzhdi zzhdiVar = this.zzk;
        ListenableFuture zzj = zzhcy.zzj(zzb2, zzhcgVar, zzhdiVar);
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzap.this.zzu(zzdvvVarArr);
            }
        }, zzhdiVar);
        return (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzi(zzhcq.zzw(zzj), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziH)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzal.zza, zzhdiVar), Exception.class, zzam.zza, zzhdiVar);
    }

    private final boolean zzX() {
        Map map;
        zzcal zzcalVar = this.zzm;
        return (zzcalVar == null || (map = zzcalVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzY(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + U3.j.b + str2 + U3.j.c + uri2.substring(i));
    }

    private static final List zzZ(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzgvb.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ zzfrg zzx(ListenableFuture listenableFuture, zzcfi zzcfiVar) {
        if (!zzfrj.zza() || !((Boolean) zzbla.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfrg zzb2 = ((zzx) zzhcy.zzs(listenableFuture)).zzb();
            zzb2.zzb(new ArrayList(Collections.singletonList(zzcfiVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcfiVar.zzd;
            zzb2.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzb2.zzd(zzmVar.zzm);
            return zzb2;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ zzfte zzA() {
        return this.zzq;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzD() {
        return this.zzt;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzu;
    }

    final /* synthetic */ String zzF() {
        return this.zzv;
    }

    final /* synthetic */ String zzG() {
        return this.zzw;
    }

    final /* synthetic */ AtomicInteger zzH() {
        return this.zzx;
    }

    final /* synthetic */ VersionInfoParcel zzI() {
        return this.zzy;
    }

    final /* synthetic */ String zzJ() {
        return this.zzz;
    }

    final /* synthetic */ void zzK(String str) {
        this.zzz = str;
    }

    final /* synthetic */ String zzL() {
        return this.zzA;
    }

    final /* synthetic */ AtomicBoolean zzM() {
        return this.zzG;
    }

    final /* synthetic */ AtomicInteger zzN() {
        return this.zzH;
    }

    final boolean zzb(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    final boolean zzc(Uri uri) {
        return zzU(uri, this.zzB, this.zzC);
    }

    final /* synthetic */ zzx zzd(zzcfi zzcfiVar, Bundle bundle) {
        return zzV(this.zzg, zzcfiVar.zza, zzcfiVar.zzb, zzcfiVar.zzc, zzcfiVar.zzd, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zze(IObjectWrapper iObjectWrapper, final zzcfi zzcfiVar, zzcfb zzcfbVar) {
        ListenableFuture zza2;
        ListenableFuture zzc2;
        ListenableFuture listenableFuture;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue()) {
            bundle.putLong(zzdzs.PUBLIC_API_CALL.zza(), zzcfiVar.zzd.zzz);
            bundle.putLong(zzdzs.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        this.zzg = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        zzfqw zzn = zzfqw.zzn(this.zzg, 22);
        zzn.zza();
        if ("UNKNOWN".equals(zzcfiVar.zzb)) {
            List arrayList = new ArrayList();
            zzbix zzbixVar = zzbjg.zziF;
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).split(","));
            }
            if (arrayList.contains(zzv.zzc(zzcfiVar.zzd))) {
                listenableFuture = zzhcy.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zzc2 = zzhcy.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                zzhcy.zzr(zzc2, new zzy(this, listenableFuture, zzcfiVar, zzcfbVar, zzn), this.zzf.zzb());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmJ)).booleanValue()) {
            zzhdi zzhdiVar = zzcgj.zza;
            zza2 = zzhdiVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzap.this.zzd(zzcfiVar, bundle);
                }
            });
            try {
                zzc2 = zzhcy.zzj(zza2, zzac.zza, zzhdiVar);
            } catch (NullPointerException e) {
                zzc2 = zzhcy.zzc(e);
            }
        } else {
            zzx zzV = zzV(this.zzg, zzcfiVar.zza, zzcfiVar.zzb, zzcfiVar.zzc, zzcfiVar.zzd, bundle);
            zza2 = zzhcy.zza(zzV);
            try {
                zzc2 = zzV.zza();
            } catch (NullPointerException e2) {
                zzc2 = zzhcy.zzc(e2);
            }
        }
        listenableFuture = zza2;
        zzhcy.zzr(zzc2, new zzy(this, listenableFuture, zzcfiVar, zzcfbVar, zzn), this.zzf.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziG)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzcal zzcalVar = this.zzm;
            this.zzn = zzbs.zzh(motionEvent, zzcalVar == null ? null : zzcalVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzc(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        zzQ(list, iObjectWrapper, zzcaiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        zzR(list, iObjectWrapper, zzcaiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzi(zzcal zzcalVar) {
        this.zzm = zzcalVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlh)).booleanValue()) {
            zzbix zzbixVar = zzbjg.zziE;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
                zzS();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zza zzaVar = this.zzK;
            zze zzeVar = new zze(webView, zzaVar, zzcgj.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzaVar, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlr)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzn();
            }
            if (((Boolean) zzblm.zzc.zze()).booleanValue()) {
                zzaVar.zza(webView);
                if (((Boolean) zzblm.zzd.zze()).booleanValue()) {
                    zzeVar.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        zzQ(list, iObjectWrapper, zzcaiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) {
        zzR(list, iObjectWrapper, zzcaiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlv)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbkl zzbklVar = this.zzI;
        zzbklVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((Boolean) zzblm.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzblm.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbklVar.zzb());
    }

    final /* synthetic */ ArrayList zzn(List list, IObjectWrapper iObjectWrapper) {
        zzbbd zzbbdVar = this.zzh;
        String zzj = zzbbdVar.zzb() != null ? zzbbdVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(zzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzb(uri)) {
                arrayList.add(zzY(uri, "ms", zzj));
            } else {
                String valueOf = String.valueOf(uri);
                String.valueOf(valueOf);
                String valueOf2 = String.valueOf(valueOf);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(valueOf2));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzo(final ArrayList arrayList) {
        return zzhcy.zzk(zzW("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgub() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzap.this.zzs(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ Uri zzp(Uri uri, IObjectWrapper iObjectWrapper) {
        zzfma zzfmaVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || (zzfmaVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfmaVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzbbe e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ ListenableFuture zzq(final Uri uri) {
        return zzhcy.zzk(zzW("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgub(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzap.zzP(uri, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ ListenableFuture zzr() {
        try {
            return zzV(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
        } catch (NullPointerException e) {
            return zzhcy.zzc(e);
        }
    }

    final /* synthetic */ ArrayList zzs(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzb(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzY(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzt(zzdvv[] zzdvvVarArr, String str, zzdvv zzdvvVar) {
        zzdvvVarArr[0] = zzdvvVar;
        Context context = this.zzg;
        zzcal zzcalVar = this.zzm;
        Map map = zzcalVar.zzb;
        JSONObject zze2 = zzbs.zze(context, map, map, zzcalVar.zza, null);
        JSONObject zzb2 = zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject zzc2 = zzbs.zzc(this.zzm.zza);
        JSONObject zzd2 = zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zze2);
        jSONObject.put("ad_view_signal", zzb2);
        jSONObject.put("scroll_view_signal", zzc2);
        jSONObject.put("lock_screen_signal", zzd2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdvvVar.zzc(str, jSONObject);
    }

    final /* synthetic */ void zzu(zzdvv[] zzdvvVarArr) {
        zzdvv zzdvvVar = zzdvvVarArr[0];
        if (zzdvvVar != null) {
            this.zzj.zzc(zzhcy.zza(zzdvvVar));
        }
    }

    final /* synthetic */ void zzv(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzc((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    final /* synthetic */ Context zzy() {
        return this.zzg;
    }

    final /* synthetic */ zzeao zzz() {
        return this.zzp;
    }
}
