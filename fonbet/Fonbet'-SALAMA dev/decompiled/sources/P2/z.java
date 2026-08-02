package P2;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzhep;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class z implements zzheg {

    /* renamed from: a, reason: collision with root package name */
    public final zzcgi f5579a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhep f5580b;

    /* renamed from: c, reason: collision with root package name */
    public final zzhep f5581c;

    /* renamed from: d, reason: collision with root package name */
    public final zzhep f5582d;

    /* renamed from: e, reason: collision with root package name */
    public final zzhep f5583e;

    public z(zzcgi zzcgiVar, zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4) {
        this.f5579a = zzcgiVar;
        this.f5580b = zzhepVar;
        this.f5581c = zzhepVar2;
        this.f5582d = zzhepVar3;
        this.f5583e = zzhepVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new o(this.f5579a.zza(), ((Long) this.f5580b.zzb()).longValue(), (PackageInfo) this.f5581c.zzb(), (A) this.f5582d.zzb(), (ScheduledExecutorService) this.f5583e.zzb());
    }
}
