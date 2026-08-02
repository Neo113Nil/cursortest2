package com.google.android.gms.internal.ads;

import A1.Q;
import F2.C0222c0;
import F2.C0254t;
import F2.Z;
import I2.P;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfba {
    public final com.google.android.gms.ads.internal.client.zzfx zza;
    public final zzblj zzb;
    public final zzejd zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzr zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbey zzi;
    public final com.google.android.gms.ads.internal.client.zzx zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final Z zzn;
    public final zzfan zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final C0222c0 zzt;

    public zzfba(zzfay zzfayVar, zzfaz zzfazVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        String str;
        C0222c0 c0222c0;
        com.google.android.gms.ads.internal.client.zzm zzmVar;
        com.google.android.gms.ads.internal.client.zzm zzmVar2;
        com.google.android.gms.ads.internal.client.zzm zzmVar3;
        com.google.android.gms.ads.internal.client.zzm zzmVar4;
        com.google.android.gms.ads.internal.client.zzm zzmVar5;
        com.google.android.gms.ads.internal.client.zzm zzmVar6;
        com.google.android.gms.ads.internal.client.zzm zzmVar7;
        com.google.android.gms.ads.internal.client.zzm zzmVar8;
        com.google.android.gms.ads.internal.client.zzm zzmVar9;
        com.google.android.gms.ads.internal.client.zzm zzmVar10;
        com.google.android.gms.ads.internal.client.zzm zzmVar11;
        com.google.android.gms.ads.internal.client.zzm zzmVar12;
        com.google.android.gms.ads.internal.client.zzm zzmVar13;
        com.google.android.gms.ads.internal.client.zzm zzmVar14;
        com.google.android.gms.ads.internal.client.zzm zzmVar15;
        com.google.android.gms.ads.internal.client.zzm zzmVar16;
        com.google.android.gms.ads.internal.client.zzm zzmVar17;
        com.google.android.gms.ads.internal.client.zzm zzmVar18;
        com.google.android.gms.ads.internal.client.zzm zzmVar19;
        com.google.android.gms.ads.internal.client.zzm zzmVar20;
        com.google.android.gms.ads.internal.client.zzm zzmVar21;
        com.google.android.gms.ads.internal.client.zzm zzmVar22;
        com.google.android.gms.ads.internal.client.zzm zzmVar23;
        com.google.android.gms.ads.internal.client.zzm zzmVar24;
        com.google.android.gms.ads.internal.client.zzm zzmVar25;
        com.google.android.gms.ads.internal.client.zzm zzmVar26;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar;
        zzbey zzbeyVar;
        com.google.android.gms.ads.internal.client.zzfx zzfxVar2;
        zzbey zzbeyVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zzbey zzbeyVar3;
        zzbey zzbeyVar4;
        com.google.android.gms.ads.internal.client.zzx zzxVar;
        int i7;
        AdManagerAdViewOptions adManagerAdViewOptions;
        PublisherAdViewOptions publisherAdViewOptions;
        Z z4;
        zzblj zzbljVar;
        zzfal zzfalVar;
        boolean z7;
        boolean z8;
        zzejd zzejdVar;
        boolean z9;
        Bundle bundle;
        boolean z10;
        zzrVar = zzfayVar.zzb;
        this.zze = zzrVar;
        str = zzfayVar.zzc;
        this.zzf = str;
        c0222c0 = zzfayVar.zzu;
        this.zzt = c0222c0;
        zzmVar = zzfayVar.zza;
        int i8 = zzmVar.f10756a;
        zzmVar2 = zzfayVar.zza;
        long j = zzmVar2.f10757b;
        zzmVar3 = zzfayVar.zza;
        Bundle bundle2 = zzmVar3.f10758c;
        zzmVar4 = zzfayVar.zza;
        int i9 = zzmVar4.f10759d;
        zzmVar5 = zzfayVar.zza;
        List list = zzmVar5.f10760e;
        zzmVar6 = zzfayVar.zza;
        boolean z11 = zzmVar6.f10761f;
        zzmVar7 = zzfayVar.zza;
        int i10 = zzmVar7.f10762x;
        zzmVar8 = zzfayVar.zza;
        boolean z12 = true;
        if (!zzmVar8.f10763y) {
            z10 = zzfayVar.zze;
            if (!z10) {
                z12 = false;
            }
        }
        zzmVar9 = zzfayVar.zza;
        String str2 = zzmVar9.f10764z;
        zzmVar10 = zzfayVar.zza;
        com.google.android.gms.ads.internal.client.zzfu zzfuVar = zzmVar10.f10739A;
        zzmVar11 = zzfayVar.zza;
        Location location = zzmVar11.f10740B;
        zzmVar12 = zzfayVar.zza;
        String str3 = zzmVar12.f10741C;
        zzmVar13 = zzfayVar.zza;
        Bundle bundle3 = zzmVar13.f10742D;
        zzmVar14 = zzfayVar.zza;
        Bundle bundle4 = zzmVar14.f10743E;
        zzmVar15 = zzfayVar.zza;
        List list2 = zzmVar15.f10744F;
        zzmVar16 = zzfayVar.zza;
        String str4 = zzmVar16.f10745G;
        zzmVar17 = zzfayVar.zza;
        String str5 = zzmVar17.f10746H;
        zzmVar18 = zzfayVar.zza;
        boolean z13 = zzmVar18.f10747I;
        zzmVar19 = zzfayVar.zza;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar19.f10748J;
        zzmVar20 = zzfayVar.zza;
        int i11 = zzmVar20.f10749K;
        zzmVar21 = zzfayVar.zza;
        String str6 = zzmVar21.f10750L;
        zzmVar22 = zzfayVar.zza;
        List list3 = zzmVar22.f10751M;
        zzmVar23 = zzfayVar.zza;
        int t7 = P.t(zzmVar23.f10752N);
        zzmVar24 = zzfayVar.zza;
        String str7 = zzmVar24.f10753O;
        zzmVar25 = zzfayVar.zza;
        int i12 = zzmVar25.f10754P;
        zzmVar26 = zzfayVar.zza;
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i8, j, bundle2, i9, list, z11, i10, z12, str2, zzfuVar, location, str3, bundle3, bundle4, list2, str4, str5, z13, zzcVar, i11, str6, list3, t7, str7, i12, zzmVar26.f10755Q);
        zzfxVar = zzfayVar.zzd;
        if (zzfxVar != null) {
            zzfxVar2 = zzfayVar.zzd;
        } else {
            zzbeyVar = zzfayVar.zzh;
            if (zzbeyVar != null) {
                zzbeyVar2 = zzfayVar.zzh;
                zzfxVar2 = zzbeyVar2.zzf;
            } else {
                zzfxVar2 = null;
            }
        }
        this.zza = zzfxVar2;
        arrayList = zzfayVar.zzf;
        this.zzg = arrayList;
        arrayList2 = zzfayVar.zzg;
        this.zzh = arrayList2;
        arrayList3 = zzfayVar.zzf;
        if (arrayList3 == null) {
            zzbeyVar4 = null;
        } else {
            zzbeyVar3 = zzfayVar.zzh;
            zzbeyVar4 = zzbeyVar3 == null ? new zzbey(new B2.b(new Q())) : zzfayVar.zzh;
        }
        this.zzi = zzbeyVar4;
        zzxVar = zzfayVar.zzi;
        this.zzj = zzxVar;
        i7 = zzfayVar.zzm;
        this.zzk = i7;
        adManagerAdViewOptions = zzfayVar.zzj;
        this.zzl = adManagerAdViewOptions;
        publisherAdViewOptions = zzfayVar.zzk;
        this.zzm = publisherAdViewOptions;
        z4 = zzfayVar.zzl;
        this.zzn = z4;
        zzbljVar = zzfayVar.zzn;
        this.zzb = zzbljVar;
        zzfalVar = zzfayVar.zzo;
        this.zzo = new zzfan(zzfalVar, null);
        z7 = zzfayVar.zzp;
        this.zzp = z7;
        z8 = zzfayVar.zzq;
        this.zzq = z8;
        zzejdVar = zzfayVar.zzr;
        this.zzc = zzejdVar;
        z9 = zzfayVar.zzs;
        this.zzr = z9;
        bundle = zzfayVar.zzt;
        this.zzs = bundle;
    }

    public final boolean zza() {
        return this.zzf.matches((String) C0254t.f2723d.f2726c.zzb(zzbby.zzds));
    }
}
