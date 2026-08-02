package com.google.android.gms.ads.internal;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new e(3);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10841a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10843c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10844d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10845e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10846f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10847x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10848y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10849z;

    public zzl(boolean z4, boolean z7, String str, boolean z8, float f7, int i7, boolean z9, boolean z10, boolean z11) {
        this.f10841a = z4;
        this.f10842b = z7;
        this.f10843c = str;
        this.f10844d = z8;
        this.f10845e = f7;
        this.f10846f = i7;
        this.f10847x = z9;
        this.f10848y = z10;
        this.f10849z = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10841a ? 1 : 0);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f10842b ? 1 : 0);
        D.s0(parcel, 4, this.f10843c, false);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10844d ? 1 : 0);
        D.B0(parcel, 6, 4);
        parcel.writeFloat(this.f10845e);
        D.B0(parcel, 7, 4);
        parcel.writeInt(this.f10846f);
        D.B0(parcel, 8, 4);
        parcel.writeInt(this.f10847x ? 1 : 0);
        D.B0(parcel, 9, 4);
        parcel.writeInt(this.f10848y ? 1 : 0);
        D.B0(parcel, 10, 4);
        parcel.writeInt(this.f10849z ? 1 : 0);
        D.z0(x02, parcel);
    }

    public zzl(boolean z4, boolean z7, boolean z8, float f7, boolean z9, boolean z10, boolean z11) {
        this(z4, z7, null, z8, f7, -1, z9, z10, z11);
    }
}
