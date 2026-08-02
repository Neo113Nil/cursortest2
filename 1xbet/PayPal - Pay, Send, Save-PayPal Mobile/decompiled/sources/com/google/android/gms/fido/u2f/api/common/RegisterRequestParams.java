package com.google.android.gms.fido.u2f.api.common;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class RegisterRequestParams extends com.google.android.gms.fido.u2f.api.common.RequestParams {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisterRequestParams> CREATOR = new com.google.android.gms.fido.u2f.api.common.zzh();
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final java.lang.Integer zza;
    private final java.lang.Double zzb;
    private final android.net.Uri zzc;
    private final java.util.List zzd;
    private final java.util.List zze;
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
    private final java.lang.String zzg;
    private java.util.Set zzh;

    RegisterRequestParams(java.lang.Integer num, java.lang.Double d, android.net.Uri uri, java.util.List list, java.util.List list2, com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue, java.lang.String str) {
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.zzd = list;
        this.zze = list2;
        this.zzf = channelIdValue;
        java.util.HashSet hashSet = new java.util.HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.fido.u2f.api.common.RegisterRequest registerRequest = (com.google.android.gms.fido.u2f.api.common.RegisterRequest) it.next();
            com.google.android.gms.common.internal.Preconditions.checkArgument((uri == null && registerRequest.getAppId() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (registerRequest.getAppId() != null) {
                hashSet.add(android.net.Uri.parse(registerRequest.getAppId()));
            }
        }
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            com.google.android.gms.fido.u2f.api.common.RegisteredKey registeredKey = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) it2.next();
            com.google.android.gms.common.internal.Preconditions.checkArgument((uri == null && registeredKey.getAppId() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (registeredKey.getAppId() != null) {
                hashSet.add(android.net.Uri.parse(registeredKey.getAppId()));
            }
        }
        this.zzh = hashSet;
        if (str != null && str.length() > 80) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Display Hint cannot be longer than 80 characters");
        this.zzg = str;
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequestParams)) {
            return false;
        }
        com.google.android.gms.fido.u2f.api.common.RegisterRequestParams registerRequestParams = (com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, registerRequestParams.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, registerRequestParams.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, registerRequestParams.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, registerRequestParams.zzd) && (((list = this.zze) == null && registerRequestParams.zze == null) || (list != null && (list2 = registerRequestParams.zze) != null && list.containsAll(list2) && registerRequestParams.zze.containsAll(this.zze))) && com.google.android.gms.common.internal.Objects.equal(this.zzf, registerRequestParams.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, registerRequestParams.zzg);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 2, getRequestId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getAppId(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getRegisterRequests(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, getRegisteredKeys(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getChannelIdValue(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getDisplayHint(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        java.lang.Integer zza;
        java.lang.Double zzb;
        android.net.Uri zzc;
        java.util.List zzd;
        java.util.List zze;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
        java.lang.String zzg;

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams build() {
            return new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setTimeoutSeconds(java.lang.Double d) {
            this.zzb = d;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setRequestId(java.lang.Integer num) {
            this.zza = num;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setRegisteredKeys(java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> list) {
            this.zze = list;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setRegisterRequests(java.util.List<com.google.android.gms.fido.u2f.api.common.RegisterRequest> list) {
            this.zzd = list;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setDisplayHint(java.lang.String str) {
            this.zzg = str;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setChannelIdValue(com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue) {
            this.zzf = channelIdValue;
            return this;
        }

        public final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setAppId(android.net.Uri uri) {
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

    public java.util.List<com.google.android.gms.fido.u2f.api.common.RegisterRequest> getRegisterRequests() {
        return this.zzd;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.String getDisplayHint() {
        return this.zzg;
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
