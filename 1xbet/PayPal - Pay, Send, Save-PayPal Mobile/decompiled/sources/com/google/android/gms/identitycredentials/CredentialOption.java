package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 BE\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0019\u001a\u00020\u0005H\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000f¨\u0006!"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "type", "", "credentialRetrievalData", "Landroid/os/Bundle;", "candidateQueryData", "requestMatcher", "requestType", "protocolType", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bundle", "(Landroid/os/Bundle;)V", "getType", "()Ljava/lang/String;", "getCredentialRetrievalData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getRequestMatcher", "getRequestType$annotations", "()V", "getRequestType", "getProtocolType$annotations", "getProtocolType", "toBundle", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CredentialOptionCreator")
/* loaded from: classes8.dex */
public final class CredentialOption extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCandidateQueryData", id = 3)
    private final android.os.Bundle candidateQueryData;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCredentialRetrievalData", id = 2)
    private final android.os.Bundle credentialRetrievalData;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getProtocolType", id = 6)
    private final java.lang.String protocolType;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestMatcher", id = 4)
    private final java.lang.String requestMatcher;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getRequestType", id = 5)
    private final java.lang.String requestType;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "", getter = "getType", id = 1)
    private final java.lang.String type;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CredentialOption> CREATOR = new com.google.android.gms.identitycredentials.CredentialOptionCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public CredentialOption(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle bundle, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.Bundle bundle2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String str2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String str3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.credentialRetrievalData = bundle;
        this.candidateQueryData = bundle2;
        this.requestMatcher = str2;
        this.requestType = str3;
        this.protocolType = str4;
        java.lang.String str5 = str3;
        boolean z = false;
        boolean z2 = (kotlin.text.StringsKt.isBlank(str5) || kotlin.text.StringsKt.isBlank(str4)) ? false : true;
        if (!kotlin.text.StringsKt.isBlank(str) && str5.length() == 0 && str4.length() == 0) {
            z = true;
        }
        if (z2 || z) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 31 + java.lang.String.valueOf(str3).length() + 19 + java.lang.String.valueOf(str4).length() + 69);
        sb.append("Either type: ");
        sb.append(str);
        sb.append(", or requestType: ");
        sb.append(str3);
        sb.append(" and protocolType: ");
        sb.append(str4);
        sb.append(" must be specified, but at least one contains an invalid blank value.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.CredentialOptionCreator.writeToParcel(this, dest, flags);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getRequestType() {
        return this.requestType;
    }

    public final java.lang.String getRequestMatcher() {
        return this.requestMatcher;
    }

    public final java.lang.String getProtocolType() {
        return this.protocolType;
    }

    public final android.os.Bundle getCredentialRetrievalData() {
        return this.credentialRetrievalData;
    }

    public final android.os.Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }
}
