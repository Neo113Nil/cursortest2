package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfq> CREATOR = new e(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzm f10731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10732d;

    public zzfq(String str, int i7, zzm zzmVar, int i8) {
        this.f10729a = str;
        this.f10730b = i7;
        this.f10731c = zzmVar;
        this.f10732d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfq) {
            zzfq zzfqVar = (zzfq) obj;
            if (this.f10729a.equals(zzfqVar.f10729a) && this.f10730b == zzfqVar.f10730b && this.f10731c.j(zzfqVar.f10731c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10729a, Integer.valueOf(this.f10730b), this.f10731c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f10729a, false);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10730b);
        D.r0(parcel, 3, this.f10731c, i7, false);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10732d);
        D.z0(iX0, parcel);
    }
}
