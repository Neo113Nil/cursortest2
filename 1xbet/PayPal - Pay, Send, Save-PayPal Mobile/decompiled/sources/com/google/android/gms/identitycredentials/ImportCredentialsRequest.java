package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\u0010\u001a\u00020\nH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/google/android/gms/identitycredentials/ImportCredentialsRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "requestJson", "", "uri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getRequestJson", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "toBundle", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ImportCredentialsRequestCreator")
/* loaded from: classes8.dex */
public final class ImportCredentialsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final java.lang.String REQUEST_TYPE = "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC";

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestJson", id = 1)
    private final java.lang.String requestJson;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUri", id = 2)
    private final android.net.Uri uri;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ImportCredentialsRequest> CREATOR = new com.google.android.gms.identitycredentials.ImportCredentialsRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ImportCredentialsRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String str, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        this.requestJson = str;
        this.uri = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ImportCredentialsRequestCreator.writeToParcel(this, dest, flags);
    }

    public final android.net.Uri getUri() {
        return this.uri;
    }

    public final java.lang.String getRequestJson() {
        return this.requestJson;
    }
}
