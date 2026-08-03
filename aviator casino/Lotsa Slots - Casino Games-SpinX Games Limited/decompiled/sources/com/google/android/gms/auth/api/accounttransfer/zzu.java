package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public final class zzu extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzu> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzv();
    private static final java.util.HashMap zzc;
    final java.util.Set zza;
    final int zzb;
    private com.google.android.gms.auth.api.accounttransfer.zzw zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        zzc = hashMap;
        hashMap.put("authenticatorInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, com.google.android.gms.auth.api.accounttransfer.zzw.class));
        hashMap.put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, com.google.android.gms.common.server.response.FastJsonResponse.Field.forString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, 3));
        hashMap.put("package", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("package", 4));
    }

    public zzu() {
        this.zza = new java.util.HashSet(3);
        this.zzb = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.zzd = (com.google.android.gms.auth.api.accounttransfer.zzw) fastJsonResponse;
        this.zza.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ java.util.Map getFieldMappings() {
        return zzc;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return java.lang.Integer.valueOf(this.zzb);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzd;
        }
        if (safeParcelableFieldId == 3) {
            return this.zze;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzf;
        }
        throw new java.lang.IllegalStateException("Unknown SafeParcelable id=" + field.getSafeParcelableFieldId());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zza.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.lang.String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zze = str2;
        } else {
            if (safeParcelableFieldId != 4) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(safeParcelableFieldId)));
            }
            this.zzf = str2;
        }
        this.zza.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set set = this.zza;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzd, i, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zze, true);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzf, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzg, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzu(java.util.Set set, int i, com.google.android.gms.auth.api.accounttransfer.zzw zzwVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = set;
        this.zzb = i;
        this.zzd = zzwVar;
        this.zze = str;
        this.zzf = str2;
        this.zzg = str3;
    }
}
