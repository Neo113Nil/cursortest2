package F2;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtn;

/* JADX INFO: renamed from: F2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0245o extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f2702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0247p f2705e;

    public C0245o(C0247p c0247p, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f2702b = nativeAdView;
        this.f2703c = frameLayout;
        this.f2704d = context;
        this.f2705e = c0247p;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2704d, "native_ad_view_delegate");
        return new d1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.G(new p105o3.b(this.f2702b), new p105o3.b(this.f2703c));
    }

    @Override // F2.r
    public final Object c() {
        Context context = this.f2704d;
        zzbby.zza(context);
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkH)).booleanValue();
        FrameLayout frameLayout = this.f2703c;
        NativeAdView nativeAdView = this.f2702b;
        C0247p c0247p = this.f2705e;
        if (!zBooleanValue) {
            return ((zzbhf) c0247p.f2709d).zza(context, nativeAdView, frameLayout);
        }
        try {
            try {
                return zzbfm.zzdy(zzbfp.zzb(Q0.a.l0(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl")).zze(new p105o3.b(context), new p105o3.b(nativeAdView), new p105o3.b(frameLayout), 250930000));
            } catch (Exception e7) {
                throw new J2.l(e7);
            }
        } catch (J2.l e8) {
            e = e8;
            zzbtn zzbtnVarZza = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza;
            zzbtnVarZza.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (RemoteException e9) {
            e = e9;
            zzbtn zzbtnVarZza2 = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza2;
            zzbtnVarZza2.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            zzbtn zzbtnVarZza3 = zzbtl.zza(context);
            c0247p.f2711f = zzbtnVarZza3;
            zzbtnVarZza3.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
