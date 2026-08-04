package Q2;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzheg;

/* JADX INFO: loaded from: classes.dex */
public final class b implements zzheg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcgi f5795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcgw f5796b;

    public b(zzcgi zzcgiVar, zzcgw zzcgwVar) {
        this.f5795a = zzcgiVar;
        this.f5796b = zzcgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        return new a((Context) this.f5795a.zzb(), (VersionInfoParcel) this.f5796b.zzb());
    }
}
