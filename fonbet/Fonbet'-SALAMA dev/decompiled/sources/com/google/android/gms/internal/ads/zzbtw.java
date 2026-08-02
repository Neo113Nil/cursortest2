package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbtw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtw> CREATOR = new zzbtx();
    public final boolean zza;
    public final List zzb;

    public zzbtw(boolean z4, List list) {
        this.zza = z4;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z4 = this.zza;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        D.u0(parcel, 3, this.zzb);
        D.z0(x02, parcel);
    }

    public zzbtw() {
        this(false, Collections.emptyList());
    }
}
