package y2;

import F2.C0254t;
import F2.F;
import F2.M0;
import F2.k1;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18152a;

    /* renamed from: b, reason: collision with root package name */
    public final F f18153b;

    public g(Context context, F f7) {
        this.f18152a = context;
        this.f18153b = f7;
    }

    public final void a(M0 m02) {
        Context context = this.f18152a;
        zzbby.zza(context);
        if (((Boolean) zzbdw.zzc.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new l4.x(11, this, m02, false));
                return;
            }
        }
        try {
            this.f18153b.zzg(k1.a(context, m02));
        } catch (RemoteException e7) {
            J2.j.e("Failed to load ad.", e7);
        }
    }
}
