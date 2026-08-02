package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class SignRequestParams extends com.google.android.gms.fido.u2f.api.common.RequestParams {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.SignRequestParams> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzk();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final java.lang.Integer zza;
    private final java.lang.Double zzb;
    private final android.net.Uri zzc;
    private final byte[] zzd;
    private final java.util.List zze;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
    private final java.lang.String zzg;
    private final java.util.Set zzh;

    SignRequestParams(java.lang.Integer num, java.lang.Double d, android.net.Uri uri, byte[] bArr, java.util.List list, com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue, java.lang.String str) {
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        this.zzd = bArr;
        this.zze = list;
        this.zzf = channelIdValue;
        java.util.HashSet hashSet = new java.util.HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.fido.u2f.api.common.RegisteredKey registeredKey = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) it.next();
                com.google.android.gms.common.internal.Preconditions.checkArgument((registeredKey.getAppId() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                registeredKey.getChallengeValue();
                com.google.android.gms.common.internal.Preconditions.checkArgument(true, "register request has null challenge and no default challenge isprovided");
                if (registeredKey.getAppId() != null) {
                    hashSet.add(android.net.Uri.parse(registeredKey.getAppId()));
                }
            }
        }
        this.zzh = hashSet;
        com.google.android.gms.common.internal.Preconditions.checkArgument(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.zzg = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.SignRequestParams)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.SignRequestParams signRequestParams = (com.google.android.gms.fido.u2f.api.common.SignRequestParams) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, signRequestParams.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, signRequestParams.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, signRequestParams.zzc) && java.util.Arrays.equals(this.zzd, signRequestParams.zzd) && this.zze.containsAll(signRequestParams.zze) && signRequestParams.zze.containsAll(this.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, signRequestParams.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, signRequestParams.zzg);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzc, this.zzb, this.zze, this.zzf, this.zzg, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 2, getRequestId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getAppId(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, getDefaultSignChallenge(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, getRegisteredKeys(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getChannelIdValue(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getDisplayHint(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        java.lang.Integer zza;
        java.lang.Double zzb;
        android.net.Uri zzc;
        byte[] zzd;
        java.util.List zze;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
        java.lang.String zzg;

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams build() {
            return new com.google.android.gms.fido.u2f.api.common.SignRequestParams(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setTimeoutSeconds(java.lang.Double d) {
            this.zzb = d;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setRequestId(java.lang.Integer num) {
            this.zza = num;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setRegisteredKeys(java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> list) {
            this.zze = list;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setDisplayHint(java.lang.String str) {
            this.zzg = str;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setDefaultSignChallenge(byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setChannelIdValue(com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue) {
            this.zzf = channelIdValue;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setAppId(android.net.Uri uri) {
            this.zzc = uri;
            return this;
        }
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.Double getTimeoutSeconds() {
        return this.zzb;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.Integer getRequestId() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> getRegisteredKeys() {
        return this.zze;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.String getDisplayHint() {
        return this.zzg;
    }

    public byte[] getDefaultSignChallenge() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public com.google.android.gms.fido.u2f.api.common.ChannelIdValue getChannelIdValue() {
        return this.zzf;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public android.net.Uri getAppId() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.util.Set<android.net.Uri> getAllAppIds() {
        return this.zzh;
    }
}
