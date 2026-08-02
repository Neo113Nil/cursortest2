package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C1338c(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11506a;

    public zzad(boolean z4) {
        this.f11506a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzad) && this.f11506a == ((zzad) obj).f11506a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11506a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11506a ? 1 : 0);
        D.z0(x02, parcel);
    }
}
