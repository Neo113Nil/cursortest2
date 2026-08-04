package F2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;

/* JADX INFO: renamed from: F2.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248p0 extends zzaxn implements InterfaceC0250q0 {
    @Override // F2.InterfaceC0250q0
    public final String zze() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // F2.InterfaceC0250q0
    public final String zzf() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }
}
