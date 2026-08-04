package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.J;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzdyg extends zzbub {
    private final Context zza;
    private final zzgbn zzb;
    private final zzdyo zzc;
    private final zzcka zzd;
    private final ArrayDeque zze;
    private final zzfgb zzf;
    private final zzbuw zzg;

    public zzdyg(Context context, zzgbn zzgbnVar, zzbuw zzbuwVar, zzcka zzckaVar, zzdyo zzdyoVar, ArrayDeque arrayDeque, zzdyl zzdylVar, zzfgb zzfgbVar) {
        zzbby.zza(context);
        this.zza = context;
        this.zzb = zzgbnVar;
        this.zzg = zzbuwVar;
        this.zzc = zzdyoVar;
        this.zzd = zzckaVar;
        this.zze = arrayDeque;
        this.zzf = zzfgbVar;
    }

    public static /* synthetic */ InputStream zzk(zzdyg zzdygVar, I3.b bVar, I3.b bVar2, zzbuo zzbuoVar, zzffn zzffnVar) {
        String strZze = ((zzbuq) bVar.get()).zze();
        zzdygVar.zzo(new zzdyd((zzbuq) bVar.get(), (JSONObject) bVar2.get(), zzbuoVar.zzh, strZze, zzffnVar));
        return new ByteArrayInputStream(strZze.getBytes(StandardCharsets.UTF_8));
    }

    private final synchronized zzdyd zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdyd zzdydVar = (zzdyd) it.next();
            if (zzdydVar.zzc.equals(str)) {
                it.remove();
                return zzdydVar;
            }
        }
        return null;
    }

    private static I3.b zzm(I3.b bVar, zzffe zzffeVar, zzbnq zzbnqVar, zzffy zzffyVar, zzffn zzffnVar) {
        zzbng zzbngVarZza = zzbnqVar.zza("AFMA_getAdDictionary", zzbnn.zza, new zzbni() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // com.google.android.gms.internal.ads.zzbni
            public final Object zza(JSONObject jSONObject) {
                return new zzbuq(jSONObject);
            }
        });
        zzffx.zzd(bVar, zzffnVar);
        zzfek zzfekVarZza = zzffeVar.zzb(zzfey.BUILD_URL, bVar).zzf(zzbngVarZza).zza();
        zzffx.zzc(zzfekVarZza, zzffyVar, zzffnVar);
        return zzfekVarZza;
    }

    private static I3.b zzn(final zzbuo zzbuoVar, zzffe zzffeVar, final zzetk zzetkVar) {
        zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzetkVar.zzb().zza(C0252s.f2717f.f2718a.j((Bundle) obj), zzbuoVar.zzm, false);
            }
        };
        return zzffeVar.zzb(zzfey.GMS_SIGNALS, zzgbc.zzh(zzbuoVar.zza)).zzf(zzgajVar).zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                J.k("Ad request signals:");
                J.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(zzdyd zzdydVar) {
        zzp();
        this.zze.addLast(zzdydVar);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbef.zzb.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(I3.b bVar, zzbug zzbugVar, zzbuo zzbuoVar) {
        zzgbc.zzr(zzgbc.zzn(bVar, new zzgaj(this) { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfca
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    c.e(inputStream2, autoCloseOutputStream, false);
                                    autoCloseOutputStream.close();
                                    inputStream2.close();
                                } catch (Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzgbc.zzh(parcelFileDescriptor);
            }
        }, zzbza.zza), new zzdyc(this, zzbuoVar, zzbugVar), zzbza.zzg);
    }

    public final I3.b zzb(final zzbuo zzbuoVar, int i7) {
        if (!((Boolean) zzbef.zza.zze()).booleanValue()) {
            return zzgbc.zzg(new Exception("Split request is disabled."));
        }
        zzfcu zzfcuVar = zzbuoVar.zzi;
        if (zzfcuVar == null) {
            return zzgbc.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfcuVar.zzc == 0 || zzfcuVar.zzd == 0) {
            return zzgbc.zzg(new Exception("Caching is disabled."));
        }
        zzbnq zzbnqVarZzb = o.f1952C.f1970q.zzb(this.zza, VersionInfoParcel.j(), this.zzf);
        zzetk zzetkVarZzq = this.zzd.zzq(zzbuoVar, i7);
        zzffe zzffeVarZze = zzetkVarZzq.zze();
        final I3.b bVarZzn = zzn(zzbuoVar, zzffeVarZze, zzetkVarZzq);
        zzffy zzffyVarZzf = zzetkVarZzq.zzf();
        final zzffn zzffnVarZza = zzffm.zza(this.zza, 9);
        final I3.b bVarZzm = zzm(bVarZzn, zzffeVarZze, zzbnqVarZzb, zzffyVarZzf, zzffnVarZza);
        return zzffeVarZze.zza(zzfey.GET_URL_AND_CACHE_KEY, bVarZzn, bVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdyg.zzk(this.zza, bVarZzm, bVarZzn, zzbuoVar, zzffnVarZza);
            }
        }).zza();
    }

    public final I3.b zzc(final zzbuo zzbuoVar, int i7) {
        zzdyd zzdydVarZzl;
        zzfek zzfekVarZza;
        zzbnq zzbnqVarZzb = o.f1952C.f1970q.zzb(this.zza, VersionInfoParcel.j(), this.zzf);
        zzetk zzetkVarZzq = this.zzd.zzq(zzbuoVar, i7);
        zzbng zzbngVarZza = zzbnqVarZzb.zza("google.afma.response.normalize", zzdyf.zza, zzbnn.zzb);
        if (((Boolean) zzbef.zza.zze()).booleanValue()) {
            zzdydVarZzl = zzl(zzbuoVar.zzh);
            if (zzdydVarZzl == null) {
                J.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbuoVar.zzj;
            zzdydVarZzl = null;
            if (str != null && !str.isEmpty()) {
                J.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzffn zzffnVarZza = zzdydVarZzl == null ? zzffm.zza(this.zza, 9) : zzdydVarZzl.zzd;
        zzffy zzffyVarZzf = zzetkVarZzq.zzf();
        zzffyVarZzf.zzd(zzbuoVar.zza.getStringArrayList("ad_types"));
        zzdyn zzdynVar = new zzdyn(zzbuoVar.zzg, zzffyVarZzf, zzffnVarZza);
        zzdyk zzdykVar = new zzdyk(this.zza, zzbuoVar.zzb.f10834a, this.zzg, i7);
        zzffe zzffeVarZze = zzetkVarZzq.zze();
        zzffn zzffnVarZza2 = zzffm.zza(this.zza, 11);
        if (zzdydVarZzl == null) {
            final I3.b bVarZzn = zzn(zzbuoVar, zzffeVarZze, zzetkVarZzq);
            final I3.b bVarZzm = zzm(bVarZzn, zzffeVarZze, zzbnqVarZzb, zzffyVarZzf, zzffnVarZza);
            zzffn zzffnVarZza3 = zzffm.zza(this.zza, 10);
            final zzfek zzfekVarZza2 = zzffeVarZze.zza(zzfey.HTTP, bVarZzm, bVarZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbuo zzbuoVar2;
                    Bundle bundle;
                    zzbuq zzbuqVar = (zzbuq) bVarZzm.get();
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = (zzbuoVar2 = zzbuoVar).zzm) != null) {
                        bundle.putLong(zzdpy.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbuqVar.zzc());
                        zzbuoVar2.zzm.putLong(zzdpy.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbuqVar.zzb());
                    }
                    return new zzdym((JSONObject) bVarZzn.get(), zzbuqVar);
                }
            }).zze(zzdynVar).zze(new zzfft(zzffnVarZza3)).zze(zzdykVar).zza();
            zzffx.zza(zzfekVarZza2, zzffyVarZzf, zzffnVarZza3);
            zzffx.zzd(zzfekVarZza2, zzffnVarZza2);
            zzfekVarZza = zzffeVarZze.zza(zzfey.PRE_PROCESS, bVarZzn, bVarZzm, zzfekVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = zzbuoVar.zzm) != null) {
                        p150v0.a.n(o.f1952C.j, bundle, zzdpy.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzdyf((zzdyj) zzfekVarZza2.get(), (JSONObject) bVarZzn.get(), (zzbuq) bVarZzm.get());
                }
            }).zzf(zzbngVarZza).zza();
        } else {
            zzdym zzdymVar = new zzdym(zzdydVarZzl.zzb, zzdydVarZzl.zza);
            zzffn zzffnVarZza4 = zzffm.zza(this.zza, 10);
            final zzfek zzfekVarZza3 = zzffeVarZze.zzb(zzfey.HTTP, zzgbc.zzh(zzdymVar)).zze(zzdynVar).zze(new zzfft(zzffnVarZza4)).zze(zzdykVar).zza();
            zzffx.zza(zzfekVarZza3, zzffyVarZzf, zzffnVarZza4);
            final I3.b bVarZzh = zzgbc.zzh(zzdydVarZzl);
            zzffx.zzd(zzfekVarZza3, zzffnVarZza2);
            zzfekVarZza = zzffeVarZze.zza(zzfey.PRE_PROCESS, zzfekVarZza3, bVarZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdyj zzdyjVar = (zzdyj) zzfekVarZza3.get();
                    I3.b bVar = bVarZzh;
                    return new zzdyf(zzdyjVar, ((zzdyd) bVar.get()).zzb, ((zzdyd) bVar.get()).zza);
                }
            }).zzf(zzbngVarZza).zza();
        }
        zzffx.zza(zzfekVarZza, zzffyVarZzf, zzffnVarZza2);
        return zzfekVarZza;
    }

    public final I3.b zzd(final zzbuo zzbuoVar, int i7) {
        zzbnq zzbnqVarZzb = o.f1952C.f1970q.zzb(this.zza, VersionInfoParcel.j(), this.zzf);
        if (!((Boolean) zzbek.zza.zze()).booleanValue()) {
            return zzgbc.zzg(new Exception("Signal collection disabled."));
        }
        zzetk zzetkVarZzq = this.zzd.zzq(zzbuoVar, i7);
        final zzesk zzeskVarZza = zzetkVarZzq.zza();
        zzbng zzbngVarZza = zzbnqVarZzb.zza("google.afma.request.getSignals", zzbnn.zza, zzbnn.zzb);
        zzffn zzffnVarZza = zzffm.zza(this.zza, 22);
        zzfek zzfekVarZza = zzetkVarZzq.zze().zzb(zzfey.GET_SIGNALS, zzgbc.zzh(zzbuoVar.zza)).zze(new zzfft(zzffnVarZza)).zzf(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) throws JSONException {
                return zzeskVarZza.zza(C0252s.f2717f.f2718a.j((Bundle) obj), zzbuoVar.zzm, false);
            }
        }).zzb(zzfey.JS_SIGNALS).zzf(zzbngVarZza).zza();
        zzffy zzffyVarZzf = zzetkVarZzq.zzf();
        zzffyVarZzf.zzd(zzbuoVar.zza.getStringArrayList("ad_types"));
        zzffyVarZzf.zzf(zzbuoVar.zza.getBundle("extras"));
        zzffx.zzb(zzfekVarZza, zzffyVarZzf, zzffnVarZza);
        if (((Boolean) zzbdy.zzf.zze()).booleanValue()) {
            zzdyo zzdyoVar = this.zzc;
            Objects.requireNonNull(zzdyoVar);
            zzfekVarZza.addListener(new zzdxw(zzdyoVar), this.zzb);
        }
        return zzfekVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zze(zzbuo zzbuoVar, zzbug zzbugVar) {
        zzq(zzb(zzbuoVar, Binder.getCallingUid()), zzbugVar, zzbuoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzf(zzbuo zzbuoVar, zzbug zzbugVar) {
        Bundle bundle;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = zzbuoVar.zzm) != null) {
            p150v0.a.n(o.f1952C.j, bundle, zzdpy.SERVICE_CONNECTED.zza());
        }
        zzq(zzd(zzbuoVar, Binder.getCallingUid()), zzbugVar, zzbuoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzg(zzbuo zzbuoVar, zzbug zzbugVar) {
        Bundle bundle;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = zzbuoVar.zzm) != null) {
            p150v0.a.n(o.f1952C.j, bundle, zzdpy.SERVICE_CONNECTED.zza());
        }
        I3.b bVarZzc = zzc(zzbuoVar, Binder.getCallingUid());
        zzq(bVarZzc, zzbugVar, zzbuoVar);
        if (((Boolean) zzbdy.zze.zze()).booleanValue()) {
            zzdyo zzdyoVar = this.zzc;
            Objects.requireNonNull(zzdyoVar);
            bVarZzc.addListener(new zzdxw(zzdyoVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzh(String str, zzbug zzbugVar) {
        zzq(zzj(str), zzbugVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzi(zzbty zzbtyVar, zzbuh zzbuhVar) {
        if (((Boolean) zzbem.zza.zze()).booleanValue()) {
            this.zzd.zzD();
            String str = zzbtyVar.zza;
            zzgbc.zzr(zzgbc.zzh(null), new zzdya(this, zzbuhVar, zzbtyVar), zzbza.zzg);
        } else {
            try {
                zzbuhVar.zzf("", zzbtyVar);
            } catch (RemoteException e7) {
                J.l("Service can't call client", e7);
            }
        }
    }

    public final I3.b zzj(String str) {
        if (((Boolean) zzbef.zza.zze()).booleanValue()) {
            return zzl(str) == null ? zzgbc.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgbc.zzh(new zzdyb(this));
        }
        return zzgbc.zzg(new Exception("Split request is disabled."));
    }
}
