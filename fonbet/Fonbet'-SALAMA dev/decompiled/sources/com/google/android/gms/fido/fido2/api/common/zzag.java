package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C1338c(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f11507a;

    public zzag(String str) {
        D.i(str);
        this.f11507a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f11507a.equals(((zzag) obj).f11507a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11507a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11507a, false);
        Y4.D.z0(x02, parcel);
    }
}
