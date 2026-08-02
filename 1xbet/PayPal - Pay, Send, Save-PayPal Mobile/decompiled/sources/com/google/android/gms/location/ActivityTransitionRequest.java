package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class ActivityTransitionRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionRequest> CREATOR = new com.google.android.gms.location.zzh();
    public static final java.util.Comparator<com.google.android.gms.location.ActivityTransition> IS_SAME_TRANSITION = new com.google.android.gms.location.zzg();
    private final java.util.List zza;
    private final java.lang.String zzb;
    private final java.util.List zzc;
    private java.lang.String zzd;

    public ActivityTransitionRequest(java.util.List<com.google.android.gms.location.ActivityTransition> list) {
        this(list, null, null, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest = (com.google.android.gms.location.ActivityTransitionRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, activityTransitionRequest.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, activityTransitionRequest.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzd, activityTransitionRequest.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zzc, activityTransitionRequest.zzc);
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode();
        java.lang.String str = this.zzb;
        int hashCode2 = str != null ? str.hashCode() : 0;
        java.util.List list = this.zzc;
        int hashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str2 = this.zzd;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(android.content.Intent intent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent);
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public java.lang.String toString() {
        java.util.List list = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(list);
        java.lang.String str = this.zzd;
        int length = java.lang.String.valueOf(valueOf).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 48 + java.lang.String.valueOf(str2).length() + 12 + java.lang.String.valueOf(valueOf2).length() + 18 + java.lang.String.valueOf(str).length() + 1);
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str2);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        java.util.List list = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ActivityTransitionRequest(java.util.List list, java.lang.String str, java.util.List list2, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "transitions can't be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(!list.isEmpty(), "transitions can't be empty.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        java.util.TreeSet treeSet = new java.util.TreeSet(IS_SAME_TRANSITION);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.location.ActivityTransition activityTransition = (com.google.android.gms.location.ActivityTransition) it.next();
            com.google.android.gms.common.internal.Preconditions.checkArgument(treeSet.add(activityTransition), java.lang.String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.zza = java.util.Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list2);
        this.zzd = str2;
    }

    public final com.google.android.gms.location.ActivityTransitionRequest zza(java.lang.String str) {
        this.zzd = str;
        return this;
    }
}
