package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class XF implements Parcelable {
    public static final Parcelable.Creator<XF> CREATOR = new C0730Zb(20);

    /* renamed from: k, reason: collision with root package name */
    public int f12191k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f12192l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12193m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12194n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f12195o;

    public XF(Parcel parcel) {
        this.f12192l = new UUID(parcel.readLong(), parcel.readLong());
        this.f12193m = parcel.readString();
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f12194n = readString;
        this.f12195o = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof XF)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        XF xf = (XF) obj;
        return Objects.equals(this.f12193m, xf.f12193m) && Objects.equals(this.f12194n, xf.f12194n) && Objects.equals(this.f12192l, xf.f12192l) && Arrays.equals(this.f12195o, xf.f12195o);
    }

    public final int hashCode() {
        int i = this.f12191k;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f12192l.hashCode() * 31;
        String str = this.f12193m;
        int hashCode2 = Arrays.hashCode(this.f12195o) + L1.a.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12194n);
        this.f12191k = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f12192l;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f12193m);
        parcel.writeString(this.f12194n);
        parcel.writeByteArray(this.f12195o);
    }

    public XF(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f12192l = uuid;
        this.f12193m = null;
        this.f12194n = AbstractC1593t6.e(str);
        this.f12195o = bArr;
    }
}
