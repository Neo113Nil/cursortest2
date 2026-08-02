package F2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;

/* renamed from: F2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0249q extends zzaxo implements InterfaceC0260w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0217a f2713a;

    public BinderC0249q(InterfaceC0217a interfaceC0217a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f2713a = interfaceC0217a;
    }

    @Override // F2.InterfaceC0260w
    public final void zzb() {
        this.f2713a.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
