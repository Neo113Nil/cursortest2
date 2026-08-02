package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t3.l;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new l(8);

    /* renamed from: a, reason: collision with root package name */
    public final long f11515a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11516b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11517c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11518d;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f11515a = j;
        D.i(bArr);
        this.f11516b = bArr;
        D.i(bArr2);
        this.f11517c = bArr2;
        D.i(bArr3);
        this.f11518d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f11515a == zzqVar.f11515a && Arrays.equals(this.f11516b, zzqVar.f11516b) && Arrays.equals(this.f11517c, zzqVar.f11517c) && Arrays.equals(this.f11518d, zzqVar.f11518d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11515a), this.f11516b, this.f11517c, this.f11518d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 8);
        parcel.writeLong(this.f11515a);
        Y4.D.l0(parcel, 2, this.f11516b, false);
        Y4.D.l0(parcel, 3, this.f11517c, false);
        Y4.D.l0(parcel, 4, this.f11518d, false);
        Y4.D.z0(x02, parcel);
    }
}
