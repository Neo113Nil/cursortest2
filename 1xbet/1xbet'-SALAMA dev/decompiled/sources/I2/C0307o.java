package I2;

import F2.C0252s;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqc;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzfom;
import com.google.android.gms.internal.ads.zzfon;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: I2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0307o extends zzapq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3638a;

    public C0307o(Context context, zzaqc zzaqcVar) {
        super(zzaqcVar);
        this.f3638a = context;
    }

    public static zzape a(Context context) {
        zzape zzapeVar = new zzape(new zzapx(new File(zzfon.zza(zzfom.zza(), context.getCacheDir(), "admob_volley")), 20971520), new C0307o(context, new zzaqc(null, null)), 4);
        zzapeVar.zzd();
        return zzapeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapq, com.google.android.gms.internal.ads.zzaou
    public final zzaox zza(zzapb zzapbVar) throws zzapk {
        if (zzapbVar.zza() == 0) {
            if (Pattern.matches((String) C0254t.f2723d.f2726c.zzb(zzbby.zzeC), zzapbVar.zzk())) {
                J2.d dVar = C0252s.f2717f.f2718a;
                com.google.android.gms.common.d dVar2 = com.google.android.gms.common.d.f11217b;
                Context context = this.f3638a;
                if (dVar2.d(context, 13400000) == 0) {
                    zzaox zzaoxVarZza = new zzbkw(context).zza(zzapbVar);
                    if (zzaoxVarZza != null) {
                        J.k("Got gmscore asset response: ".concat(String.valueOf(zzapbVar.zzk())));
                        return zzaoxVarZza;
                    }
                    J.k("Failed to get gmscore asset response: ".concat(String.valueOf(zzapbVar.zzk())));
                }
            }
        }
        return super.zza(zzapbVar);
    }
}
