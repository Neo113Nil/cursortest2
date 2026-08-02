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
import m3.c;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
        String zze = ((zzbuq) bVar.get()).zze();
        zzdygVar.zzo(new zzdyd((zzbuq) bVar.get(), (JSONObject) bVar2.get(), zzbuoVar.zzh, zze, zzffnVar));
        return new ByteArrayInputStream(zze.getBytes(StandardCharsets.UTF_8));
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
        zzbng zza = zzbnqVar.zza("AFMA_getAdDictionary", zzbnn.zza, new zzbni() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // com.google.android.gms.internal.ads.zzbni
            public final Object zza(JSONObject jSONObject) {
                return new zzbuq(jSONObject);
            }
        });
        zzffx.zzd(bVar, zzffnVar);
        zzfek zza2 = zzffeVar.zzb(zzfey.BUILD_URL, bVar).zzf(zza).zza();
        zzffx.zzc(zza2, zzffyVar, zzffnVar);
        return zza2;
    }

    private static I3.b zzn(final zzbuo zzbuoVar, zzffe zzffeVar, final zzetk zzetkVar) {
        zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxr
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzetk.this.zzb().zza(C0252s.f2717f.f2718a.j((Bundle) obj), zzbuoVar.zzm, false);
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
        int intValue = ((Long) zzbef.zzb.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(I3.b bVar, zzbug zzbugVar, zzbuo zzbuoVar) {
        zzgbc.zzr(zzgbc.zzn(bVar, new zzgaj(this) { // from class: com.google.android.gms.internal.ads.zzdxy
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
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
                                } finally {
                                }
                            } finally {
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
        zzbnq zzb = o.f1952C.f1970q.zzb(this.zza, VersionInfoParcel.j(), this.zzf);
        zzetk zzq = this.zzd.zzq(zzbuoVar, i7);
        zzffe zze = zzq.zze();
        final I3.b zzn = zzn(zzbuoVar, zze, zzq);
        zzffy zzf = zzq.zzf();
        final zzffn zza = zzffm.zza(this.zza, 9);
        final I3.b zzm = zzm(zzn, zze, zzb, zzf, zza);
        return zze.zza(zzfey.GET_URL_AND_CACHE_KEY, zzn, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdyg.zzk(zzdyg.this, zzm, zzn, zzbuoVar, zza);
            }
        }).zza();
    }

    public final I3.b zzc(final zzbuo zzbuoVar, int i7) {
        zzdyd zzl;
        zzfek zza;
        zzbnq zzb = o.f1952C.f1970q.zzb(this.zza, VersionInfoParcel.j(), this.zzf);
        zzetk zzq = this.zzd.zzq(zzbuoVar, i7);
        zzbng zza2 = zzb.zza("google.afma.response.normalize", zzdyf.zza, zzbnn.zzb);
        if (((Boolean) zzbef.zza.zze()).booleanValue()) {
            zzl = zzl(zzbuoVar.zzh);
            if (zzl == null) {
                J.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbuoVar.zzj;
            zzl = null;
            if (str != null && !str.isEmpty()) {
                J.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzffn zza3 = zzl == null ? zzffm.zza(this.zza, 9) : zzl.zzd;
        zzffy zzf = zzq.zzf();
        zzf.zzd(zzbuoVar.zza.getStringArrayList("ad_types"));
        zzdyn zzdynVar = new zzdyn(zzbuoVar.zzg, zzf, zza3);
        zzdyk zzdykVar = new zzdyk(this.zza, zzbuoVar.zzb.f10834a, this.zzg, i7);
        zzffe zze = zzq.zze();
        zzffn zza4 = zzffm.zza(this.zza, 11);
        if (zzl == null) {
            final I3.b zzn = zzn(zzbuoVar, zze, zzq);
            final I3.b zzm = zzm(zzn, zze, zzb, zzf, zza3);
            zzffn zza5 = zzffm.zza(this.zza, 10);
            final zzfek zza6 = zze.zza(zzfey.HTTP, zzm, zzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbuo zzbuoVar2;
                    Bundle bundle;
                    zzbuq zzbuqVar = (zzbuq) I3.b.this.get();
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = (zzbuoVar2 = zzbuoVar).zzm) != null) {
                        bundle.putLong(zzdpy.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbuqVar.zzc());
                        zzbuoVar2.zzm.putLong(zzdpy.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbuqVar.zzb());
                    }
                    return new zzdym((JSONObject) zzn.get(), zzbuqVar);
                }
            }).zze(zzdynVar).zze(new zzfft(zza5)).zze(zzdykVar).zza();
            zzffx.zza(zza6, zzf, zza5);
            zzffx.zzd(zza6, zza4);
            zza = zze.zza(zzfey.PRE_PROCESS, zzn, zzm, zza6).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = zzbuo.this.zzm) != null) {
                        AbstractC1663a.n(o.f1952C.j, bundle, zzdpy.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzdyf((zzdyj) zza6.get(), (JSONObject) zzn.get(), (zzbuq) zzm.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzdym zzdymVar = new zzdym(zzl.zzb, zzl.zza);
            zzffn zza7 = zzffm.zza(this.zza, 10);
            final zzfek zza8 = zze.zzb(zzfey.HTTP, zzgbc.zzh(zzdymVar)).zze(zzdynVar).zze(new zzfft(zza7)).zze(zzdykVar).zza();
            zzffx.zza(zza8, zzf, zza7);
            final I3.b zzh = zzgbc.zzh(zzl);
            zzffx.zzd(zza8, zza4);
            zza = zze.zza(zzfey.PRE_PROCESS, zza8, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdyj zzdyjVar = (zzdyj) I3.b.this.get();
                    I3.b bVar = zzh;
                    return new zzdyf(zzdyjVar, ((zzdyd) bVar.get()).zzb, ((zzdyd) bVar.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzffx.zza(zza, zzf, zza4);
        return zza;
    }

    public final I3.b zzd(final zzbuo zzbuoVar, int i7) {
        zzbnq zzb = o.f1952C.f1970q.zzb(this.zza, VersionInfoParcel.j(), this.zzf);
        if (!((Boolean) zzbek.zza.zze()).booleanValue()) {
            return zzgbc.zzg(new Exception("Signal collection disabled."));
        }
        zzetk zzq = this.zzd.zzq(zzbuoVar, i7);
        final zzesk zza = zzq.zza();
        zzbng zza2 = zzb.zza("google.afma.request.getSignals", zzbnn.zza, zzbnn.zzb);
        zzffn zza3 = zzffm.zza(this.zza, 22);
        zzfek zza4 = zzq.zze().zzb(zzfey.GET_SIGNALS, zzgbc.zzh(zzbuoVar.zza)).zze(new zzfft(zza3)).zzf(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzdxz
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzesk.this.zza(C0252s.f2717f.f2718a.j((Bundle) obj), zzbuoVar.zzm, false);
            }
        }).zzb(zzfey.JS_SIGNALS).zzf(zza2).zza();
        zzffy zzf = zzq.zzf();
        zzf.zzd(zzbuoVar.zza.getStringArrayList("ad_types"));
        zzf.zzf(zzbuoVar.zza.getBundle("extras"));
        zzffx.zzb(zza4, zzf, zza3);
        if (((Boolean) zzbdy.zzf.zze()).booleanValue()) {
            zzdyo zzdyoVar = this.zzc;
            Objects.requireNonNull(zzdyoVar);
            zza4.addListener(new zzdxw(zzdyoVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zze(zzbuo zzbuoVar, zzbug zzbugVar) {
        zzq(zzb(zzbuoVar, Binder.getCallingUid()), zzbugVar, zzbuoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzf(zzbuo zzbuoVar, zzbug zzbugVar) {
        Bundle bundle;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = zzbuoVar.zzm) != null) {
            AbstractC1663a.n(o.f1952C.j, bundle, zzdpy.SERVICE_CONNECTED.zza());
        }
        zzq(zzd(zzbuoVar, Binder.getCallingUid()), zzbugVar, zzbuoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzg(zzbuo zzbuoVar, zzbug zzbugVar) {
        Bundle bundle;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && (bundle = zzbuoVar.zzm) != null) {
            AbstractC1663a.n(o.f1952C.j, bundle, zzdpy.SERVICE_CONNECTED.zza());
        }
        I3.b zzc = zzc(zzbuoVar, Binder.getCallingUid());
        zzq(zzc, zzbugVar, zzbuoVar);
        if (((Boolean) zzbdy.zze.zze()).booleanValue()) {
            zzdyo zzdyoVar = this.zzc;
            Objects.requireNonNull(zzdyoVar);
            zzc.addListener(new zzdxw(zzdyoVar), this.zzb);
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
