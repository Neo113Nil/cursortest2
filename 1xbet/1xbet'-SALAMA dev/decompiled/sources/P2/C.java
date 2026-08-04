package P2;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzens;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzhep;

/* JADX INFO: loaded from: classes.dex */
public final class C implements zzheg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcgi f5411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzhep f5412c;

    public /* synthetic */ C(zzcgi zzcgiVar, zzhep zzhepVar, int i7) {
        this.f5410a = i7;
        this.f5411b = zzcgiVar;
        this.f5412c = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f5410a) {
            case 0:
                Context contextZza = this.f5411b.zza();
                zzcjl.zza();
                return new B(contextZza, zzens.zzc(), ((zzcgw) this.f5412c).zza());
            default:
                return new G(this.f5411b.zza(), (zzdqv) this.f5412c.zzb(), zzfdy.zzc());
        }
    }
}
