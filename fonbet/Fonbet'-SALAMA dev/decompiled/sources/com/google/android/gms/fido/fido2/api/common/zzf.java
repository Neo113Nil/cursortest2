package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C1338c(29);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11511a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11512b;

    public zzf(byte[] bArr, byte[] bArr2) {
        this.f11511a = bArr;
        this.f11512b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Arrays.equals(this.f11511a, zzfVar.f11511a) && Arrays.equals(this.f11512b, zzfVar.f11512b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11511a, this.f11512b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.l0(parcel, 1, this.f11511a, false);
        D.l0(parcel, 2, this.f11512b, false);
        D.z0(x02, parcel);
    }
}
