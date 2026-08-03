package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class UvmEntries extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.UvmEntries> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaz();
    private final java.util.List zza;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private final java.util.List zza = new java.util.ArrayList();

        public com.google.android.gms.fido.fido2.api.common.UvmEntries.Builder addAll(java.util.List<com.google.android.gms.fido.fido2.api.common.UvmEntry> list) {
            com.google.android.gms.internal.fido.zzam.zzc(this.zza.size() + list.size() <= 3);
            this.zza.addAll(list);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntries.Builder addUvmEntry(com.google.android.gms.fido.fido2.api.common.UvmEntry uvmEntry) {
            if (this.zza.size() >= 3) {
                throw new java.lang.IllegalStateException();
            }
            this.zza.add(uvmEntry);
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntries build() {
            return new com.google.android.gms.fido.fido2.api.common.UvmEntries(this.zza);
        }
    }

    UvmEntries(java.util.List list) {
        this.zza = list;
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.UvmEntries)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.UvmEntries uvmEntries = (com.google.android.gms.fido.fido2.api.common.UvmEntries) obj;
        java.util.List list2 = this.zza;
        return (list2 == null && uvmEntries.zza == null) || (list2 != null && (list = uvmEntries.zza) != null && list2.containsAll(list) && uvmEntries.zza.containsAll(this.zza));
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.UvmEntry> getUvmEntryList() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(new java.util.HashSet(this.zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getUvmEntryList(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
