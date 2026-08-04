package H2;

import B4.V;
import F2.C0254t;
import F2.InterfaceC0217a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzdcp;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zzbsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdOverlayInfoParcel f3233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f3234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3235c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3236d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3237e = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f3233a = adOverlayInfoParcel;
        this.f3234b = activity;
    }

    public final synchronized void Z() {
        try {
            if (this.f3236d) {
                return;
            }
            m mVar = this.f3233a.f10817c;
            if (mVar != null) {
                mVar.zzds(4);
            }
            this.f3236d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final boolean zzH() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzl(Bundle bundle) {
        m mVar;
        boolean zBooleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziS)).booleanValue();
        Activity activity = this.f3234b;
        if (zBooleanValue && !this.f3237e) {
            activity.requestWindowFeature(1);
        }
        boolean z4 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z4 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f3233a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z4) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC0217a interfaceC0217a = adOverlayInfoParcel.f10816b;
            if (interfaceC0217a != null) {
                interfaceC0217a.onAdClicked();
            }
            zzdcp zzdcpVar = adOverlayInfoParcel.f10811L;
            if (zzdcpVar != null) {
                zzdcpVar.zzdd();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (mVar = adOverlayInfoParcel.f10817c) != null) {
                mVar.zzdp();
            }
        }
        V v6 = E2.o.f1952C.f1955a;
        zzc zzcVar = adOverlayInfoParcel.f10815a;
        if (V.v(this.f3234b, zzcVar, adOverlayInfoParcel.f10823z, zzcVar.f10833z, null, "")) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzm() {
        if (this.f3234b.isFinishing()) {
            Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzo() {
        m mVar = this.f3233a.f10817c;
        if (mVar != null) {
            mVar.zzdi();
        }
        if (this.f3234b.isFinishing()) {
            Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzr() {
        if (this.f3235c) {
            this.f3234b.finish();
            return;
        }
        this.f3235c = true;
        m mVar = this.f3233a.f10817c;
        if (mVar != null) {
            mVar.zzdE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f3235c);
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzu() {
        if (this.f3234b.isFinishing()) {
            Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzv() {
        m mVar = this.f3233a.f10817c;
        if (mVar != null) {
            mVar.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzx() {
        this.f3237e = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzk(p105o3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzh(int i7, int i8, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zzp(int i7, String[] strArr, int[] iArr) {
    }
}
