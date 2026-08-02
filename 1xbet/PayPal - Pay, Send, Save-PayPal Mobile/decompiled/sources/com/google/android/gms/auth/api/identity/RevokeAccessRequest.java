package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public class RevokeAccessRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.RevokeAccessRequest> CREATOR = new com.google.android.gms.auth.api.identity.zbp();
    private final com.google.android.gms.internal.p000authapi.zbbj zba;
    private final android.accounts.Account zbb;
    private final java.lang.String zbc;

    RevokeAccessRequest(java.util.List list, android.accounts.Account account, java.lang.String str) {
        this.zba = com.google.android.gms.internal.p000authapi.zbbj.zbi(list);
        this.zbb = account;
        this.zbc = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.RevokeAccessRequest)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.RevokeAccessRequest revokeAccessRequest = (com.google.android.gms.auth.api.identity.RevokeAccessRequest) obj;
        com.google.android.gms.internal.p000authapi.zbbj zbbjVar = this.zba;
        int size = zbbjVar.size();
        com.google.android.gms.internal.p000authapi.zbbj zbbjVar2 = revokeAccessRequest.zba;
        return size == zbbjVar2.size() && zbbjVar.containsAll(zbbjVar2) && com.google.android.gms.common.internal.Objects.equal(this.zbb, revokeAccessRequest.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, revokeAccessRequest.zbc);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final /* synthetic */ java.lang.String zbd() {
        return this.zbc;
    }

    final /* synthetic */ android.accounts.Account zbc() {
        return this.zbb;
    }

    public static final class Builder {
        private com.google.android.gms.internal.p000authapi.zbbj zba;
        private android.accounts.Account zbb;
        private java.lang.String zbc;

        public final com.google.android.gms.auth.api.identity.RevokeAccessRequest build() {
            return new com.google.android.gms.auth.api.identity.RevokeAccessRequest(this.zba, this.zbb, this.zbc);
        }

        public final com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder setScopes(java.util.List<com.google.android.gms.common.api.Scope> list) {
            this.zba = com.google.android.gms.internal.p000authapi.zbbj.zbi(list);
            return this;
        }

        public final com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder zba(java.lang.String str) {
            this.zbc = str;
            return this;
        }

        public final com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder setAccount(android.accounts.Account account) {
            this.zbb = account;
            return this;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        /* synthetic */ Builder(com.google.android.gms.auth.api.identity.RevokeAccessRequest revokeAccessRequest, byte[] bArr) {
            this.zba = revokeAccessRequest.zbb();
            this.zbb = revokeAccessRequest.zbc();
            this.zbc = revokeAccessRequest.zbd();
        }

        private Builder() {
            throw null;
        }
    }

    final /* synthetic */ com.google.android.gms.internal.p000authapi.zbbj zbb() {
        return this.zba;
    }

    public final com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder zba() {
        return new com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder(this, null);
    }

    public java.util.List<com.google.android.gms.common.api.Scope> getScopes() {
        return this.zba;
    }

    public android.accounts.Account getAccount() {
        return this.zbb;
    }

    public static com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder builder() {
        return new com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder(null);
    }
}
