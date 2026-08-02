package F2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;

/* loaded from: classes.dex */
public final class f1 extends zzaxo implements InterfaceC0261w0 {

    /* renamed from: a, reason: collision with root package name */
    public final S2.a f2664a;

    public f1(S2.a aVar) {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        this.f2664a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }

    @Override // F2.InterfaceC0261w0
    public final void zze() {
        S2.a aVar = this.f2664a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}
