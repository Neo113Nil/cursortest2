package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B9\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u0007H\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "credentialOptions", "", "Lcom/google/android/gms/identitycredentials/CredentialOption;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/os/Bundle;", "origin", "", "resultReceiver", "Landroid/os/ResultReceiver;", "<init>", "(Ljava/util/List;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V", "bundle", "(Landroid/os/Bundle;)V", "getCredentialOptions", "()Ljava/util/List;", "getData", "()Landroid/os/Bundle;", "getOrigin", "()Ljava/lang/String;", "getResultReceiver$annotations", "()V", "getResultReceiver", "()Landroid/os/ResultReceiver;", "toBundle", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GetCredentialRequestCreator")
/* loaded from: classes8.dex */
public final class GetCredentialRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCredentialOptions", id = 1)
    private final java.util.List<com.google.android.gms.identitycredentials.CredentialOption> credentialOptions;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getData", id = 2)
    private final android.os.Bundle data;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOrigin", id = 3)
    private final java.lang.String origin;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResultReceiver", id = 4)
    private final android.os.ResultReceiver resultReceiver;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.GetCredentialRequest> CREATOR = new com.google.android.gms.identitycredentials.GetCredentialRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public GetCredentialRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List<com.google.android.gms.identitycredentials.CredentialOption> list, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle bundle, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.ResultReceiver resultReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultReceiver, "");
        this.credentialOptions = list;
        this.data = bundle;
        this.origin = str;
        this.resultReceiver = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.GetCredentialRequestCreator.writeToParcel(this, dest, flags);
    }

    public final android.os.ResultReceiver getResultReceiver() {
        return this.resultReceiver;
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public final android.os.Bundle getData() {
        return this.data;
    }

    public final java.util.List<com.google.android.gms.identitycredentials.CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }
}
