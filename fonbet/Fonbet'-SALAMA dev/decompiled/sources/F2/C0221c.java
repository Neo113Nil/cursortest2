package F2;

import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtn;
import o3.BinderC1507b;

/* renamed from: F2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221c extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f2655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0247p f2656c;

    public C0221c(C0247p c0247p, AdActivity adActivity) {
        this.f2655b = adActivity;
        this.f2656c = c0247p;
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object a() {
        C0247p.b(this.f2655b, "ad_overlay");
        return null;
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.zzn(new BinderC1507b(this.f2655b));
    }

    @Override // F2.r
    public final Object c() {
        AdActivity adActivity = this.f2655b;
        zzbby.zza(adActivity);
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        C0247p c0247p = this.f2656c;
        if (!booleanValue) {
            return ((zzbsl) c0247p.f2710e).zza(adActivity);
        }
        try {
            try {
                return zzbsn.zzI(zzbsq.zzb(Q0.a.l0(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl")).zze(new BinderC1507b(adActivity)));
            } catch (Exception e7) {
                throw new J2.l(e7);
            }
        } catch (J2.l e8) {
            e = e8;
            zzbtn zza = zzbtl.zza(adActivity.getApplicationContext());
            c0247p.f2711f = zza;
            zza.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (RemoteException e9) {
            e = e9;
            zzbtn zza2 = zzbtl.zza(adActivity.getApplicationContext());
            c0247p.f2711f = zza2;
            zza2.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            zzbtn zza22 = zzbtl.zza(adActivity.getApplicationContext());
            c0247p.f2711f = zza22;
            zza22.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
