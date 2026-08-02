package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class UvmEntry extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.UvmEntry> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzbe();
    private final int zza;
    private final short zzb;
    private final short zzc;

    UvmEntry(int i, short s, short s2) {
        this.zza = i;
        this.zzb = s;
        this.zzc = s2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.UvmEntry)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.UvmEntry uvmEntry = (com.google.android.gms.fido.fido2.api.common.UvmEntry) obj;
        return this.zza == uvmEntry.zza && this.zzb == uvmEntry.zzb && this.zzc == uvmEntry.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Short.valueOf(this.zzb), java.lang.Short.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getUserVerificationMethod());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(parcel, 2, getKeyProtectionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(parcel, 3, getMatcherProtectionType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private int zza;
        private short zzb;
        private short zzc;

        public final com.google.android.gms.fido.fido2.api.common.UvmEntry build() {
            return new com.google.android.gms.fido.fido2.api.common.UvmEntry(this.zza, this.zzb, this.zzc);
        }

        public final com.google.android.gms.fido.fido2.api.common.UvmEntry.Builder setUserVerificationMethod(int i) {
            this.zza = i;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.UvmEntry.Builder setMatcherProtectionType(short s) {
            this.zzc = s;
            return this;
        }

        public final com.google.android.gms.fido.fido2.api.common.UvmEntry.Builder setKeyProtectionType(short s) {
            this.zzb = s;
            return this;
        }
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }
}
