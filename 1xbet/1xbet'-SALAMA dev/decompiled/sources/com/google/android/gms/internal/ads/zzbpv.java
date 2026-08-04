package com.google.android.gms.internal.ads;

import B2.f;
import F2.I0;
import L2.t;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p167y2.y;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpv extends zzbpc {
    private final t zza;

    public zzbpv(t tVar) {
        this.zza = tVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final boolean zzA() {
        return this.zza.f4327n;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final boolean zzB() {
        return this.zza.f4326m;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final double zze() {
        Double d7 = this.zza.f4321g;
        if (d7 != null) {
            return d7.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzf() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzg() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final float zzh() {
        this.zza.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final Bundle zzi() {
        return this.zza.f4325l;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final I0 zzj() {
        I0 i7;
        y yVar = this.zza.j;
        if (yVar == null) {
            return null;
        }
        synchronized (yVar.f18195a) {
            i7 = yVar.f18196b;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final zzbfc zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final zzbfj zzl() {
        B2.a aVar = this.zza.f4318d;
        if (aVar != null) {
            return new zzbew(aVar.getDrawable(), aVar.getUri(), aVar.getScale(), aVar.zzb(), aVar.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final p105o3.a zzm() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final p105o3.a zzn() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final p105o3.a zzo() {
        Object obj = this.zza.f4324k;
        if (obj == null) {
            return null;
        }
        return new p105o3.b(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzp() {
        return this.zza.f4320f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzq() {
        return this.zza.f4317c;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzr() {
        return this.zza.f4319e;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzs() {
        return this.zza.f4315a;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzt() {
        return this.zza.f4323i;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final String zzu() {
        return this.zza.f4322h;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final List zzv() {
        List<B2.a> list = this.zza.f4316b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (B2.a aVar : list) {
                arrayList.add(new zzbew(aVar.getDrawable(), aVar.getUri(), aVar.getScale(), aVar.zzb(), aVar.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(p105o3.a aVar) {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx() {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(p105o3.a aVar, p105o3.a aVar2, p105o3.a aVar3) {
        View view = (View) p105o3.b.t0(aVar);
        ((com.google.ads.mediation.a) this.zza).getClass();
        if (f.f1054a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzz(p105o3.a aVar) {
        this.zza.getClass();
    }
}
