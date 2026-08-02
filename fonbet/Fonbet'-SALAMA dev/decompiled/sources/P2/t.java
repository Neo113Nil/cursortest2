package P2;

import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzdvu;
import com.google.android.gms.internal.ads.zzgaj;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbn;

/* loaded from: classes.dex */
public final class t implements zzgaj {

    /* renamed from: a, reason: collision with root package name */
    public final zzgbn f5559a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdvu f5560b;

    public t(zzgbn zzgbnVar, zzdvu zzdvuVar) {
        this.f5559a = zzgbnVar;
        this.f5560b = zzdvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final /* bridge */ /* synthetic */ I3.b zza(Object obj) {
        zzbuo zzbuoVar = (zzbuo) obj;
        return zzgbc.zzn(this.f5560b.zzc(zzbuoVar), new C0381g(zzbuoVar, 2), this.f5559a);
    }
}
