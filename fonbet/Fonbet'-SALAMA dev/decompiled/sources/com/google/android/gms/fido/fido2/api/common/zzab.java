package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C1338c(6);

    /* renamed from: a, reason: collision with root package name */
    public final long f11505a;

    public zzab(long j) {
        this.f11505a = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f11505a == ((zzab) obj).f11505a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11505a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 8);
        parcel.writeLong(this.f11505a);
        D.z0(x02, parcel);
    }
}
