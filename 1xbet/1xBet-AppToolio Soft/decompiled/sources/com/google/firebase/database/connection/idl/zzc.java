package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.firebase_database.zzib;
import java.io.File;
import java.util.List;

@SafeParcelable.Class(creator = "ConnectionConfigCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zze();

    @SafeParcelable.Field(id = 5)
    final boolean zzcp;

    @SafeParcelable.Field(id = 7)
    final String zzcr;

    @SafeParcelable.Field(id = 8)
    final String zzcs;

    @SafeParcelable.Field(id = 2)
    final zzi zzfk;

    @SafeParcelable.Field(id = 3)
    final int zzfl;

    @SafeParcelable.Field(id = 4)
    final List<String> zzfm;

    @SafeParcelable.Field(id = 6)
    final String zzfn;

    public zzc(com.google.android.gms.internal.firebase_database.zzah zzahVar, zzib zzibVar, List<String> list, boolean z, String str, String str2, File file) {
        int i;
        switch (zzibVar) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.zzfk = new zzi(zzahVar.getHost(), zzahVar.getNamespace(), zzahVar.isSecure());
        this.zzfl = i;
        this.zzfm = null;
        this.zzcp = z;
        this.zzfn = str;
        this.zzcr = str2;
        this.zzcs = file.getAbsolutePath();
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 2) zzi zziVar, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) List<String> list, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) String str3) {
        this.zzfk = zziVar;
        this.zzfl = i;
        this.zzfm = list;
        this.zzcp = z;
        this.zzfn = str;
        this.zzcr = str2;
        this.zzcs = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzfk, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzfl);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzfm, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcp);
        SafeParcelWriter.writeString(parcel, 6, this.zzfn, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzcr, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzcs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
