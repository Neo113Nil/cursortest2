package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_database.zzba;
import java.util.List;

@SafeParcelable.Class(creator = "RangeParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();

    @SafeParcelable.Field(id = 2)
    private final List<String> zzes;

    @SafeParcelable.Field(id = 3)
    private final List<String> zzet;

    @SafeParcelable.Constructor
    public zzak(@SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2) {
        this.zzes = list;
        this.zzet = list2;
    }

    public static zzba zza(zzak zzakVar, Object obj) {
        return new zzba(zzakVar.zzes, zzakVar.zzet, obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzes, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzet, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
