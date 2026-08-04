package I2;

import A1.x0;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzbzf;
import java.util.Map;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends zzapb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbzf f3653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.g f3654b;

    public w(String str, zzbzf zzbzfVar) {
        super(0, str, new p096n1.e(zzbzfVar, 4));
        this.f3653a = zzbzfVar;
        J2.g gVar = new J2.g();
        this.f3654b = gVar;
        if (J2.g.c()) {
            Object obj = null;
            gVar.d("onNetworkRequest", new F0(str, "GET", obj, obj, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final zzaph zzh(zzaox zzaoxVar) {
        return zzaph.zzb(zzaoxVar, zzapy.zzb(zzaoxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzo(Object obj) {
        zzaox zzaoxVar = (zzaox) obj;
        Map map = zzaoxVar.zzc;
        int i7 = zzaoxVar.zza;
        J2.g gVar = this.f3654b;
        gVar.getClass();
        if (J2.g.c()) {
            gVar.d("onNetworkResponse", new B.v(i7, map, 1));
            if (i7 < 200 || i7 >= 300) {
                gVar.d("onNetworkRequestError", new J2.e(null));
            }
        }
        byte[] bArr = zzaoxVar.zzb;
        if (J2.g.c() && bArr != null) {
            gVar.d("onNetworkResponseBody", new x0(bArr, 5));
        }
        this.f3653a.zzc(zzaoxVar);
    }
}
