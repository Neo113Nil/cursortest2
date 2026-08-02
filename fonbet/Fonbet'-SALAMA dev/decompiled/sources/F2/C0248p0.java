package F2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;

/* renamed from: F2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248p0 extends zzaxn implements InterfaceC0250q0 {
    @Override // F2.InterfaceC0250q0
    public final String zze() {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // F2.InterfaceC0250q0
    public final String zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }
}
