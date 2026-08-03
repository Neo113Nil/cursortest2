package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public final class zzo extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzo> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzp();
    private static final java.util.HashMap zzc;
    final java.util.Set zza;
    final int zzb;
    private java.util.ArrayList zzd;
    private int zze;
    private com.google.android.gms.auth.api.accounttransfer.zzs zzf;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        zzc = hashMap;
        hashMap.put("authenticatorData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, com.google.android.gms.auth.api.accounttransfer.zzu.class));
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, 4, com.google.android.gms.auth.api.accounttransfer.zzs.class));
    }

    public zzo() {
        this.zza = new java.util.HashSet(1);
        this.zzb = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
        }
        this.zzd = arrayList;
        this.zza.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.zzf = (com.google.android.gms.auth.api.accounttransfer.zzs) fastJsonResponse;
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
        if (safeParcelableFieldId == 4) {
            return this.zzf;
        }
        throw new java.lang.IllegalStateException("Unknown SafeParcelable id=" + field.getSafeParcelableFieldId());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zza.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set set = this.zza;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzo(java.util.Set set, int i, java.util.ArrayList arrayList, int i2, com.google.android.gms.auth.api.accounttransfer.zzs zzsVar) {
        this.zza = set;
        this.zzb = i;
        this.zzd = arrayList;
        this.zze = i2;
        this.zzf = zzsVar;
    }
}
