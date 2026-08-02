package R2;

import F2.C0254t;
import F2.W0;
import H2.q;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbtf;
import y2.EnumC1798b;
import y2.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final W0 f6014a;

    public a(W0 w02) {
        this.f6014a = w02;
    }

    public static void a(Context context, i iVar, b bVar) {
        EnumC1798b enumC1798b = EnumC1798b.BANNER;
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzj.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new q(context, iVar, bVar, 5));
                return;
            }
        }
        new zzbtf(context, enumC1798b, iVar.f18154a, null).zzb(bVar);
    }
}
