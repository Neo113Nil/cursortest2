package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t3.l;

/* loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new l(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11520a;

    public zzu(boolean z4) {
        this.f11520a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzu) && this.f11520a == ((zzu) obj).f11520a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11520a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11520a ? 1 : 0);
        D.z0(x02, parcel);
    }
}
