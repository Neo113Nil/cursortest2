package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class SleepSegmentEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.SleepSegmentEvent> CREATOR = new com.google.android.gms.location.zzap();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    public SleepSegmentEvent(long j, long j2, int i, int i2, int i3) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static java.util.List<com.google.android.gms.location.SleepSegmentEvent> extractEvents(android.content.Intent intent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            arrayList2.add((com.google.android.gms.location.SleepSegmentEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return java.util.Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.SleepSegmentEvent)) {
            return false;
        }
        com.google.android.gms.location.SleepSegmentEvent sleepSegmentEvent = (com.google.android.gms.location.SleepSegmentEvent) obj;
        return this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    public java.lang.String toString() {
        long j = this.zza;
        int length = java.lang.String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = java.lang.String.valueOf(j2).length();
        int i = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 24 + length2 + 9 + java.lang.String.valueOf(i).length());
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getStatus());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int getStatus() {
        return this.zzc;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public long getEndTimeMillis() {
        return this.zzb;
    }
}
