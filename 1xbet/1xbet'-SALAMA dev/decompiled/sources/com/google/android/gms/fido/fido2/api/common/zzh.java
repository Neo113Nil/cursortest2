package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new l(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11514b;

    public zzh(byte[] bArr, boolean z4) {
        this.f11513a = z4;
        this.f11514b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f11513a == zzhVar.f11513a && Arrays.equals(this.f11514b, zzhVar.f11514b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11513a), this.f11514b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11513a ? 1 : 0);
        D.l0(parcel, 2, this.f11514b, false);
        D.z0(iX0, parcel);
    }
}
