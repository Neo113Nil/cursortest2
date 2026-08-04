package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtg> CREATOR = new zzbth();
    public final View zza;
    public final Map zzb;

    public zzbtg(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) p105o3.b.t0(p105o3.b.Z(iBinder));
        this.zzb = (Map) p105o3.b.t0(p105o3.b.Z(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        View view = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.n0(parcel, 1, new p105o3.b(view).asBinder());
        D.n0(parcel, 2, new p105o3.b(this.zzb).asBinder());
        D.z0(iX0, parcel);
    }
}
