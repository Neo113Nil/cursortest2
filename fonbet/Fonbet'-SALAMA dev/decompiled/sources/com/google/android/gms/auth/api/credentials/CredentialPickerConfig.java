package com.google.android.gms.auth.api.credentials;

import V2.a;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;

@Deprecated
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new a(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f10918a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10919b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10921d;

    public CredentialPickerConfig(int i7, boolean z4, boolean z7, boolean z8, int i8) {
        this.f10918a = i7;
        this.f10919b = z4;
        this.f10920c = z7;
        if (i7 < 2) {
            this.f10921d = true == z8 ? 3 : 1;
        } else {
            this.f10921d = i8;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10919b ? 1 : 0);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10920c ? 1 : 0);
        int i8 = this.f10921d;
        int i9 = i8 != 3 ? 0 : 1;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i9);
        D.B0(parcel, 4, 4);
        parcel.writeInt(i8);
        D.B0(parcel, zzbbd.zzq.zzf, 4);
        parcel.writeInt(this.f10918a);
        D.z0(x02, parcel);
    }
}
