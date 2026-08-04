package R2;

import F2.C0254t;
import F2.W0;
import H2.q;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbtf;
import p167y2.EnumC1058b;
import p167y2.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0 f6014a;

    public a(W0 w7) {
        this.f6014a = w7;
    }

    public static void a(Context context, i iVar, b bVar) {
        EnumC1058b enumC1058b = EnumC1058b.BANNER;
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzj.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new q(context, iVar, bVar, 5));
                return;
            }
        }
        new zzbtf(context, enumC1058b, iVar.f18160a, null).zzb(bVar);
    }
}
