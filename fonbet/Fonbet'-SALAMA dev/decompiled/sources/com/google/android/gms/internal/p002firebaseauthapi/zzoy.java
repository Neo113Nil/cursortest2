package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzoy<P> {
    private final Class<P> zza;
    private Map<zzzc, List<zzpb<P>>> zzb;
    private final List<zzpb<P>> zzc;
    private zzpb<P> zzd;
    private zzng zze;

    private final zzoy<P> zza(P p5, zzbp zzbpVar, zzwa.zzb zzbVar, boolean z4) {
        zzzc zzzcVar;
        zzzc zzzcVar2;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (p5 == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (zzbVar.zzc() != zzvv.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzpb<P> zzpbVar = new zzpb<>(p5, zzzc.zza(zzbj.zza(zzbVar)), zzbVar.zzc(), zzbVar.zzf(), zzbVar.zza(), zzbVar.zzb().zzf(), zzbpVar);
        Map<zzzc, List<zzpb<P>>> map = this.zzb;
        List<zzpb<P>> list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzpbVar);
        zzzcVar = ((zzpb) zzpbVar).zzb;
        List<zzpb<P>> put = map.put(zzzcVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzpbVar);
            zzzcVar2 = ((zzpb) zzpbVar).zzb;
            map.put(zzzcVar2, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzpbVar);
        if (z4) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzpbVar;
        }
        return this;
    }

    public final zzoy<P> zzb(P p5, zzbp zzbpVar, zzwa.zzb zzbVar) {
        return zza(p5, zzbpVar, zzbVar, true);
    }

    private zzoy(Class<P> cls) {
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzng.zza;
    }

    public final zzoy<P> zza(P p5, zzbp zzbpVar, zzwa.zzb zzbVar) {
        return zza(p5, zzbpVar, zzbVar, false);
    }

    public final zzoy<P> zza(zzng zzngVar) {
        if (this.zzb != null) {
            this.zze = zzngVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzoz<P> zza() {
        Map<zzzc, List<zzpb<P>>> map = this.zzb;
        if (map != null) {
            zzoz<P> zzozVar = new zzoz<>(map, this.zzc, this.zzd, this.zze, this.zza);
            this.zzb = null;
            return zzozVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
