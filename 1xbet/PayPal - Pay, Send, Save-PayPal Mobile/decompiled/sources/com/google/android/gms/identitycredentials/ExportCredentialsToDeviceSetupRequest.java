package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "requestData", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "getRequestData", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ExportCredentialsToDeviceSetupRequestCreator")
/* loaded from: classes8.dex */
public final class ExportCredentialsToDeviceSetupRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestData", id = 2)
    private final android.os.Bundle requestData;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUri", id = 1)
    private final android.net.Uri uri;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest> CREATOR = new com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequestCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ExportCredentialsToDeviceSetupRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.net.Uri uri, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.uri = uri;
        this.requestData = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequestCreator.writeToParcel(this, dest, flags);
    }

    public final android.net.Uri getUri() {
        return this.uri;
    }

    public final android.os.Bundle getRequestData() {
        return this.requestData;
    }
}
