package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p074k3.c;

/* JADX INFO: loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new c(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f11503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f11504c;

    public UvmEntry(int i7, short s7, short s8) {
        this.f11502a = i7;
        this.f11503b = s7;
        this.f11504c = s8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f11502a == uvmEntry.f11502a && this.f11503b == uvmEntry.f11503b && this.f11504c == uvmEntry.f11504c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11502a), Short.valueOf(this.f11503b), Short.valueOf(this.f11504c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11502a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11503b);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11504c);
        D.z0(iX0, parcel);
    }
}
