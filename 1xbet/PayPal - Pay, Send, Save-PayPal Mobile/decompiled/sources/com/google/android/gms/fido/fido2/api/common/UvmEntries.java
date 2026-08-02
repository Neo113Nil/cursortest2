package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class UvmEntries extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.UvmEntries> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzbd();
    private final java.util.List zza;

    public static final class Builder {
        private final java.util.List zza = new java.util.ArrayList();

        public final com.google.android.gms.fido.fido2.api.common.UvmEntries.Builder addAll(java.util.List<com.google.android.gms.fido.fido2.api.common.UvmEntry> list) {
            com.google.android.gms.internal.fido.zzbm.zzc(this.zza.size() + list.size() <= 3);
            this.zza.addAll(list);
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.UvmEntries.Builder addUvmEntry(com.google.android.gms.fido.fido2.api.common.UvmEntry uvmEntry) {
            if (this.zza.size() >= 3) {
                throw new java.lang.IllegalStateException();
            }
            if (uvmEntry != null) {
                this.zza.add(uvmEntry);
            }
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.UvmEntries build() {
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
        if (list2 == null && uvmEntries.zza == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.zza) != null && list2.containsAll(list) && uvmEntries.zza.containsAll(this.zza);
    }

    public int hashCode() {
        java.util.List list = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(list == null ? null : new java.util.HashSet(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getUvmEntryList(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final org.json.JSONArray zza() {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (this.zza != null) {
                for (int i = 0; i < this.zza.size(); i++) {
                    com.google.android.gms.fido.fido2.api.common.UvmEntry uvmEntry = (com.google.android.gms.fido.fido2.api.common.UvmEntry) this.zza.get(i);
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray2.put((int) uvmEntry.getKeyProtectionType());
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException("Error encoding UvmEntries to JSON object", e);
        }
    }

    public java.util.List<com.google.android.gms.fido.fido2.api.common.UvmEntry> getUvmEntryList() {
        return this.zza;
    }
}
