package P2;

import com.google.android.gms.internal.ads.zzdch;
import com.google.android.gms.internal.ads.zzddb;
import com.google.android.gms.internal.ads.zzfdy;
import com.google.android.gms.internal.ads.zzgbn;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzhep;

/* loaded from: classes.dex */
public final class r implements zzheg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5546a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhep f5547b;

    /* renamed from: c, reason: collision with root package name */
    public final zzhep f5548c;

    /* renamed from: d, reason: collision with root package name */
    public final zzhep f5549d;

    public /* synthetic */ r(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, int i7) {
        this.f5546a = i7;
        this.f5547b = zzhepVar;
        this.f5548c = zzhepVar2;
        this.f5549d = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f5546a) {
            case 0:
                zzddb zzddbVar = (M) this.f5547b.zzb();
                zzddb zzddbVar2 = (w) this.f5548c.zzb();
                zzgbn zzc = zzfdy.zzc();
                if (((Integer) this.f5549d.zzb()).intValue() == 2) {
                    zzddbVar = zzddbVar2;
                }
                return new zzdch(zzddbVar, zzc);
            default:
                return new w((o) this.f5547b.zzb(), ((Integer) this.f5548c.zzb()).intValue(), (String) this.f5549d.zzb());
        }
    }
}
