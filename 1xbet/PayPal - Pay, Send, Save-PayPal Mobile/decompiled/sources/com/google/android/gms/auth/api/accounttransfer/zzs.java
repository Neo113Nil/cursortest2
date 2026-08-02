package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
public final class zzs extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzs> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzt();
    private static final androidx.collection.ArrayMap zzb;
    final int zza;
    private java.util.List zzc;
    private java.util.List zzd;
    private java.util.List zze;
    private java.util.List zzf;
    private java.util.List zzg;

    static {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        zzb = arrayMap;
        arrayMap.put("registered", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("registered", 2));
        arrayMap.put("in_progress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("in_progress", 3));
        arrayMap.put("success", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("success", 4));
        arrayMap.put("failed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("failed", 5));
        arrayMap.put("escrowed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzs() {
        this.zza = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return java.lang.Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new java.lang.IllegalStateException("Unknown SafeParcelable id=" + field.getSafeParcelableFieldId());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzc = arrayList;
            return;
        }
        if (safeParcelableFieldId == 3) {
            this.zzd = arrayList;
            return;
        }
        if (safeParcelableFieldId == 4) {
            this.zze = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzf = arrayList;
        } else {
            if (safeParcelableFieldId != 6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string list.", java.lang.Integer.valueOf(safeParcelableFieldId)));
            }
            this.zzg = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 2, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 3, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzs(int i, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        this.zza = i;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.util.Map getFieldMappings() {
        return zzb;
    }
}
