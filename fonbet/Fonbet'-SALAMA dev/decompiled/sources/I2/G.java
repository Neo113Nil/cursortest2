package I2;

import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzheg;

/* loaded from: classes.dex */
public final class G implements zzheg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3535a;

    /* renamed from: b, reason: collision with root package name */
    public final zzcgi f3536b;

    public /* synthetic */ G(zzcgi zzcgiVar, int i7) {
        this.f3535a = i7;
        this.f3536b = zzcgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f3535a) {
            case 0:
                return new F(this.f3536b.zza());
            default:
                return new P2.A(this.f3536b.zza());
        }
    }
}
