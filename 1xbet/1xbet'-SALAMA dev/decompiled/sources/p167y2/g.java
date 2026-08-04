package p167y2;

import F2.C0254t;
import F2.F;
import F2.M0;
import F2.k1;
import J2.b;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import p083l4.x;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f18159b;

    public g(Context context, F f7) {
        this.f18158a = context;
        this.f18159b = f7;
    }

    public final void a(M0 m7) {
        Context context = this.f18158a;
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzc.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                b.f3804b.execute(new x(11, this, m7, false));
                return;
            }
        }
        try {
            this.f18159b.zzg(k1.a(context, m7));
        } catch (RemoteException e7) {
            j.e("Failed to load ad.", e7);
        }
    }
}
