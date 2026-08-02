package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BK\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0005H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "type", "", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "origin", "requestJson", "resultReceiver", "Landroid/os/ResultReceiver;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroid/os/ResultReceiver;)V", "bundle", "(Landroid/os/Bundle;)V", "getType", "()Ljava/lang/String;", "getCredentialData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getOrigin", "getRequestJson", "getResultReceiver", "()Landroid/os/ResultReceiver;", "toBundle", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "isConditionalRequest", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CreateCredentialRequestCreator")
/* loaded from: classes8.dex */
public final class CreateCredentialRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCandidateQueryData", id = 3)
    private final android.os.Bundle candidateQueryData;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCredentialData", id = 2)
    private final android.os.Bundle credentialData;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOrigin", id = 4)
    private final java.lang.String origin;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestJson", id = 5)
    private final java.lang.String requestJson;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResultReceiver", id = 6)
    private final android.os.ResultReceiver resultReceiver;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getType", id = 1)
    private final java.lang.String type;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CreateCredentialRequest> CREATOR = new com.google.android.gms.identitycredentials.CreateCredentialRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public CreateCredentialRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle bundle, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.Bundle bundle2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String str2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String str3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.os.ResultReceiver resultReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
        this.type = str;
        this.credentialData = bundle;
        this.candidateQueryData = bundle2;
        this.origin = str2;
        this.requestJson = str3;
        this.resultReceiver = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.CreateCredentialRequestCreator.writeToParcel(this, dest, flags);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final android.os.ResultReceiver getResultReceiver() {
        return this.resultReceiver;
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public final android.os.Bundle getCredentialData() {
        return this.credentialData;
    }

    public final android.os.Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }
}
