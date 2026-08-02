package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HostInfoParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    @SafeParcelable.Field(id = 2)
    private final String zzct;

    @SafeParcelable.Field(id = 3)
    private final String zzcu;

    @SafeParcelable.Field(id = 4)
    private final boolean zzcv;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z) {
        this.zzct = str;
        this.zzcu = str2;
        this.zzcv = z;
    }

    public static com.google.android.gms.internal.firebase_database.zzah zza(zzi zziVar) {
        return new com.google.android.gms.internal.firebase_database.zzah(zziVar.zzct, zziVar.zzcu, zziVar.zzcv);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzct, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcu, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzcv);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
