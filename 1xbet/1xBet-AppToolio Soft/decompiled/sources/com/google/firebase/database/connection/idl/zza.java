package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "CompoundHashParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    @SafeParcelable.Field(id = 2)
    private final List<String> zzbz;

    @SafeParcelable.Field(id = 3)
    private final List<String> zzca;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2) {
        this.zzbz = list;
        this.zzca = list2;
    }

    public static com.google.android.gms.internal.firebase_database.zzy zza(zza zzaVar) {
        ArrayList arrayList = new ArrayList(zzaVar.zzbz.size());
        Iterator<String> it = zzaVar.zzbz.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.gms.internal.firebase_database.zzag.zzg(it.next()));
        }
        return new com.google.android.gms.internal.firebase_database.zzy(arrayList, zzaVar.zzca);
    }

    public static zza zza(com.google.android.gms.internal.firebase_database.zzy zzyVar) {
        List<List<String>> zzo = zzyVar.zzo();
        ArrayList arrayList = new ArrayList(zzo.size());
        Iterator<List<String>> it = zzo.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.android.gms.internal.firebase_database.zzag.zzb(it.next()));
        }
        return new zza(arrayList, zzyVar.zzp());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzbz, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzca, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
